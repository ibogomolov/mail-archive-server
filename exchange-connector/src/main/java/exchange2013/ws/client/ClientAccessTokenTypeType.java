
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClientAccessTokenTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClientAccessTokenTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CallerIdentity"/>
 *     &lt;enumeration value="ExtensionCallback"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClientAccessTokenTypeType")
@XmlEnum
public enum ClientAccessTokenTypeType {

    @XmlEnumValue("CallerIdentity")
    CALLER_IDENTITY("CallerIdentity"),
    @XmlEnumValue("ExtensionCallback")
    EXTENSION_CALLBACK("ExtensionCallback");
    private final String value;

    ClientAccessTokenTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClientAccessTokenTypeType fromValue(String v) {
        for (ClientAccessTokenTypeType c: ClientAccessTokenTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
