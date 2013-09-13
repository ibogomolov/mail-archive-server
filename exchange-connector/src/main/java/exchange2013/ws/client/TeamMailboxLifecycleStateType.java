
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TeamMailboxLifecycleStateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TeamMailboxLifecycleStateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="Closed"/>
 *     &lt;enumeration value="Unlinked"/>
 *     &lt;enumeration value="PendingDelete"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TeamMailboxLifecycleStateType")
@XmlEnum
public enum TeamMailboxLifecycleStateType {

    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Closed")
    CLOSED("Closed"),
    @XmlEnumValue("Unlinked")
    UNLINKED("Unlinked"),
    @XmlEnumValue("PendingDelete")
    PENDING_DELETE("PendingDelete");
    private final String value;

    TeamMailboxLifecycleStateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TeamMailboxLifecycleStateType fromValue(String v) {
        for (TeamMailboxLifecycleStateType c: TeamMailboxLifecycleStateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
