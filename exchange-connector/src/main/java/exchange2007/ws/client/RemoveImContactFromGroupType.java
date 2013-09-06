
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemoveImContactFromGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemoveImContactFromGroupType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="ContactId" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType"/>
 *         &lt;element name="GroupId" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveImContactFromGroupType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "contactId",
    "groupId"
})
public class RemoveImContactFromGroupType
    extends BaseRequestType
{

    @XmlElement(name = "ContactId", required = true)
    protected ItemIdType contactId;
    @XmlElement(name = "GroupId", required = true)
    protected ItemIdType groupId;

    /**
     * Gets the value of the contactId property.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdType }
     *     
     */
    public ItemIdType getContactId() {
        return contactId;
    }

    /**
     * Sets the value of the contactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdType }
     *     
     */
    public void setContactId(ItemIdType value) {
        this.contactId = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdType }
     *     
     */
    public ItemIdType getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdType }
     *     
     */
    public void setGroupId(ItemIdType value) {
        this.groupId = value;
    }

}
