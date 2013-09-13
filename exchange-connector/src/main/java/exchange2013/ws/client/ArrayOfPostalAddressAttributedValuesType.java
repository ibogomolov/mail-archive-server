
package exchange2013.ws.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPostalAddressAttributedValuesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPostalAddressAttributedValuesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PostalAddressAttributedValue" type="{http://schemas.microsoft.com/exchange/services/2006/types}PostalAddressAttributedValueType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPostalAddressAttributedValuesType", propOrder = {
    "postalAddressAttributedValue"
})
public class ArrayOfPostalAddressAttributedValuesType {

    @XmlElement(name = "PostalAddressAttributedValue")
    protected List<PostalAddressAttributedValueType> postalAddressAttributedValue;

    /**
     * Gets the value of the postalAddressAttributedValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the postalAddressAttributedValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPostalAddressAttributedValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PostalAddressAttributedValueType }
     * 
     * 
     */
    public List<PostalAddressAttributedValueType> getPostalAddressAttributedValue() {
        if (postalAddressAttributedValue == null) {
            postalAddressAttributedValue = new ArrayList<PostalAddressAttributedValueType>();
        }
        return this.postalAddressAttributedValue;
    }

}
