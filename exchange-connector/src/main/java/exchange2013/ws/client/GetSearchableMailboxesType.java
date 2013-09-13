
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Request type for the GetSearchableMailboxes web method.
 *       
 * 
 * <p>Java class for GetSearchableMailboxesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSearchableMailboxesType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="SearchFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpandGroupMembership" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSearchableMailboxesType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "searchFilter",
    "expandGroupMembership"
})
public class GetSearchableMailboxesType
    extends BaseRequestType
{

    @XmlElement(name = "SearchFilter")
    protected String searchFilter;
    @XmlElement(name = "ExpandGroupMembership")
    protected Boolean expandGroupMembership;

    /**
     * Gets the value of the searchFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchFilter() {
        return searchFilter;
    }

    /**
     * Sets the value of the searchFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchFilter(String value) {
        this.searchFilter = value;
    }

    /**
     * Gets the value of the expandGroupMembership property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpandGroupMembership() {
        return expandGroupMembership;
    }

    /**
     * Sets the value of the expandGroupMembership property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpandGroupMembership(Boolean value) {
        this.expandGroupMembership = value;
    }

}
