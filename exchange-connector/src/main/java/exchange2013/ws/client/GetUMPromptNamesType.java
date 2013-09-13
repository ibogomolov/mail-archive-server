
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetUMPromptNamesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetUMPromptNamesType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="ConfigurationObject" type="{http://schemas.microsoft.com/exchange/services/2006/types}GuidType"/>
 *         &lt;element name="HoursElapsedSinceLastModified" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUMPromptNamesType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "configurationObject",
    "hoursElapsedSinceLastModified"
})
public class GetUMPromptNamesType
    extends BaseRequestType
{

    @XmlElement(name = "ConfigurationObject", required = true)
    protected String configurationObject;
    @XmlElement(name = "HoursElapsedSinceLastModified")
    protected int hoursElapsedSinceLastModified;

    /**
     * Gets the value of the configurationObject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigurationObject() {
        return configurationObject;
    }

    /**
     * Sets the value of the configurationObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigurationObject(String value) {
        this.configurationObject = value;
    }

    /**
     * Gets the value of the hoursElapsedSinceLastModified property.
     * 
     */
    public int getHoursElapsedSinceLastModified() {
        return hoursElapsedSinceLastModified;
    }

    /**
     * Sets the value of the hoursElapsedSinceLastModified property.
     * 
     */
    public void setHoursElapsedSinceLastModified(int value) {
        this.hoursElapsedSinceLastModified = value;
    }

}
