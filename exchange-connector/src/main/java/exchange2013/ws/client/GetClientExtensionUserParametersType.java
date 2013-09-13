
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetClientExtensionUserParametersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetClientExtensionUserParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserEnabledExtensions" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringsType" minOccurs="0"/>
 *         &lt;element name="UserDisabledExtensions" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="UserId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EnabledOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetClientExtensionUserParametersType", propOrder = {
    "userEnabledExtensions",
    "userDisabledExtensions"
})
public class GetClientExtensionUserParametersType {

    @XmlElement(name = "UserEnabledExtensions")
    protected ArrayOfStringsType userEnabledExtensions;
    @XmlElement(name = "UserDisabledExtensions")
    protected ArrayOfStringsType userDisabledExtensions;
    @XmlAttribute(name = "UserId", required = true)
    protected String userId;
    @XmlAttribute(name = "EnabledOnly")
    protected Boolean enabledOnly;

    /**
     * Gets the value of the userEnabledExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public ArrayOfStringsType getUserEnabledExtensions() {
        return userEnabledExtensions;
    }

    /**
     * Sets the value of the userEnabledExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public void setUserEnabledExtensions(ArrayOfStringsType value) {
        this.userEnabledExtensions = value;
    }

    /**
     * Gets the value of the userDisabledExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public ArrayOfStringsType getUserDisabledExtensions() {
        return userDisabledExtensions;
    }

    /**
     * Sets the value of the userDisabledExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public void setUserDisabledExtensions(ArrayOfStringsType value) {
        this.userDisabledExtensions = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the enabledOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabledOnly() {
        return enabledOnly;
    }

    /**
     * Sets the value of the enabledOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabledOnly(Boolean value) {
        this.enabledOnly = value;
    }

}
