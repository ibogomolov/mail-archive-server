
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClientExtensionScopeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClientExtensionScopeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="User"/>
 *     &lt;enumeration value="Organization"/>
 *     &lt;enumeration value="Default"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClientExtensionScopeType")
@XmlEnum
public enum ClientExtensionScopeType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("User")
    USER("User"),
    @XmlEnumValue("Organization")
    ORGANIZATION("Organization"),
    @XmlEnumValue("Default")
    DEFAULT("Default");
    private final String value;

    ClientExtensionScopeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClientExtensionScopeType fromValue(String v) {
        for (ClientExtensionScopeType c: ClientExtensionScopeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
