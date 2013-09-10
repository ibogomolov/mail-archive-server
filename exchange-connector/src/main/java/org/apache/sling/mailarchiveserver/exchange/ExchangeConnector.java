package org.apache.sling.mailarchiveserver.exchange;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.Authenticator;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.xml.bind.JAXBElement;
import javax.xml.ws.Holder;

import org.apache.felix.scr.annotations.Reference;
import org.apache.james.mime4j.dom.Message;
import org.apache.james.mime4j.message.MessageImpl;
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

	private byte priority;

	private String username;
	private String password;
	private String wsdlPath;
	private ExchangeServicePortType port;
	private static final ExchangeVersionType EXCHANGE_VERSION = ExchangeVersionType.EXCHANGE_2013;

	private static final Logger logger = LoggerFactory.getLogger(ExchangeConnector.class);
	@Reference
	private Pipeline mailProcessor;


	public ExchangeConnector(String configFilePath) {
		// TODO refactor
		FileInputStream config = null;
		try {
			config = new FileInputStream(configFilePath);
			Properties props = new Properties();
			props.load(config);

			priority = new Byte(props.getProperty("priority"));
			setExchangeServerCredentialsAndInitializeServicePort(props);
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

	public ExchangeConnector(byte priority, String credentialsFilePath) {
		Properties props = getPropertiesFromFile(credentialsFilePath);
		this.priority = priority;
		setExchangeServerCredentialsAndInitializeServicePort(props);
	}

	private void setExchangeServerCredentialsAndInitializeServicePort(Properties props) {
		wsdlPath = props.getProperty("wsdlPath");
		username = props.getProperty("username");
		password = props.getProperty("password");
		initExchangeServicePortType();
	}

	private ExchangeServicePortType initExchangeServicePortType() {
		URL wsdlURL = null;
		try {
			wsdlURL = new URL(wsdlPath);
		} catch (MalformedURLException e) {
			throw new RuntimeException(e.getMessage());
		}
		ExchangeServices service = new ExchangeServices(wsdlURL);
		ExchangeServicePortType port = service.getExchangeServicePort();
		NtlmAuthenticator authenticator = new NtlmAuthenticator(username, password);
		Authenticator.setDefault(authenticator);
		return port;
	}

	public static Properties getPropertiesFromFile(String path) {
		FileInputStream config = null;
		try {
			config = new FileInputStream(path);
			Properties props = new Properties();
			props.load(config);
			logger.info("Configuration loaded from file."); 
			return props;
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
		boolean deletion = true;

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
			for (JAXBElement<? extends ResponseMessageType> jaxbElement : responseMessageTypeList2) {
				ItemInfoResponseMessageType response = (ItemInfoResponseMessageType) jaxbElement.getValue();
				ArrayOfRealItemsType itemsElement = response.getItems();
				List<ItemType> items = itemsElement.getItemOrMessageOrCalendarItem();
				List<Message> messages = new ArrayList<Message>();
				for( ItemType item : items ) {
					MessageType message = (MessageType) item;
					Message mime4jMessage = convertExchangeMessageToMime4jMessage(message);
					messages.add(mime4jMessage);
				}
				if (!mailProcessor.processNewMasseges(messages.iterator())) {
					deletion = false;
					break;
				}
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


	public static Message convertExchangeMessageToMime4jMessage(MessageType in) {
		// TODO write
		Message out = new MessageImpl();
		//		out.se

		//		String title = message.getItemId().getId() +"  "+ message.getItemId().getChangeKey();
		//				System.out.println(title + ":");
		//				System.out.println("\tSubj: "+message.getSubject());
		//				System.out.println("\tFrom: "+message.getSender().getMailbox().getName());
		//				System.out.println("\tFrom: "+message.getSender().getMailbox().getEmailAddress());
		//				System.out.println("\tFrom: "+message.getSender().getMailbox().getMailboxType().name());
		//				System.out.println("\tFrom: "+message.getSender().getMailbox().getRoutingType());
		//				System.out.println("\tDate: "+message.getDateTimeSent());
		//				System.out.println("\tBody: "+message.getBody().getValue());
		//				System.out.println("*** EOM ***\n");

		return out;
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
