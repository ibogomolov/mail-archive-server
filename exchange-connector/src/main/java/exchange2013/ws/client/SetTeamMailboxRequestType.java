
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SetTeamMailboxRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetTeamMailboxRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="EmailAddress" type="{http://schemas.microsoft.com/exchange/services/2006/types}EmailAddressType"/>
 *         &lt;element name="SharePointSiteUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="State" type="{http://schemas.microsoft.com/exchange/services/2006/types}TeamMailboxLifecycleStateType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetTeamMailboxRequestType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "emailAddress",
    "sharePointSiteUrl",
    "state"
})
public class SetTeamMailboxRequestType
    extends BaseRequestType
{

    @XmlElement(name = "EmailAddress", required = true)
    protected EmailAddressType emailAddress;
    @XmlElement(name = "SharePointSiteUrl", required = true)
    protected String sharePointSiteUrl;
    @XmlElement(name = "State", required = true)
    protected TeamMailboxLifecycleStateType state;

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link EmailAddressType }
     *     
     */
    public EmailAddressType getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailAddressType }
     *     
     */
    public void setEmailAddress(EmailAddressType value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the sharePointSiteUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharePointSiteUrl() {
        return sharePointSiteUrl;
    }

    /**
     * Sets the value of the sharePointSiteUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharePointSiteUrl(String value) {
        this.sharePointSiteUrl = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link TeamMailboxLifecycleStateType }
     *     
     */
    public TeamMailboxLifecycleStateType getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link TeamMailboxLifecycleStateType }
     *     
     */
    public void setState(TeamMailboxLifecycleStateType value) {
        this.state = value;
    }

}
