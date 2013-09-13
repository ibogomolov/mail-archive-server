
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *           Request type for the SetHoldOnMailboxes web method.
 *         
 * 
 * <p>Java class for SetHoldOnMailboxesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetHoldOnMailboxesType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="ActionType" type="{http://schemas.microsoft.com/exchange/services/2006/types}HoldActionType"/>
 *         &lt;element name="HoldId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Query" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Mailboxes" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringsType" minOccurs="0"/>
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncludeNonIndexableItems" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Deduplication" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InPlaceHoldIdentity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetHoldOnMailboxesType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "actionType",
    "holdId",
    "query",
    "mailboxes",
    "language",
    "includeNonIndexableItems",
    "deduplication",
    "inPlaceHoldIdentity"
})
public class SetHoldOnMailboxesType
    extends BaseRequestType
{

    @XmlElement(name = "ActionType", required = true)
    protected HoldActionType actionType;
    @XmlElement(name = "HoldId", required = true)
    protected String holdId;
    @XmlElement(name = "Query", required = true)
    protected String query;
    @XmlElement(name = "Mailboxes")
    protected ArrayOfStringsType mailboxes;
    @XmlElement(name = "Language")
    protected String language;
    @XmlElement(name = "IncludeNonIndexableItems")
    protected Boolean includeNonIndexableItems;
    @XmlElement(name = "Deduplication")
    protected Boolean deduplication;
    @XmlElement(name = "InPlaceHoldIdentity")
    protected String inPlaceHoldIdentity;

    /**
     * Gets the value of the actionType property.
     * 
     * @return
     *     possible object is
     *     {@link HoldActionType }
     *     
     */
    public HoldActionType getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldActionType }
     *     
     */
    public void setActionType(HoldActionType value) {
        this.actionType = value;
    }

    /**
     * Gets the value of the holdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldId() {
        return holdId;
    }

    /**
     * Sets the value of the holdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldId(String value) {
        this.holdId = value;
    }

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuery(String value) {
        this.query = value;
    }

    /**
     * Gets the value of the mailboxes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public ArrayOfStringsType getMailboxes() {
        return mailboxes;
    }

    /**
     * Sets the value of the mailboxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public void setMailboxes(ArrayOfStringsType value) {
        this.mailboxes = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the includeNonIndexableItems property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeNonIndexableItems() {
        return includeNonIndexableItems;
    }

    /**
     * Sets the value of the includeNonIndexableItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeNonIndexableItems(Boolean value) {
        this.includeNonIndexableItems = value;
    }

    /**
     * Gets the value of the deduplication property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeduplication() {
        return deduplication;
    }

    /**
     * Sets the value of the deduplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeduplication(Boolean value) {
        this.deduplication = value;
    }

    /**
     * Gets the value of the inPlaceHoldIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInPlaceHoldIdentity() {
        return inPlaceHoldIdentity;
    }

    /**
     * Sets the value of the inPlaceHoldIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInPlaceHoldIdentity(String value) {
        this.inPlaceHoldIdentity = value;
    }

}
