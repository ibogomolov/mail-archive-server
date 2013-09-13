
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RightsManagementLicenseDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RightsManagementLicenseDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RightsManagedMessageDecryptionStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RmsTemplateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TemplateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TemplateDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EditAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReplyAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReplyAllAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ForwardAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ModifyRecipientsAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExtractAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PrintAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExportAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProgrammaticAccessAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsOwner" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ContentOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContentExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RightsManagementLicenseDataType", propOrder = {
    "rightsManagedMessageDecryptionStatus",
    "rmsTemplateId",
    "templateName",
    "templateDescription",
    "editAllowed",
    "replyAllowed",
    "replyAllAllowed",
    "forwardAllowed",
    "modifyRecipientsAllowed",
    "extractAllowed",
    "printAllowed",
    "exportAllowed",
    "programmaticAccessAllowed",
    "isOwner",
    "contentOwner",
    "contentExpiryDate"
})
public class RightsManagementLicenseDataType {

    @XmlElement(name = "RightsManagedMessageDecryptionStatus")
    protected Integer rightsManagedMessageDecryptionStatus;
    @XmlElement(name = "RmsTemplateId")
    protected String rmsTemplateId;
    @XmlElement(name = "TemplateName")
    protected String templateName;
    @XmlElement(name = "TemplateDescription")
    protected String templateDescription;
    @XmlElement(name = "EditAllowed")
    protected Boolean editAllowed;
    @XmlElement(name = "ReplyAllowed")
    protected Boolean replyAllowed;
    @XmlElement(name = "ReplyAllAllowed")
    protected Boolean replyAllAllowed;
    @XmlElement(name = "ForwardAllowed")
    protected Boolean forwardAllowed;
    @XmlElement(name = "ModifyRecipientsAllowed")
    protected Boolean modifyRecipientsAllowed;
    @XmlElement(name = "ExtractAllowed")
    protected Boolean extractAllowed;
    @XmlElement(name = "PrintAllowed")
    protected Boolean printAllowed;
    @XmlElement(name = "ExportAllowed")
    protected Boolean exportAllowed;
    @XmlElement(name = "ProgrammaticAccessAllowed")
    protected Boolean programmaticAccessAllowed;
    @XmlElement(name = "IsOwner")
    protected Boolean isOwner;
    @XmlElement(name = "ContentOwner")
    protected String contentOwner;
    @XmlElement(name = "ContentExpiryDate")
    protected String contentExpiryDate;

    /**
     * Gets the value of the rightsManagedMessageDecryptionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRightsManagedMessageDecryptionStatus() {
        return rightsManagedMessageDecryptionStatus;
    }

    /**
     * Sets the value of the rightsManagedMessageDecryptionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRightsManagedMessageDecryptionStatus(Integer value) {
        this.rightsManagedMessageDecryptionStatus = value;
    }

    /**
     * Gets the value of the rmsTemplateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRmsTemplateId() {
        return rmsTemplateId;
    }

    /**
     * Sets the value of the rmsTemplateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRmsTemplateId(String value) {
        this.rmsTemplateId = value;
    }

    /**
     * Gets the value of the templateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * Sets the value of the templateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateName(String value) {
        this.templateName = value;
    }

    /**
     * Gets the value of the templateDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateDescription() {
        return templateDescription;
    }

    /**
     * Sets the value of the templateDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateDescription(String value) {
        this.templateDescription = value;
    }

    /**
     * Gets the value of the editAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEditAllowed() {
        return editAllowed;
    }

    /**
     * Sets the value of the editAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEditAllowed(Boolean value) {
        this.editAllowed = value;
    }

    /**
     * Gets the value of the replyAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReplyAllowed() {
        return replyAllowed;
    }

    /**
     * Sets the value of the replyAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReplyAllowed(Boolean value) {
        this.replyAllowed = value;
    }

    /**
     * Gets the value of the replyAllAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReplyAllAllowed() {
        return replyAllAllowed;
    }

    /**
     * Sets the value of the replyAllAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReplyAllAllowed(Boolean value) {
        this.replyAllAllowed = value;
    }

    /**
     * Gets the value of the forwardAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForwardAllowed() {
        return forwardAllowed;
    }

    /**
     * Sets the value of the forwardAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForwardAllowed(Boolean value) {
        this.forwardAllowed = value;
    }

    /**
     * Gets the value of the modifyRecipientsAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isModifyRecipientsAllowed() {
        return modifyRecipientsAllowed;
    }

    /**
     * Sets the value of the modifyRecipientsAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setModifyRecipientsAllowed(Boolean value) {
        this.modifyRecipientsAllowed = value;
    }

    /**
     * Gets the value of the extractAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExtractAllowed() {
        return extractAllowed;
    }

    /**
     * Sets the value of the extractAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExtractAllowed(Boolean value) {
        this.extractAllowed = value;
    }

    /**
     * Gets the value of the printAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrintAllowed() {
        return printAllowed;
    }

    /**
     * Sets the value of the printAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrintAllowed(Boolean value) {
        this.printAllowed = value;
    }

    /**
     * Gets the value of the exportAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExportAllowed() {
        return exportAllowed;
    }

    /**
     * Sets the value of the exportAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExportAllowed(Boolean value) {
        this.exportAllowed = value;
    }

    /**
     * Gets the value of the programmaticAccessAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProgrammaticAccessAllowed() {
        return programmaticAccessAllowed;
    }

    /**
     * Sets the value of the programmaticAccessAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProgrammaticAccessAllowed(Boolean value) {
        this.programmaticAccessAllowed = value;
    }

    /**
     * Gets the value of the isOwner property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOwner() {
        return isOwner;
    }

    /**
     * Sets the value of the isOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOwner(Boolean value) {
        this.isOwner = value;
    }

    /**
     * Gets the value of the contentOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentOwner() {
        return contentOwner;
    }

    /**
     * Sets the value of the contentOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentOwner(String value) {
        this.contentOwner = value;
    }

    /**
     * Gets the value of the contentExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentExpiryDate() {
        return contentExpiryDate;
    }

    /**
     * Sets the value of the contentExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentExpiryDate(String value) {
        this.contentExpiryDate = value;
    }

}
