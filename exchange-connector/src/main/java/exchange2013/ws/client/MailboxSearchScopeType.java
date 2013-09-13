
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Pair of mailbox and its search scope.
 *       
 * 
 * <p>Java class for MailboxSearchScopeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MailboxSearchScopeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Mailbox" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SearchScope" type="{http://schemas.microsoft.com/exchange/services/2006/types}MailboxSearchLocationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailboxSearchScopeType", propOrder = {
    "mailbox",
    "searchScope"
})
public class MailboxSearchScopeType {

    @XmlElement(name = "Mailbox", required = true)
    protected String mailbox;
    @XmlElement(name = "SearchScope", required = true)
    protected MailboxSearchLocationType searchScope;

    /**
     * Gets the value of the mailbox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailbox() {
        return mailbox;
    }

    /**
     * Sets the value of the mailbox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailbox(String value) {
        this.mailbox = value;
    }

    /**
     * Gets the value of the searchScope property.
     * 
     * @return
     *     possible object is
     *     {@link MailboxSearchLocationType }
     *     
     */
    public MailboxSearchLocationType getSearchScope() {
        return searchScope;
    }

    /**
     * Sets the value of the searchScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailboxSearchLocationType }
     *     
     */
    public void setSearchScope(MailboxSearchLocationType value) {
        this.searchScope = value;
    }

}
