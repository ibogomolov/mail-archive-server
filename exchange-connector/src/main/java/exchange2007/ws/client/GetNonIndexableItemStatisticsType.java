
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Request type for the GetNonIndexableItemStatistics web method.
 *       
 * 
 * <p>Java class for GetNonIndexableItemStatisticsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetNonIndexableItemStatisticsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="Mailboxes" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfLegacyDNsType"/>
 *         &lt;element name="SearchArchiveOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetNonIndexableItemStatisticsType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "mailboxes",
    "searchArchiveOnly"
})
public class GetNonIndexableItemStatisticsType
    extends BaseRequestType
{

    @XmlElement(name = "Mailboxes", required = true)
    protected NonEmptyArrayOfLegacyDNsType mailboxes;
    @XmlElement(name = "SearchArchiveOnly")
    protected Boolean searchArchiveOnly;

    /**
     * Gets the value of the mailboxes property.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfLegacyDNsType }
     *     
     */
    public NonEmptyArrayOfLegacyDNsType getMailboxes() {
        return mailboxes;
    }

    /**
     * Sets the value of the mailboxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfLegacyDNsType }
     *     
     */
    public void setMailboxes(NonEmptyArrayOfLegacyDNsType value) {
        this.mailboxes = value;
    }

    /**
     * Gets the value of the searchArchiveOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSearchArchiveOnly() {
        return searchArchiveOnly;
    }

    /**
     * Sets the value of the searchArchiveOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSearchArchiveOnly(Boolean value) {
        this.searchArchiveOnly = value;
    }

}
