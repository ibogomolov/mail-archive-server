
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddDistributionGroupToImListResponseMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddDistributionGroupToImListResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="ImGroup" type="{http://schemas.microsoft.com/exchange/services/2006/types}ImGroupType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddDistributionGroupToImListResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "imGroup"
})
public class AddDistributionGroupToImListResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "ImGroup")
    protected ImGroupType imGroup;

    /**
     * Gets the value of the imGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ImGroupType }
     *     
     */
    public ImGroupType getImGroup() {
        return imGroup;
    }

    /**
     * Sets the value of the imGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImGroupType }
     *     
     */
    public void setImGroup(ImGroupType value) {
        this.imGroup = value;
    }

}
