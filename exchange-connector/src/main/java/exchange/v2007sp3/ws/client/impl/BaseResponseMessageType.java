
package exchange.v2007sp3.ws.client.impl;

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
    FindFolderResponseType.class,
    DeleteAttachmentResponseType.class,
    MoveItemResponseType.class,
    CopyItemResponseType.class,
    SendItemResponseType.class,
    UpdateItemResponseType.class,
    CreateManagedFolderResponseType.class,
    ConvertIdResponseType.class,
    GetEventsResponseType.class,
    GetFolderResponseType.class,
    SubscribeResponseType.class,
    DeleteItemResponseType.class,
    GetItemResponseType.class,
    UpdateFolderResponseType.class,
    UnsubscribeResponseType.class,
    CreateFolderResponseType.class,
    SendNotificationResponseType.class,
    SyncFolderHierarchyResponseType.class,
    SyncFolderItemsResponseType.class,
    CreateItemResponseType.class,
    ExpandDLResponseType.class,
    FindItemResponseType.class,
    GetAttachmentResponseType.class,
    ResolveNamesResponseType.class,
    CopyFolderResponseType.class,
    DeleteFolderResponseType.class,
    MoveFolderResponseType.class,
    CreateAttachmentResponseType.class
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
