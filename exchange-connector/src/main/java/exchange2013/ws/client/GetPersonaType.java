
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPersonaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPersonaType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="PersonaId" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPersonaType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "personaId"
})
public class GetPersonaType
    extends BaseRequestType
{

    @XmlElement(name = "PersonaId", required = true)
    protected ItemIdType personaId;

    /**
     * Gets the value of the personaId property.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdType }
     *     
     */
    public ItemIdType getPersonaId() {
        return personaId;
    }

    /**
     * Sets the value of the personaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdType }
     *     
     */
    public void setPersonaId(ItemIdType value) {
        this.personaId = value;
    }

}
