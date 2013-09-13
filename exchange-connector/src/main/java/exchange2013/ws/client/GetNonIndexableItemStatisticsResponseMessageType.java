
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Response message type for the GetNonIndexableItemStatistics web method.
 *       
 * 
 * <p>Java class for GetNonIndexableItemStatisticsResponseMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetNonIndexableItemStatisticsResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="NonIndexableItemStatistics" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfNonIndexableItemStatisticsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetNonIndexableItemStatisticsResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "nonIndexableItemStatistics"
})
public class GetNonIndexableItemStatisticsResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "NonIndexableItemStatistics")
    protected ArrayOfNonIndexableItemStatisticsType nonIndexableItemStatistics;

    /**
     * Gets the value of the nonIndexableItemStatistics property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNonIndexableItemStatisticsType }
     *     
     */
    public ArrayOfNonIndexableItemStatisticsType getNonIndexableItemStatistics() {
        return nonIndexableItemStatistics;
    }

    /**
     * Sets the value of the nonIndexableItemStatistics property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNonIndexableItemStatisticsType }
     *     
     */
    public void setNonIndexableItemStatistics(ArrayOfNonIndexableItemStatisticsType value) {
        this.nonIndexableItemStatistics = value;
    }

}
