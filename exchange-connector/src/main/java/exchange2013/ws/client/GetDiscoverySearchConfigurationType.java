
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Request type for the GetDiscoverySearchConfiguration web method.
 *       
 * 
 * <p>Java class for GetDiscoverySearchConfigurationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDiscoverySearchConfigurationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="SearchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpandGroupMembership" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InPlaceHoldConfigurationOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDiscoverySearchConfigurationType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "searchId",
    "expandGroupMembership",
    "inPlaceHoldConfigurationOnly"
})
public class GetDiscoverySearchConfigurationType
    extends BaseRequestType
{

    @XmlElement(name = "SearchId")
    protected String searchId;
    @XmlElement(name = "ExpandGroupMembership")
    protected Boolean expandGroupMembership;
    @XmlElement(name = "InPlaceHoldConfigurationOnly")
    protected Boolean inPlaceHoldConfigurationOnly;

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

    /**
     * Gets the value of the inPlaceHoldConfigurationOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInPlaceHoldConfigurationOnly() {
        return inPlaceHoldConfigurationOnly;
    }

    /**
     * Sets the value of the inPlaceHoldConfigurationOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInPlaceHoldConfigurationOnly(Boolean value) {
        this.inPlaceHoldConfigurationOnly = value;
    }

}
