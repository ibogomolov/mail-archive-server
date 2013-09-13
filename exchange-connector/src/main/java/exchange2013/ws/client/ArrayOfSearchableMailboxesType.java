
package exchange2007.ws.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Array of searchable mailbox.
 *       
 * 
 * <p>Java class for ArrayOfSearchableMailboxesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSearchableMailboxesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchableMailbox" type="{http://schemas.microsoft.com/exchange/services/2006/types}SearchableMailboxType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSearchableMailboxesType", propOrder = {
    "searchableMailbox"
})
public class ArrayOfSearchableMailboxesType {

    @XmlElement(name = "SearchableMailbox")
    protected List<SearchableMailboxType> searchableMailbox;

    /**
     * Gets the value of the searchableMailbox property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchableMailbox property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchableMailbox().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchableMailboxType }
     * 
     * 
     */
    public List<SearchableMailboxType> getSearchableMailbox() {
        if (searchableMailbox == null) {
            searchableMailbox = new ArrayList<SearchableMailboxType>();
        }
        return this.searchableMailbox;
    }

}
