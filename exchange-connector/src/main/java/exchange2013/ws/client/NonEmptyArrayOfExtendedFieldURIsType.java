
package exchange2013.ws.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonEmptyArrayOfExtendedFieldURIsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonEmptyArrayOfExtendedFieldURIsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="ExtendedFieldURI" type="{http://schemas.microsoft.com/exchange/services/2006/types}PathToExtendedFieldType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonEmptyArrayOfExtendedFieldURIsType", propOrder = {
    "extendedFieldURI"
})
public class NonEmptyArrayOfExtendedFieldURIsType {

    @XmlElement(name = "ExtendedFieldURI")
    protected List<PathToExtendedFieldType> extendedFieldURI;

    /**
     * Gets the value of the extendedFieldURI property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extendedFieldURI property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtendedFieldURI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PathToExtendedFieldType }
     * 
     * 
     */
    public List<PathToExtendedFieldType> getExtendedFieldURI() {
        if (extendedFieldURI == null) {
            extendedFieldURI = new ArrayList<PathToExtendedFieldType>();
        }
        return this.extendedFieldURI;
    }

}
