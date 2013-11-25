
package exchange.v2007sp3.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseRequestType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages")
@XmlSeeAlso({
    GetEventsType.class,
    FindFolderType.class,
    UpdateFolderType.class,
    FindItemType.class,
    CreateItemType.class,
    GetFolderType.class,
    SubscribeType.class,
    CreateManagedFolderRequestType.class,
    UpdateItemType.class,
    DeleteFolderType.class,
    ConvertIdType.class,
    SetUserOofSettingsRequest.class,
    CreateAttachmentType.class,
    GetUserOofSettingsRequest.class,
    ExpandDLType.class,
    SyncFolderItemsType.class,
    GetUserAvailabilityRequestType.class,
    DeleteAttachmentType.class,
    SendItemType.class,
    DeleteItemType.class,
    GetItemType.class,
    CreateFolderType.class,
    ResolveNamesType.class,
    SyncFolderHierarchyType.class,
    GetAttachmentType.class,
    UnsubscribeType.class,
    BaseMoveCopyItemType.class,
    BaseDelegateType.class,
    BaseMoveCopyFolderType.class
})
public abstract class BaseRequestType {


}
