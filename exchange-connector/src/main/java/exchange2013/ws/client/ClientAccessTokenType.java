
package exchange2013.ws.client;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClientAccessTokenType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClientAccessTokenType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TokenType" type="{http://schemas.microsoft.com/exchange/services/2006/types}ClientAccessTokenTypeType"/>
 *         &lt;element name="TokenValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TTL" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientAccessTokenType", propOrder = {
    "id",
    "tokenType",
    "tokenValue",
    "ttl"
})
public class ClientAccessTokenType {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "TokenType", required = true)
    protected ClientAccessTokenTypeType tokenType;
    @XmlElement(name = "TokenValue", required = true)
    protected String tokenValue;
    @XmlElement(name = "TTL", required = true)
    protected BigInteger ttl;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the tokenType property.
     * 
     * @return
     *     possible object is
     *     {@link ClientAccessTokenTypeType }
     *     
     */
    public ClientAccessTokenTypeType getTokenType() {
        return tokenType;
    }

    /**
     * Sets the value of the tokenType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientAccessTokenTypeType }
     *     
     */
    public void setTokenType(ClientAccessTokenTypeType value) {
        this.tokenType = value;
    }

    /**
     * Gets the value of the tokenValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenValue() {
        return tokenValue;
    }

    /**
     * Sets the value of the tokenValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenValue(String value) {
        this.tokenValue = value;
    }

    /**
     * Gets the value of the ttl property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTTL() {
        return ttl;
    }

    /**
     * Sets the value of the ttl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTTL(BigInteger value) {
        this.ttl = value;
    }

}
