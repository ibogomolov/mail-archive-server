
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElcFolderType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ElcFolderType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Calendar"/>
 *     &lt;enumeration value="Contacts"/>
 *     &lt;enumeration value="DeletedItems"/>
 *     &lt;enumeration value="Drafts"/>
 *     &lt;enumeration value="Inbox"/>
 *     &lt;enumeration value="JunkEmail"/>
 *     &lt;enumeration value="Journal"/>
 *     &lt;enumeration value="Notes"/>
 *     &lt;enumeration value="Outbox"/>
 *     &lt;enumeration value="SentItems"/>
 *     &lt;enumeration value="Tasks"/>
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="ManagedCustomFolder"/>
 *     &lt;enumeration value="RssSubscriptions"/>
 *     &lt;enumeration value="SyncIssues"/>
 *     &lt;enumeration value="ConversationHistory"/>
 *     &lt;enumeration value="Personal"/>
 *     &lt;enumeration value="RecoverableItems"/>
 *     &lt;enumeration value="NonIpmRoot"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ElcFolderType")
@XmlEnum
public enum ElcFolderType {

    @XmlEnumValue("Calendar")
    CALENDAR("Calendar"),
    @XmlEnumValue("Contacts")
    CONTACTS("Contacts"),
    @XmlEnumValue("DeletedItems")
    DELETED_ITEMS("DeletedItems"),
    @XmlEnumValue("Drafts")
    DRAFTS("Drafts"),
    @XmlEnumValue("Inbox")
    INBOX("Inbox"),
    @XmlEnumValue("JunkEmail")
    JUNK_EMAIL("JunkEmail"),
    @XmlEnumValue("Journal")
    JOURNAL("Journal"),
    @XmlEnumValue("Notes")
    NOTES("Notes"),
    @XmlEnumValue("Outbox")
    OUTBOX("Outbox"),
    @XmlEnumValue("SentItems")
    SENT_ITEMS("SentItems"),
    @XmlEnumValue("Tasks")
    TASKS("Tasks"),
    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("ManagedCustomFolder")
    MANAGED_CUSTOM_FOLDER("ManagedCustomFolder"),
    @XmlEnumValue("RssSubscriptions")
    RSS_SUBSCRIPTIONS("RssSubscriptions"),
    @XmlEnumValue("SyncIssues")
    SYNC_ISSUES("SyncIssues"),
    @XmlEnumValue("ConversationHistory")
    CONVERSATION_HISTORY("ConversationHistory"),
    @XmlEnumValue("Personal")
    PERSONAL("Personal"),
    @XmlEnumValue("RecoverableItems")
    RECOVERABLE_ITEMS("RecoverableItems"),
    @XmlEnumValue("NonIpmRoot")
    NON_IPM_ROOT("NonIpmRoot");
    private final String value;

    ElcFolderType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ElcFolderType fromValue(String v) {
        for (ElcFolderType c: ElcFolderType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
