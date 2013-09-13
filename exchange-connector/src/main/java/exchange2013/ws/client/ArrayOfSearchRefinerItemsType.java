
package exchange2013.ws.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Array of search refiner item.
 *       
 * 
 * <p>Java class for ArrayOfSearchRefinerItemsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSearchRefinerItemsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Refiner" type="{http://schemas.microsoft.com/exchange/services/2006/types}SearchRefinerItemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSearchRefinerItemsType", propOrder = {
    "refiner"
})
public class ArrayOfSearchRefinerItemsType {

    @XmlElement(name = "Refiner")
    protected List<SearchRefinerItemType> refiner;

    /**
     * Gets the value of the refiner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refiner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefiner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchRefinerItemType }
     * 
     * 
     */
    public List<SearchRefinerItemType> getRefiner() {
        if (refiner == null) {
            refiner = new ArrayList<SearchRefinerItemType>();
        }
        return this.refiner;
    }

}
