
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationSourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LocationSourceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="LocationServices"/>
 *     &lt;enumeration value="PhonebookServices"/>
 *     &lt;enumeration value="Device"/>
 *     &lt;enumeration value="Contact"/>
 *     &lt;enumeration value="Resource"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LocationSourceType")
@XmlEnum
public enum LocationSourceType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("LocationServices")
    LOCATION_SERVICES("LocationServices"),
    @XmlEnumValue("PhonebookServices")
    PHONEBOOK_SERVICES("PhonebookServices"),
    @XmlEnumValue("Device")
    DEVICE("Device"),
    @XmlEnumValue("Contact")
    CONTACT("Contact"),
    @XmlEnumValue("Resource")
    RESOURCE("Resource");
    private final String value;

    LocationSourceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationSourceType fromValue(String v) {
        for (LocationSourceType c: LocationSourceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
