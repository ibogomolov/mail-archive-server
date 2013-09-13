
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisableAppType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisableAppType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DisableReason" type="{http://schemas.microsoft.com/exchange/services/2006/types}DisableReasonType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisableAppType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "id",
    "disableReason"
})
public class DisableAppType
    extends BaseRequestType
{

    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(name = "DisableReason", required = true)
    protected DisableReasonType disableReason;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
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
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the disableReason property.
     * 
     * @return
     *     possible object is
     *     {@link DisableReasonType }
     *     
     */
    public DisableReasonType getDisableReason() {
        return disableReason;
    }

    /**
     * Sets the value of the disableReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisableReasonType }
     *     
     */
    public void setDisableReason(DisableReasonType value) {
        this.disableReason = value;
    }

}
