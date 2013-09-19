
package exchange2013.ws.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfResponseMessagesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfResponseMessagesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="CreateItemResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ItemInfoResponseMessageType"/>
 *         &lt;element name="DeleteItemResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"/>
 *         &lt;element name="GetItemResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ItemInfoResponseMessageType"/>
 *         &lt;element name="UpdateItemResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}UpdateItemResponseMessageType"/>
 *         &lt;element name="UpdateItemInRecoverableItemsResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}UpdateItemInRecoverableItemsResponseMessageType"/>
 *         &lt;element name="SendItemResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"/>
 *         &lt;element name="DeleteFolderResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"/>
 *         &lt;element name="EmptyFolderResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"/>
 *         &lt;element name="CreateFolderResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}FolderInfoResponseMessageType"/>
 *         &lt;element name="GetFolderResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}FolderInfoResponseMessageType"/>
 *         &lt;element name="FindFolderResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}FindFolderResponseMessageType"/>
 *         &lt;element name="UpdateFolderResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}FolderInfoResponseMessageType"/>
 *         &lt;element name="MoveFolderResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}FolderInfoResponseMessageType"/>
 *         &lt;element name="CopyFolderResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}FolderInfoResponseMessageType"/>
 *         &lt;element name="CreateFolderPathResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}FolderInfoResponseMessageType"/>
 *         &lt;element name="CreateAttachmentResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}AttachmentInfoResponseMessageType"/>
 *         &lt;element name="DeleteAttachmentResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}DeleteAttachmentResponseMessageType"/>
 *         &lt;element name="GetAttachmentResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}AttachmentInfoResponseMessageType"/>
 *         &lt;element name="UploadItemsResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}UploadItemsResponseMessageType"/>
 *         &lt;element name="ExportItemsResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ExportItemsResponseMessageType"/>
 *         &lt;element name="MarkAllItemsAsReadResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"/>
 *         &lt;element name="GetClientAccessTokenResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}GetClientAccessTokenResponseMessageType"/>
 *         &lt;element name="GetAppManifestsResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"/>
 *         &lt;element name="GetClientExtensionResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"/>
 *         &lt;element name="SetClientExtensionResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"/>
 *         &lt;element name="FindItemResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}FindItemResponseMessageType"/>
 *         &lt;element name="MoveItemResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ItemInfoResponseMessageType"/>
 *         &lt;element name="ArchiveItemResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ItemInfoResponseMessageType"/>
 *         &lt;element name="CopyItemResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ItemInfoResponseMessageType"/>
 *         &lt;element name="ResolveNamesResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ResolveNamesResponseMessageType"/>
 *         &lt;element name="ExpandDLResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ExpandDLResponseMessageType"/>
 *         &lt;element name="GetServerTimeZonesResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}GetServerTimeZonesResponseMessageType"/>
 *         &lt;element name="GetEventsResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}GetEventsResponseMessageType"/>
 *         &lt;element name="GetStreamingEventsResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}GetStreamingEventsResponseMessageType"/>
 *         &lt;element name="SubscribeResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}SubscribeResponseMessageType"/>
 *         &lt;element name="UnsubscribeResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"/>
 *         &lt;element name="SendNotificationResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}SendNotificationResponseMessageType"/>
 *         &lt;element name="SyncFolderHierarchyResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}SyncFolderHierarchyResponseMessageType"/>
 *         &lt;element name="SyncFolderItemsResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}SyncFolderItemsResponseMessageType"/>
 *         &lt;element name="CreateManagedFolderResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}FolderInfoResponseMessageType"/>
 *         &lt;element name="ConvertIdResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ConvertIdResponseMessageType"/>
 *         &lt;element name="GetSharingMetadataResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}GetSharingMetadataResponseMessageType"/>
 *         &lt;element name="RefreshSharingFolderResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}RefreshSharingFolderResponseMessageType"/>
 *         &lt;element name="GetSharingFolderResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}GetSharingFolderResponseMessageType"/>
 *         &lt;element name="CreateUserConfigurationResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"/>
 *         &lt;element name="DeleteUserConfigurationResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"/>
 *         &lt;element name="GetUserConfigurationResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}GetUserConfigurationResponseMessageType"/>
 *         &lt;element name="UpdateUserConfigurationResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"/>
 *         &lt;element name="GetRoomListsResponse" type="{http://schemas.microsoft.com/exchange/services/2006/messages}GetRoomListsResponseMessageType"/>
 *         &lt;element name="GetRoomsResponse" type="{http://schemas.microsoft.com/exchange/services/2006/messages}GetRoomsResponseMessageType"/>
 *         &lt;element name="GetRemindersResponse" type="{http://schemas.microsoft.com/exchange/services/2006/messages}GetRemindersResponseMessageType"/>
 *         &lt;element name="PerformReminderActionResponse" type="{http://schemas.microsoft.com/exchange/services/2006/messages}PerformReminderActionResponseMessageType"/>
 *         &lt;element name="ApplyConversationActionResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"/>
 *         &lt;element name="FindMailboxStatisticsByKeywordsResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}FindMailboxStatisticsByKeywordsResponseMessageType"/>
 *         &lt;element name="GetSearchableMailboxesResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}GetSearchableMailboxesResponseMessageType"/>
 *         &lt;element name="SearchMailboxesResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}SearchMailboxesResponseMessageType"/>
 *         &lt;element name="GetDiscoverySearchConfigurationResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}GetDiscoverySearchConfigurationResponseMessageType"/>
 *         &lt;element name="GetHoldOnMailboxesResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}GetHoldOnMailboxesResponseMessageType"/>
 *         &lt;element name="SetHoldOnMailboxesResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}SetHoldOnMailboxesResponseMessageType"/>
 *         &lt;element name="GetNonIndexableItemStatisticsResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}GetNonIndexableItemStatisticsResponseMessageType"/>
 *         &lt;element name="GetNonIndexableItemDetailsResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}GetNonIndexableItemDetailsResponseMessageType"/>
 *         &lt;element name="FindPeopleResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}FindPeopleResponseMessageType"/>
 *         &lt;element name="GetPasswordExpirationDateResponse" type="{http://schemas.microsoft.com/exchange/services/2006/messages}GetPasswordExpirationDateResponseMessageType"/>
 *         &lt;element name="GetPersonaResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}GetPersonaResponseMessageType"/>
 *         &lt;element name="GetConversationItemsResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}GetConversationItemsResponseMessageType"/>
 *         &lt;element name="GetUserRetentionPolicyTagsResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}GetUserRetentionPolicyTagsResponseMessageType"/>
 *         &lt;element name="GetUserPhotoResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}GetUserPhotoResponseMessageType"/>
 *         &lt;element name="MarkAsJunkResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}MarkAsJunkResponseMessageType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfResponseMessagesType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "createItemResponseMessageOrDeleteItemResponseMessageOrGetItemResponseMessage"
})
public class ArrayOfResponseMessagesType {

    @XmlElementRefs({
        @XmlElementRef(name = "GetNonIndexableItemDetailsResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "EmptyFolderResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "UploadItemsResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "CreateAttachmentResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "GetNonIndexableItemStatisticsResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "GetAttachmentResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "UpdateFolderResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "UpdateItemResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "MarkAsJunkResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "ConvertIdResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "MoveFolderResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "GetEventsResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "PerformReminderActionResponse", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "GetDiscoverySearchConfigurationResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "GetRoomListsResponse", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "GetHoldOnMailboxesResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "SendNotificationResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "FindPeopleResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "FindItemResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "UpdateUserConfigurationResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "UnsubscribeResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "CreateManagedFolderResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "SendItemResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "GetRoomsResponse", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "SyncFolderHierarchyResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "GetPasswordExpirationDateResponse", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "GetUserRetentionPolicyTagsResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "SetClientExtensionResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "DeleteItemResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "CreateUserConfigurationResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "CopyFolderResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "GetServerTimeZonesResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "GetSharingFolderResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "GetUserConfigurationResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "SetHoldOnMailboxesResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "CopyItemResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "GetRemindersResponse", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "DeleteUserConfigurationResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "MoveItemResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "GetSharingMetadataResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "GetClientAccessTokenResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "ArchiveItemResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "GetItemResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "ExportItemsResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "CreateFolderPathResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "GetUserPhotoResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "GetPersonaResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "CreateFolderResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "GetStreamingEventsResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "GetSearchableMailboxesResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "FindFolderResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "DeleteAttachmentResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "SearchMailboxesResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "GetFolderResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "MarkAllItemsAsReadResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "ApplyConversationActionResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "DeleteFolderResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "CreateItemResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "SyncFolderItemsResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "RefreshSharingFolderResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "UpdateItemInRecoverableItemsResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "GetConversationItemsResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "ResolveNamesResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "GetClientExtensionResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "FindMailboxStatisticsByKeywordsResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "GetAppManifestsResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "SubscribeResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class),
        @XmlElementRef(name = "ExpandDLResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class)
    })
    protected List<JAXBElement<? extends ResponseMessageType>> createItemResponseMessageOrDeleteItemResponseMessageOrGetItemResponseMessage;

    /**
     * Gets the value of the createItemResponseMessageOrDeleteItemResponseMessageOrGetItemResponseMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the createItemResponseMessageOrDeleteItemResponseMessageOrGetItemResponseMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreateItemResponseMessageOrDeleteItemResponseMessageOrGetItemResponseMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link GetNonIndexableItemDetailsResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link UploadItemsResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link AttachmentInfoResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetNonIndexableItemStatisticsResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link FolderInfoResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link AttachmentInfoResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link UpdateItemResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link MarkAsJunkResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConvertIdResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link FolderInfoResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetEventsResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link PerformReminderActionResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetDiscoverySearchConfigurationResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetRoomListsResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link SendNotificationResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetHoldOnMailboxesResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link FindPeopleResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link FindItemResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link FolderInfoResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetRoomsResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link SyncFolderHierarchyResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetPasswordExpirationDateResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetUserRetentionPolicyTagsResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link FolderInfoResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetSharingFolderResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetServerTimeZonesResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetUserConfigurationResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link SetHoldOnMailboxesResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ItemInfoResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ItemInfoResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetRemindersResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetClientAccessTokenResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetSharingMetadataResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ItemInfoResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ItemInfoResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ExportItemsResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetUserPhotoResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link FolderInfoResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link FolderInfoResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetPersonaResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetStreamingEventsResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link DeleteAttachmentResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link FindFolderResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetSearchableMailboxesResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link SearchMailboxesResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link FolderInfoResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link SyncFolderItemsResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ItemInfoResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link RefreshSharingFolderResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link UpdateItemInRecoverableItemsResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetConversationItemsResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResolveNamesResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link FindMailboxStatisticsByKeywordsResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link SubscribeResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ExpandDLResponseMessageType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends ResponseMessageType>> getCreateItemResponseMessageOrDeleteItemResponseMessageOrGetItemResponseMessage() {
        if (createItemResponseMessageOrDeleteItemResponseMessageOrGetItemResponseMessage == null) {
            createItemResponseMessageOrDeleteItemResponseMessageOrGetItemResponseMessage = new ArrayList<JAXBElement<? extends ResponseMessageType>>();
        }
        return this.createItemResponseMessageOrDeleteItemResponseMessageOrGetItemResponseMessage;
    }

}
