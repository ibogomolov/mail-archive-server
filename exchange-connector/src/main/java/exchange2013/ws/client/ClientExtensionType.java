
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClientExtensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClientExtensionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SpecificUsers" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringsType" minOccurs="0"/>
 *         &lt;element name="Manifest" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="IsAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="IsMandatory" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="IsEnabledByDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ProvidedTo" type="{http://schemas.microsoft.com/exchange/services/2006/types}ClientExtensionProvidedToType" />
 *       &lt;attribute name="Type" type="{http://schemas.microsoft.com/exchange/services/2006/types}ClientExtensionTypeType" />
 *       &lt;attribute name="Scope" type="{http://schemas.microsoft.com/exchange/services/2006/types}ClientExtensionScopeType" />
 *       &lt;attribute name="MarketplaceAssetId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MarketplaceContentMarket" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientExtensionType", propOrder = {
    "specificUsers",
    "manifest"
})
public class ClientExtensionType {

    @XmlElement(name = "SpecificUsers")
    protected ArrayOfStringsType specificUsers;
    @XmlElement(name = "Manifest")
    protected byte[] manifest;
    @XmlAttribute(name = "IsAvailable")
    protected Boolean isAvailable;
    @XmlAttribute(name = "IsMandatory")
    protected Boolean isMandatory;
    @XmlAttribute(name = "IsEnabledByDefault")
    protected Boolean isEnabledByDefault;
    @XmlAttribute(name = "ProvidedTo")
    protected ClientExtensionProvidedToType providedTo;
    @XmlAttribute(name = "Type")
    protected ClientExtensionTypeType type;
    @XmlAttribute(name = "Scope")
    protected ClientExtensionScopeType scope;
    @XmlAttribute(name = "MarketplaceAssetId")
    protected String marketplaceAssetId;
    @XmlAttribute(name = "MarketplaceContentMarket")
    protected String marketplaceContentMarket;

    /**
     * Gets the value of the specificUsers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public ArrayOfStringsType getSpecificUsers() {
        return specificUsers;
    }

    /**
     * Sets the value of the specificUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public void setSpecificUsers(ArrayOfStringsType value) {
        this.specificUsers = value;
    }

    /**
     * Gets the value of the manifest property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getManifest() {
        return manifest;
    }

    /**
     * Sets the value of the manifest property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setManifest(byte[] value) {
        this.manifest = value;
    }

    /**
     * Gets the value of the isAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAvailable() {
        return isAvailable;
    }

    /**
     * Sets the value of the isAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAvailable(Boolean value) {
        this.isAvailable = value;
    }

    /**
     * Gets the value of the isMandatory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMandatory() {
        return isMandatory;
    }

    /**
     * Sets the value of the isMandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMandatory(Boolean value) {
        this.isMandatory = value;
    }

    /**
     * Gets the value of the isEnabledByDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEnabledByDefault() {
        return isEnabledByDefault;
    }

    /**
     * Sets the value of the isEnabledByDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEnabledByDefault(Boolean value) {
        this.isEnabledByDefault = value;
    }

    /**
     * Gets the value of the providedTo property.
     * 
     * @return
     *     possible object is
     *     {@link ClientExtensionProvidedToType }
     *     
     */
    public ClientExtensionProvidedToType getProvidedTo() {
        return providedTo;
    }

    /**
     * Sets the value of the providedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientExtensionProvidedToType }
     *     
     */
    public void setProvidedTo(ClientExtensionProvidedToType value) {
        this.providedTo = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ClientExtensionTypeType }
     *     
     */
    public ClientExtensionTypeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientExtensionTypeType }
     *     
     */
    public void setType(ClientExtensionTypeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link ClientExtensionScopeType }
     *     
     */
    public ClientExtensionScopeType getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientExtensionScopeType }
     *     
     */
    public void setScope(ClientExtensionScopeType value) {
        this.scope = value;
    }

    /**
     * Gets the value of the marketplaceAssetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketplaceAssetId() {
        return marketplaceAssetId;
    }

    /**
     * Sets the value of the marketplaceAssetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketplaceAssetId(String value) {
        this.marketplaceAssetId = value;
    }

    /**
     * Gets the value of the marketplaceContentMarket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketplaceContentMarket() {
        return marketplaceContentMarket;
    }

    /**
     * Sets the value of the marketplaceContentMarket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketplaceContentMarket(String value) {
        this.marketplaceContentMarket = value;
    }

}
