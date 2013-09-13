
package exchange2007.ws.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfConversationNodesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfConversationNodesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="ConversationNode" type="{http://schemas.microsoft.com/exchange/services/2006/types}ConversationNodeType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfConversationNodesType", propOrder = {
    "conversationNode"
})
public class ArrayOfConversationNodesType {

    @XmlElement(name = "ConversationNode")
    protected List<ConversationNodeType> conversationNode;

    /**
     * Gets the value of the conversationNode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conversationNode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConversationNode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConversationNodeType }
     * 
     * 
     */
    public List<ConversationNodeType> getConversationNode() {
        if (conversationNode == null) {
            conversationNode = new ArrayList<ConversationNodeType>();
        }
        return this.conversationNode;
    }

}
