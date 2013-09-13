
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchResultType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchResultType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="StatisticsOnly"/>
 *     &lt;enumeration value="PreviewOnly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchResultType")
@XmlEnum
public enum SearchResultType {

    @XmlEnumValue("StatisticsOnly")
    STATISTICS_ONLY("StatisticsOnly"),
    @XmlEnumValue("PreviewOnly")
    PREVIEW_ONLY("PreviewOnly");
    private final String value;

    SearchResultType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchResultType fromValue(String v) {
        for (SearchResultType c: SearchResultType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
