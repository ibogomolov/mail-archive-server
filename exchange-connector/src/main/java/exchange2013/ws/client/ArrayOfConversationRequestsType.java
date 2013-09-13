
package exchange2013.ws.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfConversationRequestsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfConversationRequestsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="Conversation" type="{http://schemas.microsoft.com/exchange/services/2006/types}ConversationRequestType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfConversationRequestsType", propOrder = {
    "conversation"
})
public class ArrayOfConversationRequestsType {

    @XmlElement(name = "Conversation")
    protected List<ConversationRequestType> conversation;

    /**
     * Gets the value of the conversation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conversation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConversation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConversationRequestType }
     * 
     * 
     */
    public List<ConversationRequestType> getConversation() {
        if (conversation == null) {
            conversation = new ArrayList<ConversationRequestType>();
        }
        return this.conversation;
    }

}
