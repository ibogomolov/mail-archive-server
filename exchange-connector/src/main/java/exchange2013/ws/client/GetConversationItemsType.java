
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetConversationItemsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetConversationItemsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="ItemShape" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemResponseShapeType"/>
 *         &lt;element name="FoldersToIgnore" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfBaseFolderIdsType" minOccurs="0"/>
 *         &lt;element name="MaxItemsToReturn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SortOrder" type="{http://schemas.microsoft.com/exchange/services/2006/types}ConversationNodeSortOrder" minOccurs="0"/>
 *         &lt;element name="MailboxScope" type="{http://schemas.microsoft.com/exchange/services/2006/types}MailboxSearchLocationType" minOccurs="0"/>
 *         &lt;element name="Conversations" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfConversationRequestsType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetConversationItemsType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "itemShape",
    "foldersToIgnore",
    "maxItemsToReturn",
    "sortOrder",
    "mailboxScope",
    "conversations"
})
public class GetConversationItemsType
    extends BaseRequestType
{

    @XmlElement(name = "ItemShape", required = true)
    protected ItemResponseShapeType itemShape;
    @XmlElement(name = "FoldersToIgnore")
    protected NonEmptyArrayOfBaseFolderIdsType foldersToIgnore;
    @XmlElement(name = "MaxItemsToReturn")
    protected Integer maxItemsToReturn;
    @XmlElement(name = "SortOrder")
    protected ConversationNodeSortOrder sortOrder;
    @XmlElement(name = "MailboxScope")
    protected MailboxSearchLocationType mailboxScope;
    @XmlElement(name = "Conversations", required = true)
    protected ArrayOfConversationRequestsType conversations;

    /**
     * Gets the value of the itemShape property.
     * 
     * @return
     *     possible object is
     *     {@link ItemResponseShapeType }
     *     
     */
    public ItemResponseShapeType getItemShape() {
        return itemShape;
    }

    /**
     * Sets the value of the itemShape property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemResponseShapeType }
     *     
     */
    public void setItemShape(ItemResponseShapeType value) {
        this.itemShape = value;
    }

    /**
     * Gets the value of the foldersToIgnore property.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfBaseFolderIdsType }
     *     
     */
    public NonEmptyArrayOfBaseFolderIdsType getFoldersToIgnore() {
        return foldersToIgnore;
    }

    /**
     * Sets the value of the foldersToIgnore property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfBaseFolderIdsType }
     *     
     */
    public void setFoldersToIgnore(NonEmptyArrayOfBaseFolderIdsType value) {
        this.foldersToIgnore = value;
    }

    /**
     * Gets the value of the maxItemsToReturn property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxItemsToReturn() {
        return maxItemsToReturn;
    }

    /**
     * Sets the value of the maxItemsToReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxItemsToReturn(Integer value) {
        this.maxItemsToReturn = value;
    }

    /**
     * Gets the value of the sortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link ConversationNodeSortOrder }
     *     
     */
    public ConversationNodeSortOrder getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversationNodeSortOrder }
     *     
     */
    public void setSortOrder(ConversationNodeSortOrder value) {
        this.sortOrder = value;
    }

    /**
     * Gets the value of the mailboxScope property.
     * 
     * @return
     *     possible object is
     *     {@link MailboxSearchLocationType }
     *     
     */
    public MailboxSearchLocationType getMailboxScope() {
        return mailboxScope;
    }

    /**
     * Sets the value of the mailboxScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailboxSearchLocationType }
     *     
     */
    public void setMailboxScope(MailboxSearchLocationType value) {
        this.mailboxScope = value;
    }

    /**
     * Gets the value of the conversations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfConversationRequestsType }
     *     
     */
    public ArrayOfConversationRequestsType getConversations() {
        return conversations;
    }

    /**
     * Sets the value of the conversations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfConversationRequestsType }
     *     
     */
    public void setConversations(ArrayOfConversationRequestsType value) {
        this.conversations = value;
    }

}
