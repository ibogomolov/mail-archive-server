
package exchange2007.ws.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Array of mailbox and its search scope.
 *       
 * 
 * <p>Java class for NonEmptyArrayOfMailboxSearchScopesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonEmptyArrayOfMailboxSearchScopesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MailboxSearchScope" type="{http://schemas.microsoft.com/exchange/services/2006/types}MailboxSearchScopeType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonEmptyArrayOfMailboxSearchScopesType", propOrder = {
    "mailboxSearchScope"
})
public class NonEmptyArrayOfMailboxSearchScopesType {

    @XmlElement(name = "MailboxSearchScope", required = true)
    protected List<MailboxSearchScopeType> mailboxSearchScope;

    /**
     * Gets the value of the mailboxSearchScope property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mailboxSearchScope property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMailboxSearchScope().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MailboxSearchScopeType }
     * 
     * 
     */
    public List<MailboxSearchScopeType> getMailboxSearchScope() {
        if (mailboxSearchScope == null) {
            mailboxSearchScope = new ArrayList<MailboxSearchScopeType>();
        }
        return this.mailboxSearchScope;
    }

}
