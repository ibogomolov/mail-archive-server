
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchPageDirectionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchPageDirectionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Previous"/>
 *     &lt;enumeration value="Next"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchPageDirectionType")
@XmlEnum
public enum SearchPageDirectionType {

    @XmlEnumValue("Previous")
    PREVIOUS("Previous"),
    @XmlEnumValue("Next")
    NEXT("Next");
    private final String value;

    SearchPageDirectionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchPageDirectionType fromValue(String v) {
        for (SearchPageDirectionType c: SearchPageDirectionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
