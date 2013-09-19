
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetUMPromptResponseMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetUMPromptResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="AudioData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUMPromptResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "audioData"
})
public class GetUMPromptResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "AudioData")
    protected byte[] audioData;

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
