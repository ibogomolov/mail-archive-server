package org.apache.sling.mailarchiveserver.exchange;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import javax.xml.ws.Holder;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;
import org.apache.james.mime4j.dom.Header;
import org.apache.james.mime4j.dom.Message;
import org.apache.james.mime4j.dom.address.Mailbox;
import org.apache.james.mime4j.dom.field.FieldName;
import org.apache.james.mime4j.message.BodyBuilder;
import org.apache.james.mime4j.message.HeaderImpl;
import org.apache.james.mime4j.message.MessageImpl;
import org.apache.james.mime4j.stream.RawField;
import org.apache.sling.mailarchiveserver.api.Connector;
import org.apache.sling.mailarchiveserver.api.Pipeline;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import exchange2013.ws.client.ArrayOfRealItemsType;
import exchange2013.ws.client.ArrayOfResponseMessagesType;
import exchange2013.ws.client.BaseFolderIdType;
import exchange2013.ws.client.BaseItemIdType;
import exchange2013.ws.client.BodyTypeResponseType;
import exchange2013.ws.client.DefaultShapeNamesType;
import exchange2013.ws.client.DeleteItemResponseType;
import exchange2013.ws.client.DeleteItemType;
import exchange2013.ws.client.DisposalType;
import exchange2013.ws.client.DistinguishedFolderIdNameType;
import exchange2013.ws.client.DistinguishedFolderIdType;
import exchange2013.ws.client.EmailAddressType;
import exchange2013.ws.client.ExchangeServicePortType;
import exchange2013.ws.client.ExchangeServices;
import exchange2013.ws.client.ExchangeVersionType;
import exchange2013.ws.client.FindItemResponseMessageType;
import exchange2013.ws.client.FindItemResponseType;
import exchange2013.ws.client.FindItemType;
import exchange2013.ws.client.GetItemResponseType;
import exchange2013.ws.client.GetItemType;
import exchange2013.ws.client.ItemInfoResponseMessageType;
import exchange2013.ws.client.ItemQueryTraversalType;
import exchange2013.ws.client.ItemResponseShapeType;
import exchange2013.ws.client.ItemType;
import exchange2013.ws.client.MessageType;
import exchange2013.ws.client.NonEmptyArrayOfBaseFolderIdsType;
import exchange2013.ws.client.NonEmptyArrayOfBaseItemIdsType;
import exchange2013.ws.client.RequestServerVersion;
import exchange2013.ws.client.ResponseClassType;
import exchange2013.ws.client.ResponseMessageType;

@Component
@Service(Connector.class)
public class ExchangeConnector implements Connector {

	private byte priority; // TODO use
	private Set<String> mailingLists;
	private String username;
	private String password;
	private String wsdlPath;
	private boolean mailboxCleanup;
	
	private boolean active = false;
	private ExchangeServicePortType port = null;
	private static final ExchangeVersionType EXCHANGE_VERSION = ExchangeVersionType.EXCHANGE_2013;

	private static final Logger logger = LoggerFactory.getLogger(ExchangeConnector.class);
	@Reference
	private Pipeline mailProcessor;

	public ExchangeConnector() {
		this("config.txt");
		System.out.println("***** ExchangeConnector()");
	}

	public ExchangeConnector(String configFilePath) {
		File configFile = new File(configFilePath);
		if (configFile.exists()) {
			FileInputStream config = null;
			try {
				config = new FileInputStream(configFile);
				Properties props = new Properties();
				props.load(config);

				priority = new Byte(props.getProperty("priority"));
				wsdlPath = props.getProperty("wsdlPath");
				username = props.getProperty("username");
				password = props.getProperty("password");
				password = props.getProperty("password");
				mailboxCleanup = new Boolean(props.getProperty("mailboxCleanup"));
				mailingLists = new HashSet<String>();
				String lists = props.getProperty("lists");
				for (String list : lists.split(",")) {
					mailingLists.add(list.trim());
				}

				// init ExchangeServicePortType
				URL wsdlURL = new URL(wsdlPath);
				ExchangeServices service = new ExchangeServices(
						wsdlURL, 
						new QName("http://schemas.microsoft.com/exchange/services/2006/messages", "ExchangeServices") 
				);
				port = service.getExchangeServicePort();
				NtlmAuthenticator authenticator = new NtlmAuthenticator(username, password);
				Authenticator.setDefault(authenticator);
				
				active = true;
			} catch (IOException e) {
				throw new RuntimeException(e.getMessage());
			} finally {
				if (config != null) {
					try {
						config.close();
					} catch (IOException e) {}
					config = null;				
				}
			}
		}
	}

	public int checkNewMessages(int limit) { 

		List<BaseItemIdType> messageIds = new ArrayList<BaseItemIdType>();
		boolean deletion = false;

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

			findRequest.setTraversal(ItemQueryTraversalType.SHALLOW); // SHALLOW

			RequestServerVersion requestVersion = new RequestServerVersion();
			requestVersion.setVersion(EXCHANGE_VERSION);

			Holder<FindItemResponseType> findItemResult = new Holder<FindItemResponseType>();

			port.findItem(findRequest, requestVersion, findItemResult);

			FindItemResponseType findItemResponse = findItemResult.value;
			ArrayOfResponseMessagesType arrayOfResponseMessages = findItemResponse.getResponseMessages();
			List<JAXBElement<? extends ResponseMessageType>> responseMessageTypeList = arrayOfResponseMessages.getCreateItemResponseMessageOrDeleteItemResponseMessageOrGetItemResponseMessage();
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

			// GET MESSAGES

			GetItemType getRequest = new GetItemType();
			ItemResponseShapeType responseShape2 = new ItemResponseShapeType();
			responseShape2.setBaseShape(DefaultShapeNamesType.ALL_PROPERTIES);
			responseShape2.setBodyType(BodyTypeResponseType.TEXT);
			getRequest.setItemShape(responseShape2);

			NonEmptyArrayOfBaseItemIdsType itemIds = new NonEmptyArrayOfBaseItemIdsType();
			List<BaseItemIdType> itemsList = itemIds.getItemIdOrOccurrenceItemIdOrRecurringMasterItemId();
			itemsList.addAll(messageIds);
			getRequest.setItemIds(itemIds);

			Holder<GetItemResponseType> getItemResult = new Holder<GetItemResponseType>();

			port.getItem(getRequest, requestVersion, getItemResult);

			GetItemResponseType getItemResponse = getItemResult.value;
			ArrayOfResponseMessagesType arrayOfResponseMessages2 = getItemResponse.getResponseMessages();
			List<JAXBElement<? extends ResponseMessageType>> responseMessageTypeList2 = arrayOfResponseMessages2.getCreateItemResponseMessageOrDeleteItemResponseMessageOrGetItemResponseMessage();
			List<Message> messages = new ArrayList<Message>();
			for (JAXBElement<? extends ResponseMessageType> jaxbElement : responseMessageTypeList2) {
				ItemInfoResponseMessageType response = (ItemInfoResponseMessageType) jaxbElement.getValue();
				ArrayOfRealItemsType itemsElement = response.getItems();
				List<ItemType> items = itemsElement.getItemOrMessageOrCalendarItem();
				for( ItemType item : items ) {
					MessageType message = (MessageType) item;
					messages.addAll(convertExchangeMessageToMime4jMessages(message));
				}
			}
			if (mailProcessor.processNewMasseges(messages.iterator())) {
				deletion = mailboxCleanup; 
			}

			return messageIds.size();
		} catch (Exception e){
			logger.info("Error while retrieving messages. {} : {} ", e.toString(), e.getMessage());
			return 0;
		} finally {

			if (deletion) {

				// REMOVE MESSAGES

				DeleteItemType request = new DeleteItemType();

				DisposalType deleteType = DisposalType.HARD_DELETE;
				request.setDeleteType(deleteType);

				NonEmptyArrayOfBaseItemIdsType itemIds = new NonEmptyArrayOfBaseItemIdsType();
				List<BaseItemIdType> itemsList = itemIds.getItemIdOrOccurrenceItemIdOrRecurringMasterItemId();
				itemsList.addAll(messageIds);
				request.setItemIds(itemIds);

				RequestServerVersion requestVersion = new RequestServerVersion();
				requestVersion.setVersion(EXCHANGE_VERSION);

				Holder<DeleteItemResponseType> deleteItemResult = new Holder<DeleteItemResponseType>();

				port.deleteItem(request, requestVersion, deleteItemResult);

				List<JAXBElement<? extends ResponseMessageType>> responseList = deleteItemResult.value.getResponseMessages().getCreateItemResponseMessageOrDeleteItemResponseMessageOrGetItemResponseMessage();
				for (JAXBElement<? extends ResponseMessageType> jaxbElement : responseList) {
					ResponseMessageType responseMessage = jaxbElement.getValue();
					ResponseClassType responseMessageClass = responseMessage.getResponseClass();
					if (responseMessageClass != ResponseClassType.SUCCESS) {
						logger.info("Error while deleting messages from Exchange server. \nCode {} : {}\n", responseMessage.getResponseCode(), responseMessage.getMessageText());
					}
				}
			}
		}
	}


	public List<Message> convertExchangeMessageToMime4jMessages(MessageType in) {

		List<Message> result = new ArrayList<Message>();
		Message sample = new MessageImpl();
		Set<String> recepients = new HashSet<String>();

		Header header = new HeaderImpl();
		// Message-Id
		header.addField(new RawField(FieldName.MESSAGE_ID, in.getInternetMessageId()));
		// In-Reply-To (opt)
		if (in.getInReplyTo() != null) {
			header.addField(new RawField(AdditionalFieldName.IN_REPLY_TO, in.getInReplyTo()));
		}
		sample.setHeader(header);

		// From
		sample.setFrom(convertMailAddressTypeToMailbox(in.getFrom().getMailbox()));

		// To
		final List<Mailbox> toList = convertMailAddressTypeListToMailboxList(in.getToRecipients().getMailbox());
		for (Mailbox mailbox : toList) {
			recepients.add(mailbox.getAddress().trim());
		}
		sample.setTo(toList);

		// Cc (opt)
		if (in.getCcRecipients() != null) {
			final List<Mailbox> ccList = convertMailAddressTypeListToMailboxList(in.getCcRecipients().getMailbox());
			for (Mailbox mailbox : ccList) {
				recepients.add(mailbox.getAddress().trim());
			}
			sample.setCc(ccList);
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
			if (mailingLists.contains(address)) {
				Message out = new MessageImpl();
				out.setBody(sample.getBody());
				Header h = sample.getHeader();
				// List-Id
				h.addField(new RawField(AdditionalFieldName.LIST_ID, "<" + address.replace("@", ".") + ">"));
				out.setHeader(h);
				result.add(out);
			}
		}

		return result;
	}

	@Override
	public boolean isActive() {
		return active;
	}

	private static Mailbox convertMailAddressTypeToMailbox(EmailAddressType in) {
		String[] email = in.getEmailAddress().split("@", 2);
		return new Mailbox(in.getName(), email[0], email[1]);
	}

	private static List<Mailbox> convertMailAddressTypeListToMailboxList(List<EmailAddressType> inList) {
		List<Mailbox> outList = new ArrayList<Mailbox>();
		for (EmailAddressType el : inList) {
			outList.add(convertMailAddressTypeToMailbox(el));
		}
		return outList;
	}

	private static class NtlmAuthenticator extends Authenticator {

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
