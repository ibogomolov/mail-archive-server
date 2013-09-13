
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetClientAccessTokenResponseMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetClientAccessTokenResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="Token" type="{http://schemas.microsoft.com/exchange/services/2006/types}ClientAccessTokenType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetClientAccessTokenResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "token"
})
public class GetClientAccessTokenResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "Token")
    protected ClientAccessTokenType token;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link ClientAccessTokenType }
     *     
     */
    public ClientAccessTokenType getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientAccessTokenType }
     *     
     */
    public void setToken(ClientAccessTokenType value) {
        this.token = value;
    }

}
