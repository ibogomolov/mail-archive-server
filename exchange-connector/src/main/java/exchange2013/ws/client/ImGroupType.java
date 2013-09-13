
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         A Group on the ImContactList, with one or more members
 *       
 * 
 * <p>Java class for ImGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DisplayName" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyStringType"/>
 *         &lt;element name="GroupType" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyStringType"/>
 *         &lt;element name="ExchangeStoreId" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType" minOccurs="0"/>
 *         &lt;element name="MemberCorrelationKey" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfItemIdsType" minOccurs="0"/>
 *         &lt;element name="ExtendedProperties" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfExtendedPropertyType" minOccurs="0"/>
 *         &lt;element name="SmtpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImGroupType", propOrder = {
    "displayName",
    "groupType",
    "exchangeStoreId",
    "memberCorrelationKey",
    "extendedProperties",
    "smtpAddress"
})
public class ImGroupType {

    @XmlElement(name = "DisplayName", required = true)
    protected String displayName;
    @XmlElement(name = "GroupType", required = true)
    protected String groupType;
    @XmlElement(name = "ExchangeStoreId")
    protected ItemIdType exchangeStoreId;
    @XmlElement(name = "MemberCorrelationKey")
    protected NonEmptyArrayOfItemIdsType memberCorrelationKey;
    @XmlElement(name = "ExtendedProperties")
    protected NonEmptyArrayOfExtendedPropertyType extendedProperties;
    @XmlElement(name = "SmtpAddress")
    protected String smtpAddress;

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the groupType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupType() {
        return groupType;
    }

    /**
     * Sets the value of the groupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupType(String value) {
        this.groupType = value;
    }

    /**
     * Gets the value of the exchangeStoreId property.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdType }
     *     
     */
    public ItemIdType getExchangeStoreId() {
        return exchangeStoreId;
    }

    /**
     * Sets the value of the exchangeStoreId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdType }
     *     
     */
    public void setExchangeStoreId(ItemIdType value) {
        this.exchangeStoreId = value;
    }

    /**
     * Gets the value of the memberCorrelationKey property.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfItemIdsType }
     *     
     */
    public NonEmptyArrayOfItemIdsType getMemberCorrelationKey() {
        return memberCorrelationKey;
    }

    /**
     * Sets the value of the memberCorrelationKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfItemIdsType }
     *     
     */
    public void setMemberCorrelationKey(NonEmptyArrayOfItemIdsType value) {
        this.memberCorrelationKey = value;
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

    /**
     * Gets the value of the smtpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmtpAddress() {
        return smtpAddress;
    }

    /**
     * Sets the value of the smtpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmtpAddress(String value) {
        this.smtpAddress = value;
    }

}
