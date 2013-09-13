
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonEmptyStateDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonEmptyStateDefinitionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice minOccurs="0">
 *         &lt;element name="DeletedOccurrenceStateDefinition" type="{http://schemas.microsoft.com/exchange/services/2006/types}DeletedOccurrenceStateDefinitionType"/>
 *         &lt;element name="DeleteFromFolderStateDefinition" type="{http://schemas.microsoft.com/exchange/services/2006/types}DeleteFromFolderStateDefinitionType"/>
 *         &lt;element name="LocationBasedStateDefinition" type="{http://schemas.microsoft.com/exchange/services/2006/types}LocationBasedStateDefinitionType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonEmptyStateDefinitionType", propOrder = {
    "deletedOccurrenceStateDefinition",
    "deleteFromFolderStateDefinition",
    "locationBasedStateDefinition"
})
public class NonEmptyStateDefinitionType {

    @XmlElement(name = "DeletedOccurrenceStateDefinition")
    protected DeletedOccurrenceStateDefinitionType deletedOccurrenceStateDefinition;
    @XmlElement(name = "DeleteFromFolderStateDefinition")
    protected DeleteFromFolderStateDefinitionType deleteFromFolderStateDefinition;
    @XmlElement(name = "LocationBasedStateDefinition")
    protected LocationBasedStateDefinitionType locationBasedStateDefinition;

    /**
     * Gets the value of the deletedOccurrenceStateDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link DeletedOccurrenceStateDefinitionType }
     *     
     */
    public DeletedOccurrenceStateDefinitionType getDeletedOccurrenceStateDefinition() {
        return deletedOccurrenceStateDefinition;
    }

    /**
     * Sets the value of the deletedOccurrenceStateDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeletedOccurrenceStateDefinitionType }
     *     
     */
    public void setDeletedOccurrenceStateDefinition(DeletedOccurrenceStateDefinitionType value) {
        this.deletedOccurrenceStateDefinition = value;
    }

    /**
     * Gets the value of the deleteFromFolderStateDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteFromFolderStateDefinitionType }
     *     
     */
    public DeleteFromFolderStateDefinitionType getDeleteFromFolderStateDefinition() {
        return deleteFromFolderStateDefinition;
    }

    /**
     * Sets the value of the deleteFromFolderStateDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteFromFolderStateDefinitionType }
     *     
     */
    public void setDeleteFromFolderStateDefinition(DeleteFromFolderStateDefinitionType value) {
        this.deleteFromFolderStateDefinition = value;
    }

    /**
     * Gets the value of the locationBasedStateDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link LocationBasedStateDefinitionType }
     *     
     */
    public LocationBasedStateDefinitionType getLocationBasedStateDefinition() {
        return locationBasedStateDefinition;
    }

    /**
     * Sets the value of the locationBasedStateDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationBasedStateDefinitionType }
     *     
     */
    public void setLocationBasedStateDefinition(LocationBasedStateDefinitionType value) {
        this.locationBasedStateDefinition = value;
    }

}
