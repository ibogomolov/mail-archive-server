
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Response message type for the SearchMailboxes web method.
 *       
 * 
 * <p>Java class for SearchMailboxesResponseMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchMailboxesResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="SearchMailboxesResult" type="{http://schemas.microsoft.com/exchange/services/2006/types}SearchMailboxesResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchMailboxesResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "searchMailboxesResult"
})
public class SearchMailboxesResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "SearchMailboxesResult")
    protected SearchMailboxesResultType searchMailboxesResult;

    /**
     * Gets the value of the searchMailboxesResult property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMailboxesResultType }
     *     
     */
    public SearchMailboxesResultType getSearchMailboxesResult() {
        return searchMailboxesResult;
    }

    /**
     * Sets the value of the searchMailboxesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMailboxesResultType }
     *     
     */
    public void setSearchMailboxesResult(SearchMailboxesResultType value) {
        this.searchMailboxesResult = value;
    }

}
