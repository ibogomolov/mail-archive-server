
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HoldActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HoldActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Create"/>
 *     &lt;enumeration value="Update"/>
 *     &lt;enumeration value="Remove"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HoldActionType")
@XmlEnum
public enum HoldActionType {

    @XmlEnumValue("Create")
    CREATE("Create"),
    @XmlEnumValue("Update")
    UPDATE("Update"),
    @XmlEnumValue("Remove")
    REMOVE("Remove");
    private final String value;

    HoldActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HoldActionType fromValue(String v) {
        for (HoldActionType c: HoldActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
