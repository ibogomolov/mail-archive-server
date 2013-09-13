
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *           Request type for the SearchMailboxes web method.
 *         
 * 
 * <p>Java class for SearchMailboxesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchMailboxesType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="SearchQueries" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfMailboxQueriesType"/>
 *         &lt;element name="ResultType" type="{http://schemas.microsoft.com/exchange/services/2006/types}SearchResultType"/>
 *         &lt;element name="PreviewItemResponseShape" type="{http://schemas.microsoft.com/exchange/services/2006/types}PreviewItemResponseShapeType" minOccurs="0"/>
 *         &lt;element name="SortBy" type="{http://schemas.microsoft.com/exchange/services/2006/types}FieldOrderType" minOccurs="0"/>
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Deduplication" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PageItemReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PageDirection" type="{http://schemas.microsoft.com/exchange/services/2006/types}SearchPageDirectionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchMailboxesType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "searchQueries",
    "resultType",
    "previewItemResponseShape",
    "sortBy",
    "language",
    "deduplication",
    "pageSize",
    "pageItemReference",
    "pageDirection"
})
public class SearchMailboxesType
    extends BaseRequestType
{

    @XmlElement(name = "SearchQueries", required = true)
    protected NonEmptyArrayOfMailboxQueriesType searchQueries;
    @XmlElement(name = "ResultType", required = true)
    protected SearchResultType resultType;
    @XmlElement(name = "PreviewItemResponseShape")
    protected PreviewItemResponseShapeType previewItemResponseShape;
    @XmlElement(name = "SortBy")
    protected FieldOrderType sortBy;
    @XmlElement(name = "Language")
    protected String language;
    @XmlElement(name = "Deduplication")
    protected Boolean deduplication;
    @XmlElement(name = "PageSize")
    protected Integer pageSize;
    @XmlElement(name = "PageItemReference")
    protected String pageItemReference;
    @XmlElement(name = "PageDirection")
    protected SearchPageDirectionType pageDirection;

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
     * Gets the value of the previewItemResponseShape property.
     * 
     * @return
     *     possible object is
     *     {@link PreviewItemResponseShapeType }
     *     
     */
    public PreviewItemResponseShapeType getPreviewItemResponseShape() {
        return previewItemResponseShape;
    }

    /**
     * Sets the value of the previewItemResponseShape property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviewItemResponseShapeType }
     *     
     */
    public void setPreviewItemResponseShape(PreviewItemResponseShapeType value) {
        this.previewItemResponseShape = value;
    }

    /**
     * Gets the value of the sortBy property.
     * 
     * @return
     *     possible object is
     *     {@link FieldOrderType }
     *     
     */
    public FieldOrderType getSortBy() {
        return sortBy;
    }

    /**
     * Sets the value of the sortBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldOrderType }
     *     
     */
    public void setSortBy(FieldOrderType value) {
        this.sortBy = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the deduplication property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeduplication() {
        return deduplication;
    }

    /**
     * Sets the value of the deduplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeduplication(Boolean value) {
        this.deduplication = value;
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

}
