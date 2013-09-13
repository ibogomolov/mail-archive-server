
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetRemindersResponseMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetRemindersResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="Reminders" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfRemindersType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetRemindersResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "reminders"
})
public class GetRemindersResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "Reminders", required = true)
    protected ArrayOfRemindersType reminders;

    /**
     * Gets the value of the reminders property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRemindersType }
     *     
     */
    public ArrayOfRemindersType getReminders() {
        return reminders;
    }

    /**
     * Sets the value of the reminders property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRemindersType }
     *     
     */
    public void setReminders(ArrayOfRemindersType value) {
        this.reminders = value;
    }

}
