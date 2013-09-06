
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConversationNodeSortOrder.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConversationNodeSortOrder">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TreeOrderAscending"/>
 *     &lt;enumeration value="TreeOrderDescending"/>
 *     &lt;enumeration value="DateOrderAscending"/>
 *     &lt;enumeration value="DateOrderDescending"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConversationNodeSortOrder")
@XmlEnum
public enum ConversationNodeSortOrder {

    @XmlEnumValue("TreeOrderAscending")
    TREE_ORDER_ASCENDING("TreeOrderAscending"),
    @XmlEnumValue("TreeOrderDescending")
    TREE_ORDER_DESCENDING("TreeOrderDescending"),
    @XmlEnumValue("DateOrderAscending")
    DATE_ORDER_ASCENDING("DateOrderAscending"),
    @XmlEnumValue("DateOrderDescending")
    DATE_ORDER_DESCENDING("DateOrderDescending");
    private final String value;

    ConversationNodeSortOrder(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConversationNodeSortOrder fromValue(String v) {
        for (ConversationNodeSortOrder c: ConversationNodeSortOrder.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
