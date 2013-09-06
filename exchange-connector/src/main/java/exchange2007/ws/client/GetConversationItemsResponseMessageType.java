
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetConversationItemsResponseMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetConversationItemsResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="Conversation" type="{http://schemas.microsoft.com/exchange/services/2006/types}ConversationResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetConversationItemsResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "conversation"
})
public class GetConversationItemsResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "Conversation")
    protected ConversationResponseType conversation;

    /**
     * Gets the value of the conversation property.
     * 
     * @return
     *     possible object is
     *     {@link ConversationResponseType }
     *     
     */
    public ConversationResponseType getConversation() {
        return conversation;
    }

    /**
     * Sets the value of the conversation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversationResponseType }
     *     
     */
    public void setConversation(ConversationResponseType value) {
        this.conversation = value;
    }

}
