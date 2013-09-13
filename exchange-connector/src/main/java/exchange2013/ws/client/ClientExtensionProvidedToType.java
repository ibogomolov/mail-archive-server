
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClientExtensionProvidedToType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClientExtensionProvidedToType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Everyone"/>
 *     &lt;enumeration value="SpecificUsers"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClientExtensionProvidedToType")
@XmlEnum
public enum ClientExtensionProvidedToType {

    @XmlEnumValue("Everyone")
    EVERYONE("Everyone"),
    @XmlEnumValue("SpecificUsers")
    SPECIFIC_USERS("SpecificUsers");
    private final String value;

    ClientExtensionProvidedToType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClientExtensionProvidedToType fromValue(String v) {
        for (ClientExtensionProvidedToType c: ClientExtensionProvidedToType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
