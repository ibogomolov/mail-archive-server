
package exchange2013.ws.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Array of mailbox hold status.
 *       
 * 
 * <p>Java class for ArrayOfMailboxHoldStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMailboxHoldStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MailboxHoldStatus" type="{http://schemas.microsoft.com/exchange/services/2006/types}MailboxHoldStatusType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMailboxHoldStatusType", propOrder = {
    "mailboxHoldStatus"
})
public class ArrayOfMailboxHoldStatusType {

    @XmlElement(name = "MailboxHoldStatus")
    protected List<MailboxHoldStatusType> mailboxHoldStatus;

    /**
     * Gets the value of the mailboxHoldStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mailboxHoldStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMailboxHoldStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MailboxHoldStatusType }
     * 
     * 
     */
    public List<MailboxHoldStatusType> getMailboxHoldStatus() {
        if (mailboxHoldStatus == null) {
            mailboxHoldStatus = new ArrayList<MailboxHoldStatusType>();
        }
        return this.mailboxHoldStatus;
    }

}
