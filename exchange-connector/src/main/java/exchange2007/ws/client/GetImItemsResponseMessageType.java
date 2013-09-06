
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetImItemsResponseMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetImItemsResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="ImItemList" type="{http://schemas.microsoft.com/exchange/services/2006/types}ImItemListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetImItemsResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "imItemList"
})
public class GetImItemsResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "ImItemList")
    protected ImItemListType imItemList;

    /**
     * Gets the value of the imItemList property.
     * 
     * @return
     *     possible object is
     *     {@link ImItemListType }
     *     
     */
    public ImItemListType getImItemList() {
        return imItemList;
    }

    /**
     * Sets the value of the imItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImItemListType }
     *     
     */
    public void setImItemList(ImItemListType value) {
        this.imItemList = value;
    }

}
