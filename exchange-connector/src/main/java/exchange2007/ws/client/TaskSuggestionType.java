
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaskSuggestionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaskSuggestionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}EntityType">
 *       &lt;sequence>
 *         &lt;element name="TaskString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Assignees" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfEmailUsersType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskSuggestionType", propOrder = {
    "taskString",
    "assignees"
})
public class TaskSuggestionType
    extends EntityType
{

    @XmlElement(name = "TaskString")
    protected String taskString;
    @XmlElement(name = "Assignees")
    protected ArrayOfEmailUsersType assignees;

    /**
     * Gets the value of the taskString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskString() {
        return taskString;
    }

    /**
     * Sets the value of the taskString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskString(String value) {
        this.taskString = value;
    }

    /**
     * Gets the value of the assignees property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEmailUsersType }
     *     
     */
    public ArrayOfEmailUsersType getAssignees() {
        return assignees;
    }

    /**
     * Sets the value of the assignees property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEmailUsersType }
     *     
     */
    public void setAssignees(ArrayOfEmailUsersType value) {
        this.assignees = value;
    }

}
