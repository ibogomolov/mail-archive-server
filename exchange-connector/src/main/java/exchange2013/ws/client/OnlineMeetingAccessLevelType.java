
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OnlineMeetingAccessLevelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OnlineMeetingAccessLevelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Locked"/>
 *     &lt;enumeration value="Invited"/>
 *     &lt;enumeration value="Internal"/>
 *     &lt;enumeration value="Everyone"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OnlineMeetingAccessLevelType")
@XmlEnum
public enum OnlineMeetingAccessLevelType {

    @XmlEnumValue("Locked")
    LOCKED("Locked"),
    @XmlEnumValue("Invited")
    INVITED("Invited"),
    @XmlEnumValue("Internal")
    INTERNAL("Internal"),
    @XmlEnumValue("Everyone")
    EVERYONE("Everyone");
    private final String value;

    OnlineMeetingAccessLevelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OnlineMeetingAccessLevelType fromValue(String v) {
        for (OnlineMeetingAccessLevelType c: OnlineMeetingAccessLevelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
