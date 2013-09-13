
package exchange2007.ws.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMeetingSuggestionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMeetingSuggestionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MeetingSuggestion" type="{http://schemas.microsoft.com/exchange/services/2006/types}MeetingSuggestionType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMeetingSuggestionsType", propOrder = {
    "meetingSuggestion"
})
public class ArrayOfMeetingSuggestionsType {

    @XmlElement(name = "MeetingSuggestion", required = true)
    protected List<MeetingSuggestionType> meetingSuggestion;

    /**
     * Gets the value of the meetingSuggestion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meetingSuggestion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeetingSuggestion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeetingSuggestionType }
     * 
     * 
     */
    public List<MeetingSuggestionType> getMeetingSuggestion() {
        if (meetingSuggestion == null) {
            meetingSuggestion = new ArrayList<MeetingSuggestionType>();
        }
        return this.meetingSuggestion;
    }

}
