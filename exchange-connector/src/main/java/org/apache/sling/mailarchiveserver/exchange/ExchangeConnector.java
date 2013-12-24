package org.apache.sling.mailarchiveserver.exchange;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.Authenticator;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import javax.xml.ws.Holder;

import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.ConfigurationPolicy;
import org.apache.felix.scr.annotations.Deactivate;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;
import org.apache.james.mime4j.dom.Body;
import org.apache.james.mime4j.dom.Header;
import org.apache.james.mime4j.dom.Message;
import org.apache.james.mime4j.dom.MessageBuilder;
import org.apache.james.mime4j.dom.Multipart;
import org.apache.james.mime4j.dom.address.Mailbox;
import org.apache.james.mime4j.dom.field.FieldName;
import org.apache.james.mime4j.field.address.AddressBuilder;
import org.apache.james.mime4j.field.address.ParseException;
import org.apache.james.mime4j.message.BodyPart;
import org.apache.james.mime4j.message.DefaultMessageBuilder;
import org.apache.james.mime4j.message.HeaderImpl;
import org.apache.james.mime4j.message.MessageImpl;
import org.apache.james.mime4j.message.MultipartImpl;
import org.apache.james.mime4j.storage.StorageBodyFactory;
import org.apache.james.mime4j.stream.RawField;
import org.apache.sling.mailarchiveserver.api.Connector;
import org.apache.sling.mailarchiveserver.api.MessageStore;
import org.apache.sling.mailarchiveserver.util.MessageFieldName;
import org.apache.sling.mailarchiveserver.util.SysStreamsLogger;
import org.osgi.service.component.ComponentContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import exchange.v2007sp3.ws.client.impl.ArrayOfRealItemsType;
import exchange.v2007sp3.ws.client.impl.ArrayOfResponseMessagesType;
import exchange.v2007sp3.ws.client.impl.AttachmentInfoResponseMessageType;
import exchange.v2007sp3.ws.client.impl.AttachmentType;
import exchange.v2007sp3.ws.client.impl.BaseFolderIdType;
import exchange.v2007sp3.ws.client.impl.BaseItemIdType;
import exchange.v2007sp3.ws.client.impl.BodyTypeResponseType;
import exchange.v2007sp3.ws.client.impl.DefaultShapeNamesType;
import exchange.v2007sp3.ws.client.impl.DeleteItemResponseType;
import exchange.v2007sp3.ws.client.impl.DeleteItemType;
import exchange.v2007sp3.ws.client.impl.DisposalType;
import exchange.v2007sp3.ws.client.impl.DistinguishedFolderIdNameType;
import exchange.v2007sp3.ws.client.impl.DistinguishedFolderIdType;
import exchange.v2007sp3.ws.client.impl.EmailAddressType;
import exchange.v2007sp3.ws.client.impl.ExchangeServicePortType;
import exchange.v2007sp3.ws.client.impl.ExchangeServices;
import exchange.v2007sp3.ws.client.impl.ExchangeVersionType;
import exchange.v2007sp3.ws.client.impl.FileAttachmentType;
import exchange.v2007sp3.ws.client.impl.FindItemResponseMessageType;
import exchange.v2007sp3.ws.client.impl.FindItemResponseType;
import exchange.v2007sp3.ws.client.impl.FindItemType;
import exchange.v2007sp3.ws.client.impl.GetAttachmentResponseType;
import exchange.v2007sp3.ws.client.impl.GetAttachmentType;
import exchange.v2007sp3.ws.client.impl.GetItemResponseType;
import exchange.v2007sp3.ws.client.impl.GetItemType;
import exchange.v2007sp3.ws.client.impl.ItemInfoResponseMessageType;
import exchange.v2007sp3.ws.client.impl.ItemQueryTraversalType;
import exchange.v2007sp3.ws.client.impl.ItemResponseShapeType;
import exchange.v2007sp3.ws.client.impl.ItemType;
import exchange.v2007sp3.ws.client.impl.MessageType;
import exchange.v2007sp3.ws.client.impl.NonEmptyArrayOfBaseFolderIdsType;
import exchange.v2007sp3.ws.client.impl.NonEmptyArrayOfBaseItemIdsType;
import exchange.v2007sp3.ws.client.impl.NonEmptyArrayOfRequestAttachmentIdsType;
import exchange.v2007sp3.ws.client.impl.RequestAttachmentIdType;
import exchange.v2007sp3.ws.client.impl.RequestServerVersion;
import exchange.v2007sp3.ws.client.impl.ResponseClassType;
import exchange.v2007sp3.ws.client.impl.ResponseMessageType;

@Component(
        name=ExchangeConnector.SERVICE_PID,
        metatype=true,
        configurationFactory = true, 
        policy = ConfigurationPolicy.REQUIRE
        )
@Service(Connector.class)
public class ExchangeConnector implements Connector {

    static final String SERVICE_PID = "org.apache.sling.mailarchiveserver.exchange.ExchangeConnector";

    @Property
    private static final String NAME_PROP = "name";
    private String name;

    @Property
    private static final String USERNAME_PROP = "username";
    private String username = null;

    @Property
    private static final String PASSWORD_PROP = "password";
    private String password = null;

    @Property("file:Services.wsdl")
    private static final String WSDLPATH_PROP = "wsdlPath";
    private String wsdlPath = null;

    @Property(boolValue=false)
    private static final String MAILBOXCLEANUP_PROP = "mailboxCleanup";
    private boolean mailboxCleanup;

    @Property
    private static final String MAILINGLISTS_PROP = "mailingLists";
    Set<String> mailingLists;

    @Property(intValue=100)
    private static final String RETREIVE_MESSAGES_LIMIT = "retreiveMessagesLimit";
    private int retreiveMessagesLimit;

    @Reference
    private MessageStore store;
    private ExchangeServicePortType port = null;
    private static final ExchangeVersionType EXCHANGE_VERSION = ExchangeVersionType.EXCHANGE_2007_SP_1;
    private static final Logger logger = LoggerFactory.getLogger(ExchangeConnector.class);

    @Activate
    protected void activate(ComponentContext context) throws MalformedURLException {
        SysStreamsLogger.bindSystemStreams(); // PROD remove

        @SuppressWarnings("rawtypes")
        final Dictionary props = context.getProperties();
        name = (String) props.get(NAME_PROP);  
        username = (String) props.get(USERNAME_PROP);  
        password = (String) props.get(PASSWORD_PROP); 
        wsdlPath = (String) props.get(WSDLPATH_PROP); 
        mailboxCleanup = (Boolean) props.get(MAILBOXCLEANUP_PROP); 
        String listsValue = (String) props.get(MAILINGLISTS_PROP); 
        mailingLists = new HashSet<String>();
        for (String l : listsValue.split(",")) {
            mailingLists.add(l.trim());
        }
        retreiveMessagesLimit = (Integer) props.get(RETREIVE_MESSAGES_LIMIT);

        loginAndOpenPort();

        logger.info(String.format("ExchangeConnector %s is activated.", name));
    }

    @Deactivate
    public void deactivate() {
        SysStreamsLogger.unbindSystemStreams(); // PROD remove

        logger.info(String.format("ExchangeConnector %s is deactivated.", name));
    }

    private void loginAndOpenPort() throws MalformedURLException {
        URL wsdlURL = new URL(wsdlPath);
        ExchangeServices service = new ExchangeServices(
                wsdlURL, 
                new QName("http://schemas.microsoft.com/exchange/services/2006/messages", "ExchangeServices") 
                );
        port = service.getExchangeServicePort();

        NtlmAuthenticator authenticator = new NtlmAuthenticator(username, password);
        Authenticator.setDefault(authenticator);
    }

    public int checkNewMessages() { 
        List<BaseItemIdType> messageIds = new ArrayList<BaseItemIdType>();
        int limit = retreiveMessagesLimit;

        try {

            // CHECK INBOX

            FindItemType findRequest = new FindItemType();
            ItemResponseShapeType responseShape = new ItemResponseShapeType();
            responseShape.setBaseShape(DefaultShapeNamesType.ID_ONLY);
            findRequest.setItemShape(responseShape);

            NonEmptyArrayOfBaseFolderIdsType folderIds = new NonEmptyArrayOfBaseFolderIdsType();
            List<BaseFolderIdType> ids = folderIds.getFolderIdOrDistinguishedFolderId();
            DistinguishedFolderIdType inbox = new DistinguishedFolderIdType();
            inbox.setId(DistinguishedFolderIdNameType.INBOX);
            ids.add(inbox);
            findRequest.setParentFolderIds(folderIds);

            findRequest.setTraversal(ItemQueryTraversalType.SHALLOW);

            RequestServerVersion requestVersion = new RequestServerVersion();
            requestVersion.setVersion(EXCHANGE_VERSION);

            Holder<FindItemResponseType> findItemResult = new Holder<FindItemResponseType>();

            port.findItem(findRequest, requestVersion, findItemResult);

            FindItemResponseType findItemResponse = findItemResult.value;
            ArrayOfResponseMessagesType arrayOfResponseMessages = findItemResponse.getResponseMessages();
            List<JAXBElement<? extends ResponseMessageType>> responseMessageTypeList = 
                    arrayOfResponseMessages.getCreateItemResponseMessageOrDeleteItemResponseMessageOrGetItemResponseMessage();
            for (JAXBElement<? extends ResponseMessageType> jaxbElement : responseMessageTypeList) {
                FindItemResponseMessageType response = (FindItemResponseMessageType) jaxbElement.getValue();

                ArrayOfRealItemsType itemsElement = response.getRootFolder().getItems();
                List<ItemType> items = itemsElement.getItemOrMessageOrCalendarItem();
                for( ItemType item : items ) {
                    if (limit-- > 0) {
                        MessageType message = (MessageType) item;
                        messageIds.add(message.getItemId());
                    } else {
                        break;
                    }
                }
            }

            if (messageIds.size() == 0) {
                logger.info(name + ": No new messages.");
                return 0;
            }
            logger.info("{}: {} new messages retrieved from Exchange server.", name, messageIds.size());
            // # of messages retrieved from Exchange server

            // GET MESSAGES

            GetItemType getRequest = new GetItemType();
            ItemResponseShapeType responseShape2 = new ItemResponseShapeType();
            responseShape2.setBaseShape(DefaultShapeNamesType.ALL_PROPERTIES);
            responseShape2.setBodyType(BodyTypeResponseType.TEXT); // optional, choose plain or html content
            getRequest.setItemShape(responseShape2);

            NonEmptyArrayOfBaseItemIdsType itemIds = new NonEmptyArrayOfBaseItemIdsType();
            List<BaseItemIdType> itemsList = itemIds.getItemIdOrOccurrenceItemIdOrRecurringMasterItemId();
            itemsList.addAll(messageIds);
            getRequest.setItemIds(itemIds);

            Holder<GetItemResponseType> getItemResult = new Holder<GetItemResponseType>();

            port.getItem(getRequest, requestVersion, getItemResult);

            int savedMsgs = 0;
            List<Message> messages = new ArrayList<Message>();

            GetItemResponseType getItemResponse = getItemResult.value;
            ArrayOfResponseMessagesType arrayOfResponseMessages2 = getItemResponse.getResponseMessages();
            List<JAXBElement<? extends ResponseMessageType>> responseMessageTypeList2 = 
                    arrayOfResponseMessages2.getCreateItemResponseMessageOrDeleteItemResponseMessageOrGetItemResponseMessage();
            for (JAXBElement<? extends ResponseMessageType> jaxbElement : responseMessageTypeList2) {
                ItemInfoResponseMessageType response = (ItemInfoResponseMessageType) jaxbElement.getValue();
                if (response.getResponseClass() != ResponseClassType.SUCCESS) {
                    continue;
                }
                ArrayOfRealItemsType itemsElement = response.getItems();
                List<ItemType> items = itemsElement.getItemOrMessageOrCalendarItem();
                for( ItemType item : items ) {
                    MessageType messageType = (MessageType) item;
                    messages.addAll(convertExchangeMessageToMime4jMessages(messageType, getAttachmentsAsMime4jBodyParts(messageType)));
                }
            }
            store.saveAll(messages.iterator());
            savedMsgs = messages.size();

            logger.info("{}: {} messages saved to JCR.", name, savedMsgs);
            // # of messages saved to JCR 
            // (is greater or equals than # of retrieved because of messages sent to several lists)

            if (mailboxCleanup) {

                // REMOVE MESSAGES

                DeleteItemType request = new DeleteItemType();

                DisposalType deleteType = DisposalType.HARD_DELETE;
                request.setDeleteType(deleteType);

                NonEmptyArrayOfBaseItemIdsType itemIdsToRemove = new NonEmptyArrayOfBaseItemIdsType();
                List<BaseItemIdType> itemsToRemoveList = itemIdsToRemove.getItemIdOrOccurrenceItemIdOrRecurringMasterItemId();
                itemsToRemoveList.addAll(messageIds);
                request.setItemIds(itemIdsToRemove);

                Holder<DeleteItemResponseType> deleteItemResult = new Holder<DeleteItemResponseType>();

                port.deleteItem(request, requestVersion, deleteItemResult);

                List<JAXBElement<? extends ResponseMessageType>> responseList = deleteItemResult.value
                        .getResponseMessages().getCreateItemResponseMessageOrDeleteItemResponseMessageOrGetItemResponseMessage();
                for (JAXBElement<? extends ResponseMessageType> jaxbElement : responseList) {
                    ResponseMessageType responseMessage = jaxbElement.getValue();
                    ResponseClassType responseMessageClass = responseMessage.getResponseClass();
                    if (responseMessageClass != ResponseClassType.SUCCESS) {
                        logger.info(name + ": Error while deleting messages from Exchange server. \nCode {} : {}\n", 
                                responseMessage.getResponseCode(), responseMessage.getMessageText());
                    }
                }

                logger.info("{}: Removed {} messages from Exchange server.", name, savedMsgs);
            }

            return savedMsgs; 

        } catch (IOException e){
            logger.info(name + ": I/O error while checking for new messages. " + e.getMessage());
            e.printStackTrace(); // PROD remove
            return -1;

        } catch (Exception e){
            // TODO skip an email that results in an exception ?
            logger.info(name + ": Error while checking for new messages. " + e.getMessage());
            e.printStackTrace(); // PROD remove
            return -1;
        } 
    }

    public List<Message> convertExchangeMessageToMime4jMessages(MessageType in, List<BodyPart> attachments) {
        List<Message> result = new ArrayList<Message>();

        final MessageImpl sampleMessage = new MessageImpl();
        sampleMessage.setHeader(new HeaderImpl());
        Set<String> recepients = new LinkedHashSet<String>();

        final Header sampleHeader = sampleMessage.getHeader();
        // Message-Id
        sampleHeader.addField(new RawField(FieldName.MESSAGE_ID, in.getInternetMessageId()));
        // In-Reply-To (opt)
        if (in.getInReplyTo() != null) {
            sampleHeader.addField(new RawField(MessageFieldName.IN_REPLY_TO, in.getInReplyTo()));
        }

        // From
        EmailAddressType fromMailbox = in.getFrom().getMailbox();
        sampleHeader.addField(new RawField(FieldName.FROM, fromMailbox.getName() +" <"+ fromMailbox.getEmailAddress() +">"));

        // To
        if (in.getToRecipients() != null) {
            try {
                List<Mailbox> toList = convertMailAddressTypeListToMailboxList(in.getToRecipients().getMailbox());
                for (Mailbox mailbox : toList) {
                    recepients.add(mailbox.getAddress().trim().toLowerCase());
                }
                sampleMessage.setTo(toList);
            } catch (ParseException e) {
                logger.info("Illegal To field of expoerted message.");
            }
        }

        // Cc (opt)
        if (in.getCcRecipients() != null) {
            try {
                final List<Mailbox> ccList = convertMailAddressTypeListToMailboxList(in.getCcRecipients().getMailbox());
                for (Mailbox mailbox : ccList) {
                    recepients.add(mailbox.getAddress().trim().toLowerCase());
                }
                sampleMessage.setCc(ccList);
            } catch (ParseException e) {
                logger.info("Illegal Cc field of expoerted message.");
            }
        }

        // Subject
        sampleMessage.setSubject(in.getSubject());

        // Date (sent date)
        sampleMessage.setDate(in.getDateTimeSent().toGregorianCalendar().getTime());

        // Body
        Body sampleBody = new StorageBodyFactory().textBody(in.getBody().getValue());
        BodyPart bodyPart = new BodyPart();
        bodyPart.setBody(sampleBody, "text/plain");

        // Create sample multipart message
        Multipart multipart = new MultipartImpl("mixed");
        multipart.addBodyPart(bodyPart);
        if (attachments != null) {
            for (BodyPart bp : attachments) {
                multipart.addBodyPart(bp);
            }
        }
        sampleMessage.setMultipart(multipart);

        MessageBuilder builder = new DefaultMessageBuilder();
        for (String address : recepients) {
            if (mailingLists.contains(address.toLowerCase())) {
                Message out = builder.newMessage(sampleMessage);
                // List-Id
                out.getHeader().setField(new RawField(MessageFieldName.LIST_ID, "<" + address.replace("@", ".") + ">"));
                result.add(out);
            }
        }

        return result;
    }

    public List<BodyPart> getAttachmentsAsMime4jBodyParts(MessageType in) {
        List<BodyPart> mime4jAttachments = new ArrayList<BodyPart>();
        List<AttachmentType> attachments;
        if (in.getAttachments() != null && (attachments = in.getAttachments().getItemAttachmentOrFileAttachment()).size() > 0) {
            RequestServerVersion requestVersion = new RequestServerVersion();
            requestVersion.setVersion(EXCHANGE_VERSION);

            NonEmptyArrayOfRequestAttachmentIdsType attachmentIdsList = new NonEmptyArrayOfRequestAttachmentIdsType();
            for (AttachmentType attachmentType : attachments) {
                RequestAttachmentIdType raid = new RequestAttachmentIdType();
                raid.setId(attachmentType.getAttachmentId().getId());
                attachmentIdsList.getAttachmentId().add(raid);
            }

            Holder<GetAttachmentResponseType> getAttachmentResult = new Holder<GetAttachmentResponseType>();

            GetAttachmentType request = new GetAttachmentType();
            request.setAttachmentIds(attachmentIdsList);
            port.getAttachment(request, requestVersion, getAttachmentResult);

            List<JAXBElement<? extends ResponseMessageType>> responseMessages = getAttachmentResult.value.getResponseMessages().getCreateItemResponseMessageOrDeleteItemResponseMessageOrGetItemResponseMessage();
            for (JAXBElement<? extends ResponseMessageType> jaxbElement : responseMessages) {
                AttachmentInfoResponseMessageType attachmentMessage = (AttachmentInfoResponseMessageType) jaxbElement.getValue();
                List<AttachmentType> attachmentsList = attachmentMessage.getAttachments().getItemAttachmentOrFileAttachment();
                for (AttachmentType attachmentType : attachmentsList) {
                    if (attachmentType instanceof FileAttachmentType) {
                        BodyPart bp = convertFileAttachmentTypeToBodyPart((FileAttachmentType) attachmentType);
                        if (bp != null) {
                            mime4jAttachments.add(bp);
                        }
                    }
                }
            }
        }
        return mime4jAttachments;
    }

    private static BodyPart convertFileAttachmentTypeToBodyPart(FileAttachmentType fileAttachmentType) {
        String filename = "filename";
        try {
            filename = fileAttachmentType.getName();
            String mimeType = fileAttachmentType.getContentType();
            byte[] content = fileAttachmentType.getContent();

            Body body = new StorageBodyFactory().binaryBody(new ByteArrayInputStream(content));

            BodyPart bodyPart = new BodyPart();
            if (mimeType == null) {
                bodyPart.setBody(body);
            } else {
                bodyPart.setBody(body, mimeType);
            }
            bodyPart.setFilename(filename);

            return bodyPart;
        } catch (IOException e) {
            logger.info("IOException while saving attachment {}: {}", filename, e.getMessage());
            e.printStackTrace(); // PROD remove
            return null;
        }
    }

    private static List<Mailbox> convertMailAddressTypeListToMailboxList(List<EmailAddressType> inList) throws ParseException {
        List<Mailbox> outList = new ArrayList<Mailbox>();
        for (EmailAddressType el : inList) {
            final Mailbox mailbox = AddressBuilder.DEFAULT.parseMailbox(el.getEmailAddress());
            if (mailbox != null) {
                outList.add(mailbox);
            }
        }
        return outList;
    }

    @Override
    public String toString() {
        return name;
    }

    private class NtlmAuthenticator extends Authenticator {
        private final String username;
        private final String password;

        public NtlmAuthenticator(final String username, final String password) {
            super();
            this.username = username;
            this.password = password; 
        }

        @Override
        public PasswordAuthentication getPasswordAuthentication() {
            return (new PasswordAuthentication (username, password.toCharArray()));
        }
    }

}
