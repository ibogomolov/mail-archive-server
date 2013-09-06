
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddNewTelUriContactToGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddNewTelUriContactToGroupType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="TelUriAddress" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyStringType"/>
 *         &lt;element name="ImContactSipUriAddress" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyStringType"/>
 *         &lt;element name="ImTelephoneNumber" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyStringType"/>
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
@XmlType(name = "AddNewTelUriContactToGroupType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "telUriAddress",
    "imContactSipUriAddress",
    "imTelephoneNumber",
    "groupId"
})
public class AddNewTelUriContactToGroupType
    extends BaseRequestType
{

    @XmlElement(name = "TelUriAddress", required = true)
    protected String telUriAddress;
    @XmlElement(name = "ImContactSipUriAddress", required = true)
    protected String imContactSipUriAddress;
    @XmlElement(name = "ImTelephoneNumber", required = true)
    protected String imTelephoneNumber;
    @XmlElement(name = "GroupId")
    protected ItemIdType groupId;

    /**
     * Gets the value of the telUriAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelUriAddress() {
        return telUriAddress;
    }

    /**
     * Sets the value of the telUriAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelUriAddress(String value) {
        this.telUriAddress = value;
    }

    /**
     * Gets the value of the imContactSipUriAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImContactSipUriAddress() {
        return imContactSipUriAddress;
    }

    /**
     * Sets the value of the imContactSipUriAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImContactSipUriAddress(String value) {
        this.imContactSipUriAddress = value;
    }

    /**
     * Gets the value of the imTelephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImTelephoneNumber() {
        return imTelephoneNumber;
    }

    /**
     * Sets the value of the imTelephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImTelephoneNumber(String value) {
        this.imTelephoneNumber = value;
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
