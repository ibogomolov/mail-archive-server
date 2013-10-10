
package exchange.v2007sp3.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseSubscriptionRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseSubscriptionRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FolderIds" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfBaseFolderIdsType"/>
 *         &lt;element name="EventTypes" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfNotificationEventTypesType"/>
 *         &lt;element name="Watermark" type="{http://schemas.microsoft.com/exchange/services/2006/types}WatermarkType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseSubscriptionRequestType", propOrder = {
    "folderIds",
    "eventTypes",
    "watermark"
})
@XmlSeeAlso({
    PushSubscriptionRequestType.class,
    PullSubscriptionRequestType.class
})
public abstract class BaseSubscriptionRequestType {

    @XmlElement(name = "FolderIds", required = true)
    protected NonEmptyArrayOfBaseFolderIdsType folderIds;
    @XmlElement(name = "EventTypes", required = true)
    protected NonEmptyArrayOfNotificationEventTypesType eventTypes;
    @XmlElement(name = "Watermark")
    protected String watermark;

    /**
     * Gets the value of the folderIds property.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfBaseFolderIdsType }
     *     
     */
    public NonEmptyArrayOfBaseFolderIdsType getFolderIds() {
        return folderIds;
    }

    /**
     * Sets the value of the folderIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfBaseFolderIdsType }
     *     
     */
    public void setFolderIds(NonEmptyArrayOfBaseFolderIdsType value) {
        this.folderIds = value;
    }

    /**
     * Gets the value of the eventTypes property.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfNotificationEventTypesType }
     *     
     */
    public NonEmptyArrayOfNotificationEventTypesType getEventTypes() {
        return eventTypes;
    }

    /**
     * Sets the value of the eventTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfNotificationEventTypesType }
     *     
     */
    public void setEventTypes(NonEmptyArrayOfNotificationEventTypesType value) {
        this.eventTypes = value;
    }

    /**
     * Gets the value of the watermark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWatermark() {
        return watermark;
    }

    /**
     * Sets the value of the watermark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWatermark(String value) {
        this.watermark = value;
    }

}
