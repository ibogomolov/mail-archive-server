
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteUMPromptsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteUMPromptsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="ConfigurationObject" type="{http://schemas.microsoft.com/exchange/services/2006/types}GuidType"/>
 *         &lt;element name="PromptNames" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteUMPromptsType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "configurationObject",
    "promptNames"
})
public class DeleteUMPromptsType
    extends BaseRequestType
{

    @XmlElement(name = "ConfigurationObject", required = true)
    protected String configurationObject;
    @XmlElement(name = "PromptNames")
    protected ArrayOfStringsType promptNames;

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
     * Gets the value of the promptNames property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public ArrayOfStringsType getPromptNames() {
        return promptNames;
    }

    /**
     * Sets the value of the promptNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public void setPromptNames(ArrayOfStringsType value) {
        this.promptNames = value;
    }

}
