
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FindPeopleResponseMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindPeopleResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="People" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPeopleType" minOccurs="0"/>
 *         &lt;element name="TotalNumberOfPeopleInView" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindPeopleResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "people",
    "totalNumberOfPeopleInView"
})
public class FindPeopleResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "People")
    protected ArrayOfPeopleType people;
    @XmlElement(name = "TotalNumberOfPeopleInView")
    protected Integer totalNumberOfPeopleInView;

    /**
     * Gets the value of the people property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPeopleType }
     *     
     */
    public ArrayOfPeopleType getPeople() {
        return people;
    }

    /**
     * Sets the value of the people property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPeopleType }
     *     
     */
    public void setPeople(ArrayOfPeopleType value) {
        this.people = value;
    }

    /**
     * Gets the value of the totalNumberOfPeopleInView property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalNumberOfPeopleInView() {
        return totalNumberOfPeopleInView;
    }

    /**
     * Sets the value of the totalNumberOfPeopleInView property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalNumberOfPeopleInView(Integer value) {
        this.totalNumberOfPeopleInView = value;
    }

}
