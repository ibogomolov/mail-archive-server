
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CDRDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CDRDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CallStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CallType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallIdentity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentCallIdentity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UMServerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DialPlanGuid" type="{http://schemas.microsoft.com/exchange/services/2006/types}GuidType" minOccurs="0"/>
 *         &lt;element name="DialPlanName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallDuration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IPGatewayAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IPGatewayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GatewayGuid" type="{http://schemas.microsoft.com/exchange/services/2006/types}GuidType"/>
 *         &lt;element name="CalledPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallerPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OfferResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DropCallReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReasonForCall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransferredNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DialedString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallerMailboxAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CalleeMailboxAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallerLegacyExchangeDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CalleeLegacyExchangeDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutoAttendantName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AudioQualityMetrics" type="{http://schemas.microsoft.com/exchange/services/2006/types}AudioQualityType" minOccurs="0"/>
 *         &lt;element name="CreationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CDRDataType", propOrder = {
    "callStartTime",
    "callType",
    "callIdentity",
    "parentCallIdentity",
    "umServerName",
    "dialPlanGuid",
    "dialPlanName",
    "callDuration",
    "ipGatewayAddress",
    "ipGatewayName",
    "gatewayGuid",
    "calledPhoneNumber",
    "callerPhoneNumber",
    "offerResult",
    "dropCallReason",
    "reasonForCall",
    "transferredNumber",
    "dialedString",
    "callerMailboxAlias",
    "calleeMailboxAlias",
    "callerLegacyExchangeDN",
    "calleeLegacyExchangeDN",
    "autoAttendantName",
    "audioQualityMetrics",
    "creationTime"
})
public class CDRDataType {

    @XmlElement(name = "CallStartTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar callStartTime;
    @XmlElement(name = "CallType")
    protected String callType;
    @XmlElement(name = "CallIdentity")
    protected String callIdentity;
    @XmlElement(name = "ParentCallIdentity")
    protected String parentCallIdentity;
    @XmlElement(name = "UMServerName")
    protected String umServerName;
    @XmlElement(name = "DialPlanGuid")
    protected String dialPlanGuid;
    @XmlElement(name = "DialPlanName")
    protected String dialPlanName;
    @XmlElement(name = "CallDuration")
    protected int callDuration;
    @XmlElement(name = "IPGatewayAddress")
    protected String ipGatewayAddress;
    @XmlElement(name = "IPGatewayName")
    protected String ipGatewayName;
    @XmlElement(name = "GatewayGuid", required = true)
    protected String gatewayGuid;
    @XmlElement(name = "CalledPhoneNumber")
    protected String calledPhoneNumber;
    @XmlElement(name = "CallerPhoneNumber")
    protected String callerPhoneNumber;
    @XmlElement(name = "OfferResult")
    protected String offerResult;
    @XmlElement(name = "DropCallReason")
    protected String dropCallReason;
    @XmlElement(name = "ReasonForCall")
    protected String reasonForCall;
    @XmlElement(name = "TransferredNumber")
    protected String transferredNumber;
    @XmlElement(name = "DialedString")
    protected String dialedString;
    @XmlElement(name = "CallerMailboxAlias")
    protected String callerMailboxAlias;
    @XmlElement(name = "CalleeMailboxAlias")
    protected String calleeMailboxAlias;
    @XmlElement(name = "CallerLegacyExchangeDN")
    protected String callerLegacyExchangeDN;
    @XmlElement(name = "CalleeLegacyExchangeDN")
    protected String calleeLegacyExchangeDN;
    @XmlElement(name = "AutoAttendantName")
    protected String autoAttendantName;
    @XmlElement(name = "AudioQualityMetrics")
    protected AudioQualityType audioQualityMetrics;
    @XmlElement(name = "CreationTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationTime;

    /**
     * Gets the value of the callStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCallStartTime() {
        return callStartTime;
    }

    /**
     * Sets the value of the callStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCallStartTime(XMLGregorianCalendar value) {
        this.callStartTime = value;
    }

    /**
     * Gets the value of the callType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallType() {
        return callType;
    }

    /**
     * Sets the value of the callType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallType(String value) {
        this.callType = value;
    }

    /**
     * Gets the value of the callIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallIdentity() {
        return callIdentity;
    }

    /**
     * Sets the value of the callIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallIdentity(String value) {
        this.callIdentity = value;
    }

    /**
     * Gets the value of the parentCallIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentCallIdentity() {
        return parentCallIdentity;
    }

    /**
     * Sets the value of the parentCallIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentCallIdentity(String value) {
        this.parentCallIdentity = value;
    }

    /**
     * Gets the value of the umServerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUMServerName() {
        return umServerName;
    }

    /**
     * Sets the value of the umServerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUMServerName(String value) {
        this.umServerName = value;
    }

    /**
     * Gets the value of the dialPlanGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDialPlanGuid() {
        return dialPlanGuid;
    }

    /**
     * Sets the value of the dialPlanGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDialPlanGuid(String value) {
        this.dialPlanGuid = value;
    }

    /**
     * Gets the value of the dialPlanName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDialPlanName() {
        return dialPlanName;
    }

    /**
     * Sets the value of the dialPlanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDialPlanName(String value) {
        this.dialPlanName = value;
    }

    /**
     * Gets the value of the callDuration property.
     * 
     */
    public int getCallDuration() {
        return callDuration;
    }

    /**
     * Sets the value of the callDuration property.
     * 
     */
    public void setCallDuration(int value) {
        this.callDuration = value;
    }

    /**
     * Gets the value of the ipGatewayAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPGatewayAddress() {
        return ipGatewayAddress;
    }

    /**
     * Sets the value of the ipGatewayAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPGatewayAddress(String value) {
        this.ipGatewayAddress = value;
    }

    /**
     * Gets the value of the ipGatewayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPGatewayName() {
        return ipGatewayName;
    }

    /**
     * Sets the value of the ipGatewayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPGatewayName(String value) {
        this.ipGatewayName = value;
    }

    /**
     * Gets the value of the gatewayGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGatewayGuid() {
        return gatewayGuid;
    }

    /**
     * Sets the value of the gatewayGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGatewayGuid(String value) {
        this.gatewayGuid = value;
    }

    /**
     * Gets the value of the calledPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledPhoneNumber() {
        return calledPhoneNumber;
    }

    /**
     * Sets the value of the calledPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledPhoneNumber(String value) {
        this.calledPhoneNumber = value;
    }

    /**
     * Gets the value of the callerPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallerPhoneNumber() {
        return callerPhoneNumber;
    }

    /**
     * Sets the value of the callerPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallerPhoneNumber(String value) {
        this.callerPhoneNumber = value;
    }

    /**
     * Gets the value of the offerResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferResult() {
        return offerResult;
    }

    /**
     * Sets the value of the offerResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferResult(String value) {
        this.offerResult = value;
    }

    /**
     * Gets the value of the dropCallReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDropCallReason() {
        return dropCallReason;
    }

    /**
     * Sets the value of the dropCallReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDropCallReason(String value) {
        this.dropCallReason = value;
    }

    /**
     * Gets the value of the reasonForCall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonForCall() {
        return reasonForCall;
    }

    /**
     * Sets the value of the reasonForCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonForCall(String value) {
        this.reasonForCall = value;
    }

    /**
     * Gets the value of the transferredNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferredNumber() {
        return transferredNumber;
    }

    /**
     * Sets the value of the transferredNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferredNumber(String value) {
        this.transferredNumber = value;
    }

    /**
     * Gets the value of the dialedString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDialedString() {
        return dialedString;
    }

    /**
     * Sets the value of the dialedString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDialedString(String value) {
        this.dialedString = value;
    }

    /**
     * Gets the value of the callerMailboxAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallerMailboxAlias() {
        return callerMailboxAlias;
    }

    /**
     * Sets the value of the callerMailboxAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallerMailboxAlias(String value) {
        this.callerMailboxAlias = value;
    }

    /**
     * Gets the value of the calleeMailboxAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalleeMailboxAlias() {
        return calleeMailboxAlias;
    }

    /**
     * Sets the value of the calleeMailboxAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalleeMailboxAlias(String value) {
        this.calleeMailboxAlias = value;
    }

    /**
     * Gets the value of the callerLegacyExchangeDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallerLegacyExchangeDN() {
        return callerLegacyExchangeDN;
    }

    /**
     * Sets the value of the callerLegacyExchangeDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallerLegacyExchangeDN(String value) {
        this.callerLegacyExchangeDN = value;
    }

    /**
     * Gets the value of the calleeLegacyExchangeDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalleeLegacyExchangeDN() {
        return calleeLegacyExchangeDN;
    }

    /**
     * Sets the value of the calleeLegacyExchangeDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalleeLegacyExchangeDN(String value) {
        this.calleeLegacyExchangeDN = value;
    }

    /**
     * Gets the value of the autoAttendantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoAttendantName() {
        return autoAttendantName;
    }

    /**
     * Sets the value of the autoAttendantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoAttendantName(String value) {
        this.autoAttendantName = value;
    }

    /**
     * Gets the value of the audioQualityMetrics property.
     * 
     * @return
     *     possible object is
     *     {@link AudioQualityType }
     *     
     */
    public AudioQualityType getAudioQualityMetrics() {
        return audioQualityMetrics;
    }

    /**
     * Sets the value of the audioQualityMetrics property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioQualityType }
     *     
     */
    public void setAudioQualityMetrics(AudioQualityType value) {
        this.audioQualityMetrics = value;
    }

    /**
     * Gets the value of the creationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationTime() {
        return creationTime;
    }

    /**
     * Sets the value of the creationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationTime(XMLGregorianCalendar value) {
        this.creationTime = value;
    }

}
