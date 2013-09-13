
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResetUMMailboxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResetUMMailboxType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="KeepProperties" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResetUMMailboxType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "keepProperties"
})
public class ResetUMMailboxType
    extends BaseRequestType
{

    @XmlElement(name = "KeepProperties")
    protected boolean keepProperties;

    /**
     * Gets the value of the keepProperties property.
     * 
     */
    public boolean isKeepProperties() {
        return keepProperties;
    }

    /**
     * Sets the value of the keepProperties property.
     * 
     */
    public void setKeepProperties(boolean value) {
        this.keepProperties = value;
    }

}
