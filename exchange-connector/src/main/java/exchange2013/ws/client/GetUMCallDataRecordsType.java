
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GetUMCallDataRecordsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetUMCallDataRecordsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="StartDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EndDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Offset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumberOfRecords" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UserLegacyExchangeDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FilterBy" type="{http://schemas.microsoft.com/exchange/services/2006/types}UMCDRFilterByType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUMCallDataRecordsType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "startDateTime",
    "endDateTime",
    "offset",
    "numberOfRecords",
    "userLegacyExchangeDN",
    "filterBy"
})
public class GetUMCallDataRecordsType
    extends BaseRequestType
{

    @XmlElement(name = "StartDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDateTime;
    @XmlElement(name = "EndDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDateTime;
    @XmlElement(name = "Offset")
    protected Integer offset;
    @XmlElement(name = "NumberOfRecords")
    protected Integer numberOfRecords;
    @XmlElement(name = "UserLegacyExchangeDN")
    protected String userLegacyExchangeDN;
    @XmlElement(name = "FilterBy", required = true)
    protected UMCDRFilterByType filterBy;

    /**
     * Gets the value of the startDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDateTime() {
        return startDateTime;
    }

    /**
     * Sets the value of the startDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDateTime(XMLGregorianCalendar value) {
        this.startDateTime = value;
    }

    /**
     * Gets the value of the endDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDateTime(XMLGregorianCalendar value) {
        this.endDateTime = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOffset(Integer value) {
        this.offset = value;
    }

    /**
     * Gets the value of the numberOfRecords property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfRecords() {
        return numberOfRecords;
    }

    /**
     * Sets the value of the numberOfRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfRecords(Integer value) {
        this.numberOfRecords = value;
    }

    /**
     * Gets the value of the userLegacyExchangeDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLegacyExchangeDN() {
        return userLegacyExchangeDN;
    }

    /**
     * Sets the value of the userLegacyExchangeDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLegacyExchangeDN(String value) {
        this.userLegacyExchangeDN = value;
    }

    /**
     * Gets the value of the filterBy property.
     * 
     * @return
     *     possible object is
     *     {@link UMCDRFilterByType }
     *     
     */
    public UMCDRFilterByType getFilterBy() {
        return filterBy;
    }

    /**
     * Sets the value of the filterBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link UMCDRFilterByType }
     *     
     */
    public void setFilterBy(UMCDRFilterByType value) {
        this.filterBy = value;
    }

}
