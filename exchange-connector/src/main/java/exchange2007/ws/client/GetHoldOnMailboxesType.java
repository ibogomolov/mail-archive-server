
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Request type for the GetHoldOnMailboxes web method.
 *       
 * 
 * <p>Java class for GetHoldOnMailboxesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetHoldOnMailboxesType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="HoldId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetHoldOnMailboxesType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "holdId"
})
public class GetHoldOnMailboxesType
    extends BaseRequestType
{

    @XmlElement(name = "HoldId", required = true)
    protected String holdId;

    /**
     * Gets the value of the holdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldId() {
        return holdId;
    }

    /**
     * Sets the value of the holdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldId(String value) {
        this.holdId = value;
    }

}
