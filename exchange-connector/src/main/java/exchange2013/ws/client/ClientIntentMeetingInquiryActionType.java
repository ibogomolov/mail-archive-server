
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClientIntentMeetingInquiryActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClientIntentMeetingInquiryActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SendCancellation"/>
 *     &lt;enumeration value="ReviveMeeting"/>
 *     &lt;enumeration value="SendUpdateForMaster"/>
 *     &lt;enumeration value="MeetingAlreadyExists"/>
 *     &lt;enumeration value="ExistingOccurrence"/>
 *     &lt;enumeration value="HasDelegates"/>
 *     &lt;enumeration value="DeletedVersionNotFound"/>
 *     &lt;enumeration value="PairedCancellationFound"/>
 *     &lt;enumeration value="FailedToRevive"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClientIntentMeetingInquiryActionType")
@XmlEnum
public enum ClientIntentMeetingInquiryActionType {

    @XmlEnumValue("SendCancellation")
    SEND_CANCELLATION("SendCancellation"),
    @XmlEnumValue("ReviveMeeting")
    REVIVE_MEETING("ReviveMeeting"),
    @XmlEnumValue("SendUpdateForMaster")
    SEND_UPDATE_FOR_MASTER("SendUpdateForMaster"),
    @XmlEnumValue("MeetingAlreadyExists")
    MEETING_ALREADY_EXISTS("MeetingAlreadyExists"),
    @XmlEnumValue("ExistingOccurrence")
    EXISTING_OCCURRENCE("ExistingOccurrence"),
    @XmlEnumValue("HasDelegates")
    HAS_DELEGATES("HasDelegates"),
    @XmlEnumValue("DeletedVersionNotFound")
    DELETED_VERSION_NOT_FOUND("DeletedVersionNotFound"),
    @XmlEnumValue("PairedCancellationFound")
    PAIRED_CANCELLATION_FOUND("PairedCancellationFound"),
    @XmlEnumValue("FailedToRevive")
    FAILED_TO_REVIVE("FailedToRevive");
    private final String value;

    ClientIntentMeetingInquiryActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClientIntentMeetingInquiryActionType fromValue(String v) {
        for (ClientIntentMeetingInquiryActionType c: ClientIntentMeetingInquiryActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
