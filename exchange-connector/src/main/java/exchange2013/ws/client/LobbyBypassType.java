
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LobbyBypassType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LobbyBypassType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Disabled"/>
 *     &lt;enumeration value="EnabledForGatewayParticipants"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LobbyBypassType")
@XmlEnum
public enum LobbyBypassType {

    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),
    @XmlEnumValue("EnabledForGatewayParticipants")
    ENABLED_FOR_GATEWAY_PARTICIPANTS("EnabledForGatewayParticipants");
    private final String value;

    LobbyBypassType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LobbyBypassType fromValue(String v) {
        for (LobbyBypassType c: LobbyBypassType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
