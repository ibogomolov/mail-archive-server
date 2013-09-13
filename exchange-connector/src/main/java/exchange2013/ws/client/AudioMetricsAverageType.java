
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AudioMetricsAverageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AudioMetricsAverageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TotalCount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudioMetricsAverageType", propOrder = {
    "totalValue",
    "totalCount"
})
public class AudioMetricsAverageType {

    @XmlElement(name = "TotalValue")
    protected double totalValue;
    @XmlElement(name = "TotalCount")
    protected double totalCount;

    /**
     * Gets the value of the totalValue property.
     * 
     */
    public double getTotalValue() {
        return totalValue;
    }

    /**
     * Sets the value of the totalValue property.
     * 
     */
    public void setTotalValue(double value) {
        this.totalValue = value;
    }

    /**
     * Gets the value of the totalCount property.
     * 
     */
    public double getTotalCount() {
        return totalCount;
    }

    /**
     * Sets the value of the totalCount property.
     * 
     */
    public void setTotalCount(double value) {
        this.totalCount = value;
    }

}
