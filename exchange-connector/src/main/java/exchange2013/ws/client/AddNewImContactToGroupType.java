
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddNewImContactToGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddNewImContactToGroupType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="ImAddress" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyStringType"/>
 *         &lt;element name="DisplayName" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyStringType" minOccurs="0"/>
 *         &lt;element name="GroupId" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddNewImContactToGroupType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "imAddress",
    "displayName",
    "groupId"
})
public class AddNewImContactToGroupType
    extends BaseRequestType
{

    @XmlElement(name = "ImAddress", required = true)
    protected String imAddress;
    @XmlElement(name = "DisplayName")
    protected String displayName;
    @XmlElement(name = "GroupId")
    protected ItemIdType groupId;

    /**
     * Gets the value of the imAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImAddress() {
        return imAddress;
    }

    /**
     * Sets the value of the imAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImAddress(String value) {
        this.imAddress = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
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
