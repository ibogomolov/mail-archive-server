
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAppManifestsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAppManifestsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="Manifests" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ArrayOfAppManifestsType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAppManifestsResponseType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "manifests"
})
public class GetAppManifestsResponseType
    extends ResponseMessageType
{

    @XmlElement(name = "Manifests", required = true)
    protected ArrayOfAppManifestsType manifests;

    /**
     * Gets the value of the manifests property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAppManifestsType }
     *     
     */
    public ArrayOfAppManifestsType getManifests() {
        return manifests;
    }

    /**
     * Sets the value of the manifests property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAppManifestsType }
     *     
     */
    public void setManifests(ArrayOfAppManifestsType value) {
        this.manifests = value;
    }

}
