
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Request type for the GetNonIndexableItemDetails web method.
 *       
 * 
 * <p>Java class for GetNonIndexableItemDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetNonIndexableItemDetailsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="Mailboxes" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfLegacyDNsType"/>
 *         &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PageItemReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PageDirection" type="{http://schemas.microsoft.com/exchange/services/2006/types}SearchPageDirectionType" minOccurs="0"/>
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
@XmlType(name = "GetNonIndexableItemDetailsType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "mailboxes",
    "pageSize",
    "pageItemReference",
    "pageDirection",
    "searchArchiveOnly"
})
public class GetNonIndexableItemDetailsType
    extends BaseRequestType
{

    @XmlElement(name = "Mailboxes", required = true)
    protected NonEmptyArrayOfLegacyDNsType mailboxes;
    @XmlElement(name = "PageSize")
    protected Integer pageSize;
    @XmlElement(name = "PageItemReference")
    protected String pageItemReference;
    @XmlElement(name = "PageDirection")
    protected SearchPageDirectionType pageDirection;
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
     * Gets the value of the pageSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageSize(Integer value) {
        this.pageSize = value;
    }

    /**
     * Gets the value of the pageItemReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageItemReference() {
        return pageItemReference;
    }

    /**
     * Sets the value of the pageItemReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageItemReference(String value) {
        this.pageItemReference = value;
    }

    /**
     * Gets the value of the pageDirection property.
     * 
     * @return
     *     possible object is
     *     {@link SearchPageDirectionType }
     *     
     */
    public SearchPageDirectionType getPageDirection() {
        return pageDirection;
    }

    /**
     * Sets the value of the pageDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchPageDirectionType }
     *     
     */
    public void setPageDirection(SearchPageDirectionType value) {
        this.pageDirection = value;
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
