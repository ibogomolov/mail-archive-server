
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistinguishedFolderIdNameType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DistinguishedFolderIdNameType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="calendar"/>
 *     &lt;enumeration value="contacts"/>
 *     &lt;enumeration value="deleteditems"/>
 *     &lt;enumeration value="drafts"/>
 *     &lt;enumeration value="inbox"/>
 *     &lt;enumeration value="journal"/>
 *     &lt;enumeration value="notes"/>
 *     &lt;enumeration value="outbox"/>
 *     &lt;enumeration value="sentitems"/>
 *     &lt;enumeration value="tasks"/>
 *     &lt;enumeration value="msgfolderroot"/>
 *     &lt;enumeration value="publicfoldersroot"/>
 *     &lt;enumeration value="root"/>
 *     &lt;enumeration value="junkemail"/>
 *     &lt;enumeration value="searchfolders"/>
 *     &lt;enumeration value="voicemail"/>
 *     &lt;enumeration value="recoverableitemsroot"/>
 *     &lt;enumeration value="recoverableitemsdeletions"/>
 *     &lt;enumeration value="recoverableitemsversions"/>
 *     &lt;enumeration value="recoverableitemspurges"/>
 *     &lt;enumeration value="archiveroot"/>
 *     &lt;enumeration value="archivemsgfolderroot"/>
 *     &lt;enumeration value="archivedeleteditems"/>
 *     &lt;enumeration value="archiverecoverableitemsroot"/>
 *     &lt;enumeration value="archiverecoverableitemsdeletions"/>
 *     &lt;enumeration value="archiverecoverableitemsversions"/>
 *     &lt;enumeration value="archiverecoverableitemspurges"/>
 *     &lt;enumeration value="syncissues"/>
 *     &lt;enumeration value="conflicts"/>
 *     &lt;enumeration value="localfailures"/>
 *     &lt;enumeration value="serverfailures"/>
 *     &lt;enumeration value="recipientcache"/>
 *     &lt;enumeration value="quickcontacts"/>
 *     &lt;enumeration value="conversationhistory"/>
 *     &lt;enumeration value="adminauditlogs"/>
 *     &lt;enumeration value="todosearch"/>
 *     &lt;enumeration value="mycontacts"/>
 *     &lt;enumeration value="directory"/>
 *     &lt;enumeration value="imcontactlist"/>
 *     &lt;enumeration value="peopleconnect"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DistinguishedFolderIdNameType")
@XmlEnum
public enum DistinguishedFolderIdNameType {

    @XmlEnumValue("calendar")
    CALENDAR("calendar"),
    @XmlEnumValue("contacts")
    CONTACTS("contacts"),
    @XmlEnumValue("deleteditems")
    DELETEDITEMS("deleteditems"),
    @XmlEnumValue("drafts")
    DRAFTS("drafts"),
    @XmlEnumValue("inbox")
    INBOX("inbox"),
    @XmlEnumValue("journal")
    JOURNAL("journal"),
    @XmlEnumValue("notes")
    NOTES("notes"),
    @XmlEnumValue("outbox")
    OUTBOX("outbox"),
    @XmlEnumValue("sentitems")
    SENTITEMS("sentitems"),
    @XmlEnumValue("tasks")
    TASKS("tasks"),
    @XmlEnumValue("msgfolderroot")
    MSGFOLDERROOT("msgfolderroot"),
    @XmlEnumValue("publicfoldersroot")
    PUBLICFOLDERSROOT("publicfoldersroot"),
    @XmlEnumValue("root")
    ROOT("root"),
    @XmlEnumValue("junkemail")
    JUNKEMAIL("junkemail"),
    @XmlEnumValue("searchfolders")
    SEARCHFOLDERS("searchfolders"),
    @XmlEnumValue("voicemail")
    VOICEMAIL("voicemail"),
    @XmlEnumValue("recoverableitemsroot")
    RECOVERABLEITEMSROOT("recoverableitemsroot"),
    @XmlEnumValue("recoverableitemsdeletions")
    RECOVERABLEITEMSDELETIONS("recoverableitemsdeletions"),
    @XmlEnumValue("recoverableitemsversions")
    RECOVERABLEITEMSVERSIONS("recoverableitemsversions"),
    @XmlEnumValue("recoverableitemspurges")
    RECOVERABLEITEMSPURGES("recoverableitemspurges"),
    @XmlEnumValue("archiveroot")
    ARCHIVEROOT("archiveroot"),
    @XmlEnumValue("archivemsgfolderroot")
    ARCHIVEMSGFOLDERROOT("archivemsgfolderroot"),
    @XmlEnumValue("archivedeleteditems")
    ARCHIVEDELETEDITEMS("archivedeleteditems"),
    @XmlEnumValue("archiverecoverableitemsroot")
    ARCHIVERECOVERABLEITEMSROOT("archiverecoverableitemsroot"),
    @XmlEnumValue("archiverecoverableitemsdeletions")
    ARCHIVERECOVERABLEITEMSDELETIONS("archiverecoverableitemsdeletions"),
    @XmlEnumValue("archiverecoverableitemsversions")
    ARCHIVERECOVERABLEITEMSVERSIONS("archiverecoverableitemsversions"),
    @XmlEnumValue("archiverecoverableitemspurges")
    ARCHIVERECOVERABLEITEMSPURGES("archiverecoverableitemspurges"),
    @XmlEnumValue("syncissues")
    SYNCISSUES("syncissues"),
    @XmlEnumValue("conflicts")
    CONFLICTS("conflicts"),
    @XmlEnumValue("localfailures")
    LOCALFAILURES("localfailures"),
    @XmlEnumValue("serverfailures")
    SERVERFAILURES("serverfailures"),
    @XmlEnumValue("recipientcache")
    RECIPIENTCACHE("recipientcache"),
    @XmlEnumValue("quickcontacts")
    QUICKCONTACTS("quickcontacts"),
    @XmlEnumValue("conversationhistory")
    CONVERSATIONHISTORY("conversationhistory"),
    @XmlEnumValue("adminauditlogs")
    ADMINAUDITLOGS("adminauditlogs"),
    @XmlEnumValue("todosearch")
    TODOSEARCH("todosearch"),
    @XmlEnumValue("mycontacts")
    MYCONTACTS("mycontacts"),
    @XmlEnumValue("directory")
    DIRECTORY("directory"),
    @XmlEnumValue("imcontactlist")
    IMCONTACTLIST("imcontactlist"),
    @XmlEnumValue("peopleconnect")
    PEOPLECONNECT("peopleconnect");
    private final String value;

    DistinguishedFolderIdNameType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DistinguishedFolderIdNameType fromValue(String v) {
        for (DistinguishedFolderIdNameType c: DistinguishedFolderIdNameType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
