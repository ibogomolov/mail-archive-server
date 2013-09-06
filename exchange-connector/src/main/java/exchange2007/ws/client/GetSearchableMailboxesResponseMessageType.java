
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *           Response message type for the GetSearchableMailboxes web method.
 *         
 * 
 * <p>Java class for GetSearchableMailboxesResponseMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSearchableMailboxesResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="SearchableMailboxes" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfSearchableMailboxesType"/>
 *         &lt;element name="FailedMailboxes" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfFailedSearchMailboxesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSearchableMailboxesResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "searchableMailboxes",
    "failedMailboxes"
})
public class GetSearchableMailboxesResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "SearchableMailboxes", required = true)
    protected ArrayOfSearchableMailboxesType searchableMailboxes;
    @XmlElement(name = "FailedMailboxes")
    protected ArrayOfFailedSearchMailboxesType failedMailboxes;

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
     * Gets the value of the failedMailboxes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFailedSearchMailboxesType }
     *     
     */
    public ArrayOfFailedSearchMailboxesType getFailedMailboxes() {
        return failedMailboxes;
    }

    /**
     * Sets the value of the failedMailboxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFailedSearchMailboxesType }
     *     
     */
    public void setFailedMailboxes(ArrayOfFailedSearchMailboxesType value) {
        this.failedMailboxes = value;
    }

}
