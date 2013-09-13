
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FindConversationResponseMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindConversationResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="Conversations" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfConversationsType" minOccurs="0"/>
 *         &lt;element name="HighlightTerms" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfHighlightTermsType" minOccurs="0"/>
 *         &lt;element name="TotalConversationsInView" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IndexedOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindConversationResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "conversations",
    "highlightTerms",
    "totalConversationsInView",
    "indexedOffset"
})
public class FindConversationResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "Conversations")
    protected ArrayOfConversationsType conversations;
    @XmlElement(name = "HighlightTerms")
    protected ArrayOfHighlightTermsType highlightTerms;
    @XmlElement(name = "TotalConversationsInView")
    protected Integer totalConversationsInView;
    @XmlElement(name = "IndexedOffset")
    protected Integer indexedOffset;

    /**
     * Gets the value of the conversations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfConversationsType }
     *     
     */
    public ArrayOfConversationsType getConversations() {
        return conversations;
    }

    /**
     * Sets the value of the conversations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfConversationsType }
     *     
     */
    public void setConversations(ArrayOfConversationsType value) {
        this.conversations = value;
    }

    /**
     * Gets the value of the highlightTerms property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHighlightTermsType }
     *     
     */
    public ArrayOfHighlightTermsType getHighlightTerms() {
        return highlightTerms;
    }

    /**
     * Sets the value of the highlightTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHighlightTermsType }
     *     
     */
    public void setHighlightTerms(ArrayOfHighlightTermsType value) {
        this.highlightTerms = value;
    }

    /**
     * Gets the value of the totalConversationsInView property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalConversationsInView() {
        return totalConversationsInView;
    }

    /**
     * Sets the value of the totalConversationsInView property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalConversationsInView(Integer value) {
        this.totalConversationsInView = value;
    }

    /**
     * Gets the value of the indexedOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndexedOffset() {
        return indexedOffset;
    }

    /**
     * Sets the value of the indexedOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndexedOffset(Integer value) {
        this.indexedOffset = value;
    }

}
