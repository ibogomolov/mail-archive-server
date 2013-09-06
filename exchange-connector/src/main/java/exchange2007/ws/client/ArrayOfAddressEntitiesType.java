
package exchange2007.ws.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAddressEntitiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAddressEntitiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressEntity" type="{http://schemas.microsoft.com/exchange/services/2006/types}AddressEntityType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAddressEntitiesType", propOrder = {
    "addressEntity"
})
public class ArrayOfAddressEntitiesType {

    @XmlElement(name = "AddressEntity")
    protected List<AddressEntityType> addressEntity;

    /**
     * Gets the value of the addressEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressEntityType }
     * 
     * 
     */
    public List<AddressEntityType> getAddressEntity() {
        if (addressEntity == null) {
            addressEntity = new ArrayList<AddressEntityType>();
        }
        return this.addressEntity;
    }

}
