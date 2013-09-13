
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SetClientExtensionActionIdType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SetClientExtensionActionIdType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Install"/>
 *     &lt;enumeration value="Uninstall"/>
 *     &lt;enumeration value="Configure"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SetClientExtensionActionIdType")
@XmlEnum
public enum SetClientExtensionActionIdType {

    @XmlEnumValue("Install")
    INSTALL("Install"),
    @XmlEnumValue("Uninstall")
    UNINSTALL("Uninstall"),
    @XmlEnumValue("Configure")
    CONFIGURE("Configure");
    private final String value;

    SetClientExtensionActionIdType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SetClientExtensionActionIdType fromValue(String v) {
        for (SetClientExtensionActionIdType c: SetClientExtensionActionIdType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
