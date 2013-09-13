
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PerformReminderActionResponseMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PerformReminderActionResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="UpdatedItemIds" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfItemIdsType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformReminderActionResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "updatedItemIds"
})
public class PerformReminderActionResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "UpdatedItemIds", required = true)
    protected NonEmptyArrayOfItemIdsType updatedItemIds;

    /**
     * Gets the value of the updatedItemIds property.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfItemIdsType }
     *     
     */
    public NonEmptyArrayOfItemIdsType getUpdatedItemIds() {
        return updatedItemIds;
    }

    /**
     * Sets the value of the updatedItemIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfItemIdsType }
     *     
     */
    public void setUpdatedItemIds(NonEmptyArrayOfItemIdsType value) {
        this.updatedItemIds = value;
    }

}
