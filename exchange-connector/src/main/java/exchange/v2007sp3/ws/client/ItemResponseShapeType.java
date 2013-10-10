
package exchange.v2007sp3.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemResponseShapeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemResponseShapeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaseShape" type="{http://schemas.microsoft.com/exchange/services/2006/types}DefaultShapeNamesType"/>
 *         &lt;element name="IncludeMimeContent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BodyType" type="{http://schemas.microsoft.com/exchange/services/2006/types}BodyTypeResponseType" minOccurs="0"/>
 *         &lt;element name="AdditionalProperties" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfPathsToElementType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemResponseShapeType", propOrder = {
    "baseShape",
    "includeMimeContent",
    "bodyType",
    "additionalProperties"
})
public class ItemResponseShapeType {

    @XmlElement(name = "BaseShape", required = true)
    protected DefaultShapeNamesType baseShape;
    @XmlElement(name = "IncludeMimeContent")
    protected Boolean includeMimeContent;
    @XmlElement(name = "BodyType")
    protected BodyTypeResponseType bodyType;
    @XmlElement(name = "AdditionalProperties")
    protected NonEmptyArrayOfPathsToElementType additionalProperties;

    /**
     * Gets the value of the baseShape property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultShapeNamesType }
     *     
     */
    public DefaultShapeNamesType getBaseShape() {
        return baseShape;
    }

    /**
     * Sets the value of the baseShape property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultShapeNamesType }
     *     
     */
    public void setBaseShape(DefaultShapeNamesType value) {
        this.baseShape = value;
    }

    /**
     * Gets the value of the includeMimeContent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeMimeContent() {
        return includeMimeContent;
    }

    /**
     * Sets the value of the includeMimeContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeMimeContent(Boolean value) {
        this.includeMimeContent = value;
    }

    /**
     * Gets the value of the bodyType property.
     * 
     * @return
     *     possible object is
     *     {@link BodyTypeResponseType }
     *     
     */
    public BodyTypeResponseType getBodyType() {
        return bodyType;
    }

    /**
     * Sets the value of the bodyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BodyTypeResponseType }
     *     
     */
    public void setBodyType(BodyTypeResponseType value) {
        this.bodyType = value;
    }

    /**
     * Gets the value of the additionalProperties property.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfPathsToElementType }
     *     
     */
    public NonEmptyArrayOfPathsToElementType getAdditionalProperties() {
        return additionalProperties;
    }

    /**
     * Sets the value of the additionalProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfPathsToElementType }
     *     
     */
    public void setAdditionalProperties(NonEmptyArrayOfPathsToElementType value) {
        this.additionalProperties = value;
    }

}
