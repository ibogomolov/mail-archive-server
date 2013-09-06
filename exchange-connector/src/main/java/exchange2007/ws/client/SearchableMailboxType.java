
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Searchable mailbox.
 *       
 * 
 * <p>Java class for SearchableMailboxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchableMailboxType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Guid" type="{http://schemas.microsoft.com/exchange/services/2006/types}GuidType"/>
 *         &lt;element name="PrimarySmtpAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IsExternalMailbox" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ExternalEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IsMembershipGroup" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ReferenceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchableMailboxType", propOrder = {
    "guid",
    "primarySmtpAddress",
    "isExternalMailbox",
    "externalEmailAddress",
    "displayName",
    "isMembershipGroup",
    "referenceId"
})
public class SearchableMailboxType {

    @XmlElement(name = "Guid", required = true)
    protected String guid;
    @XmlElement(name = "PrimarySmtpAddress", required = true)
    protected String primarySmtpAddress;
    @XmlElement(name = "IsExternalMailbox")
    protected boolean isExternalMailbox;
    @XmlElement(name = "ExternalEmailAddress", required = true)
    protected String externalEmailAddress;
    @XmlElement(name = "DisplayName", required = true)
    protected String displayName;
    @XmlElement(name = "IsMembershipGroup")
    protected boolean isMembershipGroup;
    @XmlElement(name = "ReferenceId", required = true)
    protected String referenceId;

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
    }

    /**
     * Gets the value of the primarySmtpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimarySmtpAddress() {
        return primarySmtpAddress;
    }

    /**
     * Sets the value of the primarySmtpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimarySmtpAddress(String value) {
        this.primarySmtpAddress = value;
    }

    /**
     * Gets the value of the isExternalMailbox property.
     * 
     */
    public boolean isIsExternalMailbox() {
        return isExternalMailbox;
    }

    /**
     * Sets the value of the isExternalMailbox property.
     * 
     */
    public void setIsExternalMailbox(boolean value) {
        this.isExternalMailbox = value;
    }

    /**
     * Gets the value of the externalEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalEmailAddress() {
        return externalEmailAddress;
    }

    /**
     * Sets the value of the externalEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalEmailAddress(String value) {
        this.externalEmailAddress = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the isMembershipGroup property.
     * 
     */
    public boolean isIsMembershipGroup() {
        return isMembershipGroup;
    }

    /**
     * Sets the value of the isMembershipGroup property.
     * 
     */
    public void setIsMembershipGroup(boolean value) {
        this.isMembershipGroup = value;
    }

    /**
     * Gets the value of the referenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * Sets the value of the referenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceId(String value) {
        this.referenceId = value;
    }

}
