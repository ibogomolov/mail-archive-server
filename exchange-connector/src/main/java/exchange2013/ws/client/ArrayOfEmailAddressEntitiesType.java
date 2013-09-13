
package exchange2013.ws.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfEmailAddressEntitiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEmailAddressEntitiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmailAddressEntity" type="{http://schemas.microsoft.com/exchange/services/2006/types}EmailAddressEntityType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEmailAddressEntitiesType", propOrder = {
    "emailAddressEntity"
})
public class ArrayOfEmailAddressEntitiesType {

    @XmlElement(name = "EmailAddressEntity")
    protected List<EmailAddressEntityType> emailAddressEntity;

    /**
     * Gets the value of the emailAddressEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailAddressEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailAddressEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailAddressEntityType }
     * 
     * 
     */
    public List<EmailAddressEntityType> getEmailAddressEntity() {
        if (emailAddressEntity == null) {
            emailAddressEntity = new ArrayList<EmailAddressEntityType>();
        }
        return this.emailAddressEntity;
    }

}
