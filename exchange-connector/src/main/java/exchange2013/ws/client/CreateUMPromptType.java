
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateUMPromptType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateUMPromptType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="ConfigurationObject" type="{http://schemas.microsoft.com/exchange/services/2006/types}GuidType"/>
 *         &lt;element name="PromptName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AudioData" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateUMPromptType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "configurationObject",
    "promptName",
    "audioData"
})
public class CreateUMPromptType
    extends BaseRequestType
{

    @XmlElement(name = "ConfigurationObject", required = true)
    protected String configurationObject;
    @XmlElement(name = "PromptName", required = true)
    protected String promptName;
    @XmlElement(name = "AudioData", required = true)
    protected byte[] audioData;

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

    /**
     * Gets the value of the audioData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAudioData() {
        return audioData;
    }

    /**
     * Sets the value of the audioData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAudioData(byte[] value) {
        this.audioData = ((byte[]) value);
    }

}
