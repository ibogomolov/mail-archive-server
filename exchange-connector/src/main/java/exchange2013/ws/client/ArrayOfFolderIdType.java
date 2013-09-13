
package exchange2013.ws.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFolderIdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFolderIdType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="FolderId" type="{http://schemas.microsoft.com/exchange/services/2006/types}FolderIdType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFolderIdType", propOrder = {
    "folderId"
})
public class ArrayOfFolderIdType {

    @XmlElement(name = "FolderId")
    protected List<FolderIdType> folderId;

    /**
     * Gets the value of the folderId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the folderId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFolderId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FolderIdType }
     * 
     * 
     */
    public List<FolderIdType> getFolderId() {
        if (folderId == null) {
            folderId = new ArrayList<FolderIdType>();
        }
        return this.folderId;
    }

}
