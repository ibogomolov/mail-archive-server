
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SetClientExtensionActionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetClientExtensionActionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClientExtension" type="{http://schemas.microsoft.com/exchange/services/2006/types}ClientExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ActionId" use="required" type="{http://schemas.microsoft.com/exchange/services/2006/types}SetClientExtensionActionIdType" />
 *       &lt;attribute name="ExtensionId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetClientExtensionActionType", propOrder = {
    "clientExtension"
})
public class SetClientExtensionActionType {

    @XmlElement(name = "ClientExtension")
    protected ClientExtensionType clientExtension;
    @XmlAttribute(name = "ActionId", required = true)
    protected SetClientExtensionActionIdType actionId;
    @XmlAttribute(name = "ExtensionId")
    protected String extensionId;

    /**
     * Gets the value of the clientExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ClientExtensionType }
     *     
     */
    public ClientExtensionType getClientExtension() {
        return clientExtension;
    }

    /**
     * Sets the value of the clientExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientExtensionType }
     *     
     */
    public void setClientExtension(ClientExtensionType value) {
        this.clientExtension = value;
    }

    /**
     * Gets the value of the actionId property.
     * 
     * @return
     *     possible object is
     *     {@link SetClientExtensionActionIdType }
     *     
     */
    public SetClientExtensionActionIdType getActionId() {
        return actionId;
    }

    /**
     * Sets the value of the actionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetClientExtensionActionIdType }
     *     
     */
    public void setActionId(SetClientExtensionActionIdType value) {
        this.actionId = value;
    }

    /**
     * Gets the value of the extensionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionId() {
        return extensionId;
    }

    /**
     * Sets the value of the extensionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionId(String value) {
        this.extensionId = value;
    }

}
