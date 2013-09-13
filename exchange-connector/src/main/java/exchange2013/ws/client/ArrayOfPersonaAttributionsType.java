
package exchange2013.ws.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPersonaAttributionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPersonaAttributionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Attribution" type="{http://schemas.microsoft.com/exchange/services/2006/types}PersonaAttributionType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPersonaAttributionsType", propOrder = {
    "attribution"
})
public class ArrayOfPersonaAttributionsType {

    @XmlElement(name = "Attribution", required = true)
    protected List<PersonaAttributionType> attribution;

    /**
     * Gets the value of the attribution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attribution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttribution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonaAttributionType }
     * 
     * 
     */
    public List<PersonaAttributionType> getAttribution() {
        if (attribution == null) {
            attribution = new ArrayList<PersonaAttributionType>();
        }
        return this.attribution;
    }

}
