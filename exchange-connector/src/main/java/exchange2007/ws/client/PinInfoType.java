
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PinInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PinInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsValid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PinExpired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="LockedOut" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="FirstTimeUser" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PinInfoType", propOrder = {
    "pin",
    "isValid",
    "pinExpired",
    "lockedOut",
    "firstTimeUser"
})
public class PinInfoType {

    @XmlElement(name = "PIN")
    protected String pin;
    @XmlElement(name = "IsValid")
    protected boolean isValid;
    @XmlElement(name = "PinExpired")
    protected boolean pinExpired;
    @XmlElement(name = "LockedOut")
    protected boolean lockedOut;
    @XmlElement(name = "FirstTimeUser")
    protected boolean firstTimeUser;

    /**
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIN() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIN(String value) {
        this.pin = value;
    }

    /**
     * Gets the value of the isValid property.
     * 
     */
    public boolean isIsValid() {
        return isValid;
    }

    /**
     * Sets the value of the isValid property.
     * 
     */
    public void setIsValid(boolean value) {
        this.isValid = value;
    }

    /**
     * Gets the value of the pinExpired property.
     * 
     */
    public boolean isPinExpired() {
        return pinExpired;
    }

    /**
     * Sets the value of the pinExpired property.
     * 
     */
    public void setPinExpired(boolean value) {
        this.pinExpired = value;
    }

    /**
     * Gets the value of the lockedOut property.
     * 
     */
    public boolean isLockedOut() {
        return lockedOut;
    }

    /**
     * Sets the value of the lockedOut property.
     * 
     */
    public void setLockedOut(boolean value) {
        this.lockedOut = value;
    }

    /**
     * Gets the value of the firstTimeUser property.
     * 
     */
    public boolean isFirstTimeUser() {
        return firstTimeUser;
    }

    /**
     * Sets the value of the firstTimeUser property.
     * 
     */
    public void setFirstTimeUser(boolean value) {
        this.firstTimeUser = value;
    }

}
