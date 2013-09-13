
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationBasedStateDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationBasedStateDefinitionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}BaseCalendarItemStateDefinitionType">
 *       &lt;sequence>
 *         &lt;element name="OrganizerLocation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AttendeeLocation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationBasedStateDefinitionType", propOrder = {
    "organizerLocation",
    "attendeeLocation"
})
public class LocationBasedStateDefinitionType
    extends BaseCalendarItemStateDefinitionType
{

    @XmlElement(name = "OrganizerLocation", required = true)
    protected String organizerLocation;
    @XmlElement(name = "AttendeeLocation", required = true)
    protected String attendeeLocation;

    /**
     * Gets the value of the organizerLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizerLocation() {
        return organizerLocation;
    }

    /**
     * Sets the value of the organizerLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizerLocation(String value) {
        this.organizerLocation = value;
    }

    /**
     * Gets the value of the attendeeLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttendeeLocation() {
        return attendeeLocation;
    }

    /**
     * Sets the value of the attendeeLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttendeeLocation(String value) {
        this.attendeeLocation = value;
    }

}
