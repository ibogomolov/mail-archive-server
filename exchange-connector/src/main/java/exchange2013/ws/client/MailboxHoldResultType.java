
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Mailbox hold result.
 *       
 * 
 * <p>Java class for MailboxHoldResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MailboxHoldResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HoldId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Query" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MailboxHoldStatuses" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfMailboxHoldStatusType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailboxHoldResultType", propOrder = {
    "holdId",
    "query",
    "mailboxHoldStatuses"
})
public class MailboxHoldResultType {

    @XmlElement(name = "HoldId", required = true)
    protected String holdId;
    @XmlElement(name = "Query")
    protected String query;
    @XmlElement(name = "MailboxHoldStatuses", required = true)
    protected ArrayOfMailboxHoldStatusType mailboxHoldStatuses;

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
     * Gets the value of the mailboxHoldStatuses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMailboxHoldStatusType }
     *     
     */
    public ArrayOfMailboxHoldStatusType getMailboxHoldStatuses() {
        return mailboxHoldStatuses;
    }

    /**
     * Sets the value of the mailboxHoldStatuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMailboxHoldStatusType }
     *     
     */
    public void setMailboxHoldStatuses(ArrayOfMailboxHoldStatusType value) {
        this.mailboxHoldStatuses = value;
    }

}
