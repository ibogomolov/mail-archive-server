
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Mailbox information for each preview item.
 *       
 * 
 * <p>Java class for PreviewItemMailboxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreviewItemMailboxType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MailboxId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PrimarySmtpAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreviewItemMailboxType", propOrder = {
    "mailboxId",
    "primarySmtpAddress"
})
public class PreviewItemMailboxType {

    @XmlElement(name = "MailboxId", required = true)
    protected String mailboxId;
    @XmlElement(name = "PrimarySmtpAddress", required = true)
    protected String primarySmtpAddress;

    /**
     * Gets the value of the mailboxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailboxId() {
        return mailboxId;
    }

    /**
     * Sets the value of the mailboxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailboxId(String value) {
        this.mailboxId = value;
    }

    /**
     * Gets the value of the primarySmtpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimarySmtpAddress() {
        return primarySmtpAddress;
    }

    /**
     * Sets the value of the primarySmtpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimarySmtpAddress(String value) {
        this.primarySmtpAddress = value;
    }

}
