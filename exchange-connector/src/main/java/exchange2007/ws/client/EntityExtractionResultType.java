
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityExtractionResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityExtractionResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Addresses" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfAddressEntitiesType" minOccurs="0"/>
 *         &lt;element name="MeetingSuggestions" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfMeetingSuggestionsType" minOccurs="0"/>
 *         &lt;element name="TaskSuggestions" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfTaskSuggestionsType" minOccurs="0"/>
 *         &lt;element name="EmailAddresses" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfEmailAddressEntitiesType" minOccurs="0"/>
 *         &lt;element name="Contacts" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfContactsType" minOccurs="0"/>
 *         &lt;element name="Urls" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfUrlEntitiesType" minOccurs="0"/>
 *         &lt;element name="PhoneNumbers" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPhoneEntitiesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityExtractionResultType", propOrder = {
    "addresses",
    "meetingSuggestions",
    "taskSuggestions",
    "emailAddresses",
    "contacts",
    "urls",
    "phoneNumbers"
})
public class EntityExtractionResultType {

    @XmlElement(name = "Addresses")
    protected ArrayOfAddressEntitiesType addresses;
    @XmlElement(name = "MeetingSuggestions")
    protected ArrayOfMeetingSuggestionsType meetingSuggestions;
    @XmlElement(name = "TaskSuggestions")
    protected ArrayOfTaskSuggestionsType taskSuggestions;
    @XmlElement(name = "EmailAddresses")
    protected ArrayOfEmailAddressEntitiesType emailAddresses;
    @XmlElement(name = "Contacts")
    protected ArrayOfContactsType contacts;
    @XmlElement(name = "Urls")
    protected ArrayOfUrlEntitiesType urls;
    @XmlElement(name = "PhoneNumbers")
    protected ArrayOfPhoneEntitiesType phoneNumbers;

    /**
     * Gets the value of the addresses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAddressEntitiesType }
     *     
     */
    public ArrayOfAddressEntitiesType getAddresses() {
        return addresses;
    }

    /**
     * Sets the value of the addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAddressEntitiesType }
     *     
     */
    public void setAddresses(ArrayOfAddressEntitiesType value) {
        this.addresses = value;
    }

    /**
     * Gets the value of the meetingSuggestions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMeetingSuggestionsType }
     *     
     */
    public ArrayOfMeetingSuggestionsType getMeetingSuggestions() {
        return meetingSuggestions;
    }

    /**
     * Sets the value of the meetingSuggestions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMeetingSuggestionsType }
     *     
     */
    public void setMeetingSuggestions(ArrayOfMeetingSuggestionsType value) {
        this.meetingSuggestions = value;
    }

    /**
     * Gets the value of the taskSuggestions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTaskSuggestionsType }
     *     
     */
    public ArrayOfTaskSuggestionsType getTaskSuggestions() {
        return taskSuggestions;
    }

    /**
     * Sets the value of the taskSuggestions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTaskSuggestionsType }
     *     
     */
    public void setTaskSuggestions(ArrayOfTaskSuggestionsType value) {
        this.taskSuggestions = value;
    }

    /**
     * Gets the value of the emailAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEmailAddressEntitiesType }
     *     
     */
    public ArrayOfEmailAddressEntitiesType getEmailAddresses() {
        return emailAddresses;
    }

    /**
     * Sets the value of the emailAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEmailAddressEntitiesType }
     *     
     */
    public void setEmailAddresses(ArrayOfEmailAddressEntitiesType value) {
        this.emailAddresses = value;
    }

    /**
     * Gets the value of the contacts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContactsType }
     *     
     */
    public ArrayOfContactsType getContacts() {
        return contacts;
    }

    /**
     * Sets the value of the contacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContactsType }
     *     
     */
    public void setContacts(ArrayOfContactsType value) {
        this.contacts = value;
    }

    /**
     * Gets the value of the urls property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUrlEntitiesType }
     *     
     */
    public ArrayOfUrlEntitiesType getUrls() {
        return urls;
    }

    /**
     * Sets the value of the urls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUrlEntitiesType }
     *     
     */
    public void setUrls(ArrayOfUrlEntitiesType value) {
        this.urls = value;
    }

    /**
     * Gets the value of the phoneNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhoneEntitiesType }
     *     
     */
    public ArrayOfPhoneEntitiesType getPhoneNumbers() {
        return phoneNumbers;
    }

    /**
     * Sets the value of the phoneNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhoneEntitiesType }
     *     
     */
    public void setPhoneNumbers(ArrayOfPhoneEntitiesType value) {
        this.phoneNumbers = value;
    }

}
