
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Pair of query and a set of mailbox search scopes.
 *       
 * 
 * <p>Java class for MailboxQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MailboxQueryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Query" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MailboxSearchScopes" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfMailboxSearchScopesType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailboxQueryType", propOrder = {
    "query",
    "mailboxSearchScopes"
})
public class MailboxQueryType {

    @XmlElement(name = "Query", required = true)
    protected String query;
    @XmlElement(name = "MailboxSearchScopes", required = true)
    protected NonEmptyArrayOfMailboxSearchScopesType mailboxSearchScopes;

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
     * Gets the value of the mailboxSearchScopes property.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfMailboxSearchScopesType }
     *     
     */
    public NonEmptyArrayOfMailboxSearchScopesType getMailboxSearchScopes() {
        return mailboxSearchScopes;
    }

    /**
     * Sets the value of the mailboxSearchScopes property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfMailboxSearchScopesType }
     *     
     */
    public void setMailboxSearchScopes(NonEmptyArrayOfMailboxSearchScopesType value) {
        this.mailboxSearchScopes = value;
    }

}
