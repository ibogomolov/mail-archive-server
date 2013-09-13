
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetentionActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RetentionActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="MoveToDeletedItems"/>
 *     &lt;enumeration value="MoveToFolder"/>
 *     &lt;enumeration value="DeleteAndAllowRecovery"/>
 *     &lt;enumeration value="PermanentlyDelete"/>
 *     &lt;enumeration value="MarkAsPastRetentionLimit"/>
 *     &lt;enumeration value="MoveToArchive"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RetentionActionType")
@XmlEnum
public enum RetentionActionType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("MoveToDeletedItems")
    MOVE_TO_DELETED_ITEMS("MoveToDeletedItems"),
    @XmlEnumValue("MoveToFolder")
    MOVE_TO_FOLDER("MoveToFolder"),
    @XmlEnumValue("DeleteAndAllowRecovery")
    DELETE_AND_ALLOW_RECOVERY("DeleteAndAllowRecovery"),
    @XmlEnumValue("PermanentlyDelete")
    PERMANENTLY_DELETE("PermanentlyDelete"),
    @XmlEnumValue("MarkAsPastRetentionLimit")
    MARK_AS_PAST_RETENTION_LIMIT("MarkAsPastRetentionLimit"),
    @XmlEnumValue("MoveToArchive")
    MOVE_TO_ARCHIVE("MoveToArchive");
    private final String value;

    RetentionActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RetentionActionType fromValue(String v) {
        for (RetentionActionType c: RetentionActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
