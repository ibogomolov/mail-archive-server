
package exchange.v2007sp3.ws.client.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttachmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttachmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttachmentId" type="{http://schemas.microsoft.com/exchange/services/2006/types}AttachmentIdType" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContentLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentType", propOrder = {
    "attachmentId",
    "name",
    "contentType",
    "contentId",
    "contentLocation"
})
@XmlSeeAlso({
    ItemAttachmentType.class,
    FileAttachmentType.class
})
public class AttachmentType {

    @XmlElement(name = "AttachmentId")
    protected AttachmentIdType attachmentId;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "ContentType")
    protected String contentType;
    @XmlElement(name = "ContentId")
    protected String contentId;
    @XmlElement(name = "ContentLocation")
    protected String contentLocation;

    /**
     * Gets the value of the attachmentId property.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentIdType }
     *     
     */
    public AttachmentIdType getAttachmentId() {
        return attachmentId;
    }

    /**
     * Sets the value of the attachmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentIdType }
     *     
     */
    public void setAttachmentId(AttachmentIdType value) {
        this.attachmentId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentType(String value) {
        this.contentType = value;
    }

    /**
     * Gets the value of the contentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentId() {
        return contentId;
    }

    /**
     * Sets the value of the contentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentId(String value) {
        this.contentId = value;
    }

    /**
     * Gets the value of the contentLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentLocation() {
        return contentLocation;
    }

    /**
     * Sets the value of the contentLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentLocation(String value) {
        this.contentLocation = value;
    }

}
