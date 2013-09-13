
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Response message type for the GetUserRetentionPolicyTags web method.
 *       
 * 
 * <p>Java class for GetUserRetentionPolicyTagsResponseMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetUserRetentionPolicyTagsResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="RetentionPolicyTags" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfRetentionPolicyTagsType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUserRetentionPolicyTagsResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "retentionPolicyTags"
})
public class GetUserRetentionPolicyTagsResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "RetentionPolicyTags", required = true)
    protected ArrayOfRetentionPolicyTagsType retentionPolicyTags;

    /**
     * Gets the value of the retentionPolicyTags property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRetentionPolicyTagsType }
     *     
     */
    public ArrayOfRetentionPolicyTagsType getRetentionPolicyTags() {
        return retentionPolicyTags;
    }

    /**
     * Sets the value of the retentionPolicyTags property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRetentionPolicyTagsType }
     *     
     */
    public void setRetentionPolicyTags(ArrayOfRetentionPolicyTagsType value) {
        this.retentionPolicyTags = value;
    }

}
