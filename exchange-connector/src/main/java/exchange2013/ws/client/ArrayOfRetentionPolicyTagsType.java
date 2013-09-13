
package exchange2007.ws.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Array of retention policy tags.
 *       
 * 
 * <p>Java class for ArrayOfRetentionPolicyTagsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRetentionPolicyTagsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RetentionPolicyTag" type="{http://schemas.microsoft.com/exchange/services/2006/types}RetentionPolicyTagType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRetentionPolicyTagsType", propOrder = {
    "retentionPolicyTag"
})
public class ArrayOfRetentionPolicyTagsType {

    @XmlElement(name = "RetentionPolicyTag")
    protected List<RetentionPolicyTagType> retentionPolicyTag;

    /**
     * Gets the value of the retentionPolicyTag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retentionPolicyTag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetentionPolicyTag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetentionPolicyTagType }
     * 
     * 
     */
    public List<RetentionPolicyTagType> getRetentionPolicyTag() {
        if (retentionPolicyTag == null) {
            retentionPolicyTag = new ArrayList<RetentionPolicyTagType>();
        }
        return this.retentionPolicyTag;
    }

}
