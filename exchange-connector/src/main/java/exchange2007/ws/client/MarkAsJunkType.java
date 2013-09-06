
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarkAsJunkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarkAsJunkType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="ItemIds" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfBaseItemIdsType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="IsJunk" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="MoveItem" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarkAsJunkType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "itemIds"
})
public class MarkAsJunkType
    extends BaseRequestType
{

    @XmlElement(name = "ItemIds", required = true)
    protected NonEmptyArrayOfBaseItemIdsType itemIds;
    @XmlAttribute(name = "IsJunk", required = true)
    protected boolean isJunk;
    @XmlAttribute(name = "MoveItem", required = true)
    protected boolean moveItem;

    /**
     * Gets the value of the itemIds property.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfBaseItemIdsType }
     *     
     */
    public NonEmptyArrayOfBaseItemIdsType getItemIds() {
        return itemIds;
    }

    /**
     * Sets the value of the itemIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfBaseItemIdsType }
     *     
     */
    public void setItemIds(NonEmptyArrayOfBaseItemIdsType value) {
        this.itemIds = value;
    }

    /**
     * Gets the value of the isJunk property.
     * 
     */
    public boolean isIsJunk() {
        return isJunk;
    }

    /**
     * Sets the value of the isJunk property.
     * 
     */
    public void setIsJunk(boolean value) {
        this.isJunk = value;
    }

    /**
     * Gets the value of the moveItem property.
     * 
     */
    public boolean isMoveItem() {
        return moveItem;
    }

    /**
     * Sets the value of the moveItem property.
     * 
     */
    public void setMoveItem(boolean value) {
        this.moveItem = value;
    }

}
