
package exchange.v2007sp3.ws.client.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalendarFolderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalendarFolderType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}BaseFolderType">
 *       &lt;sequence>
 *         &lt;element name="PermissionSet" type="{http://schemas.microsoft.com/exchange/services/2006/types}CalendarPermissionSetType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalendarFolderType", propOrder = {
    "permissionSet"
})
public class CalendarFolderType
    extends BaseFolderType
{

    @XmlElement(name = "PermissionSet")
    protected CalendarPermissionSetType permissionSet;

    /**
     * Gets the value of the permissionSet property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarPermissionSetType }
     *     
     */
    public CalendarPermissionSetType getPermissionSet() {
        return permissionSet;
    }

    /**
     * Sets the value of the permissionSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarPermissionSetType }
     *     
     */
    public void setPermissionSet(CalendarPermissionSetType value) {
        this.permissionSet = value;
    }

}
