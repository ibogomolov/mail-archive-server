
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClientIntentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClientIntentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemId" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType"/>
 *         &lt;element name="Intent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ItemVersion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WouldRepair" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PredictedAction" type="{http://schemas.microsoft.com/exchange/services/2006/types}ClientIntentMeetingInquiryActionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientIntentType", propOrder = {
    "itemId",
    "intent",
    "itemVersion",
    "wouldRepair",
    "predictedAction"
})
public class ClientIntentType {

    @XmlElement(name = "ItemId", required = true)
    protected ItemIdType itemId;
    @XmlElement(name = "Intent")
    protected int intent;
    @XmlElement(name = "ItemVersion")
    protected int itemVersion;
    @XmlElement(name = "WouldRepair")
    protected boolean wouldRepair;
    @XmlElement(name = "PredictedAction")
    protected ClientIntentMeetingInquiryActionType predictedAction;

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
     * Gets the value of the intent property.
     * 
     */
    public int getIntent() {
        return intent;
    }

    /**
     * Sets the value of the intent property.
     * 
     */
    public void setIntent(int value) {
        this.intent = value;
    }

    /**
     * Gets the value of the itemVersion property.
     * 
     */
    public int getItemVersion() {
        return itemVersion;
    }

    /**
     * Sets the value of the itemVersion property.
     * 
     */
    public void setItemVersion(int value) {
        this.itemVersion = value;
    }

    /**
     * Gets the value of the wouldRepair property.
     * 
     */
    public boolean isWouldRepair() {
        return wouldRepair;
    }

    /**
     * Sets the value of the wouldRepair property.
     * 
     */
    public void setWouldRepair(boolean value) {
        this.wouldRepair = value;
    }

    /**
     * Gets the value of the predictedAction property.
     * 
     * @return
     *     possible object is
     *     {@link ClientIntentMeetingInquiryActionType }
     *     
     */
    public ClientIntentMeetingInquiryActionType getPredictedAction() {
        return predictedAction;
    }

    /**
     * Sets the value of the predictedAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientIntentMeetingInquiryActionType }
     *     
     */
    public void setPredictedAction(ClientIntentMeetingInquiryActionType value) {
        this.predictedAction = value;
    }

}
