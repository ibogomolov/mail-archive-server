package org.apache.sling.mailarchiveserver.exchange;

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
import javax.xml.ws.Holder;

import org.apache.felix.scr.annotations.Reference;
import org.apache.james.mime4j.dom.Header;
import org.apache.james.mime4j.dom.Message;
import org.apache.james.mime4j.dom.address.Mailbox;
import org.apache.james.mime4j.message.BodyBuilder;
import org.apache.james.mime4j.message.MessageImpl;
import org.apache.james.mime4j.stream.RawField;
import org.apache.sling.mailarchiveserver.api.Connector;
import org.apache.sling.mailarchiveserver.api.Pipeline;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import exchange2007.ws.client.ArrayOfRealItemsType;
import exchange2007.ws.client.ArrayOfResponseMessagesType;
import exchange2007.ws.client.BaseFolderIdType;
import exchange2007.ws.client.BaseItemIdType;
import exchange2007.ws.client.BodyTypeResponseType;
import exchange2007.ws.client.DefaultShapeNamesType;
import exchange2007.ws.client.DeleteItemResponseType;
import exchange2007.ws.client.DeleteItemType;
import exchange2007.ws.client.DisposalType;
import exchange2007.ws.client.DistinguishedFolderIdNameType;
import exchange2007.ws.client.DistinguishedFolderIdType;
import exchange2007.ws.client.EmailAddressType;
import exchange2007.ws.client.ExchangeServicePortType;
import exchange2007.ws.client.ExchangeServices;
import exchange2007.ws.client.ExchangeVersionType;
import exchange2007.ws.client.FindItemResponseMessageType;
import exchange2007.ws.client.FindItemResponseType;
import exchange2007.ws.client.FindItemType;
import exchange2007.ws.client.GetItemResponseType;
import exchange2007.ws.client.GetItemType;
import exchange2007.ws.client.ItemInfoResponseMessageType;
import exchange2007.ws.client.ItemQueryTraversalType;
import exchange2007.ws.client.ItemResponseShapeType;
import exchange2007.ws.client.ItemType;
import exchange2007.ws.client.MessageType;
import exchange2007.ws.client.NonEmptyArrayOfBaseFolderIdsType;
import exchange2007.ws.client.NonEmptyArrayOfBaseItemIdsType;
import exchange2007.ws.client.RequestServerVersion;
import exchange2007.ws.client.ResponseClassType;
import exchange2007.ws.client.ResponseMessageType;

public class ExchangeConnector implements Connector {

	private byte priority; // PROD not used for now
	private Set<String> mailingLists;
	private String username;
	private String password;
	private String wsdlPath;
	private ExchangeServicePortType port;
	private static final ExchangeVersionType EXCHANGE_VERSION = ExchangeVersionType.EXCHANGE_2013;

	private static final Logger logger = LoggerFactory.getLogger(ExchangeConnector.class);
	@Reference
	private Pipeline mailProcessor;


	public ExchangeConnector(String configFilePath) {
		FileInputStream config = null;
		try {
			config = new FileInputStream(configFilePath);
			Properties props = new Properties();
			props.load(config);

			priority = new Byte(props.getProperty("priority"));
			wsdlPath = props.getProperty("wsdlPath");
			username = props.getProperty("username");
			password = props.getProperty("password");
			mailingLists = new HashSet<String>();
			String lists = props.getProperty("lists");
			for (String list : lists.split(",")) {
				mailingLists.add(list.trim());
			}
			
			// init ExchangeServicePortType
			URL wsdlURL = new URL(wsdlPath);
			ExchangeServices service = new ExchangeServices(wsdlURL);
			port = service.getExchangeServicePort();
			NtlmAuthenticator authenticator = new NtlmAuthenticator(username, password);
			Authenticator.setDefault(authenticator);
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

	@Override
	public int checkNewMessages(int limit) { 

		List<BaseItemIdType> messageIds = null;
		boolean deletion = false; // FIXME set to true

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

			messageIds = new ArrayList<BaseItemIdType>();

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
			if (!mailProcessor.processNewMasseges(messages.iterator())) {
				deletion = false;
			}

			return messageIds.size();

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
						logger.info(String.format("Error while deleting messages from Exchange server. \nCode %s : %s\n", responseMessage.getResponseCode(), responseMessage.getMessageText()));
					}
				}
			}

		}
	}


	public List<Message> convertExchangeMessageToMime4jMessages(MessageType in) {

		List<Message> result = new ArrayList<Message>();
		Message sample = new MessageImpl();
		Set<String> recepients = new HashSet<String>();

		// Message-Id
		sample.createMessageId(in.getInternetMessageId());

		// From (sender)
		sample.setSender(convertMailAddressTypeToMailbox(in.getSender().getMailbox()));

		// To
		final List<Mailbox> toList = convertMailAddressTypeListToMailboxList(in.getToRecipients().getMailbox());
		for (Mailbox mailbox : toList) {
			recepients.add(mailbox.getAddress().trim());
		}
		sample.setTo(toList);

		// Cc
		final List<Mailbox> ccList = convertMailAddressTypeListToMailboxList(in.getCcRecipients().getMailbox());
		for (Mailbox mailbox : ccList) {
			recepients.add(mailbox.getAddress().trim());
		}
		sample.setCc(ccList);

		// Subject
		sample.setSubject(in.getSubject());

		// Date (sent date)
		sample.setDate(in.getDateTimeSent().toGregorianCalendar().getTime());

		// Body
		BodyBuilder bb = BodyBuilder.create();
		bb.setText(in.getBody().getValue());
		sample.setBody(bb.build());

		for (String address : recepients) {
			if (mailingLists.contains(address)) {
				Message out = new MessageImpl();
				out.setBody(sample.getBody());
				Header h = sample.getHeader();
				// In-Reply-To
				h.addField(new RawField(AdditionalFieldName.IN_REPLY_TO, in.getInReplyTo()));
				// List-Id
				h.addField(new RawField(AdditionalFieldName.LIST_ID, address.replace("@", ".")));
				out.setHeader(h);
				result.add(out);
			}
		}

		// TODO remove
		System.out.println("*** begin ***");
		//		String title = in.getItemId().getId() +"  "+ in.getItemId().getChangeKey();
		//		System.out.println(title + ":");
		//		System.out.println("\t getOriginalDisplayName: "+in.getSender().getMailbox().getOriginalDisplayName());
		//		System.out.println("\t getSender().getMailbox().getName: "+in.getSender().getMailbox().getName());
		//		System.out.println("\t getSender().getMailbox().getEmailAddress: "+in.getSender().getMailbox().getEmailAddress());
		//		System.out.println("\t getRoutingType: "+in.getSender().getMailbox().getRoutingType());
		//		System.out.println("\t getMailboxType().name: "+in.getSender().getMailbox().getMailboxType().name());
		//		System.out.println("\t getItemId().getId: "+in.getSender().getMailbox().getItemId().getId()); // NPE
		//		System.out.println("\tDate: "+in.getDateTimeSent());
		//		System.out.println("\tBody: "+in.getBody().getValue());
		//		System.out.println("\t getCulture: "+in.getCulture()); // en-US
		//		System.out.println("\tSubj: "+in.getSubject());
		//		System.out.println("\t getConversationTopic: "+in.getConversationTopic());
		//		System.out.println("\t getToRecipients: "+in.getToRecipients().getMailbox().get(0).getEmailAddress());
		//		System.out.println("\t getCcRecipients: "+in.getCcRecipients().getMailbox().get(0).getEmailAddress());
		//		System.out.println("\t getBccRecipients: "+in.getBccRecipients().getMailbox().get(0).getEmailAddress()); NPE
		//		System.out.println("\t getDisplayTo: "+in.getDisplayTo());
		//		System.out.println("\t getFrom().getMailbox().getName: "+in.getFrom().getMailbox().getName());
		//		System.out.println("\t getFrom().getMailbox().getEmailAddress: "+in.getFrom().getMailbox().getEmailAddress());
		//		System.out.println("\t getUniqueBody().getValue: "+in.getUniqueBody().getValue()); // NPE
		//		System.out.println("\t getInReplyTo:  "+in.getInReplyTo()); // this =
		//		System.out.println("\t getReferences: "+in.getReferences()); // = that
		//		System.out.println("\t getInternetMessageId: "+in.getInternetMessageId()); // this is Message-Id
		//		System.out.println("\t getReceivedBy().getMailbox().getName: "+in.getReceivedBy().getMailbox().getName());
		//		System.out.println("\t getReceivedBy().getMailbox().getEmailAddress: "+in.getReceivedBy().getMailbox().getEmailAddress());
		//		System.out.println("\t getCulture: "+in.get);
		//		System.out.println("\t getCulture: "+in.get);
		//		System.out.println("\t getCulture: "+in.get);
		//		System.out.println("\t getCulture: "+in.get);
		System.out.println("*** EOM ***\n");

		return result;
	}

	private static Mailbox convertMailAddressTypeToMailbox(EmailAddressType in) {
		String[] email = in.getEmailAddress().split("@", 2);
		return new Mailbox(in.getName(), email[0], email[1]);
	}

	private static List<Mailbox> convertMailAddressTypeListToMailboxList(List<EmailAddressType> inList) {
		List<Mailbox> outList = new ArrayList<>();
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
