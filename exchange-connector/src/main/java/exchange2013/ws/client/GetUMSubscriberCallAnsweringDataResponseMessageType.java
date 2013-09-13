
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetUMSubscriberCallAnsweringDataResponseMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetUMSubscriberCallAnsweringDataResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="IsOOF" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsTranscriptionEnabledInMailboxConfig" type="{http://schemas.microsoft.com/exchange/services/2006/types}UMMailboxTranscriptionEnabledSetting"/>
 *         &lt;element name="IsMailboxQuotaExceeded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Greeting" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="GreetingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaskTimedOut" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUMSubscriberCallAnsweringDataResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "isOOF",
    "isTranscriptionEnabledInMailboxConfig",
    "isMailboxQuotaExceeded",
    "greeting",
    "greetingName",
    "taskTimedOut"
})
public class GetUMSubscriberCallAnsweringDataResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "IsOOF")
    protected boolean isOOF;
    @XmlElement(name = "IsTranscriptionEnabledInMailboxConfig", required = true)
    protected UMMailboxTranscriptionEnabledSetting isTranscriptionEnabledInMailboxConfig;
    @XmlElement(name = "IsMailboxQuotaExceeded")
    protected boolean isMailboxQuotaExceeded;
    @XmlElement(name = "Greeting")
    protected byte[] greeting;
    @XmlElement(name = "GreetingName")
    protected String greetingName;
    @XmlElement(name = "TaskTimedOut")
    protected boolean taskTimedOut;

    /**
     * Gets the value of the isOOF property.
     * 
     */
    public boolean isIsOOF() {
        return isOOF;
    }

    /**
     * Sets the value of the isOOF property.
     * 
     */
    public void setIsOOF(boolean value) {
        this.isOOF = value;
    }

    /**
     * Gets the value of the isTranscriptionEnabledInMailboxConfig property.
     * 
     * @return
     *     possible object is
     *     {@link UMMailboxTranscriptionEnabledSetting }
     *     
     */
    public UMMailboxTranscriptionEnabledSetting getIsTranscriptionEnabledInMailboxConfig() {
        return isTranscriptionEnabledInMailboxConfig;
    }

    /**
     * Sets the value of the isTranscriptionEnabledInMailboxConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link UMMailboxTranscriptionEnabledSetting }
     *     
     */
    public void setIsTranscriptionEnabledInMailboxConfig(UMMailboxTranscriptionEnabledSetting value) {
        this.isTranscriptionEnabledInMailboxConfig = value;
    }

    /**
     * Gets the value of the isMailboxQuotaExceeded property.
     * 
     */
    public boolean isIsMailboxQuotaExceeded() {
        return isMailboxQuotaExceeded;
    }

    /**
     * Sets the value of the isMailboxQuotaExceeded property.
     * 
     */
    public void setIsMailboxQuotaExceeded(boolean value) {
        this.isMailboxQuotaExceeded = value;
    }

    /**
     * Gets the value of the greeting property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getGreeting() {
        return greeting;
    }

    /**
     * Sets the value of the greeting property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setGreeting(byte[] value) {
        this.greeting = value;
    }

    /**
     * Gets the value of the greetingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGreetingName() {
        return greetingName;
    }

    /**
     * Sets the value of the greetingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGreetingName(String value) {
        this.greetingName = value;
    }

    /**
     * Gets the value of the taskTimedOut property.
     * 
     */
    public boolean isTaskTimedOut() {
        return taskTimedOut;
    }

    /**
     * Sets the value of the taskTimedOut property.
     * 
     */
    public void setTaskTimedOut(boolean value) {
        this.taskTimedOut = value;
    }

}
