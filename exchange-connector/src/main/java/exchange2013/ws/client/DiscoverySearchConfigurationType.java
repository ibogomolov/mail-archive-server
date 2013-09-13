
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Discovery search configuration.
 *       
 * 
 * <p>Java class for DiscoverySearchConfigurationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscoverySearchConfigurationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SearchQuery" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SearchableMailboxes" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfSearchableMailboxesType" minOccurs="0"/>
 *         &lt;element name="InPlaceHoldIdentity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManagedByOrganization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscoverySearchConfigurationType", propOrder = {
    "searchId",
    "searchQuery",
    "searchableMailboxes",
    "inPlaceHoldIdentity",
    "managedByOrganization"
})
public class DiscoverySearchConfigurationType {

    @XmlElement(name = "SearchId", required = true)
    protected String searchId;
    @XmlElement(name = "SearchQuery", required = true)
    protected String searchQuery;
    @XmlElement(name = "SearchableMailboxes")
    protected ArrayOfSearchableMailboxesType searchableMailboxes;
    @XmlElement(name = "InPlaceHoldIdentity")
    protected String inPlaceHoldIdentity;
    @XmlElement(name = "ManagedByOrganization")
    protected String managedByOrganization;

    /**
     * Gets the value of the searchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchId() {
        return searchId;
    }

    /**
     * Sets the value of the searchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchId(String value) {
        this.searchId = value;
    }

    /**
     * Gets the value of the searchQuery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchQuery() {
        return searchQuery;
    }

    /**
     * Sets the value of the searchQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchQuery(String value) {
        this.searchQuery = value;
    }

    /**
     * Gets the value of the searchableMailboxes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSearchableMailboxesType }
     *     
     */
    public ArrayOfSearchableMailboxesType getSearchableMailboxes() {
        return searchableMailboxes;
    }

    /**
     * Sets the value of the searchableMailboxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSearchableMailboxesType }
     *     
     */
    public void setSearchableMailboxes(ArrayOfSearchableMailboxesType value) {
        this.searchableMailboxes = value;
    }

    /**
     * Gets the value of the inPlaceHoldIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInPlaceHoldIdentity() {
        return inPlaceHoldIdentity;
    }

    /**
     * Sets the value of the inPlaceHoldIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInPlaceHoldIdentity(String value) {
        this.inPlaceHoldIdentity = value;
    }

    /**
     * Gets the value of the managedByOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagedByOrganization() {
        return managedByOrganization;
    }

    /**
     * Sets the value of the managedByOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagedByOrganization(String value) {
        this.managedByOrganization = value;
    }

}
