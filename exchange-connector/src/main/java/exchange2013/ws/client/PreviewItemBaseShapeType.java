
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreviewItemBaseShapeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PreviewItemBaseShapeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="Compact"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PreviewItemBaseShapeType")
@XmlEnum
public enum PreviewItemBaseShapeType {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Compact")
    COMPACT("Compact");
    private final String value;

    PreviewItemBaseShapeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PreviewItemBaseShapeType fromValue(String v) {
        for (PreviewItemBaseShapeType c: PreviewItemBaseShapeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
