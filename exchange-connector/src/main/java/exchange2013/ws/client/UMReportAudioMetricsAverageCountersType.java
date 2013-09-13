
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UMReportAudioMetricsAverageCountersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UMReportAudioMetricsAverageCountersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NMOS" type="{http://schemas.microsoft.com/exchange/services/2006/types}AudioMetricsAverageType" minOccurs="0"/>
 *         &lt;element name="NMOSDegradation" type="{http://schemas.microsoft.com/exchange/services/2006/types}AudioMetricsAverageType" minOccurs="0"/>
 *         &lt;element name="Jitter" type="{http://schemas.microsoft.com/exchange/services/2006/types}AudioMetricsAverageType" minOccurs="0"/>
 *         &lt;element name="PercentPacketLoss" type="{http://schemas.microsoft.com/exchange/services/2006/types}AudioMetricsAverageType" minOccurs="0"/>
 *         &lt;element name="RoundTrip" type="{http://schemas.microsoft.com/exchange/services/2006/types}AudioMetricsAverageType" minOccurs="0"/>
 *         &lt;element name="BurstLossDuration" type="{http://schemas.microsoft.com/exchange/services/2006/types}AudioMetricsAverageType" minOccurs="0"/>
 *         &lt;element name="TotalAudioQualityCallsSampled" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UMReportAudioMetricsAverageCountersType", propOrder = {
    "nmos",
    "nmosDegradation",
    "jitter",
    "percentPacketLoss",
    "roundTrip",
    "burstLossDuration",
    "totalAudioQualityCallsSampled"
})
public class UMReportAudioMetricsAverageCountersType {

    @XmlElement(name = "NMOS")
    protected AudioMetricsAverageType nmos;
    @XmlElement(name = "NMOSDegradation")
    protected AudioMetricsAverageType nmosDegradation;
    @XmlElement(name = "Jitter")
    protected AudioMetricsAverageType jitter;
    @XmlElement(name = "PercentPacketLoss")
    protected AudioMetricsAverageType percentPacketLoss;
    @XmlElement(name = "RoundTrip")
    protected AudioMetricsAverageType roundTrip;
    @XmlElement(name = "BurstLossDuration")
    protected AudioMetricsAverageType burstLossDuration;
    @XmlElement(name = "TotalAudioQualityCallsSampled")
    protected long totalAudioQualityCallsSampled;

    /**
     * Gets the value of the nmos property.
     * 
     * @return
     *     possible object is
     *     {@link AudioMetricsAverageType }
     *     
     */
    public AudioMetricsAverageType getNMOS() {
        return nmos;
    }

    /**
     * Sets the value of the nmos property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioMetricsAverageType }
     *     
     */
    public void setNMOS(AudioMetricsAverageType value) {
        this.nmos = value;
    }

    /**
     * Gets the value of the nmosDegradation property.
     * 
     * @return
     *     possible object is
     *     {@link AudioMetricsAverageType }
     *     
     */
    public AudioMetricsAverageType getNMOSDegradation() {
        return nmosDegradation;
    }

    /**
     * Sets the value of the nmosDegradation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioMetricsAverageType }
     *     
     */
    public void setNMOSDegradation(AudioMetricsAverageType value) {
        this.nmosDegradation = value;
    }

    /**
     * Gets the value of the jitter property.
     * 
     * @return
     *     possible object is
     *     {@link AudioMetricsAverageType }
     *     
     */
    public AudioMetricsAverageType getJitter() {
        return jitter;
    }

    /**
     * Sets the value of the jitter property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioMetricsAverageType }
     *     
     */
    public void setJitter(AudioMetricsAverageType value) {
        this.jitter = value;
    }

    /**
     * Gets the value of the percentPacketLoss property.
     * 
     * @return
     *     possible object is
     *     {@link AudioMetricsAverageType }
     *     
     */
    public AudioMetricsAverageType getPercentPacketLoss() {
        return percentPacketLoss;
    }

    /**
     * Sets the value of the percentPacketLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioMetricsAverageType }
     *     
     */
    public void setPercentPacketLoss(AudioMetricsAverageType value) {
        this.percentPacketLoss = value;
    }

    /**
     * Gets the value of the roundTrip property.
     * 
     * @return
     *     possible object is
     *     {@link AudioMetricsAverageType }
     *     
     */
    public AudioMetricsAverageType getRoundTrip() {
        return roundTrip;
    }

    /**
     * Sets the value of the roundTrip property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioMetricsAverageType }
     *     
     */
    public void setRoundTrip(AudioMetricsAverageType value) {
        this.roundTrip = value;
    }

    /**
     * Gets the value of the burstLossDuration property.
     * 
     * @return
     *     possible object is
     *     {@link AudioMetricsAverageType }
     *     
     */
    public AudioMetricsAverageType getBurstLossDuration() {
        return burstLossDuration;
    }

    /**
     * Sets the value of the burstLossDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioMetricsAverageType }
     *     
     */
    public void setBurstLossDuration(AudioMetricsAverageType value) {
        this.burstLossDuration = value;
    }

    /**
     * Gets the value of the totalAudioQualityCallsSampled property.
     * 
     */
    public long getTotalAudioQualityCallsSampled() {
        return totalAudioQualityCallsSampled;
    }

    /**
     * Sets the value of the totalAudioQualityCallsSampled property.
     * 
     */
    public void setTotalAudioQualityCallsSampled(long value) {
        this.totalAudioQualityCallsSampled = value;
    }

}
