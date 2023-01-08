
package client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for moderateAdvertisementStatement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="moderateAdvertisementStatement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="moderator" type="{http://moderate_advertisement/}user" minOccurs="0"/>
 *         &lt;element name="statement" type="{http://moderate_advertisement/}postAdvertisementStatement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "moderateAdvertisementStatement", propOrder = {
    "moderator",
    "statement"
})
public class ModerateAdvertisementStatement {

    protected User moderator;
    protected PostAdvertisementStatement statement;

    /**
     * Gets the value of the moderator property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getModerator() {
        return moderator;
    }

    /**
     * Sets the value of the moderator property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setModerator(User value) {
        this.moderator = value;
    }

    /**
     * Gets the value of the statement property.
     * 
     * @return
     *     possible object is
     *     {@link PostAdvertisementStatement }
     *     
     */
    public PostAdvertisementStatement getStatement() {
        return statement;
    }

    /**
     * Sets the value of the statement property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostAdvertisementStatement }
     *     
     */
    public void setStatement(PostAdvertisementStatement value) {
        this.statement = value;
    }

}
