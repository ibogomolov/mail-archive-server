
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SetImListMigrationCompletedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetImListMigrationCompletedType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="ImListMigrationCompleted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetImListMigrationCompletedType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "imListMigrationCompleted"
})
public class SetImListMigrationCompletedType
    extends BaseRequestType
{

    @XmlElement(name = "ImListMigrationCompleted")
    protected boolean imListMigrationCompleted;

    /**
     * Gets the value of the imListMigrationCompleted property.
     * 
     */
    public boolean isImListMigrationCompleted() {
        return imListMigrationCompleted;
    }

    /**
     * Sets the value of the imListMigrationCompleted property.
     * 
     */
    public void setImListMigrationCompleted(boolean value) {
        this.imListMigrationCompleted = value;
    }

}
