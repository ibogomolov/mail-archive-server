
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserPhotoSizeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserPhotoSizeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HR48x48"/>
 *     &lt;enumeration value="HR64x64"/>
 *     &lt;enumeration value="HR96x96"/>
 *     &lt;enumeration value="HR120x120"/>
 *     &lt;enumeration value="HR240x240"/>
 *     &lt;enumeration value="HR360x360"/>
 *     &lt;enumeration value="HR432x432"/>
 *     &lt;enumeration value="HR504x504"/>
 *     &lt;enumeration value="HR648x648"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UserPhotoSizeType")
@XmlEnum
public enum UserPhotoSizeType {

    @XmlEnumValue("HR48x48")
    HR_48_X_48("HR48x48"),
    @XmlEnumValue("HR64x64")
    HR_64_X_64("HR64x64"),
    @XmlEnumValue("HR96x96")
    HR_96_X_96("HR96x96"),
    @XmlEnumValue("HR120x120")
    HR_120_X_120("HR120x120"),
    @XmlEnumValue("HR240x240")
    HR_240_X_240("HR240x240"),
    @XmlEnumValue("HR360x360")
    HR_360_X_360("HR360x360"),
    @XmlEnumValue("HR432x432")
    HR_432_X_432("HR432x432"),
    @XmlEnumValue("HR504x504")
    HR_504_X_504("HR504x504"),
    @XmlEnumValue("HR648x648")
    HR_648_X_648("HR648x648");
    private final String value;

    UserPhotoSizeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserPhotoSizeType fromValue(String v) {
        for (UserPhotoSizeType c: UserPhotoSizeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
