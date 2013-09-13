
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetUserPhotoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetUserPhotoType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SizeRequested" type="{http://schemas.microsoft.com/exchange/services/2006/types}UserPhotoSizeType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUserPhotoType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "email",
    "sizeRequested"
})
public class GetUserPhotoType
    extends BaseRequestType
{

    @XmlElement(name = "Email", required = true)
    protected String email;
    @XmlElement(name = "SizeRequested", required = true)
    protected UserPhotoSizeType sizeRequested;

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the sizeRequested property.
     * 
     * @return
     *     possible object is
     *     {@link UserPhotoSizeType }
     *     
     */
    public UserPhotoSizeType getSizeRequested() {
        return sizeRequested;
    }

    /**
     * Sets the value of the sizeRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserPhotoSizeType }
     *     
     */
    public void setSizeRequested(UserPhotoSizeType value) {
        this.sizeRequested = value;
    }

}
