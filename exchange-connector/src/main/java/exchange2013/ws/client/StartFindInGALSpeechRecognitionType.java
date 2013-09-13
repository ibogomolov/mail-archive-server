
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StartFindInGALSpeechRecognitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StartFindInGALSpeechRecognitionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="Culture" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyStringType"/>
 *         &lt;element name="TimeZone" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyStringType"/>
 *         &lt;element name="UserObjectGuid" type="{http://schemas.microsoft.com/exchange/services/2006/types}GuidType"/>
 *         &lt;element name="TenantGuid" type="{http://schemas.microsoft.com/exchange/services/2006/types}GuidType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StartFindInGALSpeechRecognitionType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "culture",
    "timeZone",
    "userObjectGuid",
    "tenantGuid"
})
public class StartFindInGALSpeechRecognitionType
    extends BaseRequestType
{

    @XmlElement(name = "Culture", required = true)
    protected String culture;
    @XmlElement(name = "TimeZone", required = true)
    protected String timeZone;
    @XmlElement(name = "UserObjectGuid", required = true)
    protected String userObjectGuid;
    @XmlElement(name = "TenantGuid", required = true)
    protected String tenantGuid;

    /**
     * Gets the value of the culture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCulture() {
        return culture;
    }

    /**
     * Sets the value of the culture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCulture(String value) {
        this.culture = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the userObjectGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserObjectGuid() {
        return userObjectGuid;
    }

    /**
     * Sets the value of the userObjectGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserObjectGuid(String value) {
        this.userObjectGuid = value;
    }

    /**
     * Gets the value of the tenantGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenantGuid() {
        return tenantGuid;
    }

    /**
     * Sets the value of the tenantGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenantGuid(String value) {
        this.tenantGuid = value;
    }

}
