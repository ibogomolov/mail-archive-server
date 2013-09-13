
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FindPeopleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindPeopleType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="PersonaShape" type="{http://schemas.microsoft.com/exchange/services/2006/types}PersonaResponseShapeType" minOccurs="0"/>
 *         &lt;element name="IndexedPageItemView" type="{http://schemas.microsoft.com/exchange/services/2006/types}IndexedPageViewType"/>
 *         &lt;element name="Restriction" type="{http://schemas.microsoft.com/exchange/services/2006/types}RestrictionType" minOccurs="0"/>
 *         &lt;element name="AggregationRestriction" type="{http://schemas.microsoft.com/exchange/services/2006/types}RestrictionType" minOccurs="0"/>
 *         &lt;element name="SortOrder" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfFieldOrdersType" minOccurs="0"/>
 *         &lt;element name="ParentFolderId" type="{http://schemas.microsoft.com/exchange/services/2006/types}TargetFolderIdType" minOccurs="0"/>
 *         &lt;element name="QueryString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindPeopleType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "personaShape",
    "indexedPageItemView",
    "restriction",
    "aggregationRestriction",
    "sortOrder",
    "parentFolderId",
    "queryString"
})
public class FindPeopleType
    extends BaseRequestType
{

    @XmlElement(name = "PersonaShape")
    protected PersonaResponseShapeType personaShape;
    @XmlElement(name = "IndexedPageItemView", required = true)
    protected IndexedPageViewType indexedPageItemView;
    @XmlElement(name = "Restriction")
    protected RestrictionType restriction;
    @XmlElement(name = "AggregationRestriction")
    protected RestrictionType aggregationRestriction;
    @XmlElement(name = "SortOrder")
    protected NonEmptyArrayOfFieldOrdersType sortOrder;
    @XmlElement(name = "ParentFolderId")
    protected TargetFolderIdType parentFolderId;
    @XmlElement(name = "QueryString")
    protected String queryString;

    /**
     * Gets the value of the personaShape property.
     * 
     * @return
     *     possible object is
     *     {@link PersonaResponseShapeType }
     *     
     */
    public PersonaResponseShapeType getPersonaShape() {
        return personaShape;
    }

    /**
     * Sets the value of the personaShape property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonaResponseShapeType }
     *     
     */
    public void setPersonaShape(PersonaResponseShapeType value) {
        this.personaShape = value;
    }

    /**
     * Gets the value of the indexedPageItemView property.
     * 
     * @return
     *     possible object is
     *     {@link IndexedPageViewType }
     *     
     */
    public IndexedPageViewType getIndexedPageItemView() {
        return indexedPageItemView;
    }

    /**
     * Sets the value of the indexedPageItemView property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexedPageViewType }
     *     
     */
    public void setIndexedPageItemView(IndexedPageViewType value) {
        this.indexedPageItemView = value;
    }

    /**
     * Gets the value of the restriction property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictionType }
     *     
     */
    public RestrictionType getRestriction() {
        return restriction;
    }

    /**
     * Sets the value of the restriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictionType }
     *     
     */
    public void setRestriction(RestrictionType value) {
        this.restriction = value;
    }

    /**
     * Gets the value of the aggregationRestriction property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictionType }
     *     
     */
    public RestrictionType getAggregationRestriction() {
        return aggregationRestriction;
    }

    /**
     * Sets the value of the aggregationRestriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictionType }
     *     
     */
    public void setAggregationRestriction(RestrictionType value) {
        this.aggregationRestriction = value;
    }

    /**
     * Gets the value of the sortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfFieldOrdersType }
     *     
     */
    public NonEmptyArrayOfFieldOrdersType getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfFieldOrdersType }
     *     
     */
    public void setSortOrder(NonEmptyArrayOfFieldOrdersType value) {
        this.sortOrder = value;
    }

    /**
     * Gets the value of the parentFolderId property.
     * 
     * @return
     *     possible object is
     *     {@link TargetFolderIdType }
     *     
     */
    public TargetFolderIdType getParentFolderId() {
        return parentFolderId;
    }

    /**
     * Sets the value of the parentFolderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetFolderIdType }
     *     
     */
    public void setParentFolderId(TargetFolderIdType value) {
        this.parentFolderId = value;
    }

    /**
     * Gets the value of the queryString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryString() {
        return queryString;
    }

    /**
     * Sets the value of the queryString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryString(String value) {
        this.queryString = value;
    }

}
