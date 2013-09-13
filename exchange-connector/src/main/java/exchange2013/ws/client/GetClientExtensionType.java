
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetClientExtensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetClientExtensionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="RequestedExtensionIds" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringsType" minOccurs="0"/>
 *         &lt;element name="UserParameters" type="{http://schemas.microsoft.com/exchange/services/2006/types}GetClientExtensionUserParametersType" minOccurs="0"/>
 *         &lt;element name="IsDebug" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetClientExtensionType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "requestedExtensionIds",
    "userParameters",
    "isDebug"
})
public class GetClientExtensionType
    extends BaseRequestType
{

    @XmlElement(name = "RequestedExtensionIds")
    protected ArrayOfStringsType requestedExtensionIds;
    @XmlElement(name = "UserParameters")
    protected GetClientExtensionUserParametersType userParameters;
    @XmlElement(name = "IsDebug")
    protected Boolean isDebug;

    /**
     * Gets the value of the requestedExtensionIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public ArrayOfStringsType getRequestedExtensionIds() {
        return requestedExtensionIds;
    }

    /**
     * Sets the value of the requestedExtensionIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public void setRequestedExtensionIds(ArrayOfStringsType value) {
        this.requestedExtensionIds = value;
    }

    /**
     * Gets the value of the userParameters property.
     * 
     * @return
     *     possible object is
     *     {@link GetClientExtensionUserParametersType }
     *     
     */
    public GetClientExtensionUserParametersType getUserParameters() {
        return userParameters;
    }

    /**
     * Sets the value of the userParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetClientExtensionUserParametersType }
     *     
     */
    public void setUserParameters(GetClientExtensionUserParametersType value) {
        this.userParameters = value;
    }

    /**
     * Gets the value of the isDebug property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDebug() {
        return isDebug;
    }

    /**
     * Sets the value of the isDebug property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDebug(Boolean value) {
        this.isDebug = value;
    }

}
