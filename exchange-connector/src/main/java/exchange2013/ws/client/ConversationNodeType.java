
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConversationNodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConversationNodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InternetMessageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentInternetMessageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Items" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfAllItemsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConversationNodeType", propOrder = {
    "internetMessageId",
    "parentInternetMessageId",
    "items"
})
public class ConversationNodeType {

    @XmlElement(name = "InternetMessageId")
    protected String internetMessageId;
    @XmlElement(name = "ParentInternetMessageId")
    protected String parentInternetMessageId;
    @XmlElement(name = "Items")
    protected NonEmptyArrayOfAllItemsType items;

    /**
     * Gets the value of the internetMessageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternetMessageId() {
        return internetMessageId;
    }

    /**
     * Sets the value of the internetMessageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternetMessageId(String value) {
        this.internetMessageId = value;
    }

    /**
     * Gets the value of the parentInternetMessageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentInternetMessageId() {
        return parentInternetMessageId;
    }

    /**
     * Sets the value of the parentInternetMessageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentInternetMessageId(String value) {
        this.parentInternetMessageId = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfAllItemsType }
     *     
     */
    public NonEmptyArrayOfAllItemsType getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfAllItemsType }
     *     
     */
    public void setItems(NonEmptyArrayOfAllItemsType value) {
        this.items = value;
    }

}
