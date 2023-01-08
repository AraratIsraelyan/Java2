
package client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for postAdvertisementStatement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="postAdvertisementStatement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="advertisement" type="{http://post_advertisement/}advertisement" minOccurs="0"/>
 *         &lt;element name="agreement" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="user" type="{http://post_advertisement/}user" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "postAdvertisementStatement", propOrder = {
    "advertisement",
    "agreement",
    "user"
})
public class PostAdvertisementStatement {

    protected Advertisement advertisement;
    protected boolean agreement;
    protected User user;

    /**
     * Gets the value of the advertisement property.
     * 
     * @return
     *     possible object is
     *     {@link Advertisement }
     *     
     */
    public Advertisement getAdvertisement() {
        return advertisement;
    }

    /**
     * Sets the value of the advertisement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Advertisement }
     *     
     */
    public void setAdvertisement(Advertisement value) {
        this.advertisement = value;
    }

    /**
     * Gets the value of the agreement property.
     * 
     */
    public boolean isAgreement() {
        return agreement;
    }

    /**
     * Sets the value of the agreement property.
     * 
     */
    public void setAgreement(boolean value) {
        this.agreement = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }

}
