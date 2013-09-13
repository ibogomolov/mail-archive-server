
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PersonaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonaId" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType"/>
 *         &lt;element name="PersonaType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonaObjectStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Bodies" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfBodyContentAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="DisplayNameFirstLastSortKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplayNameLastFirstSortKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyNameSortKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HomeCitySortKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkCitySortKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplayNameFirstLastHeader" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplayNameLastFirstHeader" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplayNameFirstLast" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplayNameLastFirst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FileAs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FileAsId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplayNamePrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Generation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nickname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="YomiCompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="YomiFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="YomiLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailAddress" type="{http://schemas.microsoft.com/exchange/services/2006/types}EmailAddressType" minOccurs="0"/>
 *         &lt;element name="EmailAddresses" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfEmailAddressesType" minOccurs="0"/>
 *         &lt;element name="PhoneNumber" type="{http://schemas.microsoft.com/exchange/services/2006/types}PersonaPhoneNumberType" minOccurs="0"/>
 *         &lt;element name="ImAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HomeCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelevanceScore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FolderIds" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfFolderIdType" minOccurs="0"/>
 *         &lt;element name="Attributions" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPersonaAttributionsType" minOccurs="0"/>
 *         &lt;element name="DisplayNames" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="FileAses" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="FileAsIds" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="DisplayNamePrefixes" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="GivenNames" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="MiddleNames" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="Surnames" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="Generations" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="Nicknames" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="Initials" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="YomiCompanyNames" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="YomiFirstNames" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="YomiLastNames" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="BusinessPhoneNumbers" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPhoneNumberAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="BusinessPhoneNumbers2" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPhoneNumberAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="HomePhones" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPhoneNumberAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="HomePhones2" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPhoneNumberAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="MobilePhones" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPhoneNumberAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="MobilePhones2" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPhoneNumberAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="AssistantPhoneNumbers" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPhoneNumberAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="CallbackPhones" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPhoneNumberAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="CarPhones" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPhoneNumberAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="HomeFaxes" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPhoneNumberAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="OrganizationMainPhones" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPhoneNumberAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="OtherFaxes" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPhoneNumberAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="OtherTelephones" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPhoneNumberAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="OtherPhones2" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPhoneNumberAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="Pagers" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPhoneNumberAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="RadioPhones" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPhoneNumberAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="TelexNumbers" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPhoneNumberAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="TTYTDDPhoneNumbers" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPhoneNumberAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="WorkFaxes" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPhoneNumberAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="Emails1" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfEmailAddressAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="Emails2" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfEmailAddressAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="Emails3" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfEmailAddressAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="BusinessHomePages" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="PersonalHomePages" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="OfficeLocations" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="ImAddresses" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="ImAddresses2" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="ImAddresses3" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="BusinessAddresses" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPostalAddressAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="HomeAddresses" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPostalAddressAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="OtherAddresses" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPostalAddressAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="Titles" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="Departments" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="CompanyNames" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="Managers" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="AssistantNames" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="Professions" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="SpouseNames" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="Children" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringArrayAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="Schools" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="Hobbies" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="WeddingAnniversaries" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="Birthdays" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="Locations" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/>
 *         &lt;element name="ExtendedProperties" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfExtendedPropertyAttributedValueType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonaType", propOrder = {
    "personaId",
    "personaType",
    "personaObjectStatus",
    "creationTime",
    "bodies",
    "displayNameFirstLastSortKey",
    "displayNameLastFirstSortKey",
    "companyNameSortKey",
    "homeCitySortKey",
    "workCitySortKey",
    "displayNameFirstLastHeader",
    "displayNameLastFirstHeader",
    "displayName",
    "displayNameFirstLast",
    "displayNameLastFirst",
    "fileAs",
    "fileAsId",
    "displayNamePrefix",
    "givenName",
    "middleName",
    "surname",
    "generation",
    "nickname",
    "yomiCompanyName",
    "yomiFirstName",
    "yomiLastName",
    "title",
    "department",
    "companyName",
    "location",
    "emailAddress",
    "emailAddresses",
    "phoneNumber",
    "imAddress",
    "homeCity",
    "workCity",
    "relevanceScore",
    "folderIds",
    "attributions",
    "displayNames",
    "fileAses",
    "fileAsIds",
    "displayNamePrefixes",
    "givenNames",
    "middleNames",
    "surnames",
    "generations",
    "nicknames",
    "initials",
    "yomiCompanyNames",
    "yomiFirstNames",
    "yomiLastNames",
    "businessPhoneNumbers",
    "businessPhoneNumbers2",
    "homePhones",
    "homePhones2",
    "mobilePhones",
    "mobilePhones2",
    "assistantPhoneNumbers",
    "callbackPhones",
    "carPhones",
    "homeFaxes",
    "organizationMainPhones",
    "otherFaxes",
    "otherTelephones",
    "otherPhones2",
    "pagers",
    "radioPhones",
    "telexNumbers",
    "ttytddPhoneNumbers",
    "workFaxes",
    "emails1",
    "emails2",
    "emails3",
    "businessHomePages",
    "personalHomePages",
    "officeLocations",
    "imAddresses",
    "imAddresses2",
    "imAddresses3",
    "businessAddresses",
    "homeAddresses",
    "otherAddresses",
    "titles",
    "departments",
    "companyNames",
    "managers",
    "assistantNames",
    "professions",
    "spouseNames",
    "children",
    "schools",
    "hobbies",
    "weddingAnniversaries",
    "birthdays",
    "locations",
    "extendedProperties"
})
public class PersonaType {

    @XmlElement(name = "PersonaId", required = true)
    protected ItemIdType personaId;
    @XmlElement(name = "PersonaType")
    protected String personaType;
    @XmlElement(name = "PersonaObjectStatus")
    protected String personaObjectStatus;
    @XmlElement(name = "CreationTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationTime;
    @XmlElement(name = "Bodies")
    protected ArrayOfBodyContentAttributedValuesType bodies;
    @XmlElement(name = "DisplayNameFirstLastSortKey")
    protected String displayNameFirstLastSortKey;
    @XmlElement(name = "DisplayNameLastFirstSortKey")
    protected String displayNameLastFirstSortKey;
    @XmlElement(name = "CompanyNameSortKey")
    protected String companyNameSortKey;
    @XmlElement(name = "HomeCitySortKey")
    protected String homeCitySortKey;
    @XmlElement(name = "WorkCitySortKey")
    protected String workCitySortKey;
    @XmlElement(name = "DisplayNameFirstLastHeader")
    protected String displayNameFirstLastHeader;
    @XmlElement(name = "DisplayNameLastFirstHeader")
    protected String displayNameLastFirstHeader;
    @XmlElement(name = "DisplayName")
    protected String displayName;
    @XmlElement(name = "DisplayNameFirstLast")
    protected String displayNameFirstLast;
    @XmlElement(name = "DisplayNameLastFirst")
    protected String displayNameLastFirst;
    @XmlElement(name = "FileAs")
    protected String fileAs;
    @XmlElement(name = "FileAsId")
    protected String fileAsId;
    @XmlElement(name = "DisplayNamePrefix")
    protected String displayNamePrefix;
    @XmlElement(name = "GivenName")
    protected String givenName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "Surname")
    protected String surname;
    @XmlElement(name = "Generation")
    protected String generation;
    @XmlElement(name = "Nickname")
    protected String nickname;
    @XmlElement(name = "YomiCompanyName")
    protected String yomiCompanyName;
    @XmlElement(name = "YomiFirstName")
    protected String yomiFirstName;
    @XmlElement(name = "YomiLastName")
    protected String yomiLastName;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "Department")
    protected String department;
    @XmlElement(name = "CompanyName")
    protected String companyName;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "EmailAddress")
    protected EmailAddressType emailAddress;
    @XmlElement(name = "EmailAddresses")
    protected ArrayOfEmailAddressesType emailAddresses;
    @XmlElement(name = "PhoneNumber")
    protected PersonaPhoneNumberType phoneNumber;
    @XmlElement(name = "ImAddress")
    protected String imAddress;
    @XmlElement(name = "HomeCity")
    protected String homeCity;
    @XmlElement(name = "WorkCity")
    protected String workCity;
    @XmlElement(name = "RelevanceScore")
    protected Integer relevanceScore;
    @XmlElement(name = "FolderIds")
    protected ArrayOfFolderIdType folderIds;
    @XmlElement(name = "Attributions")
    protected ArrayOfPersonaAttributionsType attributions;
    @XmlElement(name = "DisplayNames")
    protected ArrayOfStringAttributedValuesType displayNames;
    @XmlElement(name = "FileAses")
    protected ArrayOfStringAttributedValuesType fileAses;
    @XmlElement(name = "FileAsIds")
    protected ArrayOfStringAttributedValuesType fileAsIds;
    @XmlElement(name = "DisplayNamePrefixes")
    protected ArrayOfStringAttributedValuesType displayNamePrefixes;
    @XmlElement(name = "GivenNames")
    protected ArrayOfStringAttributedValuesType givenNames;
    @XmlElement(name = "MiddleNames")
    protected ArrayOfStringAttributedValuesType middleNames;
    @XmlElement(name = "Surnames")
    protected ArrayOfStringAttributedValuesType surnames;
    @XmlElement(name = "Generations")
    protected ArrayOfStringAttributedValuesType generations;
    @XmlElement(name = "Nicknames")
    protected ArrayOfStringAttributedValuesType nicknames;
    @XmlElement(name = "Initials")
    protected ArrayOfStringAttributedValuesType initials;
    @XmlElement(name = "YomiCompanyNames")
    protected ArrayOfStringAttributedValuesType yomiCompanyNames;
    @XmlElement(name = "YomiFirstNames")
    protected ArrayOfStringAttributedValuesType yomiFirstNames;
    @XmlElement(name = "YomiLastNames")
    protected ArrayOfStringAttributedValuesType yomiLastNames;
    @XmlElement(name = "BusinessPhoneNumbers")
    protected ArrayOfPhoneNumberAttributedValuesType businessPhoneNumbers;
    @XmlElement(name = "BusinessPhoneNumbers2")
    protected ArrayOfPhoneNumberAttributedValuesType businessPhoneNumbers2;
    @XmlElement(name = "HomePhones")
    protected ArrayOfPhoneNumberAttributedValuesType homePhones;
    @XmlElement(name = "HomePhones2")
    protected ArrayOfPhoneNumberAttributedValuesType homePhones2;
    @XmlElement(name = "MobilePhones")
    protected ArrayOfPhoneNumberAttributedValuesType mobilePhones;
    @XmlElement(name = "MobilePhones2")
    protected ArrayOfPhoneNumberAttributedValuesType mobilePhones2;
    @XmlElement(name = "AssistantPhoneNumbers")
    protected ArrayOfPhoneNumberAttributedValuesType assistantPhoneNumbers;
    @XmlElement(name = "CallbackPhones")
    protected ArrayOfPhoneNumberAttributedValuesType callbackPhones;
    @XmlElement(name = "CarPhones")
    protected ArrayOfPhoneNumberAttributedValuesType carPhones;
    @XmlElement(name = "HomeFaxes")
    protected ArrayOfPhoneNumberAttributedValuesType homeFaxes;
    @XmlElement(name = "OrganizationMainPhones")
    protected ArrayOfPhoneNumberAttributedValuesType organizationMainPhones;
    @XmlElement(name = "OtherFaxes")
    protected ArrayOfPhoneNumberAttributedValuesType otherFaxes;
    @XmlElement(name = "OtherTelephones")
    protected ArrayOfPhoneNumberAttributedValuesType otherTelephones;
    @XmlElement(name = "OtherPhones2")
    protected ArrayOfPhoneNumberAttributedValuesType otherPhones2;
    @XmlElement(name = "Pagers")
    protected ArrayOfPhoneNumberAttributedValuesType pagers;
    @XmlElement(name = "RadioPhones")
    protected ArrayOfPhoneNumberAttributedValuesType radioPhones;
    @XmlElement(name = "TelexNumbers")
    protected ArrayOfPhoneNumberAttributedValuesType telexNumbers;
    @XmlElement(name = "TTYTDDPhoneNumbers")
    protected ArrayOfPhoneNumberAttributedValuesType ttytddPhoneNumbers;
    @XmlElement(name = "WorkFaxes")
    protected ArrayOfPhoneNumberAttributedValuesType workFaxes;
    @XmlElement(name = "Emails1")
    protected ArrayOfEmailAddressAttributedValuesType emails1;
    @XmlElement(name = "Emails2")
    protected ArrayOfEmailAddressAttributedValuesType emails2;
    @XmlElement(name = "Emails3")
    protected ArrayOfEmailAddressAttributedValuesType emails3;
    @XmlElement(name = "BusinessHomePages")
    protected ArrayOfStringAttributedValuesType businessHomePages;
    @XmlElement(name = "PersonalHomePages")
    protected ArrayOfStringAttributedValuesType personalHomePages;
    @XmlElement(name = "OfficeLocations")
    protected ArrayOfStringAttributedValuesType officeLocations;
    @XmlElement(name = "ImAddresses")
    protected ArrayOfStringAttributedValuesType imAddresses;
    @XmlElement(name = "ImAddresses2")
    protected ArrayOfStringAttributedValuesType imAddresses2;
    @XmlElement(name = "ImAddresses3")
    protected ArrayOfStringAttributedValuesType imAddresses3;
    @XmlElement(name = "BusinessAddresses")
    protected ArrayOfPostalAddressAttributedValuesType businessAddresses;
    @XmlElement(name = "HomeAddresses")
    protected ArrayOfPostalAddressAttributedValuesType homeAddresses;
    @XmlElement(name = "OtherAddresses")
    protected ArrayOfPostalAddressAttributedValuesType otherAddresses;
    @XmlElement(name = "Titles")
    protected ArrayOfStringAttributedValuesType titles;
    @XmlElement(name = "Departments")
    protected ArrayOfStringAttributedValuesType departments;
    @XmlElement(name = "CompanyNames")
    protected ArrayOfStringAttributedValuesType companyNames;
    @XmlElement(name = "Managers")
    protected ArrayOfStringAttributedValuesType managers;
    @XmlElement(name = "AssistantNames")
    protected ArrayOfStringAttributedValuesType assistantNames;
    @XmlElement(name = "Professions")
    protected ArrayOfStringAttributedValuesType professions;
    @XmlElement(name = "SpouseNames")
    protected ArrayOfStringAttributedValuesType spouseNames;
    @XmlElement(name = "Children")
    protected ArrayOfStringArrayAttributedValuesType children;
    @XmlElement(name = "Schools")
    protected ArrayOfStringAttributedValuesType schools;
    @XmlElement(name = "Hobbies")
    protected ArrayOfStringAttributedValuesType hobbies;
    @XmlElement(name = "WeddingAnniversaries")
    protected ArrayOfStringAttributedValuesType weddingAnniversaries;
    @XmlElement(name = "Birthdays")
    protected ArrayOfStringAttributedValuesType birthdays;
    @XmlElement(name = "Locations")
    protected ArrayOfStringAttributedValuesType locations;
    @XmlElement(name = "ExtendedProperties")
    protected ArrayOfExtendedPropertyAttributedValueType extendedProperties;

    /**
     * Gets the value of the personaId property.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdType }
     *     
     */
    public ItemIdType getPersonaId() {
        return personaId;
    }

    /**
     * Sets the value of the personaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdType }
     *     
     */
    public void setPersonaId(ItemIdType value) {
        this.personaId = value;
    }

    /**
     * Gets the value of the personaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonaType() {
        return personaType;
    }

    /**
     * Sets the value of the personaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonaType(String value) {
        this.personaType = value;
    }

    /**
     * Gets the value of the personaObjectStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonaObjectStatus() {
        return personaObjectStatus;
    }

    /**
     * Sets the value of the personaObjectStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonaObjectStatus(String value) {
        this.personaObjectStatus = value;
    }

    /**
     * Gets the value of the creationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationTime() {
        return creationTime;
    }

    /**
     * Sets the value of the creationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationTime(XMLGregorianCalendar value) {
        this.creationTime = value;
    }

    /**
     * Gets the value of the bodies property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBodyContentAttributedValuesType }
     *     
     */
    public ArrayOfBodyContentAttributedValuesType getBodies() {
        return bodies;
    }

    /**
     * Sets the value of the bodies property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBodyContentAttributedValuesType }
     *     
     */
    public void setBodies(ArrayOfBodyContentAttributedValuesType value) {
        this.bodies = value;
    }

    /**
     * Gets the value of the displayNameFirstLastSortKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayNameFirstLastSortKey() {
        return displayNameFirstLastSortKey;
    }

    /**
     * Sets the value of the displayNameFirstLastSortKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayNameFirstLastSortKey(String value) {
        this.displayNameFirstLastSortKey = value;
    }

    /**
     * Gets the value of the displayNameLastFirstSortKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayNameLastFirstSortKey() {
        return displayNameLastFirstSortKey;
    }

    /**
     * Sets the value of the displayNameLastFirstSortKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayNameLastFirstSortKey(String value) {
        this.displayNameLastFirstSortKey = value;
    }

    /**
     * Gets the value of the companyNameSortKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyNameSortKey() {
        return companyNameSortKey;
    }

    /**
     * Sets the value of the companyNameSortKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyNameSortKey(String value) {
        this.companyNameSortKey = value;
    }

    /**
     * Gets the value of the homeCitySortKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeCitySortKey() {
        return homeCitySortKey;
    }

    /**
     * Sets the value of the homeCitySortKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeCitySortKey(String value) {
        this.homeCitySortKey = value;
    }

    /**
     * Gets the value of the workCitySortKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkCitySortKey() {
        return workCitySortKey;
    }

    /**
     * Sets the value of the workCitySortKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkCitySortKey(String value) {
        this.workCitySortKey = value;
    }

    /**
     * Gets the value of the displayNameFirstLastHeader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayNameFirstLastHeader() {
        return displayNameFirstLastHeader;
    }

    /**
     * Sets the value of the displayNameFirstLastHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayNameFirstLastHeader(String value) {
        this.displayNameFirstLastHeader = value;
    }

    /**
     * Gets the value of the displayNameLastFirstHeader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayNameLastFirstHeader() {
        return displayNameLastFirstHeader;
    }

    /**
     * Sets the value of the displayNameLastFirstHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayNameLastFirstHeader(String value) {
        this.displayNameLastFirstHeader = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the displayNameFirstLast property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayNameFirstLast() {
        return displayNameFirstLast;
    }

    /**
     * Sets the value of the displayNameFirstLast property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayNameFirstLast(String value) {
        this.displayNameFirstLast = value;
    }

    /**
     * Gets the value of the displayNameLastFirst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayNameLastFirst() {
        return displayNameLastFirst;
    }

    /**
     * Sets the value of the displayNameLastFirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayNameLastFirst(String value) {
        this.displayNameLastFirst = value;
    }

    /**
     * Gets the value of the fileAs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileAs() {
        return fileAs;
    }

    /**
     * Sets the value of the fileAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileAs(String value) {
        this.fileAs = value;
    }

    /**
     * Gets the value of the fileAsId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileAsId() {
        return fileAsId;
    }

    /**
     * Sets the value of the fileAsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileAsId(String value) {
        this.fileAsId = value;
    }

    /**
     * Gets the value of the displayNamePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayNamePrefix() {
        return displayNamePrefix;
    }

    /**
     * Sets the value of the displayNamePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayNamePrefix(String value) {
        this.displayNamePrefix = value;
    }

    /**
     * Gets the value of the givenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     * Sets the value of the givenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivenName(String value) {
        this.givenName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Gets the value of the generation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneration() {
        return generation;
    }

    /**
     * Sets the value of the generation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneration(String value) {
        this.generation = value;
    }

    /**
     * Gets the value of the nickname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * Sets the value of the nickname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickname(String value) {
        this.nickname = value;
    }

    /**
     * Gets the value of the yomiCompanyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYomiCompanyName() {
        return yomiCompanyName;
    }

    /**
     * Sets the value of the yomiCompanyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYomiCompanyName(String value) {
        this.yomiCompanyName = value;
    }

    /**
     * Gets the value of the yomiFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYomiFirstName() {
        return yomiFirstName;
    }

    /**
     * Sets the value of the yomiFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYomiFirstName(String value) {
        this.yomiFirstName = value;
    }

    /**
     * Gets the value of the yomiLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYomiLastName() {
        return yomiLastName;
    }

    /**
     * Sets the value of the yomiLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYomiLastName(String value) {
        this.yomiLastName = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link EmailAddressType }
     *     
     */
    public EmailAddressType getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailAddressType }
     *     
     */
    public void setEmailAddress(EmailAddressType value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the emailAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEmailAddressesType }
     *     
     */
    public ArrayOfEmailAddressesType getEmailAddresses() {
        return emailAddresses;
    }

    /**
     * Sets the value of the emailAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEmailAddressesType }
     *     
     */
    public void setEmailAddresses(ArrayOfEmailAddressesType value) {
        this.emailAddresses = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link PersonaPhoneNumberType }
     *     
     */
    public PersonaPhoneNumberType getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonaPhoneNumberType }
     *     
     */
    public void setPhoneNumber(PersonaPhoneNumberType value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the imAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImAddress() {
        return imAddress;
    }

    /**
     * Sets the value of the imAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImAddress(String value) {
        this.imAddress = value;
    }

    /**
     * Gets the value of the homeCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeCity() {
        return homeCity;
    }

    /**
     * Sets the value of the homeCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeCity(String value) {
        this.homeCity = value;
    }

    /**
     * Gets the value of the workCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkCity() {
        return workCity;
    }

    /**
     * Sets the value of the workCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkCity(String value) {
        this.workCity = value;
    }

    /**
     * Gets the value of the relevanceScore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRelevanceScore() {
        return relevanceScore;
    }

    /**
     * Sets the value of the relevanceScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRelevanceScore(Integer value) {
        this.relevanceScore = value;
    }

    /**
     * Gets the value of the folderIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFolderIdType }
     *     
     */
    public ArrayOfFolderIdType getFolderIds() {
        return folderIds;
    }

    /**
     * Sets the value of the folderIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFolderIdType }
     *     
     */
    public void setFolderIds(ArrayOfFolderIdType value) {
        this.folderIds = value;
    }

    /**
     * Gets the value of the attributions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPersonaAttributionsType }
     *     
     */
    public ArrayOfPersonaAttributionsType getAttributions() {
        return attributions;
    }

    /**
     * Sets the value of the attributions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPersonaAttributionsType }
     *     
     */
    public void setAttributions(ArrayOfPersonaAttributionsType value) {
        this.attributions = value;
    }

    /**
     * Gets the value of the displayNames property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getDisplayNames() {
        return displayNames;
    }

    /**
     * Sets the value of the displayNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setDisplayNames(ArrayOfStringAttributedValuesType value) {
        this.displayNames = value;
    }

    /**
     * Gets the value of the fileAses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getFileAses() {
        return fileAses;
    }

    /**
     * Sets the value of the fileAses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setFileAses(ArrayOfStringAttributedValuesType value) {
        this.fileAses = value;
    }

    /**
     * Gets the value of the fileAsIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getFileAsIds() {
        return fileAsIds;
    }

    /**
     * Sets the value of the fileAsIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setFileAsIds(ArrayOfStringAttributedValuesType value) {
        this.fileAsIds = value;
    }

    /**
     * Gets the value of the displayNamePrefixes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getDisplayNamePrefixes() {
        return displayNamePrefixes;
    }

    /**
     * Sets the value of the displayNamePrefixes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setDisplayNamePrefixes(ArrayOfStringAttributedValuesType value) {
        this.displayNamePrefixes = value;
    }

    /**
     * Gets the value of the givenNames property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getGivenNames() {
        return givenNames;
    }

    /**
     * Sets the value of the givenNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setGivenNames(ArrayOfStringAttributedValuesType value) {
        this.givenNames = value;
    }

    /**
     * Gets the value of the middleNames property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getMiddleNames() {
        return middleNames;
    }

    /**
     * Sets the value of the middleNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setMiddleNames(ArrayOfStringAttributedValuesType value) {
        this.middleNames = value;
    }

    /**
     * Gets the value of the surnames property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getSurnames() {
        return surnames;
    }

    /**
     * Sets the value of the surnames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setSurnames(ArrayOfStringAttributedValuesType value) {
        this.surnames = value;
    }

    /**
     * Gets the value of the generations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getGenerations() {
        return generations;
    }

    /**
     * Sets the value of the generations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setGenerations(ArrayOfStringAttributedValuesType value) {
        this.generations = value;
    }

    /**
     * Gets the value of the nicknames property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getNicknames() {
        return nicknames;
    }

    /**
     * Sets the value of the nicknames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setNicknames(ArrayOfStringAttributedValuesType value) {
        this.nicknames = value;
    }

    /**
     * Gets the value of the initials property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getInitials() {
        return initials;
    }

    /**
     * Sets the value of the initials property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setInitials(ArrayOfStringAttributedValuesType value) {
        this.initials = value;
    }

    /**
     * Gets the value of the yomiCompanyNames property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getYomiCompanyNames() {
        return yomiCompanyNames;
    }

    /**
     * Sets the value of the yomiCompanyNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setYomiCompanyNames(ArrayOfStringAttributedValuesType value) {
        this.yomiCompanyNames = value;
    }

    /**
     * Gets the value of the yomiFirstNames property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getYomiFirstNames() {
        return yomiFirstNames;
    }

    /**
     * Sets the value of the yomiFirstNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setYomiFirstNames(ArrayOfStringAttributedValuesType value) {
        this.yomiFirstNames = value;
    }

    /**
     * Gets the value of the yomiLastNames property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getYomiLastNames() {
        return yomiLastNames;
    }

    /**
     * Sets the value of the yomiLastNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setYomiLastNames(ArrayOfStringAttributedValuesType value) {
        this.yomiLastNames = value;
    }

    /**
     * Gets the value of the businessPhoneNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public ArrayOfPhoneNumberAttributedValuesType getBusinessPhoneNumbers() {
        return businessPhoneNumbers;
    }

    /**
     * Sets the value of the businessPhoneNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public void setBusinessPhoneNumbers(ArrayOfPhoneNumberAttributedValuesType value) {
        this.businessPhoneNumbers = value;
    }

    /**
     * Gets the value of the businessPhoneNumbers2 property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public ArrayOfPhoneNumberAttributedValuesType getBusinessPhoneNumbers2() {
        return businessPhoneNumbers2;
    }

    /**
     * Sets the value of the businessPhoneNumbers2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public void setBusinessPhoneNumbers2(ArrayOfPhoneNumberAttributedValuesType value) {
        this.businessPhoneNumbers2 = value;
    }

    /**
     * Gets the value of the homePhones property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public ArrayOfPhoneNumberAttributedValuesType getHomePhones() {
        return homePhones;
    }

    /**
     * Sets the value of the homePhones property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public void setHomePhones(ArrayOfPhoneNumberAttributedValuesType value) {
        this.homePhones = value;
    }

    /**
     * Gets the value of the homePhones2 property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public ArrayOfPhoneNumberAttributedValuesType getHomePhones2() {
        return homePhones2;
    }

    /**
     * Sets the value of the homePhones2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public void setHomePhones2(ArrayOfPhoneNumberAttributedValuesType value) {
        this.homePhones2 = value;
    }

    /**
     * Gets the value of the mobilePhones property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public ArrayOfPhoneNumberAttributedValuesType getMobilePhones() {
        return mobilePhones;
    }

    /**
     * Sets the value of the mobilePhones property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public void setMobilePhones(ArrayOfPhoneNumberAttributedValuesType value) {
        this.mobilePhones = value;
    }

    /**
     * Gets the value of the mobilePhones2 property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public ArrayOfPhoneNumberAttributedValuesType getMobilePhones2() {
        return mobilePhones2;
    }

    /**
     * Sets the value of the mobilePhones2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public void setMobilePhones2(ArrayOfPhoneNumberAttributedValuesType value) {
        this.mobilePhones2 = value;
    }

    /**
     * Gets the value of the assistantPhoneNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public ArrayOfPhoneNumberAttributedValuesType getAssistantPhoneNumbers() {
        return assistantPhoneNumbers;
    }

    /**
     * Sets the value of the assistantPhoneNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public void setAssistantPhoneNumbers(ArrayOfPhoneNumberAttributedValuesType value) {
        this.assistantPhoneNumbers = value;
    }

    /**
     * Gets the value of the callbackPhones property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public ArrayOfPhoneNumberAttributedValuesType getCallbackPhones() {
        return callbackPhones;
    }

    /**
     * Sets the value of the callbackPhones property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public void setCallbackPhones(ArrayOfPhoneNumberAttributedValuesType value) {
        this.callbackPhones = value;
    }

    /**
     * Gets the value of the carPhones property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public ArrayOfPhoneNumberAttributedValuesType getCarPhones() {
        return carPhones;
    }

    /**
     * Sets the value of the carPhones property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public void setCarPhones(ArrayOfPhoneNumberAttributedValuesType value) {
        this.carPhones = value;
    }

    /**
     * Gets the value of the homeFaxes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public ArrayOfPhoneNumberAttributedValuesType getHomeFaxes() {
        return homeFaxes;
    }

    /**
     * Sets the value of the homeFaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public void setHomeFaxes(ArrayOfPhoneNumberAttributedValuesType value) {
        this.homeFaxes = value;
    }

    /**
     * Gets the value of the organizationMainPhones property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public ArrayOfPhoneNumberAttributedValuesType getOrganizationMainPhones() {
        return organizationMainPhones;
    }

    /**
     * Sets the value of the organizationMainPhones property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public void setOrganizationMainPhones(ArrayOfPhoneNumberAttributedValuesType value) {
        this.organizationMainPhones = value;
    }

    /**
     * Gets the value of the otherFaxes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public ArrayOfPhoneNumberAttributedValuesType getOtherFaxes() {
        return otherFaxes;
    }

    /**
     * Sets the value of the otherFaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public void setOtherFaxes(ArrayOfPhoneNumberAttributedValuesType value) {
        this.otherFaxes = value;
    }

    /**
     * Gets the value of the otherTelephones property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public ArrayOfPhoneNumberAttributedValuesType getOtherTelephones() {
        return otherTelephones;
    }

    /**
     * Sets the value of the otherTelephones property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public void setOtherTelephones(ArrayOfPhoneNumberAttributedValuesType value) {
        this.otherTelephones = value;
    }

    /**
     * Gets the value of the otherPhones2 property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public ArrayOfPhoneNumberAttributedValuesType getOtherPhones2() {
        return otherPhones2;
    }

    /**
     * Sets the value of the otherPhones2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public void setOtherPhones2(ArrayOfPhoneNumberAttributedValuesType value) {
        this.otherPhones2 = value;
    }

    /**
     * Gets the value of the pagers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public ArrayOfPhoneNumberAttributedValuesType getPagers() {
        return pagers;
    }

    /**
     * Sets the value of the pagers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public void setPagers(ArrayOfPhoneNumberAttributedValuesType value) {
        this.pagers = value;
    }

    /**
     * Gets the value of the radioPhones property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public ArrayOfPhoneNumberAttributedValuesType getRadioPhones() {
        return radioPhones;
    }

    /**
     * Sets the value of the radioPhones property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public void setRadioPhones(ArrayOfPhoneNumberAttributedValuesType value) {
        this.radioPhones = value;
    }

    /**
     * Gets the value of the telexNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public ArrayOfPhoneNumberAttributedValuesType getTelexNumbers() {
        return telexNumbers;
    }

    /**
     * Sets the value of the telexNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public void setTelexNumbers(ArrayOfPhoneNumberAttributedValuesType value) {
        this.telexNumbers = value;
    }

    /**
     * Gets the value of the ttytddPhoneNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public ArrayOfPhoneNumberAttributedValuesType getTTYTDDPhoneNumbers() {
        return ttytddPhoneNumbers;
    }

    /**
     * Sets the value of the ttytddPhoneNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public void setTTYTDDPhoneNumbers(ArrayOfPhoneNumberAttributedValuesType value) {
        this.ttytddPhoneNumbers = value;
    }

    /**
     * Gets the value of the workFaxes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public ArrayOfPhoneNumberAttributedValuesType getWorkFaxes() {
        return workFaxes;
    }

    /**
     * Sets the value of the workFaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public void setWorkFaxes(ArrayOfPhoneNumberAttributedValuesType value) {
        this.workFaxes = value;
    }

    /**
     * Gets the value of the emails1 property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEmailAddressAttributedValuesType }
     *     
     */
    public ArrayOfEmailAddressAttributedValuesType getEmails1() {
        return emails1;
    }

    /**
     * Sets the value of the emails1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEmailAddressAttributedValuesType }
     *     
     */
    public void setEmails1(ArrayOfEmailAddressAttributedValuesType value) {
        this.emails1 = value;
    }

    /**
     * Gets the value of the emails2 property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEmailAddressAttributedValuesType }
     *     
     */
    public ArrayOfEmailAddressAttributedValuesType getEmails2() {
        return emails2;
    }

    /**
     * Sets the value of the emails2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEmailAddressAttributedValuesType }
     *     
     */
    public void setEmails2(ArrayOfEmailAddressAttributedValuesType value) {
        this.emails2 = value;
    }

    /**
     * Gets the value of the emails3 property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEmailAddressAttributedValuesType }
     *     
     */
    public ArrayOfEmailAddressAttributedValuesType getEmails3() {
        return emails3;
    }

    /**
     * Sets the value of the emails3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEmailAddressAttributedValuesType }
     *     
     */
    public void setEmails3(ArrayOfEmailAddressAttributedValuesType value) {
        this.emails3 = value;
    }

    /**
     * Gets the value of the businessHomePages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getBusinessHomePages() {
        return businessHomePages;
    }

    /**
     * Sets the value of the businessHomePages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setBusinessHomePages(ArrayOfStringAttributedValuesType value) {
        this.businessHomePages = value;
    }

    /**
     * Gets the value of the personalHomePages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getPersonalHomePages() {
        return personalHomePages;
    }

    /**
     * Sets the value of the personalHomePages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setPersonalHomePages(ArrayOfStringAttributedValuesType value) {
        this.personalHomePages = value;
    }

    /**
     * Gets the value of the officeLocations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getOfficeLocations() {
        return officeLocations;
    }

    /**
     * Sets the value of the officeLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setOfficeLocations(ArrayOfStringAttributedValuesType value) {
        this.officeLocations = value;
    }

    /**
     * Gets the value of the imAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getImAddresses() {
        return imAddresses;
    }

    /**
     * Sets the value of the imAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setImAddresses(ArrayOfStringAttributedValuesType value) {
        this.imAddresses = value;
    }

    /**
     * Gets the value of the imAddresses2 property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getImAddresses2() {
        return imAddresses2;
    }

    /**
     * Sets the value of the imAddresses2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setImAddresses2(ArrayOfStringAttributedValuesType value) {
        this.imAddresses2 = value;
    }

    /**
     * Gets the value of the imAddresses3 property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getImAddresses3() {
        return imAddresses3;
    }

    /**
     * Sets the value of the imAddresses3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setImAddresses3(ArrayOfStringAttributedValuesType value) {
        this.imAddresses3 = value;
    }

    /**
     * Gets the value of the businessAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPostalAddressAttributedValuesType }
     *     
     */
    public ArrayOfPostalAddressAttributedValuesType getBusinessAddresses() {
        return businessAddresses;
    }

    /**
     * Sets the value of the businessAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPostalAddressAttributedValuesType }
     *     
     */
    public void setBusinessAddresses(ArrayOfPostalAddressAttributedValuesType value) {
        this.businessAddresses = value;
    }

    /**
     * Gets the value of the homeAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPostalAddressAttributedValuesType }
     *     
     */
    public ArrayOfPostalAddressAttributedValuesType getHomeAddresses() {
        return homeAddresses;
    }

    /**
     * Sets the value of the homeAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPostalAddressAttributedValuesType }
     *     
     */
    public void setHomeAddresses(ArrayOfPostalAddressAttributedValuesType value) {
        this.homeAddresses = value;
    }

    /**
     * Gets the value of the otherAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPostalAddressAttributedValuesType }
     *     
     */
    public ArrayOfPostalAddressAttributedValuesType getOtherAddresses() {
        return otherAddresses;
    }

    /**
     * Sets the value of the otherAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPostalAddressAttributedValuesType }
     *     
     */
    public void setOtherAddresses(ArrayOfPostalAddressAttributedValuesType value) {
        this.otherAddresses = value;
    }

    /**
     * Gets the value of the titles property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getTitles() {
        return titles;
    }

    /**
     * Sets the value of the titles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setTitles(ArrayOfStringAttributedValuesType value) {
        this.titles = value;
    }

    /**
     * Gets the value of the departments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getDepartments() {
        return departments;
    }

    /**
     * Sets the value of the departments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setDepartments(ArrayOfStringAttributedValuesType value) {
        this.departments = value;
    }

    /**
     * Gets the value of the companyNames property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getCompanyNames() {
        return companyNames;
    }

    /**
     * Sets the value of the companyNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setCompanyNames(ArrayOfStringAttributedValuesType value) {
        this.companyNames = value;
    }

    /**
     * Gets the value of the managers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getManagers() {
        return managers;
    }

    /**
     * Sets the value of the managers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setManagers(ArrayOfStringAttributedValuesType value) {
        this.managers = value;
    }

    /**
     * Gets the value of the assistantNames property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getAssistantNames() {
        return assistantNames;
    }

    /**
     * Sets the value of the assistantNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setAssistantNames(ArrayOfStringAttributedValuesType value) {
        this.assistantNames = value;
    }

    /**
     * Gets the value of the professions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getProfessions() {
        return professions;
    }

    /**
     * Sets the value of the professions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setProfessions(ArrayOfStringAttributedValuesType value) {
        this.professions = value;
    }

    /**
     * Gets the value of the spouseNames property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getSpouseNames() {
        return spouseNames;
    }

    /**
     * Sets the value of the spouseNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setSpouseNames(ArrayOfStringAttributedValuesType value) {
        this.spouseNames = value;
    }

    /**
     * Gets the value of the children property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringArrayAttributedValuesType }
     *     
     */
    public ArrayOfStringArrayAttributedValuesType getChildren() {
        return children;
    }

    /**
     * Sets the value of the children property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringArrayAttributedValuesType }
     *     
     */
    public void setChildren(ArrayOfStringArrayAttributedValuesType value) {
        this.children = value;
    }

    /**
     * Gets the value of the schools property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getSchools() {
        return schools;
    }

    /**
     * Sets the value of the schools property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setSchools(ArrayOfStringAttributedValuesType value) {
        this.schools = value;
    }

    /**
     * Gets the value of the hobbies property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getHobbies() {
        return hobbies;
    }

    /**
     * Sets the value of the hobbies property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setHobbies(ArrayOfStringAttributedValuesType value) {
        this.hobbies = value;
    }

    /**
     * Gets the value of the weddingAnniversaries property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getWeddingAnniversaries() {
        return weddingAnniversaries;
    }

    /**
     * Sets the value of the weddingAnniversaries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setWeddingAnniversaries(ArrayOfStringAttributedValuesType value) {
        this.weddingAnniversaries = value;
    }

    /**
     * Gets the value of the birthdays property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getBirthdays() {
        return birthdays;
    }

    /**
     * Sets the value of the birthdays property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setBirthdays(ArrayOfStringAttributedValuesType value) {
        this.birthdays = value;
    }

    /**
     * Gets the value of the locations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getLocations() {
        return locations;
    }

    /**
     * Sets the value of the locations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setLocations(ArrayOfStringAttributedValuesType value) {
        this.locations = value;
    }

    /**
     * Gets the value of the extendedProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExtendedPropertyAttributedValueType }
     *     
     */
    public ArrayOfExtendedPropertyAttributedValueType getExtendedProperties() {
        return extendedProperties;
    }

    /**
     * Sets the value of the extendedProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExtendedPropertyAttributedValueType }
     *     
     */
    public void setExtendedProperties(ArrayOfExtendedPropertyAttributedValueType value) {
        this.extendedProperties = value;
    }

}
