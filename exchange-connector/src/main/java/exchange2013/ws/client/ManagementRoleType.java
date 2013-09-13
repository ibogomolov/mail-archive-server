
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManagementRoleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManagementRoleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserRoles" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfRoleType" minOccurs="0"/>
 *         &lt;element name="ApplicationRoles" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfRoleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagementRoleType", propOrder = {
    "userRoles",
    "applicationRoles"
})
public class ManagementRoleType {

    @XmlElement(name = "UserRoles")
    protected NonEmptyArrayOfRoleType userRoles;
    @XmlElement(name = "ApplicationRoles")
    protected NonEmptyArrayOfRoleType applicationRoles;

    /**
     * Gets the value of the userRoles property.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfRoleType }
     *     
     */
    public NonEmptyArrayOfRoleType getUserRoles() {
        return userRoles;
    }

    /**
     * Sets the value of the userRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfRoleType }
     *     
     */
    public void setUserRoles(NonEmptyArrayOfRoleType value) {
        this.userRoles = value;
    }

    /**
     * Gets the value of the applicationRoles property.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfRoleType }
     *     
     */
    public NonEmptyArrayOfRoleType getApplicationRoles() {
        return applicationRoles;
    }

    /**
     * Sets the value of the applicationRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfRoleType }
     *     
     */
    public void setApplicationRoles(NonEmptyArrayOfRoleType value) {
        this.applicationRoles = value;
    }

}
