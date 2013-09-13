
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StartFindInGALSpeechRecognitionResponseMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StartFindInGALSpeechRecognitionResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="RecognitionId" type="{http://schemas.microsoft.com/exchange/services/2006/types}RecognitionIdType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StartFindInGALSpeechRecognitionResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "recognitionId"
})
public class StartFindInGALSpeechRecognitionResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "RecognitionId")
    protected RecognitionIdType recognitionId;

    /**
     * Gets the value of the recognitionId property.
     * 
     * @return
     *     possible object is
     *     {@link RecognitionIdType }
     *     
     */
    public RecognitionIdType getRecognitionId() {
        return recognitionId;
    }

    /**
     * Sets the value of the recognitionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecognitionIdType }
     *     
     */
    public void setRecognitionId(RecognitionIdType value) {
        this.recognitionId = value;
    }

}
