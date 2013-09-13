
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TargetFolderIdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetFolderIdType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="FolderId" type="{http://schemas.microsoft.com/exchange/services/2006/types}FolderIdType"/>
 *         &lt;element name="DistinguishedFolderId" type="{http://schemas.microsoft.com/exchange/services/2006/types}DistinguishedFolderIdType"/>
 *         &lt;element name="AddressListId" type="{http://schemas.microsoft.com/exchange/services/2006/types}AddressListIdType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetFolderIdType", propOrder = {
    "folderId",
    "distinguishedFolderId",
    "addressListId"
})
@XmlSeeAlso({
    UserConfigurationNameType.class
})
public class TargetFolderIdType {

    @XmlElement(name = "FolderId")
    protected FolderIdType folderId;
    @XmlElement(name = "DistinguishedFolderId")
    protected DistinguishedFolderIdType distinguishedFolderId;
    @XmlElement(name = "AddressListId")
    protected AddressListIdType addressListId;

    /**
     * Gets the value of the folderId property.
     * 
     * @return
     *     possible object is
     *     {@link FolderIdType }
     *     
     */
    public FolderIdType getFolderId() {
        return folderId;
    }

    /**
     * Sets the value of the folderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FolderIdType }
     *     
     */
    public void setFolderId(FolderIdType value) {
        this.folderId = value;
    }

    /**
     * Gets the value of the distinguishedFolderId property.
     * 
     * @return
     *     possible object is
     *     {@link DistinguishedFolderIdType }
     *     
     */
    public DistinguishedFolderIdType getDistinguishedFolderId() {
        return distinguishedFolderId;
    }

    /**
     * Sets the value of the distinguishedFolderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistinguishedFolderIdType }
     *     
     */
    public void setDistinguishedFolderId(DistinguishedFolderIdType value) {
        this.distinguishedFolderId = value;
    }

    /**
     * Gets the value of the addressListId property.
     * 
     * @return
     *     possible object is
     *     {@link AddressListIdType }
     *     
     */
    public AddressListIdType getAddressListId() {
        return addressListId;
    }

    /**
     * Sets the value of the addressListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressListIdType }
     *     
     */
    public void setAddressListId(AddressListIdType value) {
        this.addressListId = value;
    }

}
