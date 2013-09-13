
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompleteFindInGALSpeechRecognitionResponseMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompleteFindInGALSpeechRecognitionResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="RecognitionResult" type="{http://schemas.microsoft.com/exchange/services/2006/types}RecognitionResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompleteFindInGALSpeechRecognitionResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "recognitionResult"
})
public class CompleteFindInGALSpeechRecognitionResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "RecognitionResult")
    protected RecognitionResultType recognitionResult;

    /**
     * Gets the value of the recognitionResult property.
     * 
     * @return
     *     possible object is
     *     {@link RecognitionResultType }
     *     
     */
    public RecognitionResultType getRecognitionResult() {
        return recognitionResult;
    }

    /**
     * Sets the value of the recognitionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecognitionResultType }
     *     
     */
    public void setRecognitionResult(RecognitionResultType value) {
        this.recognitionResult = value;
    }

}
