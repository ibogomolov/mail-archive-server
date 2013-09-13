
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         IM Contact List
 *       
 * 
 * <p>Java class for ImItemListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImItemListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Groups" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfImGroupType" minOccurs="0"/>
 *         &lt;element name="Personas" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPeopleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImItemListType", propOrder = {
    "groups",
    "personas"
})
public class ImItemListType {

    @XmlElement(name = "Groups")
    protected ArrayOfImGroupType groups;
    @XmlElement(name = "Personas")
    protected ArrayOfPeopleType personas;

    /**
     * Gets the value of the groups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfImGroupType }
     *     
     */
    public ArrayOfImGroupType getGroups() {
        return groups;
    }

    /**
     * Sets the value of the groups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfImGroupType }
     *     
     */
    public void setGroups(ArrayOfImGroupType value) {
        this.groups = value;
    }

    /**
     * Gets the value of the personas property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPeopleType }
     *     
     */
    public ArrayOfPeopleType getPersonas() {
        return personas;
    }

    /**
     * Sets the value of the personas property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPeopleType }
     *     
     */
    public void setPersonas(ArrayOfPeopleType value) {
        this.personas = value;
    }

}
