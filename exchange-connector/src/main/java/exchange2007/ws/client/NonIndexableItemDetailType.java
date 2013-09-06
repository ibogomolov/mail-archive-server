
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *         Non indexable item detail.
 *       
 * 
 * <p>Java class for NonIndexableItemDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonIndexableItemDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemId" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType"/>
 *         &lt;element name="ErrorCode" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIndexErrorType"/>
 *         &lt;element name="ErrorDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IsPartiallyIndexed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsPermanentFailure" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SortValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AttemptCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LastAttemptTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="AdditionalInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonIndexableItemDetailType", propOrder = {
    "itemId",
    "errorCode",
    "errorDescription",
    "isPartiallyIndexed",
    "isPermanentFailure",
    "sortValue",
    "attemptCount",
    "lastAttemptTime",
    "additionalInfo"
})
public class NonIndexableItemDetailType {

    @XmlElement(name = "ItemId", required = true)
    protected ItemIdType itemId;
    @XmlElement(name = "ErrorCode", required = true)
    protected ItemIndexErrorType errorCode;
    @XmlElement(name = "ErrorDescription", required = true)
    protected String errorDescription;
    @XmlElement(name = "IsPartiallyIndexed")
    protected boolean isPartiallyIndexed;
    @XmlElement(name = "IsPermanentFailure")
    protected boolean isPermanentFailure;
    @XmlElement(name = "SortValue", required = true)
    protected String sortValue;
    @XmlElement(name = "AttemptCount")
    protected int attemptCount;
    @XmlElement(name = "LastAttemptTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastAttemptTime;
    @XmlElement(name = "AdditionalInfo")
    protected String additionalInfo;

    /**
     * Gets the value of the itemId property.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdType }
     *     
     */
    public ItemIdType getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdType }
     *     
     */
    public void setItemId(ItemIdType value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link ItemIndexErrorType }
     *     
     */
    public ItemIndexErrorType getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIndexErrorType }
     *     
     */
    public void setErrorCode(ItemIndexErrorType value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorDescription() {
        return errorDescription;
    }

    /**
     * Sets the value of the errorDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorDescription(String value) {
        this.errorDescription = value;
    }

    /**
     * Gets the value of the isPartiallyIndexed property.
     * 
     */
    public boolean isIsPartiallyIndexed() {
        return isPartiallyIndexed;
    }

    /**
     * Sets the value of the isPartiallyIndexed property.
     * 
     */
    public void setIsPartiallyIndexed(boolean value) {
        this.isPartiallyIndexed = value;
    }

    /**
     * Gets the value of the isPermanentFailure property.
     * 
     */
    public boolean isIsPermanentFailure() {
        return isPermanentFailure;
    }

    /**
     * Sets the value of the isPermanentFailure property.
     * 
     */
    public void setIsPermanentFailure(boolean value) {
        this.isPermanentFailure = value;
    }

    /**
     * Gets the value of the sortValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortValue() {
        return sortValue;
    }

    /**
     * Sets the value of the sortValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortValue(String value) {
        this.sortValue = value;
    }

    /**
     * Gets the value of the attemptCount property.
     * 
     */
    public int getAttemptCount() {
        return attemptCount;
    }

    /**
     * Sets the value of the attemptCount property.
     * 
     */
    public void setAttemptCount(int value) {
        this.attemptCount = value;
    }

    /**
     * Gets the value of the lastAttemptTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastAttemptTime() {
        return lastAttemptTime;
    }

    /**
     * Sets the value of the lastAttemptTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastAttemptTime(XMLGregorianCalendar value) {
        this.lastAttemptTime = value;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInfo(String value) {
        this.additionalInfo = value;
    }

}
