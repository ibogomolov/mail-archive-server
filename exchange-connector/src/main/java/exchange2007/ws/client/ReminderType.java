
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ReminderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReminderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReminderTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ItemId" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType"/>
 *         &lt;element name="RecurringMasterItemId" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType" minOccurs="0"/>
 *         &lt;element name="ReminderGroup" type="{http://schemas.microsoft.com/exchange/services/2006/types}ReminderGroupType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReminderType", propOrder = {
    "subject",
    "location",
    "reminderTime",
    "startDate",
    "endDate",
    "itemId",
    "recurringMasterItemId",
    "reminderGroup"
})
public class ReminderType {

    @XmlElement(name = "Subject", required = true)
    protected String subject;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "ReminderTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reminderTime;
    @XmlElement(name = "StartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "EndDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "ItemId", required = true)
    protected ItemIdType itemId;
    @XmlElement(name = "RecurringMasterItemId")
    protected ItemIdType recurringMasterItemId;
    @XmlElement(name = "ReminderGroup")
    protected ReminderGroupType reminderGroup;

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
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the reminderTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReminderTime() {
        return reminderTime;
    }

    /**
     * Sets the value of the reminderTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReminderTime(XMLGregorianCalendar value) {
        this.reminderTime = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the itemId property.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdType }
     *     
     */
    public ItemIdType getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdType }
     *     
     */
    public void setItemId(ItemIdType value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the recurringMasterItemId property.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdType }
     *     
     */
    public ItemIdType getRecurringMasterItemId() {
        return recurringMasterItemId;
    }

    /**
     * Sets the value of the recurringMasterItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdType }
     *     
     */
    public void setRecurringMasterItemId(ItemIdType value) {
        this.recurringMasterItemId = value;
    }

    /**
     * Gets the value of the reminderGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ReminderGroupType }
     *     
     */
    public ReminderGroupType getReminderGroup() {
        return reminderGroup;
    }

    /**
     * Sets the value of the reminderGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReminderGroupType }
     *     
     */
    public void setReminderGroup(ReminderGroupType value) {
        this.reminderGroup = value;
    }

}
