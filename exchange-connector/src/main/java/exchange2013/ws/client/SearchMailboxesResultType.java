
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Mailboxes search result.
 *       
 * 
 * <p>Java class for SearchMailboxesResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchMailboxesResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchQueries" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfMailboxQueriesType"/>
 *         &lt;element name="ResultType" type="{http://schemas.microsoft.com/exchange/services/2006/types}SearchResultType"/>
 *         &lt;element name="ItemCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PageItemCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PageItemSize" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="KeywordStats" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfKeywordStatisticsSearchResultsType" minOccurs="0"/>
 *         &lt;element name="Items" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfSearchPreviewItemsType" minOccurs="0"/>
 *         &lt;element name="FailedMailboxes" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfFailedSearchMailboxesType" minOccurs="0"/>
 *         &lt;element name="Refiners" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfSearchRefinerItemsType" minOccurs="0"/>
 *         &lt;element name="MailboxStats" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfMailboxStatisticsItemsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchMailboxesResultType", propOrder = {
    "searchQueries",
    "resultType",
    "itemCount",
    "size",
    "pageItemCount",
    "pageItemSize",
    "keywordStats",
    "items",
    "failedMailboxes",
    "refiners",
    "mailboxStats"
})
public class SearchMailboxesResultType {

    @XmlElement(name = "SearchQueries", required = true)
    protected NonEmptyArrayOfMailboxQueriesType searchQueries;
    @XmlElement(name = "ResultType", required = true)
    protected SearchResultType resultType;
    @XmlElement(name = "ItemCount")
    protected long itemCount;
    @XmlElement(name = "Size")
    protected long size;
    @XmlElement(name = "PageItemCount")
    protected int pageItemCount;
    @XmlElement(name = "PageItemSize")
    protected long pageItemSize;
    @XmlElement(name = "KeywordStats")
    protected ArrayOfKeywordStatisticsSearchResultsType keywordStats;
    @XmlElement(name = "Items")
    protected ArrayOfSearchPreviewItemsType items;
    @XmlElement(name = "FailedMailboxes")
    protected ArrayOfFailedSearchMailboxesType failedMailboxes;
    @XmlElement(name = "Refiners")
    protected ArrayOfSearchRefinerItemsType refiners;
    @XmlElement(name = "MailboxStats")
    protected ArrayOfMailboxStatisticsItemsType mailboxStats;

    /**
     * Gets the value of the searchQueries property.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfMailboxQueriesType }
     *     
     */
    public NonEmptyArrayOfMailboxQueriesType getSearchQueries() {
        return searchQueries;
    }

    /**
     * Sets the value of the searchQueries property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfMailboxQueriesType }
     *     
     */
    public void setSearchQueries(NonEmptyArrayOfMailboxQueriesType value) {
        this.searchQueries = value;
    }

    /**
     * Gets the value of the resultType property.
     * 
     * @return
     *     possible object is
     *     {@link SearchResultType }
     *     
     */
    public SearchResultType getResultType() {
        return resultType;
    }

    /**
     * Sets the value of the resultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchResultType }
     *     
     */
    public void setResultType(SearchResultType value) {
        this.resultType = value;
    }

    /**
     * Gets the value of the itemCount property.
     * 
     */
    public long getItemCount() {
        return itemCount;
    }

    /**
     * Sets the value of the itemCount property.
     * 
     */
    public void setItemCount(long value) {
        this.itemCount = value;
    }

    /**
     * Gets the value of the size property.
     * 
     */
    public long getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     */
    public void setSize(long value) {
        this.size = value;
    }

    /**
     * Gets the value of the pageItemCount property.
     * 
     */
    public int getPageItemCount() {
        return pageItemCount;
    }

    /**
     * Sets the value of the pageItemCount property.
     * 
     */
    public void setPageItemCount(int value) {
        this.pageItemCount = value;
    }

    /**
     * Gets the value of the pageItemSize property.
     * 
     */
    public long getPageItemSize() {
        return pageItemSize;
    }

    /**
     * Sets the value of the pageItemSize property.
     * 
     */
    public void setPageItemSize(long value) {
        this.pageItemSize = value;
    }

    /**
     * Gets the value of the keywordStats property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeywordStatisticsSearchResultsType }
     *     
     */
    public ArrayOfKeywordStatisticsSearchResultsType getKeywordStats() {
        return keywordStats;
    }

    /**
     * Sets the value of the keywordStats property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeywordStatisticsSearchResultsType }
     *     
     */
    public void setKeywordStats(ArrayOfKeywordStatisticsSearchResultsType value) {
        this.keywordStats = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSearchPreviewItemsType }
     *     
     */
    public ArrayOfSearchPreviewItemsType getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSearchPreviewItemsType }
     *     
     */
    public void setItems(ArrayOfSearchPreviewItemsType value) {
        this.items = value;
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

    /**
     * Gets the value of the refiners property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSearchRefinerItemsType }
     *     
     */
    public ArrayOfSearchRefinerItemsType getRefiners() {
        return refiners;
    }

    /**
     * Sets the value of the refiners property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSearchRefinerItemsType }
     *     
     */
    public void setRefiners(ArrayOfSearchRefinerItemsType value) {
        this.refiners = value;
    }

    /**
     * Gets the value of the mailboxStats property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMailboxStatisticsItemsType }
     *     
     */
    public ArrayOfMailboxStatisticsItemsType getMailboxStats() {
        return mailboxStats;
    }

    /**
     * Sets the value of the mailboxStats property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMailboxStatisticsItemsType }
     *     
     */
    public void setMailboxStats(ArrayOfMailboxStatisticsItemsType value) {
        this.mailboxStats = value;
    }

}
