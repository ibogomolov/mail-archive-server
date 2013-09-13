
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetImItemListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetImItemListType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="ExtendedProperties" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfExtendedFieldURIs" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetImItemListType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "extendedProperties"
})
public class GetImItemListType
    extends BaseRequestType
{

    @XmlElement(name = "ExtendedProperties")
    protected NonEmptyArrayOfExtendedFieldURIs extendedProperties;

    /**
     * Gets the value of the extendedProperties property.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfExtendedFieldURIs }
     *     
     */
    public NonEmptyArrayOfExtendedFieldURIs getExtendedProperties() {
        return extendedProperties;
    }

    /**
     * Sets the value of the extendedProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfExtendedFieldURIs }
     *     
     */
    public void setExtendedProperties(NonEmptyArrayOfExtendedFieldURIs value) {
        this.extendedProperties = value;
    }

}
