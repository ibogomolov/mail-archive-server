
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Retention policy tag.
 *       
 * 
 * <p>Java class for RetentionPolicyTagType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetentionPolicyTagType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RetentionId" type="{http://schemas.microsoft.com/exchange/services/2006/types}GuidType"/>
 *         &lt;element name="RetentionPeriod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Type" type="{http://schemas.microsoft.com/exchange/services/2006/types}ElcFolderType"/>
 *         &lt;element name="RetentionAction" type="{http://schemas.microsoft.com/exchange/services/2006/types}RetentionActionType"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsVisible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="OptedInto" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsArchive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetentionPolicyTagType", propOrder = {
    "displayName",
    "retentionId",
    "retentionPeriod",
    "type",
    "retentionAction",
    "description",
    "isVisible",
    "optedInto",
    "isArchive"
})
public class RetentionPolicyTagType {

    @XmlElement(name = "DisplayName", required = true)
    protected String displayName;
    @XmlElement(name = "RetentionId", required = true)
    protected String retentionId;
    @XmlElement(name = "RetentionPeriod")
    protected int retentionPeriod;
    @XmlElement(name = "Type", required = true)
    protected ElcFolderType type;
    @XmlElement(name = "RetentionAction", required = true)
    protected RetentionActionType retentionAction;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "IsVisible")
    protected boolean isVisible;
    @XmlElement(name = "OptedInto")
    protected boolean optedInto;
    @XmlElement(name = "IsArchive")
    protected boolean isArchive;

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
     * Gets the value of the retentionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetentionId() {
        return retentionId;
    }

    /**
     * Sets the value of the retentionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetentionId(String value) {
        this.retentionId = value;
    }

    /**
     * Gets the value of the retentionPeriod property.
     * 
     */
    public int getRetentionPeriod() {
        return retentionPeriod;
    }

    /**
     * Sets the value of the retentionPeriod property.
     * 
     */
    public void setRetentionPeriod(int value) {
        this.retentionPeriod = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ElcFolderType }
     *     
     */
    public ElcFolderType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElcFolderType }
     *     
     */
    public void setType(ElcFolderType value) {
        this.type = value;
    }

    /**
     * Gets the value of the retentionAction property.
     * 
     * @return
     *     possible object is
     *     {@link RetentionActionType }
     *     
     */
    public RetentionActionType getRetentionAction() {
        return retentionAction;
    }

    /**
     * Sets the value of the retentionAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetentionActionType }
     *     
     */
    public void setRetentionAction(RetentionActionType value) {
        this.retentionAction = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the isVisible property.
     * 
     */
    public boolean isIsVisible() {
        return isVisible;
    }

    /**
     * Sets the value of the isVisible property.
     * 
     */
    public void setIsVisible(boolean value) {
        this.isVisible = value;
    }

    /**
     * Gets the value of the optedInto property.
     * 
     */
    public boolean isOptedInto() {
        return optedInto;
    }

    /**
     * Sets the value of the optedInto property.
     * 
     */
    public void setOptedInto(boolean value) {
        this.optedInto = value;
    }

    /**
     * Gets the value of the isArchive property.
     * 
     */
    public boolean isIsArchive() {
        return isArchive;
    }

    /**
     * Sets the value of the isArchive property.
     * 
     */
    public void setIsArchive(boolean value) {
        this.isArchive = value;
    }

}
