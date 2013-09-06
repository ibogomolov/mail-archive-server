
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PredictedMessageActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PredictedMessageActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Respond"/>
 *     &lt;enumeration value="FollowUp"/>
 *     &lt;enumeration value="MoveToFolder"/>
 *     &lt;enumeration value="Delete"/>
 *     &lt;enumeration value="Read"/>
 *     &lt;enumeration value="Ignore"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PredictedMessageActionType")
@XmlEnum
public enum PredictedMessageActionType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Respond")
    RESPOND("Respond"),
    @XmlEnumValue("FollowUp")
    FOLLOW_UP("FollowUp"),
    @XmlEnumValue("MoveToFolder")
    MOVE_TO_FOLDER("MoveToFolder"),
    @XmlEnumValue("Delete")
    DELETE("Delete"),
    @XmlEnumValue("Read")
    READ("Read"),
    @XmlEnumValue("Ignore")
    IGNORE("Ignore");
    private final String value;

    PredictedMessageActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PredictedMessageActionType fromValue(String v) {
        for (PredictedMessageActionType c: PredictedMessageActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
