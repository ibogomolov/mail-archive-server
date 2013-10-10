
package exchange.v2007sp3.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchangeImpersonationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExchangeImpersonationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConnectingSID" type="{http://schemas.microsoft.com/exchange/services/2006/types}ConnectingSIDType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeImpersonationType", propOrder = {
    "connectingSID"
})
public class ExchangeImpersonationType {

    @XmlElement(name = "ConnectingSID", required = true)
    protected ConnectingSIDType connectingSID;

    /**
     * Gets the value of the connectingSID property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectingSIDType }
     *     
     */
    public ConnectingSIDType getConnectingSID() {
        return connectingSID;
    }

    /**
     * Sets the value of the connectingSID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectingSIDType }
     *     
     */
    public void setConnectingSID(ConnectingSIDType value) {
        this.connectingSID = value;
    }

}
