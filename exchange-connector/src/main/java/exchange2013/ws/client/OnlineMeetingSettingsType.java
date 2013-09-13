
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OnlineMeetingSettingsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OnlineMeetingSettingsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LobbyBypass" type="{http://schemas.microsoft.com/exchange/services/2006/types}LobbyBypassType"/>
 *         &lt;element name="AccessLevel" type="{http://schemas.microsoft.com/exchange/services/2006/types}OnlineMeetingAccessLevelType"/>
 *         &lt;element name="Presenters" type="{http://schemas.microsoft.com/exchange/services/2006/types}PresentersType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnlineMeetingSettingsType", propOrder = {
    "lobbyBypass",
    "accessLevel",
    "presenters"
})
public class OnlineMeetingSettingsType {

    @XmlElement(name = "LobbyBypass", required = true)
    protected LobbyBypassType lobbyBypass;
    @XmlElement(name = "AccessLevel", required = true)
    protected OnlineMeetingAccessLevelType accessLevel;
    @XmlElement(name = "Presenters", required = true)
    protected PresentersType presenters;

    /**
     * Gets the value of the lobbyBypass property.
     * 
     * @return
     *     possible object is
     *     {@link LobbyBypassType }
     *     
     */
    public LobbyBypassType getLobbyBypass() {
        return lobbyBypass;
    }

    /**
     * Sets the value of the lobbyBypass property.
     * 
     * @param value
     *     allowed object is
     *     {@link LobbyBypassType }
     *     
     */
    public void setLobbyBypass(LobbyBypassType value) {
        this.lobbyBypass = value;
    }

    /**
     * Gets the value of the accessLevel property.
     * 
     * @return
     *     possible object is
     *     {@link OnlineMeetingAccessLevelType }
     *     
     */
    public OnlineMeetingAccessLevelType getAccessLevel() {
        return accessLevel;
    }

    /**
     * Sets the value of the accessLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnlineMeetingAccessLevelType }
     *     
     */
    public void setAccessLevel(OnlineMeetingAccessLevelType value) {
        this.accessLevel = value;
    }

    /**
     * Gets the value of the presenters property.
     * 
     * @return
     *     possible object is
     *     {@link PresentersType }
     *     
     */
    public PresentersType getPresenters() {
        return presenters;
    }

    /**
     * Sets the value of the presenters property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentersType }
     *     
     */
    public void setPresenters(PresentersType value) {
        this.presenters = value;
    }

}
