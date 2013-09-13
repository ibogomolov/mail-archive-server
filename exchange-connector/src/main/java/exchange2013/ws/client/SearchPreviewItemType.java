
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *         Mailbox search preview item.
 *       
 * 
 * <p>Java class for SearchPreviewItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchPreviewItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType"/>
 *         &lt;element name="Mailbox" type="{http://schemas.microsoft.com/exchange/services/2006/types}PreviewItemMailboxType" minOccurs="0"/>
 *         &lt;element name="ParentId" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType" minOccurs="0"/>
 *         &lt;element name="ItemClass" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemClassType" minOccurs="0"/>
 *         &lt;element name="UniqueHash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SortValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwaLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToRecipients" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfSmtpAddressType" minOccurs="0"/>
 *         &lt;element name="CcRecipients" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfSmtpAddressType" minOccurs="0"/>
 *         &lt;element name="BccRecipients" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfSmtpAddressType" minOccurs="0"/>
 *         &lt;element name="CreatedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ReceivedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SentTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Preview" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Importance" type="{http://schemas.microsoft.com/exchange/services/2006/types}ImportanceChoicesType" minOccurs="0"/>
 *         &lt;element name="Read" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasAttachment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExtendedProperties" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfExtendedPropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchPreviewItemType", propOrder = {
    "id",
    "mailbox",
    "parentId",
    "itemClass",
    "uniqueHash",
    "sortValue",
    "owaLink",
    "sender",
    "toRecipients",
    "ccRecipients",
    "bccRecipients",
    "createdTime",
    "receivedTime",
    "sentTime",
    "subject",
    "size",
    "preview",
    "importance",
    "read",
    "hasAttachment",
    "extendedProperties"
})
public class SearchPreviewItemType {

    @XmlElement(name = "Id", required = true)
    protected ItemIdType id;
    @XmlElement(name = "Mailbox")
    protected PreviewItemMailboxType mailbox;
    @XmlElement(name = "ParentId")
    protected ItemIdType parentId;
    @XmlElement(name = "ItemClass")
    protected String itemClass;
    @XmlElement(name = "UniqueHash")
    protected String uniqueHash;
    @XmlElement(name = "SortValue")
    protected String sortValue;
    @XmlElement(name = "OwaLink")
    protected String owaLink;
    @XmlElement(name = "Sender")
    protected String sender;
    @XmlElement(name = "ToRecipients")
    protected ArrayOfSmtpAddressType toRecipients;
    @XmlElement(name = "CcRecipients")
    protected ArrayOfSmtpAddressType ccRecipients;
    @XmlElement(name = "BccRecipients")
    protected ArrayOfSmtpAddressType bccRecipients;
    @XmlElement(name = "CreatedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdTime;
    @XmlElement(name = "ReceivedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receivedTime;
    @XmlElement(name = "SentTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sentTime;
    @XmlElement(name = "Subject")
    protected String subject;
    @XmlElement(name = "Size")
    protected Long size;
    @XmlElement(name = "Preview")
    protected String preview;
    @XmlElement(name = "Importance")
    protected ImportanceChoicesType importance;
    @XmlElement(name = "Read")
    protected Boolean read;
    @XmlElement(name = "HasAttachment")
    protected Boolean hasAttachment;
    @XmlElement(name = "ExtendedProperties")
    protected NonEmptyArrayOfExtendedPropertyType extendedProperties;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdType }
     *     
     */
    public ItemIdType getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdType }
     *     
     */
    public void setId(ItemIdType value) {
        this.id = value;
    }

    /**
     * Gets the value of the mailbox property.
     * 
     * @return
     *     possible object is
     *     {@link PreviewItemMailboxType }
     *     
     */
    public PreviewItemMailboxType getMailbox() {
        return mailbox;
    }

    /**
     * Sets the value of the mailbox property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviewItemMailboxType }
     *     
     */
    public void setMailbox(PreviewItemMailboxType value) {
        this.mailbox = value;
    }

    /**
     * Gets the value of the parentId property.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdType }
     *     
     */
    public ItemIdType getParentId() {
        return parentId;
    }

    /**
     * Sets the value of the parentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdType }
     *     
     */
    public void setParentId(ItemIdType value) {
        this.parentId = value;
    }

    /**
     * Gets the value of the itemClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemClass() {
        return itemClass;
    }

    /**
     * Sets the value of the itemClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemClass(String value) {
        this.itemClass = value;
    }

    /**
     * Gets the value of the uniqueHash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueHash() {
        return uniqueHash;
    }

    /**
     * Sets the value of the uniqueHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueHash(String value) {
        this.uniqueHash = value;
    }

    /**
     * Gets the value of the sortValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortValue() {
        return sortValue;
    }

    /**
     * Sets the value of the sortValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortValue(String value) {
        this.sortValue = value;
    }

    /**
     * Gets the value of the owaLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwaLink() {
        return owaLink;
    }

    /**
     * Sets the value of the owaLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwaLink(String value) {
        this.owaLink = value;
    }

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSender(String value) {
        this.sender = value;
    }

    /**
     * Gets the value of the toRecipients property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSmtpAddressType }
     *     
     */
    public ArrayOfSmtpAddressType getToRecipients() {
        return toRecipients;
    }

    /**
     * Sets the value of the toRecipients property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSmtpAddressType }
     *     
     */
    public void setToRecipients(ArrayOfSmtpAddressType value) {
        this.toRecipients = value;
    }

    /**
     * Gets the value of the ccRecipients property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSmtpAddressType }
     *     
     */
    public ArrayOfSmtpAddressType getCcRecipients() {
        return ccRecipients;
    }

    /**
     * Sets the value of the ccRecipients property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSmtpAddressType }
     *     
     */
    public void setCcRecipients(ArrayOfSmtpAddressType value) {
        this.ccRecipients = value;
    }

    /**
     * Gets the value of the bccRecipients property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSmtpAddressType }
     *     
     */
    public ArrayOfSmtpAddressType getBccRecipients() {
        return bccRecipients;
    }

    /**
     * Sets the value of the bccRecipients property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSmtpAddressType }
     *     
     */
    public void setBccRecipients(ArrayOfSmtpAddressType value) {
        this.bccRecipients = value;
    }

    /**
     * Gets the value of the createdTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedTime() {
        return createdTime;
    }

    /**
     * Sets the value of the createdTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedTime(XMLGregorianCalendar value) {
        this.createdTime = value;
    }

    /**
     * Gets the value of the receivedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceivedTime() {
        return receivedTime;
    }

    /**
     * Sets the value of the receivedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceivedTime(XMLGregorianCalendar value) {
        this.receivedTime = value;
    }

    /**
     * Gets the value of the sentTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSentTime() {
        return sentTime;
    }

    /**
     * Sets the value of the sentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSentTime(XMLGregorianCalendar value) {
        this.sentTime = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSize(Long value) {
        this.size = value;
    }

    /**
     * Gets the value of the preview property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreview() {
        return preview;
    }

    /**
     * Sets the value of the preview property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreview(String value) {
        this.preview = value;
    }

    /**
     * Gets the value of the importance property.
     * 
     * @return
     *     possible object is
     *     {@link ImportanceChoicesType }
     *     
     */
    public ImportanceChoicesType getImportance() {
        return importance;
    }

    /**
     * Sets the value of the importance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportanceChoicesType }
     *     
     */
    public void setImportance(ImportanceChoicesType value) {
        this.importance = value;
    }

    /**
     * Gets the value of the read property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRead() {
        return read;
    }

    /**
     * Sets the value of the read property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRead(Boolean value) {
        this.read = value;
    }

    /**
     * Gets the value of the hasAttachment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasAttachment() {
        return hasAttachment;
    }

    /**
     * Sets the value of the hasAttachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasAttachment(Boolean value) {
        this.hasAttachment = value;
    }

    /**
     * Gets the value of the extendedProperties property.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfExtendedPropertyType }
     *     
     */
    public NonEmptyArrayOfExtendedPropertyType getExtendedProperties() {
        return extendedProperties;
    }

    /**
     * Sets the value of the extendedProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfExtendedPropertyType }
     *     
     */
    public void setExtendedProperties(NonEmptyArrayOfExtendedPropertyType value) {
        this.extendedProperties = value;
    }

}
