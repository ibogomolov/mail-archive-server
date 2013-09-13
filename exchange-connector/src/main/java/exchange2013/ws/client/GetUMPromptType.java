
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetUMPromptType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetUMPromptType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="ConfigurationObject" type="{http://schemas.microsoft.com/exchange/services/2006/types}GuidType"/>
 *         &lt;element name="PromptName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUMPromptType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "configurationObject",
    "promptName"
})
public class GetUMPromptType
    extends BaseRequestType
{

    @XmlElement(name = "ConfigurationObject", required = true)
    protected String configurationObject;
    @XmlElement(name = "PromptName", required = true)
    protected String promptName;

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
     * Gets the value of the promptName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromptName() {
        return promptName;
    }

    /**
     * Sets the value of the promptName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromptName(String value) {
        this.promptName = value;
    }

}
