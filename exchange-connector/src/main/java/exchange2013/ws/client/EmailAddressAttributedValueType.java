
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmailAddressAttributedValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmailAddressAttributedValueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Value" type="{http://schemas.microsoft.com/exchange/services/2006/types}EmailAddressType"/>
 *         &lt;element name="Attributions" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfValueAttributionsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmailAddressAttributedValueType", propOrder = {
    "value",
    "attributions"
})
public class EmailAddressAttributedValueType {

    @XmlElement(name = "Value", required = true)
    protected EmailAddressType value;
    @XmlElement(name = "Attributions", required = true)
    protected ArrayOfValueAttributionsType attributions;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link EmailAddressType }
     *     
     */
    public EmailAddressType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailAddressType }
     *     
     */
    public void setValue(EmailAddressType value) {
        this.value = value;
    }

    /**
     * Gets the value of the attributions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfValueAttributionsType }
     *     
     */
    public ArrayOfValueAttributionsType getAttributions() {
        return attributions;
    }

    /**
     * Sets the value of the attributions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfValueAttributionsType }
     *     
     */
    public void setAttributions(ArrayOfValueAttributionsType value) {
        this.attributions = value;
    }

}
