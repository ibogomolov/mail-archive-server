
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}EntityType">
 *       &lt;sequence>
 *         &lt;element name="PersonName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneNumbers" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPhonesType" minOccurs="0"/>
 *         &lt;element name="Urls" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfUrlsType" minOccurs="0"/>
 *         &lt;element name="EmailAddresses" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfExtractedEmailAddresses" minOccurs="0"/>
 *         &lt;element name="Addresses" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfAddressesType" minOccurs="0"/>
 *         &lt;element name="ContactString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactType", propOrder = {
    "personName",
    "businessName",
    "phoneNumbers",
    "urls",
    "emailAddresses",
    "addresses",
    "contactString"
})
public class ContactType
    extends EntityType
{

    @XmlElement(name = "PersonName")
    protected String personName;
    @XmlElement(name = "BusinessName")
    protected String businessName;
    @XmlElement(name = "PhoneNumbers")
    protected ArrayOfPhonesType phoneNumbers;
    @XmlElement(name = "Urls")
    protected ArrayOfUrlsType urls;
    @XmlElement(name = "EmailAddresses")
    protected ArrayOfExtractedEmailAddresses emailAddresses;
    @XmlElement(name = "Addresses")
    protected ArrayOfAddressesType addresses;
    @XmlElement(name = "ContactString")
    protected String contactString;

    /**
     * Gets the value of the personName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonName(String value) {
        this.personName = value;
    }

    /**
     * Gets the value of the businessName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * Sets the value of the businessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessName(String value) {
        this.businessName = value;
    }

    /**
     * Gets the value of the phoneNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhonesType }
     *     
     */
    public ArrayOfPhonesType getPhoneNumbers() {
        return phoneNumbers;
    }

    /**
     * Sets the value of the phoneNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhonesType }
     *     
     */
    public void setPhoneNumbers(ArrayOfPhonesType value) {
        this.phoneNumbers = value;
    }

    /**
     * Gets the value of the urls property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUrlsType }
     *     
     */
    public ArrayOfUrlsType getUrls() {
        return urls;
    }

    /**
     * Sets the value of the urls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUrlsType }
     *     
     */
    public void setUrls(ArrayOfUrlsType value) {
        this.urls = value;
    }

    /**
     * Gets the value of the emailAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExtractedEmailAddresses }
     *     
     */
    public ArrayOfExtractedEmailAddresses getEmailAddresses() {
        return emailAddresses;
    }

    /**
     * Sets the value of the emailAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExtractedEmailAddresses }
     *     
     */
    public void setEmailAddresses(ArrayOfExtractedEmailAddresses value) {
        this.emailAddresses = value;
    }

    /**
     * Gets the value of the addresses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAddressesType }
     *     
     */
    public ArrayOfAddressesType getAddresses() {
        return addresses;
    }

    /**
     * Sets the value of the addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAddressesType }
     *     
     */
    public void setAddresses(ArrayOfAddressesType value) {
        this.addresses = value;
    }

    /**
     * Gets the value of the contactString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactString() {
        return contactString;
    }

    /**
     * Sets the value of the contactString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactString(String value) {
        this.contactString = value;
    }

}
