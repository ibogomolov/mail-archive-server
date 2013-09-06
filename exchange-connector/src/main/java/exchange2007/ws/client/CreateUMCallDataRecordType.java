
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateUMCallDataRecordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateUMCallDataRecordType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="CDRData" type="{http://schemas.microsoft.com/exchange/services/2006/types}CDRDataType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateUMCallDataRecordType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "cdrData"
})
public class CreateUMCallDataRecordType
    extends BaseRequestType
{

    @XmlElement(name = "CDRData", required = true)
    protected CDRDataType cdrData;

    /**
     * Gets the value of the cdrData property.
     * 
     * @return
     *     possible object is
     *     {@link CDRDataType }
     *     
     */
    public CDRDataType getCDRData() {
        return cdrData;
    }

    /**
     * Sets the value of the cdrData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CDRDataType }
     *     
     */
    public void setCDRData(CDRDataType value) {
        this.cdrData = value;
    }

}
