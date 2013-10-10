
package exchange.v2007sp3.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactsFolderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactsFolderType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}BaseFolderType">
 *       &lt;sequence>
 *         &lt;element name="PermissionSet" type="{http://schemas.microsoft.com/exchange/services/2006/types}PermissionSetType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactsFolderType", propOrder = {
    "permissionSet"
})
public class ContactsFolderType
    extends BaseFolderType
{

    @XmlElement(name = "PermissionSet")
    protected PermissionSetType permissionSet;

    /**
     * Gets the value of the permissionSet property.
     * 
     * @return
     *     possible object is
     *     {@link PermissionSetType }
     *     
     */
    public PermissionSetType getPermissionSet() {
        return permissionSet;
    }

    /**
     * Sets the value of the permissionSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link PermissionSetType }
     *     
     */
    public void setPermissionSet(PermissionSetType value) {
        this.permissionSet = value;
    }

}
