
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Non indexable item details result.
 *       
 * 
 * <p>Java class for NonIndexableItemDetailResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonIndexableItemDetailResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Items" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfNonIndexableItemDetailsType" minOccurs="0"/>
 *         &lt;element name="FailedMailboxes" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfFailedSearchMailboxesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonIndexableItemDetailResultType", propOrder = {
    "items",
    "failedMailboxes"
})
public class NonIndexableItemDetailResultType {

    @XmlElement(name = "Items")
    protected ArrayOfNonIndexableItemDetailsType items;
    @XmlElement(name = "FailedMailboxes")
    protected ArrayOfFailedSearchMailboxesType failedMailboxes;

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNonIndexableItemDetailsType }
     *     
     */
    public ArrayOfNonIndexableItemDetailsType getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNonIndexableItemDetailsType }
     *     
     */
    public void setItems(ArrayOfNonIndexableItemDetailsType value) {
        this.items = value;
    }

    /**
     * Gets the value of the failedMailboxes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFailedSearchMailboxesType }
     *     
     */
    public ArrayOfFailedSearchMailboxesType getFailedMailboxes() {
        return failedMailboxes;
    }

    /**
     * Sets the value of the failedMailboxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFailedSearchMailboxesType }
     *     
     */
    public void setFailedMailboxes(ArrayOfFailedSearchMailboxesType value) {
        this.failedMailboxes = value;
    }

}
