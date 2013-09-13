
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetClientIntentResponseMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetClientIntentResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="ClientIntent" type="{http://schemas.microsoft.com/exchange/services/2006/types}ClientIntentType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetClientIntentResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "clientIntent"
})
public class GetClientIntentResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "ClientIntent")
    protected ClientIntentType clientIntent;

    /**
     * Gets the value of the clientIntent property.
     * 
     * @return
     *     possible object is
     *     {@link ClientIntentType }
     *     
     */
    public ClientIntentType getClientIntent() {
        return clientIntent;
    }

    /**
     * Sets the value of the clientIntent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientIntentType }
     *     
     */
    public void setClientIntent(ClientIntentType value) {
        this.clientIntent = value;
    }

}
