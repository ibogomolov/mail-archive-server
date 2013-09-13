
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PerformReminderActionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PerformReminderActionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="ReminderItemActions" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfReminderItemActionType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformReminderActionType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "reminderItemActions"
})
public class PerformReminderActionType
    extends BaseRequestType
{

    @XmlElement(name = "ReminderItemActions", required = true)
    protected NonEmptyArrayOfReminderItemActionType reminderItemActions;

    /**
     * Gets the value of the reminderItemActions property.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfReminderItemActionType }
     *     
     */
    public NonEmptyArrayOfReminderItemActionType getReminderItemActions() {
        return reminderItemActions;
    }

    /**
     * Sets the value of the reminderItemActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfReminderItemActionType }
     *     
     */
    public void setReminderItemActions(NonEmptyArrayOfReminderItemActionType value) {
        this.reminderItemActions = value;
    }

}
