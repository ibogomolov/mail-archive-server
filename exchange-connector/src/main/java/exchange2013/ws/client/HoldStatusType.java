
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HoldStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HoldStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotOnHold"/>
 *     &lt;enumeration value="Pending"/>
 *     &lt;enumeration value="OnHold"/>
 *     &lt;enumeration value="PartialHold"/>
 *     &lt;enumeration value="Failed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HoldStatusType")
@XmlEnum
public enum HoldStatusType {

    @XmlEnumValue("NotOnHold")
    NOT_ON_HOLD("NotOnHold"),
    @XmlEnumValue("Pending")
    PENDING("Pending"),
    @XmlEnumValue("OnHold")
    ON_HOLD("OnHold"),
    @XmlEnumValue("PartialHold")
    PARTIAL_HOLD("PartialHold"),
    @XmlEnumValue("Failed")
    FAILED("Failed");
    private final String value;

    HoldStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HoldStatusType fromValue(String v) {
        for (HoldStatusType c: HoldStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
