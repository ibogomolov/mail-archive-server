
package exchange2007.ws.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Array of non indexable item statistics.
 *       
 * 
 * <p>Java class for ArrayOfNonIndexableItemStatisticsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNonIndexableItemStatisticsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NonIndexableItemStatistic" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonIndexableItemStatisticType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNonIndexableItemStatisticsType", propOrder = {
    "nonIndexableItemStatistic"
})
public class ArrayOfNonIndexableItemStatisticsType {

    @XmlElement(name = "NonIndexableItemStatistic")
    protected List<NonIndexableItemStatisticType> nonIndexableItemStatistic;

    /**
     * Gets the value of the nonIndexableItemStatistic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonIndexableItemStatistic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonIndexableItemStatistic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonIndexableItemStatisticType }
     * 
     * 
     */
    public List<NonIndexableItemStatisticType> getNonIndexableItemStatistic() {
        if (nonIndexableItemStatistic == null) {
            nonIndexableItemStatistic = new ArrayList<NonIndexableItemStatisticType>();
        }
        return this.nonIndexableItemStatistic;
    }

}
