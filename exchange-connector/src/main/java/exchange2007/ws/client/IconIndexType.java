
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IconIndexType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IconIndexType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="PostItem"/>
 *     &lt;enumeration value="MailRead"/>
 *     &lt;enumeration value="MailUnread"/>
 *     &lt;enumeration value="MailReplied"/>
 *     &lt;enumeration value="MailForwarded"/>
 *     &lt;enumeration value="MailEncrypted"/>
 *     &lt;enumeration value="MailSmimeSigned"/>
 *     &lt;enumeration value="MailEncryptedReplied"/>
 *     &lt;enumeration value="MailSmimeSignedReplied"/>
 *     &lt;enumeration value="MailEncryptedForwarded"/>
 *     &lt;enumeration value="MailSmimeSignedForwarded"/>
 *     &lt;enumeration value="MailEncryptedRead"/>
 *     &lt;enumeration value="MailSmimeSignedRead"/>
 *     &lt;enumeration value="MailIrm"/>
 *     &lt;enumeration value="MailIrmForwarded"/>
 *     &lt;enumeration value="MailIrmReplied"/>
 *     &lt;enumeration value="SmsSubmitted"/>
 *     &lt;enumeration value="SmsRoutedToDeliveryPoint"/>
 *     &lt;enumeration value="SmsRoutedToExternalMessagingSystem"/>
 *     &lt;enumeration value="SmsDelivered"/>
 *     &lt;enumeration value="OutlookDefaultForContacts"/>
 *     &lt;enumeration value="AppointmentItem"/>
 *     &lt;enumeration value="AppointmentRecur"/>
 *     &lt;enumeration value="AppointmentMeet"/>
 *     &lt;enumeration value="AppointmentMeetRecur"/>
 *     &lt;enumeration value="AppointmentMeetNY"/>
 *     &lt;enumeration value="AppointmentMeetYes"/>
 *     &lt;enumeration value="AppointmentMeetNo"/>
 *     &lt;enumeration value="AppointmentMeetMaybe"/>
 *     &lt;enumeration value="AppointmentMeetCancel"/>
 *     &lt;enumeration value="AppointmentMeetInfo"/>
 *     &lt;enumeration value="TaskItem"/>
 *     &lt;enumeration value="TaskRecur"/>
 *     &lt;enumeration value="TaskOwned"/>
 *     &lt;enumeration value="TaskDelegated"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IconIndexType")
@XmlEnum
public enum IconIndexType {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("PostItem")
    POST_ITEM("PostItem"),
    @XmlEnumValue("MailRead")
    MAIL_READ("MailRead"),
    @XmlEnumValue("MailUnread")
    MAIL_UNREAD("MailUnread"),
    @XmlEnumValue("MailReplied")
    MAIL_REPLIED("MailReplied"),
    @XmlEnumValue("MailForwarded")
    MAIL_FORWARDED("MailForwarded"),
    @XmlEnumValue("MailEncrypted")
    MAIL_ENCRYPTED("MailEncrypted"),
    @XmlEnumValue("MailSmimeSigned")
    MAIL_SMIME_SIGNED("MailSmimeSigned"),
    @XmlEnumValue("MailEncryptedReplied")
    MAIL_ENCRYPTED_REPLIED("MailEncryptedReplied"),
    @XmlEnumValue("MailSmimeSignedReplied")
    MAIL_SMIME_SIGNED_REPLIED("MailSmimeSignedReplied"),
    @XmlEnumValue("MailEncryptedForwarded")
    MAIL_ENCRYPTED_FORWARDED("MailEncryptedForwarded"),
    @XmlEnumValue("MailSmimeSignedForwarded")
    MAIL_SMIME_SIGNED_FORWARDED("MailSmimeSignedForwarded"),
    @XmlEnumValue("MailEncryptedRead")
    MAIL_ENCRYPTED_READ("MailEncryptedRead"),
    @XmlEnumValue("MailSmimeSignedRead")
    MAIL_SMIME_SIGNED_READ("MailSmimeSignedRead"),
    @XmlEnumValue("MailIrm")
    MAIL_IRM("MailIrm"),
    @XmlEnumValue("MailIrmForwarded")
    MAIL_IRM_FORWARDED("MailIrmForwarded"),
    @XmlEnumValue("MailIrmReplied")
    MAIL_IRM_REPLIED("MailIrmReplied"),
    @XmlEnumValue("SmsSubmitted")
    SMS_SUBMITTED("SmsSubmitted"),
    @XmlEnumValue("SmsRoutedToDeliveryPoint")
    SMS_ROUTED_TO_DELIVERY_POINT("SmsRoutedToDeliveryPoint"),
    @XmlEnumValue("SmsRoutedToExternalMessagingSystem")
    SMS_ROUTED_TO_EXTERNAL_MESSAGING_SYSTEM("SmsRoutedToExternalMessagingSystem"),
    @XmlEnumValue("SmsDelivered")
    SMS_DELIVERED("SmsDelivered"),
    @XmlEnumValue("OutlookDefaultForContacts")
    OUTLOOK_DEFAULT_FOR_CONTACTS("OutlookDefaultForContacts"),
    @XmlEnumValue("AppointmentItem")
    APPOINTMENT_ITEM("AppointmentItem"),
    @XmlEnumValue("AppointmentRecur")
    APPOINTMENT_RECUR("AppointmentRecur"),
    @XmlEnumValue("AppointmentMeet")
    APPOINTMENT_MEET("AppointmentMeet"),
    @XmlEnumValue("AppointmentMeetRecur")
    APPOINTMENT_MEET_RECUR("AppointmentMeetRecur"),
    @XmlEnumValue("AppointmentMeetNY")
    APPOINTMENT_MEET_NY("AppointmentMeetNY"),
    @XmlEnumValue("AppointmentMeetYes")
    APPOINTMENT_MEET_YES("AppointmentMeetYes"),
    @XmlEnumValue("AppointmentMeetNo")
    APPOINTMENT_MEET_NO("AppointmentMeetNo"),
    @XmlEnumValue("AppointmentMeetMaybe")
    APPOINTMENT_MEET_MAYBE("AppointmentMeetMaybe"),
    @XmlEnumValue("AppointmentMeetCancel")
    APPOINTMENT_MEET_CANCEL("AppointmentMeetCancel"),
    @XmlEnumValue("AppointmentMeetInfo")
    APPOINTMENT_MEET_INFO("AppointmentMeetInfo"),
    @XmlEnumValue("TaskItem")
    TASK_ITEM("TaskItem"),
    @XmlEnumValue("TaskRecur")
    TASK_RECUR("TaskRecur"),
    @XmlEnumValue("TaskOwned")
    TASK_OWNED("TaskOwned"),
    @XmlEnumValue("TaskDelegated")
    TASK_DELEGATED("TaskDelegated");
    private final String value;

    IconIndexType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IconIndexType fromValue(String v) {
        for (IconIndexType c: IconIndexType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
