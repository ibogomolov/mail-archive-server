
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FindConversationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindConversationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="IndexedPageItemView" type="{http://schemas.microsoft.com/exchange/services/2006/types}IndexedPageViewType"/>
 *           &lt;element name="SeekToConditionPageItemView" type="{http://schemas.microsoft.com/exchange/services/2006/types}SeekToConditionPageViewType"/>
 *         &lt;/choice>
 *         &lt;element name="SortOrder" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfFieldOrdersType" minOccurs="0"/>
 *         &lt;element name="ParentFolderId" type="{http://schemas.microsoft.com/exchange/services/2006/types}TargetFolderIdType"/>
 *         &lt;element name="MailboxScope" type="{http://schemas.microsoft.com/exchange/services/2006/types}MailboxSearchLocationType" minOccurs="0"/>
 *         &lt;element name="QueryString" type="{http://schemas.microsoft.com/exchange/services/2006/messages}QueryStringType" minOccurs="0"/>
 *         &lt;element name="ConversationShape" type="{http://schemas.microsoft.com/exchange/services/2006/types}ConversationResponseShapeType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Traversal" type="{http://schemas.microsoft.com/exchange/services/2006/types}ConversationQueryTraversalType" />
 *       &lt;attribute name="ViewFilter" type="{http://schemas.microsoft.com/exchange/services/2006/types}ViewFilterType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindConversationType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "indexedPageItemView",
    "seekToConditionPageItemView",
    "sortOrder",
    "parentFolderId",
    "mailboxScope",
    "queryString",
    "conversationShape"
})
public class FindConversationType
    extends BaseRequestType
{

    @XmlElement(name = "IndexedPageItemView")
    protected IndexedPageViewType indexedPageItemView;
    @XmlElement(name = "SeekToConditionPageItemView")
    protected SeekToConditionPageViewType seekToConditionPageItemView;
    @XmlElement(name = "SortOrder")
    protected NonEmptyArrayOfFieldOrdersType sortOrder;
    @XmlElement(name = "ParentFolderId", required = true)
    protected TargetFolderIdType parentFolderId;
    @XmlElement(name = "MailboxScope")
    protected MailboxSearchLocationType mailboxScope;
    @XmlElement(name = "QueryString")
    protected QueryStringType queryString;
    @XmlElement(name = "ConversationShape")
    protected ConversationResponseShapeType conversationShape;
    @XmlAttribute(name = "Traversal")
    protected ConversationQueryTraversalType traversal;
    @XmlAttribute(name = "ViewFilter")
    protected ViewFilterType viewFilter;

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
     * Gets the value of the seekToConditionPageItemView property.
     * 
     * @return
     *     possible object is
     *     {@link SeekToConditionPageViewType }
     *     
     */
    public SeekToConditionPageViewType getSeekToConditionPageItemView() {
        return seekToConditionPageItemView;
    }

    /**
     * Sets the value of the seekToConditionPageItemView property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeekToConditionPageViewType }
     *     
     */
    public void setSeekToConditionPageItemView(SeekToConditionPageViewType value) {
        this.seekToConditionPageItemView = value;
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
     * Gets the value of the mailboxScope property.
     * 
     * @return
     *     possible object is
     *     {@link MailboxSearchLocationType }
     *     
     */
    public MailboxSearchLocationType getMailboxScope() {
        return mailboxScope;
    }

    /**
     * Sets the value of the mailboxScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailboxSearchLocationType }
     *     
     */
    public void setMailboxScope(MailboxSearchLocationType value) {
        this.mailboxScope = value;
    }

    /**
     * Gets the value of the queryString property.
     * 
     * @return
     *     possible object is
     *     {@link QueryStringType }
     *     
     */
    public QueryStringType getQueryString() {
        return queryString;
    }

    /**
     * Sets the value of the queryString property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryStringType }
     *     
     */
    public void setQueryString(QueryStringType value) {
        this.queryString = value;
    }

    /**
     * Gets the value of the conversationShape property.
     * 
     * @return
     *     possible object is
     *     {@link ConversationResponseShapeType }
     *     
     */
    public ConversationResponseShapeType getConversationShape() {
        return conversationShape;
    }

    /**
     * Sets the value of the conversationShape property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversationResponseShapeType }
     *     
     */
    public void setConversationShape(ConversationResponseShapeType value) {
        this.conversationShape = value;
    }

    /**
     * Gets the value of the traversal property.
     * 
     * @return
     *     possible object is
     *     {@link ConversationQueryTraversalType }
     *     
     */
    public ConversationQueryTraversalType getTraversal() {
        return traversal;
    }

    /**
     * Sets the value of the traversal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversationQueryTraversalType }
     *     
     */
    public void setTraversal(ConversationQueryTraversalType value) {
        this.traversal = value;
    }

    /**
     * Gets the value of the viewFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ViewFilterType }
     *     
     */
    public ViewFilterType getViewFilter() {
        return viewFilter;
    }

    /**
     * Sets the value of the viewFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewFilterType }
     *     
     */
    public void setViewFilter(ViewFilterType value) {
        this.viewFilter = value;
    }

}
