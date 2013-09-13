
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Mailbox failed on search and its error message.
 *       
 * 
 * <p>Java class for FailedSearchMailboxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FailedSearchMailboxType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Mailbox" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IsArchive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FailedSearchMailboxType", propOrder = {
    "mailbox",
    "errorCode",
    "errorMessage",
    "isArchive"
})
public class FailedSearchMailboxType {

    @XmlElement(name = "Mailbox", required = true)
    protected String mailbox;
    @XmlElement(name = "ErrorCode")
    protected int errorCode;
    @XmlElement(name = "ErrorMessage", required = true)
    protected String errorMessage;
    @XmlElement(name = "IsArchive")
    protected boolean isArchive;

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
     * Gets the value of the errorCode property.
     * 
     */
    public int getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     */
    public void setErrorCode(int value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the isArchive property.
     * 
     */
    public boolean isIsArchive() {
        return isArchive;
    }

    /**
     * Sets the value of the isArchive property.
     * 
     */
    public void setIsArchive(boolean value) {
        this.isArchive = value;
    }

}
