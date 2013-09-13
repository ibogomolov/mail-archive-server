
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for QueryStringType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryStringType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="ResetCache" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ReturnHighlightTerms" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ReturnDeletedItems" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryStringType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "value"
})
public class QueryStringType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "ResetCache")
    protected Boolean resetCache;
    @XmlAttribute(name = "ReturnHighlightTerms")
    protected Boolean returnHighlightTerms;
    @XmlAttribute(name = "ReturnDeletedItems")
    protected Boolean returnDeletedItems;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the resetCache property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResetCache() {
        return resetCache;
    }

    /**
     * Sets the value of the resetCache property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResetCache(Boolean value) {
        this.resetCache = value;
    }

    /**
     * Gets the value of the returnHighlightTerms property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnHighlightTerms() {
        return returnHighlightTerms;
    }

    /**
     * Sets the value of the returnHighlightTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnHighlightTerms(Boolean value) {
        this.returnHighlightTerms = value;
    }

    /**
     * Gets the value of the returnDeletedItems property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnDeletedItems() {
        return returnDeletedItems;
    }

    /**
     * Sets the value of the returnDeletedItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnDeletedItems(Boolean value) {
        this.returnDeletedItems = value;
    }

}
