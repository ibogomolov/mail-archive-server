
package exchange.v2007sp3.ws.client.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SerializedSecurityContextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SerializedSecurityContextType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserSid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GroupSids" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfGroupIdentifiersType" minOccurs="0"/>
 *         &lt;element name="RestrictedGroupSids" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfRestrictedGroupIdentifiersType" minOccurs="0"/>
 *         &lt;element name="PrimarySmtpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SerializedSecurityContextType", propOrder = {
    "userSid",
    "groupSids",
    "restrictedGroupSids",
    "primarySmtpAddress"
})
public class SerializedSecurityContextType {

    @XmlElement(name = "UserSid", required = true)
    protected String userSid;
    @XmlElement(name = "GroupSids")
    protected NonEmptyArrayOfGroupIdentifiersType groupSids;
    @XmlElement(name = "RestrictedGroupSids")
    protected NonEmptyArrayOfRestrictedGroupIdentifiersType restrictedGroupSids;
    @XmlElement(name = "PrimarySmtpAddress")
    protected String primarySmtpAddress;

    /**
     * Gets the value of the userSid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserSid() {
        return userSid;
    }

    /**
     * Sets the value of the userSid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserSid(String value) {
        this.userSid = value;
    }

    /**
     * Gets the value of the groupSids property.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfGroupIdentifiersType }
     *     
     */
    public NonEmptyArrayOfGroupIdentifiersType getGroupSids() {
        return groupSids;
    }

    /**
     * Sets the value of the groupSids property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfGroupIdentifiersType }
     *     
     */
    public void setGroupSids(NonEmptyArrayOfGroupIdentifiersType value) {
        this.groupSids = value;
    }

    /**
     * Gets the value of the restrictedGroupSids property.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfRestrictedGroupIdentifiersType }
     *     
     */
    public NonEmptyArrayOfRestrictedGroupIdentifiersType getRestrictedGroupSids() {
        return restrictedGroupSids;
    }

    /**
     * Sets the value of the restrictedGroupSids property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfRestrictedGroupIdentifiersType }
     *     
     */
    public void setRestrictedGroupSids(NonEmptyArrayOfRestrictedGroupIdentifiersType value) {
        this.restrictedGroupSids = value;
    }

    /**
     * Gets the value of the primarySmtpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimarySmtpAddress() {
        return primarySmtpAddress;
    }

    /**
     * Sets the value of the primarySmtpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimarySmtpAddress(String value) {
        this.primarySmtpAddress = value;
    }

}
