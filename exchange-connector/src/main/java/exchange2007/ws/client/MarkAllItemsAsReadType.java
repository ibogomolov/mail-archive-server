
package exchange2007.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarkAllItemsAsReadType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarkAllItemsAsReadType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="ReadFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SuppressReadReceipts" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="FolderIds" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfBaseFolderIdsType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarkAllItemsAsReadType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "readFlag",
    "suppressReadReceipts",
    "folderIds"
})
public class MarkAllItemsAsReadType
    extends BaseRequestType
{

    @XmlElement(name = "ReadFlag")
    protected boolean readFlag;
    @XmlElement(name = "SuppressReadReceipts")
    protected boolean suppressReadReceipts;
    @XmlElement(name = "FolderIds", required = true)
    protected NonEmptyArrayOfBaseFolderIdsType folderIds;

    /**
     * Gets the value of the readFlag property.
     * 
     */
    public boolean isReadFlag() {
        return readFlag;
    }

    /**
     * Sets the value of the readFlag property.
     * 
     */
    public void setReadFlag(boolean value) {
        this.readFlag = value;
    }

    /**
     * Gets the value of the suppressReadReceipts property.
     * 
     */
    public boolean isSuppressReadReceipts() {
        return suppressReadReceipts;
    }

    /**
     * Sets the value of the suppressReadReceipts property.
     * 
     */
    public void setSuppressReadReceipts(boolean value) {
        this.suppressReadReceipts = value;
    }

    /**
     * Gets the value of the folderIds property.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfBaseFolderIdsType }
     *     
     */
    public NonEmptyArrayOfBaseFolderIdsType getFolderIds() {
        return folderIds;
    }

    /**
     * Sets the value of the folderIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfBaseFolderIdsType }
     *     
     */
    public void setFolderIds(NonEmptyArrayOfBaseFolderIdsType value) {
        this.folderIds = value;
    }

}
