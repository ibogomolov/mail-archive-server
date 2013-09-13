
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddNewImContactToGroupResponseMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddNewImContactToGroupResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="Persona" type="{http://schemas.microsoft.com/exchange/services/2006/types}PersonaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddNewImContactToGroupResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "persona"
})
public class AddNewImContactToGroupResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "Persona")
    protected PersonaType persona;

    /**
     * Gets the value of the persona property.
     * 
     * @return
     *     possible object is
     *     {@link PersonaType }
     *     
     */
    public PersonaType getPersona() {
        return persona;
    }

    /**
     * Sets the value of the persona property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonaType }
     *     
     */
    public void setPersona(PersonaType value) {
        this.persona = value;
    }

}
