
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AudioQualityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AudioQualityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NMOS" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="NMOSDegradation" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="NMOSDegradationPacketLoss" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="NMOSDegradationJitter" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="Jitter" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="PacketLoss" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="RoundTrip" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="BurstDensity" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="BurstDuration" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="AudioCodec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudioQualityType", propOrder = {
    "nmos",
    "nmosDegradation",
    "nmosDegradationPacketLoss",
    "nmosDegradationJitter",
    "jitter",
    "packetLoss",
    "roundTrip",
    "burstDensity",
    "burstDuration",
    "audioCodec"
})
public class AudioQualityType {

    @XmlElement(name = "NMOS")
    protected float nmos;
    @XmlElement(name = "NMOSDegradation")
    protected float nmosDegradation;
    @XmlElement(name = "NMOSDegradationPacketLoss")
    protected float nmosDegradationPacketLoss;
    @XmlElement(name = "NMOSDegradationJitter")
    protected float nmosDegradationJitter;
    @XmlElement(name = "Jitter")
    protected float jitter;
    @XmlElement(name = "PacketLoss")
    protected float packetLoss;
    @XmlElement(name = "RoundTrip")
    protected float roundTrip;
    @XmlElement(name = "BurstDensity")
    protected float burstDensity;
    @XmlElement(name = "BurstDuration")
    protected float burstDuration;
    @XmlElement(name = "AudioCodec")
    protected String audioCodec;

    /**
     * Gets the value of the nmos property.
     * 
     */
    public float getNMOS() {
        return nmos;
    }

    /**
     * Sets the value of the nmos property.
     * 
     */
    public void setNMOS(float value) {
        this.nmos = value;
    }

    /**
     * Gets the value of the nmosDegradation property.
     * 
     */
    public float getNMOSDegradation() {
        return nmosDegradation;
    }

    /**
     * Sets the value of the nmosDegradation property.
     * 
     */
    public void setNMOSDegradation(float value) {
        this.nmosDegradation = value;
    }

    /**
     * Gets the value of the nmosDegradationPacketLoss property.
     * 
     */
    public float getNMOSDegradationPacketLoss() {
        return nmosDegradationPacketLoss;
    }

    /**
     * Sets the value of the nmosDegradationPacketLoss property.
     * 
     */
    public void setNMOSDegradationPacketLoss(float value) {
        this.nmosDegradationPacketLoss = value;
    }

    /**
     * Gets the value of the nmosDegradationJitter property.
     * 
     */
    public float getNMOSDegradationJitter() {
        return nmosDegradationJitter;
    }

    /**
     * Sets the value of the nmosDegradationJitter property.
     * 
     */
    public void setNMOSDegradationJitter(float value) {
        this.nmosDegradationJitter = value;
    }

    /**
     * Gets the value of the jitter property.
     * 
     */
    public float getJitter() {
        return jitter;
    }

    /**
     * Sets the value of the jitter property.
     * 
     */
    public void setJitter(float value) {
        this.jitter = value;
    }

    /**
     * Gets the value of the packetLoss property.
     * 
     */
    public float getPacketLoss() {
        return packetLoss;
    }

    /**
     * Sets the value of the packetLoss property.
     * 
     */
    public void setPacketLoss(float value) {
        this.packetLoss = value;
    }

    /**
     * Gets the value of the roundTrip property.
     * 
     */
    public float getRoundTrip() {
        return roundTrip;
    }

    /**
     * Sets the value of the roundTrip property.
     * 
     */
    public void setRoundTrip(float value) {
        this.roundTrip = value;
    }

    /**
     * Gets the value of the burstDensity property.
     * 
     */
    public float getBurstDensity() {
        return burstDensity;
    }

    /**
     * Sets the value of the burstDensity property.
     * 
     */
    public void setBurstDensity(float value) {
        this.burstDensity = value;
    }

    /**
     * Gets the value of the burstDuration property.
     * 
     */
    public float getBurstDuration() {
        return burstDuration;
    }

    /**
     * Sets the value of the burstDuration property.
     * 
     */
    public void setBurstDuration(float value) {
        this.burstDuration = value;
    }

    /**
     * Gets the value of the audioCodec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudioCodec() {
        return audioCodec;
    }

    /**
     * Sets the value of the audioCodec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudioCodec(String value) {
        this.audioCodec = value;
    }

}
