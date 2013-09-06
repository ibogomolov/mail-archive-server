
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Response message type for the FindMailboxStatisticsByKeywords web method.
 *       
 * 
 * <p>Java class for FindMailboxStatisticsByKeywordsResponseMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindMailboxStatisticsByKeywordsResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="MailboxStatisticsSearchResult" type="{http://schemas.microsoft.com/exchange/services/2006/types}MailboxStatisticsSearchResultType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindMailboxStatisticsByKeywordsResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "mailboxStatisticsSearchResult"
})
public class FindMailboxStatisticsByKeywordsResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "MailboxStatisticsSearchResult", required = true)
    protected MailboxStatisticsSearchResultType mailboxStatisticsSearchResult;

    /**
     * Gets the value of the mailboxStatisticsSearchResult property.
     * 
     * @return
     *     possible object is
     *     {@link MailboxStatisticsSearchResultType }
     *     
     */
    public MailboxStatisticsSearchResultType getMailboxStatisticsSearchResult() {
        return mailboxStatisticsSearchResult;
    }

    /**
     * Sets the value of the mailboxStatisticsSearchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailboxStatisticsSearchResultType }
     *     
     */
    public void setMailboxStatisticsSearchResult(MailboxStatisticsSearchResultType value) {
        this.mailboxStatisticsSearchResult = value;
    }

}
