
package exchange2013.ws.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonEmptyArrayOfReminderItemActionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonEmptyArrayOfReminderItemActionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReminderItemAction" type="{http://schemas.microsoft.com/exchange/services/2006/types}ReminderItemActionType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonEmptyArrayOfReminderItemActionType", propOrder = {
    "reminderItemAction"
})
public class NonEmptyArrayOfReminderItemActionType {

    @XmlElement(name = "ReminderItemAction", required = true)
    protected List<ReminderItemActionType> reminderItemAction;

    /**
     * Gets the value of the reminderItemAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reminderItemAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReminderItemAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReminderItemActionType }
     * 
     * 
     */
    public List<ReminderItemActionType> getReminderItemAction() {
        if (reminderItemAction == null) {
            reminderItemAction = new ArrayList<ReminderItemActionType>();
        }
        return this.reminderItemAction;
    }

}
