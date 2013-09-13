
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseDelegateResponseMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseDelegateResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="ResponseMessages" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ArrayOfDelegateUserResponseMessageType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseDelegateResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "responseMessages"
})
@XmlSeeAlso({
    RemoveDelegateResponseMessageType.class,
    GetDelegateResponseMessageType.class,
    AddDelegateResponseMessageType.class,
    UpdateDelegateResponseMessageType.class
})
public abstract class BaseDelegateResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "ResponseMessages")
    protected ArrayOfDelegateUserResponseMessageType responseMessages;

    /**
     * Gets the value of the responseMessages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDelegateUserResponseMessageType }
     *     
     */
    public ArrayOfDelegateUserResponseMessageType getResponseMessages() {
        return responseMessages;
    }

    /**
     * Sets the value of the responseMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDelegateUserResponseMessageType }
     *     
     */
    public void setResponseMessages(ArrayOfDelegateUserResponseMessageType value) {
        this.responseMessages = value;
    }

}
