
package exchange2013.ws.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfStringArrayAttributedValuesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfStringArrayAttributedValuesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StringArrayAttributedValue" type="{http://schemas.microsoft.com/exchange/services/2006/types}StringArrayAttributedValueType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStringArrayAttributedValuesType", propOrder = {
    "stringArrayAttributedValue"
})
public class ArrayOfStringArrayAttributedValuesType {

    @XmlElement(name = "StringArrayAttributedValue")
    protected List<StringArrayAttributedValueType> stringArrayAttributedValue;

    /**
     * Gets the value of the stringArrayAttributedValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stringArrayAttributedValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStringArrayAttributedValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringArrayAttributedValueType }
     * 
     * 
     */
    public List<StringArrayAttributedValueType> getStringArrayAttributedValue() {
        if (stringArrayAttributedValue == null) {
            stringArrayAttributedValue = new ArrayList<StringArrayAttributedValueType>();
        }
        return this.stringArrayAttributedValue;
    }

}
