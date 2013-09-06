
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemIndexErrorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemIndexErrorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="GenericError"/>
 *     &lt;enumeration value="Timeout"/>
 *     &lt;enumeration value="StaleEvent"/>
 *     &lt;enumeration value="MailboxOffline"/>
 *     &lt;enumeration value="AttachmentLimitReached"/>
 *     &lt;enumeration value="MarsWriterTruncation"/>
 *     &lt;enumeration value="DocumentParserFailure"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemIndexErrorType")
@XmlEnum
public enum ItemIndexErrorType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("GenericError")
    GENERIC_ERROR("GenericError"),
    @XmlEnumValue("Timeout")
    TIMEOUT("Timeout"),
    @XmlEnumValue("StaleEvent")
    STALE_EVENT("StaleEvent"),
    @XmlEnumValue("MailboxOffline")
    MAILBOX_OFFLINE("MailboxOffline"),
    @XmlEnumValue("AttachmentLimitReached")
    ATTACHMENT_LIMIT_REACHED("AttachmentLimitReached"),
    @XmlEnumValue("MarsWriterTruncation")
    MARS_WRITER_TRUNCATION("MarsWriterTruncation"),
    @XmlEnumValue("DocumentParserFailure")
    DOCUMENT_PARSER_FAILURE("DocumentParserFailure");
    private final String value;

    ItemIndexErrorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemIndexErrorType fromValue(String v) {
        for (ItemIndexErrorType c: ItemIndexErrorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
