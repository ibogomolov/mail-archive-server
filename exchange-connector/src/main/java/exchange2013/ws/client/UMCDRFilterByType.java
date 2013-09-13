
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UMCDRFilterByType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UMCDRFilterByType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FilterByUser"/>
 *     &lt;enumeration value="FilterByDate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UMCDRFilterByType")
@XmlEnum
public enum UMCDRFilterByType {

    @XmlEnumValue("FilterByUser")
    FILTER_BY_USER("FilterByUser"),
    @XmlEnumValue("FilterByDate")
    FILTER_BY_DATE("FilterByDate");
    private final String value;

    UMCDRFilterByType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UMCDRFilterByType fromValue(String v) {
        for (UMCDRFilterByType c: UMCDRFilterByType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
