
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeekToConditionPageViewType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeekToConditionPageViewType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}BasePagingType">
 *       &lt;sequence>
 *         &lt;element name="Condition" type="{http://schemas.microsoft.com/exchange/services/2006/types}RestrictionType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="BasePoint" use="required" type="{http://schemas.microsoft.com/exchange/services/2006/types}IndexBasePointType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeekToConditionPageViewType", propOrder = {
    "condition"
})
public class SeekToConditionPageViewType
    extends BasePagingType
{

    @XmlElement(name = "Condition", required = true)
    protected RestrictionType condition;
    @XmlAttribute(name = "BasePoint", required = true)
    protected IndexBasePointType basePoint;

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictionType }
     *     
     */
    public RestrictionType getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictionType }
     *     
     */
    public void setCondition(RestrictionType value) {
        this.condition = value;
    }

    /**
     * Gets the value of the basePoint property.
     * 
     * @return
     *     possible object is
     *     {@link IndexBasePointType }
     *     
     */
    public IndexBasePointType getBasePoint() {
        return basePoint;
    }

    /**
     * Sets the value of the basePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexBasePointType }
     *     
     */
    public void setBasePoint(IndexBasePointType value) {
        this.basePoint = value;
    }

}
