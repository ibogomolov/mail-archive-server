
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClientExtensionTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClientExtensionTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="Private"/>
 *     &lt;enumeration value="MarketPlace"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClientExtensionTypeType")
@XmlEnum
public enum ClientExtensionTypeType {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Private")
    PRIVATE("Private"),
    @XmlEnumValue("MarketPlace")
    MARKET_PLACE("MarketPlace");
    private final String value;

    ClientExtensionTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClientExtensionTypeType fromValue(String v) {
        for (ClientExtensionTypeType c: ClientExtensionTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
