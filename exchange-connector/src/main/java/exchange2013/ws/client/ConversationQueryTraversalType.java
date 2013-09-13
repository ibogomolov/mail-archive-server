
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConversationQueryTraversalType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConversationQueryTraversalType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Shallow"/>
 *     &lt;enumeration value="Deep"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConversationQueryTraversalType")
@XmlEnum
public enum ConversationQueryTraversalType {

    @XmlEnumValue("Shallow")
    SHALLOW("Shallow"),
    @XmlEnumValue("Deep")
    DEEP("Deep");
    private final String value;

    ConversationQueryTraversalType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConversationQueryTraversalType fromValue(String v) {
        for (ConversationQueryTraversalType c: ConversationQueryTraversalType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
