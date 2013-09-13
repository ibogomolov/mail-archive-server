
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UMReportRawCountersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UMReportRawCountersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AutoAttendantCalls" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="FailedCalls" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="FaxCalls" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="MissedCalls" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="OtherCalls" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="OutboundCalls" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SubscriberAccessCalls" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="VoiceMailCalls" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TotalCalls" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="AudioMetricsAverages" type="{http://schemas.microsoft.com/exchange/services/2006/types}UMReportAudioMetricsAverageCountersType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UMReportRawCountersType", propOrder = {
    "autoAttendantCalls",
    "failedCalls",
    "faxCalls",
    "missedCalls",
    "otherCalls",
    "outboundCalls",
    "subscriberAccessCalls",
    "voiceMailCalls",
    "totalCalls",
    "date",
    "audioMetricsAverages"
})
public class UMReportRawCountersType {

    @XmlElement(name = "AutoAttendantCalls")
    protected long autoAttendantCalls;
    @XmlElement(name = "FailedCalls")
    protected long failedCalls;
    @XmlElement(name = "FaxCalls")
    protected long faxCalls;
    @XmlElement(name = "MissedCalls")
    protected long missedCalls;
    @XmlElement(name = "OtherCalls")
    protected long otherCalls;
    @XmlElement(name = "OutboundCalls")
    protected long outboundCalls;
    @XmlElement(name = "SubscriberAccessCalls")
    protected long subscriberAccessCalls;
    @XmlElement(name = "VoiceMailCalls")
    protected long voiceMailCalls;
    @XmlElement(name = "TotalCalls")
    protected long totalCalls;
    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "AudioMetricsAverages")
    protected UMReportAudioMetricsAverageCountersType audioMetricsAverages;

    /**
     * Gets the value of the autoAttendantCalls property.
     * 
     */
    public long getAutoAttendantCalls() {
        return autoAttendantCalls;
    }

    /**
     * Sets the value of the autoAttendantCalls property.
     * 
     */
    public void setAutoAttendantCalls(long value) {
        this.autoAttendantCalls = value;
    }

    /**
     * Gets the value of the failedCalls property.
     * 
     */
    public long getFailedCalls() {
        return failedCalls;
    }

    /**
     * Sets the value of the failedCalls property.
     * 
     */
    public void setFailedCalls(long value) {
        this.failedCalls = value;
    }

    /**
     * Gets the value of the faxCalls property.
     * 
     */
    public long getFaxCalls() {
        return faxCalls;
    }

    /**
     * Sets the value of the faxCalls property.
     * 
     */
    public void setFaxCalls(long value) {
        this.faxCalls = value;
    }

    /**
     * Gets the value of the missedCalls property.
     * 
     */
    public long getMissedCalls() {
        return missedCalls;
    }

    /**
     * Sets the value of the missedCalls property.
     * 
     */
    public void setMissedCalls(long value) {
        this.missedCalls = value;
    }

    /**
     * Gets the value of the otherCalls property.
     * 
     */
    public long getOtherCalls() {
        return otherCalls;
    }

    /**
     * Sets the value of the otherCalls property.
     * 
     */
    public void setOtherCalls(long value) {
        this.otherCalls = value;
    }

    /**
     * Gets the value of the outboundCalls property.
     * 
     */
    public long getOutboundCalls() {
        return outboundCalls;
    }

    /**
     * Sets the value of the outboundCalls property.
     * 
     */
    public void setOutboundCalls(long value) {
        this.outboundCalls = value;
    }

    /**
     * Gets the value of the subscriberAccessCalls property.
     * 
     */
    public long getSubscriberAccessCalls() {
        return subscriberAccessCalls;
    }

    /**
     * Sets the value of the subscriberAccessCalls property.
     * 
     */
    public void setSubscriberAccessCalls(long value) {
        this.subscriberAccessCalls = value;
    }

    /**
     * Gets the value of the voiceMailCalls property.
     * 
     */
    public long getVoiceMailCalls() {
        return voiceMailCalls;
    }

    /**
     * Sets the value of the voiceMailCalls property.
     * 
     */
    public void setVoiceMailCalls(long value) {
        this.voiceMailCalls = value;
    }

    /**
     * Gets the value of the totalCalls property.
     * 
     */
    public long getTotalCalls() {
        return totalCalls;
    }

    /**
     * Sets the value of the totalCalls property.
     * 
     */
    public void setTotalCalls(long value) {
        this.totalCalls = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the audioMetricsAverages property.
     * 
     * @return
     *     possible object is
     *     {@link UMReportAudioMetricsAverageCountersType }
     *     
     */
    public UMReportAudioMetricsAverageCountersType getAudioMetricsAverages() {
        return audioMetricsAverages;
    }

    /**
     * Sets the value of the audioMetricsAverages property.
     * 
     * @param value
     *     allowed object is
     *     {@link UMReportAudioMetricsAverageCountersType }
     *     
     */
    public void setAudioMetricsAverages(UMReportAudioMetricsAverageCountersType value) {
        this.audioMetricsAverages = value;
    }

}
