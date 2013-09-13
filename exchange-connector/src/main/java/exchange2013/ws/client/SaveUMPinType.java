
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SaveUMPinType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SaveUMPinType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="PinInfo" type="{http://schemas.microsoft.com/exchange/services/2006/types}PinInfoType"/>
 *         &lt;element name="UserUMMailboxPolicyGuid" type="{http://schemas.microsoft.com/exchange/services/2006/types}GuidType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveUMPinType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "pinInfo",
    "userUMMailboxPolicyGuid"
})
public class SaveUMPinType
    extends BaseRequestType
{

    @XmlElement(name = "PinInfo", required = true)
    protected PinInfoType pinInfo;
    @XmlElement(name = "UserUMMailboxPolicyGuid", required = true)
    protected String userUMMailboxPolicyGuid;

    /**
     * Gets the value of the pinInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PinInfoType }
     *     
     */
    public PinInfoType getPinInfo() {
        return pinInfo;
    }

    /**
     * Sets the value of the pinInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinInfoType }
     *     
     */
    public void setPinInfo(PinInfoType value) {
        this.pinInfo = value;
    }

    /**
     * Gets the value of the userUMMailboxPolicyGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserUMMailboxPolicyGuid() {
        return userUMMailboxPolicyGuid;
    }

    /**
     * Sets the value of the userUMMailboxPolicyGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserUMMailboxPolicyGuid(String value) {
        this.userUMMailboxPolicyGuid = value;
    }

}
