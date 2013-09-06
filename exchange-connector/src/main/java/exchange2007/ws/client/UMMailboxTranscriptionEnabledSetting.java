
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UMMailboxTranscriptionEnabledSetting.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UMMailboxTranscriptionEnabledSetting">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Disabled"/>
 *     &lt;enumeration value="Enabled"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UMMailboxTranscriptionEnabledSetting")
@XmlEnum
public enum UMMailboxTranscriptionEnabledSetting {

    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),
    @XmlEnumValue("Enabled")
    ENABLED("Enabled"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    UMMailboxTranscriptionEnabledSetting(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UMMailboxTranscriptionEnabledSetting fromValue(String v) {
        for (UMMailboxTranscriptionEnabledSetting c: UMMailboxTranscriptionEnabledSetting.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
