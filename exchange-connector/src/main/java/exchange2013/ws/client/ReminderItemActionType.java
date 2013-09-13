
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReminderItemActionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReminderItemActionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActionType" type="{http://schemas.microsoft.com/exchange/services/2006/types}ReminderActionType"/>
 *         &lt;element name="ItemId" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType"/>
 *         &lt;element name="NewReminderTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReminderItemActionType", propOrder = {
    "actionType",
    "itemId",
    "newReminderTime"
})
public class ReminderItemActionType {

    @XmlElement(name = "ActionType", required = true)
    protected ReminderActionType actionType;
    @XmlElement(name = "ItemId", required = true)
    protected ItemIdType itemId;
    @XmlElement(name = "NewReminderTime")
    protected String newReminderTime;

    /**
     * Gets the value of the actionType property.
     * 
     * @return
     *     possible object is
     *     {@link ReminderActionType }
     *     
     */
    public ReminderActionType getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReminderActionType }
     *     
     */
    public void setActionType(ReminderActionType value) {
        this.actionType = value;
    }

    /**
     * Gets the value of the itemId property.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdType }
     *     
     */
    public ItemIdType getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdType }
     *     
     */
    public void setItemId(ItemIdType value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the newReminderTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewReminderTime() {
        return newReminderTime;
    }

    /**
     * Sets the value of the newReminderTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewReminderTime(String value) {
        this.newReminderTime = value;
    }

}
