
package exchange.v2007sp3.ws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnindexedFieldURIType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnindexedFieldURIType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="folder:FolderId"/>
 *     &lt;enumeration value="folder:ParentFolderId"/>
 *     &lt;enumeration value="folder:DisplayName"/>
 *     &lt;enumeration value="folder:UnreadCount"/>
 *     &lt;enumeration value="folder:TotalCount"/>
 *     &lt;enumeration value="folder:ChildFolderCount"/>
 *     &lt;enumeration value="folder:FolderClass"/>
 *     &lt;enumeration value="folder:SearchParameters"/>
 *     &lt;enumeration value="folder:ManagedFolderInformation"/>
 *     &lt;enumeration value="folder:PermissionSet"/>
 *     &lt;enumeration value="folder:EffectiveRights"/>
 *     &lt;enumeration value="item:ItemId"/>
 *     &lt;enumeration value="item:ParentFolderId"/>
 *     &lt;enumeration value="item:ItemClass"/>
 *     &lt;enumeration value="item:MimeContent"/>
 *     &lt;enumeration value="item:Attachments"/>
 *     &lt;enumeration value="item:Subject"/>
 *     &lt;enumeration value="item:DateTimeReceived"/>
 *     &lt;enumeration value="item:Size"/>
 *     &lt;enumeration value="item:Categories"/>
 *     &lt;enumeration value="item:HasAttachments"/>
 *     &lt;enumeration value="item:Importance"/>
 *     &lt;enumeration value="item:InReplyTo"/>
 *     &lt;enumeration value="item:InternetMessageHeaders"/>
 *     &lt;enumeration value="item:IsDraft"/>
 *     &lt;enumeration value="item:IsFromMe"/>
 *     &lt;enumeration value="item:IsResend"/>
 *     &lt;enumeration value="item:IsSubmitted"/>
 *     &lt;enumeration value="item:IsUnmodified"/>
 *     &lt;enumeration value="item:DateTimeSent"/>
 *     &lt;enumeration value="item:DateTimeCreated"/>
 *     &lt;enumeration value="item:Body"/>
 *     &lt;enumeration value="item:ResponseObjects"/>
 *     &lt;enumeration value="item:Sensitivity"/>
 *     &lt;enumeration value="item:ReminderDueBy"/>
 *     &lt;enumeration value="item:ReminderIsSet"/>
 *     &lt;enumeration value="item:ReminderMinutesBeforeStart"/>
 *     &lt;enumeration value="item:DisplayTo"/>
 *     &lt;enumeration value="item:DisplayCc"/>
 *     &lt;enumeration value="item:Culture"/>
 *     &lt;enumeration value="item:EffectiveRights"/>
 *     &lt;enumeration value="item:LastModifiedName"/>
 *     &lt;enumeration value="item:LastModifiedTime"/>
 *     &lt;enumeration value="message:ConversationIndex"/>
 *     &lt;enumeration value="message:ConversationTopic"/>
 *     &lt;enumeration value="message:InternetMessageId"/>
 *     &lt;enumeration value="message:IsRead"/>
 *     &lt;enumeration value="message:IsResponseRequested"/>
 *     &lt;enumeration value="message:IsReadReceiptRequested"/>
 *     &lt;enumeration value="message:IsDeliveryReceiptRequested"/>
 *     &lt;enumeration value="message:ReceivedBy"/>
 *     &lt;enumeration value="message:ReceivedRepresenting"/>
 *     &lt;enumeration value="message:References"/>
 *     &lt;enumeration value="message:ReplyTo"/>
 *     &lt;enumeration value="message:From"/>
 *     &lt;enumeration value="message:Sender"/>
 *     &lt;enumeration value="message:ToRecipients"/>
 *     &lt;enumeration value="message:CcRecipients"/>
 *     &lt;enumeration value="message:BccRecipients"/>
 *     &lt;enumeration value="meeting:AssociatedCalendarItemId"/>
 *     &lt;enumeration value="meeting:IsDelegated"/>
 *     &lt;enumeration value="meeting:IsOutOfDate"/>
 *     &lt;enumeration value="meeting:HasBeenProcessed"/>
 *     &lt;enumeration value="meeting:ResponseType"/>
 *     &lt;enumeration value="meetingRequest:MeetingRequestType"/>
 *     &lt;enumeration value="meetingRequest:IntendedFreeBusyStatus"/>
 *     &lt;enumeration value="calendar:Start"/>
 *     &lt;enumeration value="calendar:End"/>
 *     &lt;enumeration value="calendar:OriginalStart"/>
 *     &lt;enumeration value="calendar:IsAllDayEvent"/>
 *     &lt;enumeration value="calendar:LegacyFreeBusyStatus"/>
 *     &lt;enumeration value="calendar:Location"/>
 *     &lt;enumeration value="calendar:When"/>
 *     &lt;enumeration value="calendar:IsMeeting"/>
 *     &lt;enumeration value="calendar:IsCancelled"/>
 *     &lt;enumeration value="calendar:IsRecurring"/>
 *     &lt;enumeration value="calendar:MeetingRequestWasSent"/>
 *     &lt;enumeration value="calendar:IsResponseRequested"/>
 *     &lt;enumeration value="calendar:CalendarItemType"/>
 *     &lt;enumeration value="calendar:MyResponseType"/>
 *     &lt;enumeration value="calendar:Organizer"/>
 *     &lt;enumeration value="calendar:RequiredAttendees"/>
 *     &lt;enumeration value="calendar:OptionalAttendees"/>
 *     &lt;enumeration value="calendar:Resources"/>
 *     &lt;enumeration value="calendar:ConflictingMeetingCount"/>
 *     &lt;enumeration value="calendar:AdjacentMeetingCount"/>
 *     &lt;enumeration value="calendar:ConflictingMeetings"/>
 *     &lt;enumeration value="calendar:AdjacentMeetings"/>
 *     &lt;enumeration value="calendar:Duration"/>
 *     &lt;enumeration value="calendar:TimeZone"/>
 *     &lt;enumeration value="calendar:AppointmentReplyTime"/>
 *     &lt;enumeration value="calendar:AppointmentSequenceNumber"/>
 *     &lt;enumeration value="calendar:AppointmentState"/>
 *     &lt;enumeration value="calendar:Recurrence"/>
 *     &lt;enumeration value="calendar:FirstOccurrence"/>
 *     &lt;enumeration value="calendar:LastOccurrence"/>
 *     &lt;enumeration value="calendar:ModifiedOccurrences"/>
 *     &lt;enumeration value="calendar:DeletedOccurrences"/>
 *     &lt;enumeration value="calendar:MeetingTimeZone"/>
 *     &lt;enumeration value="calendar:ConferenceType"/>
 *     &lt;enumeration value="calendar:AllowNewTimeProposal"/>
 *     &lt;enumeration value="calendar:IsOnlineMeeting"/>
 *     &lt;enumeration value="calendar:MeetingWorkspaceUrl"/>
 *     &lt;enumeration value="calendar:NetShowUrl"/>
 *     &lt;enumeration value="calendar:UID"/>
 *     &lt;enumeration value="calendar:RecurrenceId"/>
 *     &lt;enumeration value="calendar:DateTimeStamp"/>
 *     &lt;enumeration value="task:ActualWork"/>
 *     &lt;enumeration value="task:AssignedTime"/>
 *     &lt;enumeration value="task:BillingInformation"/>
 *     &lt;enumeration value="task:ChangeCount"/>
 *     &lt;enumeration value="task:Companies"/>
 *     &lt;enumeration value="task:CompleteDate"/>
 *     &lt;enumeration value="task:Contacts"/>
 *     &lt;enumeration value="task:DelegationState"/>
 *     &lt;enumeration value="task:Delegator"/>
 *     &lt;enumeration value="task:DueDate"/>
 *     &lt;enumeration value="task:IsAssignmentEditable"/>
 *     &lt;enumeration value="task:IsComplete"/>
 *     &lt;enumeration value="task:IsRecurring"/>
 *     &lt;enumeration value="task:IsTeamTask"/>
 *     &lt;enumeration value="task:Mileage"/>
 *     &lt;enumeration value="task:Owner"/>
 *     &lt;enumeration value="task:PercentComplete"/>
 *     &lt;enumeration value="task:Recurrence"/>
 *     &lt;enumeration value="task:StartDate"/>
 *     &lt;enumeration value="task:Status"/>
 *     &lt;enumeration value="task:StatusDescription"/>
 *     &lt;enumeration value="task:TotalWork"/>
 *     &lt;enumeration value="contacts:AssistantName"/>
 *     &lt;enumeration value="contacts:Birthday"/>
 *     &lt;enumeration value="contacts:BusinessHomePage"/>
 *     &lt;enumeration value="contacts:Children"/>
 *     &lt;enumeration value="contacts:Companies"/>
 *     &lt;enumeration value="contacts:CompanyName"/>
 *     &lt;enumeration value="contacts:CompleteName"/>
 *     &lt;enumeration value="contacts:ContactSource"/>
 *     &lt;enumeration value="contacts:Culture"/>
 *     &lt;enumeration value="contacts:Department"/>
 *     &lt;enumeration value="contacts:DisplayName"/>
 *     &lt;enumeration value="contacts:EmailAddresses"/>
 *     &lt;enumeration value="contacts:FileAs"/>
 *     &lt;enumeration value="contacts:FileAsMapping"/>
 *     &lt;enumeration value="contacts:Generation"/>
 *     &lt;enumeration value="contacts:GivenName"/>
 *     &lt;enumeration value="contacts:ImAddresses"/>
 *     &lt;enumeration value="contacts:Initials"/>
 *     &lt;enumeration value="contacts:JobTitle"/>
 *     &lt;enumeration value="contacts:Manager"/>
 *     &lt;enumeration value="contacts:MiddleName"/>
 *     &lt;enumeration value="contacts:Mileage"/>
 *     &lt;enumeration value="contacts:Nickname"/>
 *     &lt;enumeration value="contacts:OfficeLocation"/>
 *     &lt;enumeration value="contacts:PhoneNumbers"/>
 *     &lt;enumeration value="contacts:PhysicalAddresses"/>
 *     &lt;enumeration value="contacts:PostalAddressIndex"/>
 *     &lt;enumeration value="contacts:Profession"/>
 *     &lt;enumeration value="contacts:SpouseName"/>
 *     &lt;enumeration value="contacts:Surname"/>
 *     &lt;enumeration value="contacts:WeddingAnniversary"/>
 *     &lt;enumeration value="postitem:PostedTime"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnindexedFieldURIType")
@XmlEnum
public enum UnindexedFieldURIType {

    @XmlEnumValue("folder:FolderId")
    FOLDER_FOLDER_ID("folder:FolderId"),
    @XmlEnumValue("folder:ParentFolderId")
    FOLDER_PARENT_FOLDER_ID("folder:ParentFolderId"),
    @XmlEnumValue("folder:DisplayName")
    FOLDER_DISPLAY_NAME("folder:DisplayName"),
    @XmlEnumValue("folder:UnreadCount")
    FOLDER_UNREAD_COUNT("folder:UnreadCount"),
    @XmlEnumValue("folder:TotalCount")
    FOLDER_TOTAL_COUNT("folder:TotalCount"),
    @XmlEnumValue("folder:ChildFolderCount")
    FOLDER_CHILD_FOLDER_COUNT("folder:ChildFolderCount"),
    @XmlEnumValue("folder:FolderClass")
    FOLDER_FOLDER_CLASS("folder:FolderClass"),
    @XmlEnumValue("folder:SearchParameters")
    FOLDER_SEARCH_PARAMETERS("folder:SearchParameters"),
    @XmlEnumValue("folder:ManagedFolderInformation")
    FOLDER_MANAGED_FOLDER_INFORMATION("folder:ManagedFolderInformation"),
    @XmlEnumValue("folder:PermissionSet")
    FOLDER_PERMISSION_SET("folder:PermissionSet"),
    @XmlEnumValue("folder:EffectiveRights")
    FOLDER_EFFECTIVE_RIGHTS("folder:EffectiveRights"),
    @XmlEnumValue("item:ItemId")
    ITEM_ITEM_ID("item:ItemId"),
    @XmlEnumValue("item:ParentFolderId")
    ITEM_PARENT_FOLDER_ID("item:ParentFolderId"),
    @XmlEnumValue("item:ItemClass")
    ITEM_ITEM_CLASS("item:ItemClass"),
    @XmlEnumValue("item:MimeContent")
    ITEM_MIME_CONTENT("item:MimeContent"),
    @XmlEnumValue("item:Attachments")
    ITEM_ATTACHMENTS("item:Attachments"),
    @XmlEnumValue("item:Subject")
    ITEM_SUBJECT("item:Subject"),
    @XmlEnumValue("item:DateTimeReceived")
    ITEM_DATE_TIME_RECEIVED("item:DateTimeReceived"),
    @XmlEnumValue("item:Size")
    ITEM_SIZE("item:Size"),
    @XmlEnumValue("item:Categories")
    ITEM_CATEGORIES("item:Categories"),
    @XmlEnumValue("item:HasAttachments")
    ITEM_HAS_ATTACHMENTS("item:HasAttachments"),
    @XmlEnumValue("item:Importance")
    ITEM_IMPORTANCE("item:Importance"),
    @XmlEnumValue("item:InReplyTo")
    ITEM_IN_REPLY_TO("item:InReplyTo"),
    @XmlEnumValue("item:InternetMessageHeaders")
    ITEM_INTERNET_MESSAGE_HEADERS("item:InternetMessageHeaders"),
    @XmlEnumValue("item:IsDraft")
    ITEM_IS_DRAFT("item:IsDraft"),
    @XmlEnumValue("item:IsFromMe")
    ITEM_IS_FROM_ME("item:IsFromMe"),
    @XmlEnumValue("item:IsResend")
    ITEM_IS_RESEND("item:IsResend"),
    @XmlEnumValue("item:IsSubmitted")
    ITEM_IS_SUBMITTED("item:IsSubmitted"),
    @XmlEnumValue("item:IsUnmodified")
    ITEM_IS_UNMODIFIED("item:IsUnmodified"),
    @XmlEnumValue("item:DateTimeSent")
    ITEM_DATE_TIME_SENT("item:DateTimeSent"),
    @XmlEnumValue("item:DateTimeCreated")
    ITEM_DATE_TIME_CREATED("item:DateTimeCreated"),
    @XmlEnumValue("item:Body")
    ITEM_BODY("item:Body"),
    @XmlEnumValue("item:ResponseObjects")
    ITEM_RESPONSE_OBJECTS("item:ResponseObjects"),
    @XmlEnumValue("item:Sensitivity")
    ITEM_SENSITIVITY("item:Sensitivity"),
    @XmlEnumValue("item:ReminderDueBy")
    ITEM_REMINDER_DUE_BY("item:ReminderDueBy"),
    @XmlEnumValue("item:ReminderIsSet")
    ITEM_REMINDER_IS_SET("item:ReminderIsSet"),
    @XmlEnumValue("item:ReminderMinutesBeforeStart")
    ITEM_REMINDER_MINUTES_BEFORE_START("item:ReminderMinutesBeforeStart"),
    @XmlEnumValue("item:DisplayTo")
    ITEM_DISPLAY_TO("item:DisplayTo"),
    @XmlEnumValue("item:DisplayCc")
    ITEM_DISPLAY_CC("item:DisplayCc"),
    @XmlEnumValue("item:Culture")
    ITEM_CULTURE("item:Culture"),
    @XmlEnumValue("item:EffectiveRights")
    ITEM_EFFECTIVE_RIGHTS("item:EffectiveRights"),
    @XmlEnumValue("item:LastModifiedName")
    ITEM_LAST_MODIFIED_NAME("item:LastModifiedName"),
    @XmlEnumValue("item:LastModifiedTime")
    ITEM_LAST_MODIFIED_TIME("item:LastModifiedTime"),
    @XmlEnumValue("message:ConversationIndex")
    MESSAGE_CONVERSATION_INDEX("message:ConversationIndex"),
    @XmlEnumValue("message:ConversationTopic")
    MESSAGE_CONVERSATION_TOPIC("message:ConversationTopic"),
    @XmlEnumValue("message:InternetMessageId")
    MESSAGE_INTERNET_MESSAGE_ID("message:InternetMessageId"),
    @XmlEnumValue("message:IsRead")
    MESSAGE_IS_READ("message:IsRead"),
    @XmlEnumValue("message:IsResponseRequested")
    MESSAGE_IS_RESPONSE_REQUESTED("message:IsResponseRequested"),
    @XmlEnumValue("message:IsReadReceiptRequested")
    MESSAGE_IS_READ_RECEIPT_REQUESTED("message:IsReadReceiptRequested"),
    @XmlEnumValue("message:IsDeliveryReceiptRequested")
    MESSAGE_IS_DELIVERY_RECEIPT_REQUESTED("message:IsDeliveryReceiptRequested"),
    @XmlEnumValue("message:ReceivedBy")
    MESSAGE_RECEIVED_BY("message:ReceivedBy"),
    @XmlEnumValue("message:ReceivedRepresenting")
    MESSAGE_RECEIVED_REPRESENTING("message:ReceivedRepresenting"),
    @XmlEnumValue("message:References")
    MESSAGE_REFERENCES("message:References"),
    @XmlEnumValue("message:ReplyTo")
    MESSAGE_REPLY_TO("message:ReplyTo"),
    @XmlEnumValue("message:From")
    MESSAGE_FROM("message:From"),
    @XmlEnumValue("message:Sender")
    MESSAGE_SENDER("message:Sender"),
    @XmlEnumValue("message:ToRecipients")
    MESSAGE_TO_RECIPIENTS("message:ToRecipients"),
    @XmlEnumValue("message:CcRecipients")
    MESSAGE_CC_RECIPIENTS("message:CcRecipients"),
    @XmlEnumValue("message:BccRecipients")
    MESSAGE_BCC_RECIPIENTS("message:BccRecipients"),
    @XmlEnumValue("meeting:AssociatedCalendarItemId")
    MEETING_ASSOCIATED_CALENDAR_ITEM_ID("meeting:AssociatedCalendarItemId"),
    @XmlEnumValue("meeting:IsDelegated")
    MEETING_IS_DELEGATED("meeting:IsDelegated"),
    @XmlEnumValue("meeting:IsOutOfDate")
    MEETING_IS_OUT_OF_DATE("meeting:IsOutOfDate"),
    @XmlEnumValue("meeting:HasBeenProcessed")
    MEETING_HAS_BEEN_PROCESSED("meeting:HasBeenProcessed"),
    @XmlEnumValue("meeting:ResponseType")
    MEETING_RESPONSE_TYPE("meeting:ResponseType"),
    @XmlEnumValue("meetingRequest:MeetingRequestType")
    MEETING_REQUEST_MEETING_REQUEST_TYPE("meetingRequest:MeetingRequestType"),
    @XmlEnumValue("meetingRequest:IntendedFreeBusyStatus")
    MEETING_REQUEST_INTENDED_FREE_BUSY_STATUS("meetingRequest:IntendedFreeBusyStatus"),
    @XmlEnumValue("calendar:Start")
    CALENDAR_START("calendar:Start"),
    @XmlEnumValue("calendar:End")
    CALENDAR_END("calendar:End"),
    @XmlEnumValue("calendar:OriginalStart")
    CALENDAR_ORIGINAL_START("calendar:OriginalStart"),
    @XmlEnumValue("calendar:IsAllDayEvent")
    CALENDAR_IS_ALL_DAY_EVENT("calendar:IsAllDayEvent"),
    @XmlEnumValue("calendar:LegacyFreeBusyStatus")
    CALENDAR_LEGACY_FREE_BUSY_STATUS("calendar:LegacyFreeBusyStatus"),
    @XmlEnumValue("calendar:Location")
    CALENDAR_LOCATION("calendar:Location"),
    @XmlEnumValue("calendar:When")
    CALENDAR_WHEN("calendar:When"),
    @XmlEnumValue("calendar:IsMeeting")
    CALENDAR_IS_MEETING("calendar:IsMeeting"),
    @XmlEnumValue("calendar:IsCancelled")
    CALENDAR_IS_CANCELLED("calendar:IsCancelled"),
    @XmlEnumValue("calendar:IsRecurring")
    CALENDAR_IS_RECURRING("calendar:IsRecurring"),
    @XmlEnumValue("calendar:MeetingRequestWasSent")
    CALENDAR_MEETING_REQUEST_WAS_SENT("calendar:MeetingRequestWasSent"),
    @XmlEnumValue("calendar:IsResponseRequested")
    CALENDAR_IS_RESPONSE_REQUESTED("calendar:IsResponseRequested"),
    @XmlEnumValue("calendar:CalendarItemType")
    CALENDAR_CALENDAR_ITEM_TYPE("calendar:CalendarItemType"),
    @XmlEnumValue("calendar:MyResponseType")
    CALENDAR_MY_RESPONSE_TYPE("calendar:MyResponseType"),
    @XmlEnumValue("calendar:Organizer")
    CALENDAR_ORGANIZER("calendar:Organizer"),
    @XmlEnumValue("calendar:RequiredAttendees")
    CALENDAR_REQUIRED_ATTENDEES("calendar:RequiredAttendees"),
    @XmlEnumValue("calendar:OptionalAttendees")
    CALENDAR_OPTIONAL_ATTENDEES("calendar:OptionalAttendees"),
    @XmlEnumValue("calendar:Resources")
    CALENDAR_RESOURCES("calendar:Resources"),
    @XmlEnumValue("calendar:ConflictingMeetingCount")
    CALENDAR_CONFLICTING_MEETING_COUNT("calendar:ConflictingMeetingCount"),
    @XmlEnumValue("calendar:AdjacentMeetingCount")
    CALENDAR_ADJACENT_MEETING_COUNT("calendar:AdjacentMeetingCount"),
    @XmlEnumValue("calendar:ConflictingMeetings")
    CALENDAR_CONFLICTING_MEETINGS("calendar:ConflictingMeetings"),
    @XmlEnumValue("calendar:AdjacentMeetings")
    CALENDAR_ADJACENT_MEETINGS("calendar:AdjacentMeetings"),
    @XmlEnumValue("calendar:Duration")
    CALENDAR_DURATION("calendar:Duration"),
    @XmlEnumValue("calendar:TimeZone")
    CALENDAR_TIME_ZONE("calendar:TimeZone"),
    @XmlEnumValue("calendar:AppointmentReplyTime")
    CALENDAR_APPOINTMENT_REPLY_TIME("calendar:AppointmentReplyTime"),
    @XmlEnumValue("calendar:AppointmentSequenceNumber")
    CALENDAR_APPOINTMENT_SEQUENCE_NUMBER("calendar:AppointmentSequenceNumber"),
    @XmlEnumValue("calendar:AppointmentState")
    CALENDAR_APPOINTMENT_STATE("calendar:AppointmentState"),
    @XmlEnumValue("calendar:Recurrence")
    CALENDAR_RECURRENCE("calendar:Recurrence"),
    @XmlEnumValue("calendar:FirstOccurrence")
    CALENDAR_FIRST_OCCURRENCE("calendar:FirstOccurrence"),
    @XmlEnumValue("calendar:LastOccurrence")
    CALENDAR_LAST_OCCURRENCE("calendar:LastOccurrence"),
    @XmlEnumValue("calendar:ModifiedOccurrences")
    CALENDAR_MODIFIED_OCCURRENCES("calendar:ModifiedOccurrences"),
    @XmlEnumValue("calendar:DeletedOccurrences")
    CALENDAR_DELETED_OCCURRENCES("calendar:DeletedOccurrences"),
    @XmlEnumValue("calendar:MeetingTimeZone")
    CALENDAR_MEETING_TIME_ZONE("calendar:MeetingTimeZone"),
    @XmlEnumValue("calendar:ConferenceType")
    CALENDAR_CONFERENCE_TYPE("calendar:ConferenceType"),
    @XmlEnumValue("calendar:AllowNewTimeProposal")
    CALENDAR_ALLOW_NEW_TIME_PROPOSAL("calendar:AllowNewTimeProposal"),
    @XmlEnumValue("calendar:IsOnlineMeeting")
    CALENDAR_IS_ONLINE_MEETING("calendar:IsOnlineMeeting"),
    @XmlEnumValue("calendar:MeetingWorkspaceUrl")
    CALENDAR_MEETING_WORKSPACE_URL("calendar:MeetingWorkspaceUrl"),
    @XmlEnumValue("calendar:NetShowUrl")
    CALENDAR_NET_SHOW_URL("calendar:NetShowUrl"),
    @XmlEnumValue("calendar:UID")
    CALENDAR_UID("calendar:UID"),
    @XmlEnumValue("calendar:RecurrenceId")
    CALENDAR_RECURRENCE_ID("calendar:RecurrenceId"),
    @XmlEnumValue("calendar:DateTimeStamp")
    CALENDAR_DATE_TIME_STAMP("calendar:DateTimeStamp"),
    @XmlEnumValue("task:ActualWork")
    TASK_ACTUAL_WORK("task:ActualWork"),
    @XmlEnumValue("task:AssignedTime")
    TASK_ASSIGNED_TIME("task:AssignedTime"),
    @XmlEnumValue("task:BillingInformation")
    TASK_BILLING_INFORMATION("task:BillingInformation"),
    @XmlEnumValue("task:ChangeCount")
    TASK_CHANGE_COUNT("task:ChangeCount"),
    @XmlEnumValue("task:Companies")
    TASK_COMPANIES("task:Companies"),
    @XmlEnumValue("task:CompleteDate")
    TASK_COMPLETE_DATE("task:CompleteDate"),
    @XmlEnumValue("task:Contacts")
    TASK_CONTACTS("task:Contacts"),
    @XmlEnumValue("task:DelegationState")
    TASK_DELEGATION_STATE("task:DelegationState"),
    @XmlEnumValue("task:Delegator")
    TASK_DELEGATOR("task:Delegator"),
    @XmlEnumValue("task:DueDate")
    TASK_DUE_DATE("task:DueDate"),
    @XmlEnumValue("task:IsAssignmentEditable")
    TASK_IS_ASSIGNMENT_EDITABLE("task:IsAssignmentEditable"),
    @XmlEnumValue("task:IsComplete")
    TASK_IS_COMPLETE("task:IsComplete"),
    @XmlEnumValue("task:IsRecurring")
    TASK_IS_RECURRING("task:IsRecurring"),
    @XmlEnumValue("task:IsTeamTask")
    TASK_IS_TEAM_TASK("task:IsTeamTask"),
    @XmlEnumValue("task:Mileage")
    TASK_MILEAGE("task:Mileage"),
    @XmlEnumValue("task:Owner")
    TASK_OWNER("task:Owner"),
    @XmlEnumValue("task:PercentComplete")
    TASK_PERCENT_COMPLETE("task:PercentComplete"),
    @XmlEnumValue("task:Recurrence")
    TASK_RECURRENCE("task:Recurrence"),
    @XmlEnumValue("task:StartDate")
    TASK_START_DATE("task:StartDate"),
    @XmlEnumValue("task:Status")
    TASK_STATUS("task:Status"),
    @XmlEnumValue("task:StatusDescription")
    TASK_STATUS_DESCRIPTION("task:StatusDescription"),
    @XmlEnumValue("task:TotalWork")
    TASK_TOTAL_WORK("task:TotalWork"),
    @XmlEnumValue("contacts:AssistantName")
    CONTACTS_ASSISTANT_NAME("contacts:AssistantName"),
    @XmlEnumValue("contacts:Birthday")
    CONTACTS_BIRTHDAY("contacts:Birthday"),
    @XmlEnumValue("contacts:BusinessHomePage")
    CONTACTS_BUSINESS_HOME_PAGE("contacts:BusinessHomePage"),
    @XmlEnumValue("contacts:Children")
    CONTACTS_CHILDREN("contacts:Children"),
    @XmlEnumValue("contacts:Companies")
    CONTACTS_COMPANIES("contacts:Companies"),
    @XmlEnumValue("contacts:CompanyName")
    CONTACTS_COMPANY_NAME("contacts:CompanyName"),
    @XmlEnumValue("contacts:CompleteName")
    CONTACTS_COMPLETE_NAME("contacts:CompleteName"),
    @XmlEnumValue("contacts:ContactSource")
    CONTACTS_CONTACT_SOURCE("contacts:ContactSource"),
    @XmlEnumValue("contacts:Culture")
    CONTACTS_CULTURE("contacts:Culture"),
    @XmlEnumValue("contacts:Department")
    CONTACTS_DEPARTMENT("contacts:Department"),
    @XmlEnumValue("contacts:DisplayName")
    CONTACTS_DISPLAY_NAME("contacts:DisplayName"),
    @XmlEnumValue("contacts:EmailAddresses")
    CONTACTS_EMAIL_ADDRESSES("contacts:EmailAddresses"),
    @XmlEnumValue("contacts:FileAs")
    CONTACTS_FILE_AS("contacts:FileAs"),
    @XmlEnumValue("contacts:FileAsMapping")
    CONTACTS_FILE_AS_MAPPING("contacts:FileAsMapping"),
    @XmlEnumValue("contacts:Generation")
    CONTACTS_GENERATION("contacts:Generation"),
    @XmlEnumValue("contacts:GivenName")
    CONTACTS_GIVEN_NAME("contacts:GivenName"),
    @XmlEnumValue("contacts:ImAddresses")
    CONTACTS_IM_ADDRESSES("contacts:ImAddresses"),
    @XmlEnumValue("contacts:Initials")
    CONTACTS_INITIALS("contacts:Initials"),
    @XmlEnumValue("contacts:JobTitle")
    CONTACTS_JOB_TITLE("contacts:JobTitle"),
    @XmlEnumValue("contacts:Manager")
    CONTACTS_MANAGER("contacts:Manager"),
    @XmlEnumValue("contacts:MiddleName")
    CONTACTS_MIDDLE_NAME("contacts:MiddleName"),
    @XmlEnumValue("contacts:Mileage")
    CONTACTS_MILEAGE("contacts:Mileage"),
    @XmlEnumValue("contacts:Nickname")
    CONTACTS_NICKNAME("contacts:Nickname"),
    @XmlEnumValue("contacts:OfficeLocation")
    CONTACTS_OFFICE_LOCATION("contacts:OfficeLocation"),
    @XmlEnumValue("contacts:PhoneNumbers")
    CONTACTS_PHONE_NUMBERS("contacts:PhoneNumbers"),
    @XmlEnumValue("contacts:PhysicalAddresses")
    CONTACTS_PHYSICAL_ADDRESSES("contacts:PhysicalAddresses"),
    @XmlEnumValue("contacts:PostalAddressIndex")
    CONTACTS_POSTAL_ADDRESS_INDEX("contacts:PostalAddressIndex"),
    @XmlEnumValue("contacts:Profession")
    CONTACTS_PROFESSION("contacts:Profession"),
    @XmlEnumValue("contacts:SpouseName")
    CONTACTS_SPOUSE_NAME("contacts:SpouseName"),
    @XmlEnumValue("contacts:Surname")
    CONTACTS_SURNAME("contacts:Surname"),
    @XmlEnumValue("contacts:WeddingAnniversary")
    CONTACTS_WEDDING_ANNIVERSARY("contacts:WeddingAnniversary"),
    @XmlEnumValue("postitem:PostedTime")
    POSTITEM_POSTED_TIME("postitem:PostedTime");
    private final String value;

    UnindexedFieldURIType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnindexedFieldURIType fromValue(String v) {
        for (UnindexedFieldURIType c: UnindexedFieldURIType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
