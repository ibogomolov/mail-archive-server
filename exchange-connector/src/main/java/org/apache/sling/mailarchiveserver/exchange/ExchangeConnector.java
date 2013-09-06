package org.apache.sling.mailarchiveserver.exchange;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.Authenticator;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.xml.bind.JAXBElement;
import javax.xml.ws.Holder;

import exchange2007.ws.client.ArrayOfRealItemsType;
import exchange2007.ws.client.ArrayOfResponseMessagesType;
import exchange2007.ws.client.BaseFolderIdType;
import exchange2007.ws.client.BaseItemIdType;
import exchange2007.ws.client.BodyTypeResponseType;
import exchange2007.ws.client.DefaultShapeNamesType;
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
import exchange2007.ws.client.ResponseMessageType;

//@Component
public class ExchangeConnector {

	private static final String CONFIG_FILE = "/Users/bogomolo/workspace/MailArchiveServer/launchpad/config.txt"; // TODO change
	private static String USERNAME;
	private static String PASSWORD;
	private static String WSDL_FILE_LOCATION;
//	private static final Logger logger = LoggerFactory.getLogger(ExchangeConnector.class);
	
//	@Activate
	public void activate() throws IOException {
		FileInputStream config = null;
		try {
			config = new FileInputStream(CONFIG_FILE);
			Properties props = new Properties();
			props.load(config);
			WSDL_FILE_LOCATION = props.getProperty("wsdlPath");
			USERNAME = props.getProperty("username");
			PASSWORD = props.getProperty("password");
//			logger.info("Configuration loaded from file."); // TODO uncomment
		} finally {
			if (config != null) {
				config.close();
				config = null;				
			}
		}
	}

	public void getNewMessages() throws MalformedURLException { 

		// TODO fixme for production
		
		try {
			activate();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		URL wsdlURL = new URL(WSDL_FILE_LOCATION);
//		ExchangeServices service = new ExchangeServices(wsdlURL);
		ExchangeServices service = new ExchangeServices();
		ExchangeServicePortType port = service.getExchangeServicePort();
		NtlmAuthenticator authenticator = new NtlmAuthenticator(USERNAME, PASSWORD);
		Authenticator.setDefault(authenticator);

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
		requestVersion.setVersion(ExchangeVersionType.EXCHANGE_2013);

		Holder<FindItemResponseType> findItemResult = new Holder<FindItemResponseType>();

		port.findItem(findRequest, requestVersion, findItemResult);

		List<BaseItemIdType> messagesId = new ArrayList<BaseItemIdType>();

		FindItemResponseType findItemResponse = findItemResult.value;
		ArrayOfResponseMessagesType arrayOfResponseMessages = findItemResponse.getResponseMessages();
		List<JAXBElement<? extends ResponseMessageType>> responseMessageTypeList = arrayOfResponseMessages.getCreateItemResponseMessageOrDeleteItemResponseMessageOrGetItemResponseMessage();
		for (JAXBElement<? extends ResponseMessageType> jaxbElement : responseMessageTypeList) {
			FindItemResponseMessageType response = (FindItemResponseMessageType) jaxbElement.getValue();

			ArrayOfRealItemsType itemsElement = response.getRootFolder().getItems();
			List<ItemType> items = itemsElement.getItemOrMessageOrCalendarItem();
			for( ItemType item : items ) {
				MessageType message = (MessageType) item;
				messagesId.add(message.getItemId());
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
		itemsList.addAll(messagesId);
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
			for( ItemType item : items ) {
				MessageType message = (MessageType) item;
				String title = message.getItemId().getId() +"  "+ message.getItemId().getChangeKey();
				System.out.println(title + ":");
				System.out.println("\tSubj: "+message.getSubject());
				System.out.println("\tFrom: "+message.getSender().getMailbox().getName());
				System.out.println("\tFrom: "+message.getSender().getMailbox().getEmailAddress());
				System.out.println("\tFrom: "+message.getSender().getMailbox().getMailboxType().name());
				System.out.println("\tFrom: "+message.getSender().getMailbox().getRoutingType());
				System.out.println("\tDate: "+message.getDateTimeSent());
				System.out.println("\tBody: "+message.getBody().getValue());
				System.out.println("*** EOM ***\n");
			}
		}

		// DELETE MESSAGES

		//		port.deleteItem(request, requestVersion, deleteItemResult); 
		// FIXME continue
		
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
