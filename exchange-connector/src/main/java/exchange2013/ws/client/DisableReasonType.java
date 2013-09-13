
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisableReasonType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DisableReasonType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NoReason"/>
 *     &lt;enumeration value="OutlookClientPerformance"/>
 *     &lt;enumeration value="OWAClientPerformance"/>
 *     &lt;enumeration value="MobileClientPerformance"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DisableReasonType")
@XmlEnum
public enum DisableReasonType {

    @XmlEnumValue("NoReason")
    NO_REASON("NoReason"),
    @XmlEnumValue("OutlookClientPerformance")
    OUTLOOK_CLIENT_PERFORMANCE("OutlookClientPerformance"),
    @XmlEnumValue("OWAClientPerformance")
    OWA_CLIENT_PERFORMANCE("OWAClientPerformance"),
    @XmlEnumValue("MobileClientPerformance")
    MOBILE_CLIENT_PERFORMANCE("MobileClientPerformance");
    private final String value;

    DisableReasonType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisableReasonType fromValue(String v) {
        for (DisableReasonType c: DisableReasonType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
