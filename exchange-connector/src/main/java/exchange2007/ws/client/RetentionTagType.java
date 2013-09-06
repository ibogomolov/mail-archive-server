
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for RetentionTagType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetentionTagType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://schemas.microsoft.com/exchange/services/2006/types>GuidType">
 *       &lt;attribute name="IsExplicit" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetentionTagType", propOrder = {
    "value"
})
public class RetentionTagType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "IsExplicit", required = true)
    protected boolean isExplicit;

    /**
     * 
     *         The regular expression captures the standard representation of a GUID
     *       
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
     * Gets the value of the isExplicit property.
     * 
     */
    public boolean isIsExplicit() {
        return isExplicit;
    }

    /**
     * Sets the value of the isExplicit property.
     * 
     */
    public void setIsExplicit(boolean value) {
        this.isExplicit = value;
    }

}
