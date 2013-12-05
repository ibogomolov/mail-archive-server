package org.apache.sling.mailarchiveserver.exchange;

import java.io.IOException;
import java.net.Authenticator;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashSet;
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
import org.apache.james.mime4j.dom.Header;
import org.apache.james.mime4j.dom.Message;
import org.apache.james.mime4j.dom.address.Mailbox;
import org.apache.james.mime4j.dom.field.FieldName;
import org.apache.james.mime4j.field.address.AddressBuilder;
import org.apache.james.mime4j.field.address.ParseException;
import org.apache.james.mime4j.message.BodyBuilder;
import org.apache.james.mime4j.message.HeaderImpl;
import org.apache.james.mime4j.message.MessageImpl;
import org.apache.james.mime4j.stream.RawField;
import org.apache.sling.mailarchiveserver.api.Connector;
import org.apache.sling.mailarchiveserver.api.MessageFieldName;
import org.apache.sling.mailarchiveserver.api.MessageStore;
import org.osgi.service.component.ComponentContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import exchange.v2007sp3.ws.client.impl.ArrayOfRealItemsType;
import exchange.v2007sp3.ws.client.impl.ArrayOfResponseMessagesType;
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
import exchange.v2007sp3.ws.client.impl.FindItemResponseMessageType;
import exchange.v2007sp3.ws.client.impl.FindItemResponseType;
import exchange.v2007sp3.ws.client.impl.FindItemType;
import exchange.v2007sp3.ws.client.impl.GetItemResponseType;
import exchange.v2007sp3.ws.client.impl.GetItemType;
import exchange.v2007sp3.ws.client.impl.ItemInfoResponseMessageType;
import exchange.v2007sp3.ws.client.impl.ItemQueryTraversalType;
import exchange.v2007sp3.ws.client.impl.ItemResponseShapeType;
import exchange.v2007sp3.ws.client.impl.ItemType;
import exchange.v2007sp3.ws.client.impl.MessageType;
import exchange.v2007sp3.ws.client.impl.NonEmptyArrayOfBaseFolderIdsType;
import exchange.v2007sp3.ws.client.impl.NonEmptyArrayOfBaseItemIdsType;
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
    private Set<String> mailingLists;

    @Property(intValue=100)
    private static final String RETREIVE_MESSAGES_LIMIT = "retreiveMessagesLimit";
    private int retreiveMessagesLimit;

    @Reference
    private MessageStore store;
    private ExchangeServicePortType port = null;
    private static final ExchangeVersionType EXCHANGE_VERSION = ExchangeVersionType.EXCHANGE_2007_SP_1;
    private static final Logger logger = LoggerFactory.getLogger(ExchangeConnector.class);

    public ExchangeConnector() {
        //		SysStreamsLogger.bindSystemStreams(); // PROD remove
    }

    @Activate
    protected void activate(ComponentContext context) throws MalformedURLException {
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
                for( ItemType item : items ) { // usually items.size() == 1
                    MessageType message = (MessageType) item;
                    List<Message> messages = convertExchangeMessageToMime4jMessages(message);
                    savedMsgs += messages.size();
                    store.saveAll(messages.iterator());
                }
            }

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
            logger.info(name + ": Error while saving messages. " + e.getMessage());
            return -1;

        } catch (Exception e){
            // TODO skip an email that results in an exception ?
            logger.info(name + ": Error while retrieving messages. " + e.getMessage());
            e.printStackTrace(); // PROD remove
            return -1;
        } 
    }


    public List<Message> convertExchangeMessageToMime4jMessages(MessageType in) {

        List<Message> result = new ArrayList<Message>();
        MessageImpl sample = new MessageImpl();
        sample.setHeader(new HeaderImpl());
        Set<String> recepients = new HashSet<String>();

        final Header header = sample.getHeader();
        // Message-Id
        header.addField(new RawField(FieldName.MESSAGE_ID, in.getInternetMessageId()));
        // In-Reply-To (opt)
        if (in.getInReplyTo() != null) {
            header.addField(new RawField(MessageFieldName.IN_REPLY_TO, in.getInReplyTo()));
        }
        // Content-Type TODO
        //		tmpHeader.addField(new RawField(FieldName.CONTENT_TYPE, stringToContentType(in.getBody().getBodyType().value())));

        // From
        try {
            sample.setFrom(AddressBuilder.DEFAULT.parseMailbox(in.getFrom().getMailbox().getEmailAddress()));
        } catch (ParseException e) {
            logger.info("Illegal From field of expoerted message.");
        }

        // To
        try {
            List<Mailbox> toList = convertMailAddressTypeListToMailboxList(in.getToRecipients().getMailbox());
            for (Mailbox mailbox : toList) {
                recepients.add(mailbox.getAddress().trim().toLowerCase());
            }
            sample.setTo(toList);
        } catch (ParseException e) {
            logger.info("Illegal To field of expoerted message.");
        }

        // Cc (opt)
        if (in.getCcRecipients() != null) {
            try {
                final List<Mailbox> ccList = convertMailAddressTypeListToMailboxList(in.getCcRecipients().getMailbox());
                for (Mailbox mailbox : ccList) {
                    recepients.add(mailbox.getAddress().trim().toLowerCase());
                }
                sample.setCc(ccList);
            } catch (ParseException e) {
                logger.info("Illegal Cc field of expoerted message.");
            }
        }

        // Subject
        sample.setSubject(in.getSubject());

        // Date (sent date)
        sample.setDate(in.getDateTimeSent().toGregorianCalendar().getTime());

        // Body
        BodyBuilder bb = BodyBuilder.create();
        bb.setText(in.getBody().getValue());
        sample.setBody(bb.buildText());

        for (String address : recepients) {
            if (mailingLists.contains(address.toLowerCase())) {
                Message out = new MessageImpl();
                out.setBody(sample.getBody());
                Header h = sample.getHeader();
                // List-Id
                h.addField(new RawField(MessageFieldName.LIST_ID, "<" + address.replace("@", ".") + ">"));
                out.setHeader(h);
                result.add(out);
            }
        }

        return result;
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
