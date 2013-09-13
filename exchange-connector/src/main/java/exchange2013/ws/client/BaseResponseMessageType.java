
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseResponseMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseResponseMessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResponseMessages" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ArrayOfResponseMessagesType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "responseMessages"
})
@XmlSeeAlso({
    DeleteAttachmentResponseType.class,
    MoveItemResponseType.class,
    UpdateItemResponseType.class,
    GetEventsResponseType.class,
    UpdateItemInRecoverableItemsResponseType.class,
    GetStreamingEventsResponseType.class,
    GetServerTimeZonesResponseType.class,
    GetAttachmentResponseType.class,
    CreateFolderPathResponseType.class,
    DeleteFolderResponseType.class,
    CreateAttachmentResponseType.class,
    FindFolderResponseType.class,
    CopyItemResponseType.class,
    MarkAsJunkResponseType.class,
    DeleteUserConfigurationResponseType.class,
    FindMailboxStatisticsByKeywordsResponseType.class,
    GetFolderResponseType.class,
    SubscribeResponseType.class,
    DeleteItemResponseType.class,
    UnsubscribeResponseType.class,
    CopyFolderResponseType.class,
    GetConversationItemsResponseType.class,
    SendItemResponseType.class,
    ApplyConversationActionResponseType.class,
    GetClientAccessTokenResponseType.class,
    GetUserConfigurationResponseType.class,
    CreateManagedFolderResponseType.class,
    ConvertIdResponseType.class,
    CreateUserConfigurationResponseType.class,
    UpdateFolderResponseType.class,
    SendNotificationResponseType.class,
    SyncFolderHierarchyResponseType.class,
    SyncFolderItemsResponseType.class,
    UpdateUserConfigurationResponseType.class,
    ExpandDLResponseType.class,
    CreateItemResponseType.class,
    SearchMailboxesResponseType.class,
    MarkAllItemsAsReadResponseType.class,
    ExportItemsResponseType.class,
    SetClientExtensionResponseType.class,
    GetItemResponseType.class,
    UploadItemsResponseType.class,
    CreateFolderResponseType.class,
    ArchiveItemResponseType.class,
    FindItemResponseType.class,
    EmptyFolderResponseType.class,
    ResolveNamesResponseType.class,
    MoveFolderResponseType.class,
    GetUserPhotoResponseType.class
})
public class BaseResponseMessageType {

    @XmlElement(name = "ResponseMessages", required = true)
    protected ArrayOfResponseMessagesType responseMessages;

    /**
     * Gets the value of the responseMessages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfResponseMessagesType }
     *     
     */
    public ArrayOfResponseMessagesType getResponseMessages() {
        return responseMessages;
    }

    /**
     * Sets the value of the responseMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfResponseMessagesType }
     *     
     */
    public void setResponseMessages(ArrayOfResponseMessagesType value) {
        this.responseMessages = value;
    }

}
