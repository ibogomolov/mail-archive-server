
package exchange2013.ws.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Array of query and mailboxes.
 *       
 * 
 * <p>Java class for NonEmptyArrayOfMailboxQueriesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonEmptyArrayOfMailboxQueriesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MailboxQuery" type="{http://schemas.microsoft.com/exchange/services/2006/types}MailboxQueryType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonEmptyArrayOfMailboxQueriesType", propOrder = {
    "mailboxQuery"
})
public class NonEmptyArrayOfMailboxQueriesType {

    @XmlElement(name = "MailboxQuery", required = true)
    protected List<MailboxQueryType> mailboxQuery;

    /**
     * Gets the value of the mailboxQuery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mailboxQuery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMailboxQuery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MailboxQueryType }
     * 
     * 
     */
    public List<MailboxQueryType> getMailboxQuery() {
        if (mailboxQuery == null) {
            mailboxQuery = new ArrayList<MailboxQueryType>();
        }
        return this.mailboxQuery;
    }

}
