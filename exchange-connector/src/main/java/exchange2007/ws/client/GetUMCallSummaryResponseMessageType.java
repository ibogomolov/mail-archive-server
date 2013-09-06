
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetUMCallSummaryResponseMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetUMCallSummaryResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="UMReportRawCountersCollection" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfUMReportRawCountersType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUMCallSummaryResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "umReportRawCountersCollection"
})
public class GetUMCallSummaryResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "UMReportRawCountersCollection")
    protected ArrayOfUMReportRawCountersType umReportRawCountersCollection;

    /**
     * Gets the value of the umReportRawCountersCollection property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUMReportRawCountersType }
     *     
     */
    public ArrayOfUMReportRawCountersType getUMReportRawCountersCollection() {
        return umReportRawCountersCollection;
    }

    /**
     * Sets the value of the umReportRawCountersCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUMReportRawCountersType }
     *     
     */
    public void setUMReportRawCountersCollection(ArrayOfUMReportRawCountersType value) {
        this.umReportRawCountersCollection = value;
    }

}
