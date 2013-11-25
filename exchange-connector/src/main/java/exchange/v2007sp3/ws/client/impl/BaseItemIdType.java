
package exchange.v2007sp3.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Abstract base type for item identifiers.  Should never be used in web service calls
 * 
 * <p>Java class for BaseItemIdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseItemIdType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseItemIdType")
@XmlSeeAlso({
    RecurringMasterItemIdType.class,
    RootItemIdType.class,
    RequestAttachmentIdType.class,
    OccurrenceItemIdType.class,
    ItemIdType.class
})
public abstract class BaseItemIdType {


}
