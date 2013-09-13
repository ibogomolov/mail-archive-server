
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreviewItemResponseShapeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreviewItemResponseShapeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaseShape" type="{http://schemas.microsoft.com/exchange/services/2006/types}PreviewItemBaseShapeType"/>
 *         &lt;element name="AdditionalProperties" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfExtendedFieldURIsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreviewItemResponseShapeType", propOrder = {
    "baseShape",
    "additionalProperties"
})
public class PreviewItemResponseShapeType {

    @XmlElement(name = "BaseShape", required = true)
    protected PreviewItemBaseShapeType baseShape;
    @XmlElement(name = "AdditionalProperties")
    protected NonEmptyArrayOfExtendedFieldURIsType additionalProperties;

    /**
     * Gets the value of the baseShape property.
     * 
     * @return
     *     possible object is
     *     {@link PreviewItemBaseShapeType }
     *     
     */
    public PreviewItemBaseShapeType getBaseShape() {
        return baseShape;
    }

    /**
     * Sets the value of the baseShape property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviewItemBaseShapeType }
     *     
     */
    public void setBaseShape(PreviewItemBaseShapeType value) {
        this.baseShape = value;
    }

    /**
     * Gets the value of the additionalProperties property.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfExtendedFieldURIsType }
     *     
     */
    public NonEmptyArrayOfExtendedFieldURIsType getAdditionalProperties() {
        return additionalProperties;
    }

    /**
     * Sets the value of the additionalProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfExtendedFieldURIsType }
     *     
     */
    public void setAdditionalProperties(NonEmptyArrayOfExtendedFieldURIsType value) {
        this.additionalProperties = value;
    }

}
