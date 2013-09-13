
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConversationResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConversationResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConversationId" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType"/>
 *         &lt;element name="SyncState" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="ConversationNodes" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfConversationNodesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConversationResponseType", propOrder = {
    "conversationId",
    "syncState",
    "conversationNodes"
})
public class ConversationResponseType {

    @XmlElement(name = "ConversationId", required = true)
    protected ItemIdType conversationId;
    @XmlElement(name = "SyncState")
    protected byte[] syncState;
    @XmlElement(name = "ConversationNodes")
    protected ArrayOfConversationNodesType conversationNodes;

    /**
     * Gets the value of the conversationId property.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdType }
     *     
     */
    public ItemIdType getConversationId() {
        return conversationId;
    }

    /**
     * Sets the value of the conversationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdType }
     *     
     */
    public void setConversationId(ItemIdType value) {
        this.conversationId = value;
    }

    /**
     * Gets the value of the syncState property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSyncState() {
        return syncState;
    }

    /**
     * Sets the value of the syncState property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSyncState(byte[] value) {
        this.syncState = value;
    }

    /**
     * Gets the value of the conversationNodes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfConversationNodesType }
     *     
     */
    public ArrayOfConversationNodesType getConversationNodes() {
        return conversationNodes;
    }

    /**
     * Sets the value of the conversationNodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfConversationNodesType }
     *     
     */
    public void setConversationNodes(ArrayOfConversationNodesType value) {
        this.conversationNodes = value;
    }

}
