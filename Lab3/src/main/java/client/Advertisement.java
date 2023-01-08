
package client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for advertisement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="advertisement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adPreview" type="{http://moderate_advertisement/}bufferedImage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "advertisement", propOrder = {
    "adDescription",
    "adName",
    "adPreview"
})
public class Advertisement {

    protected String adDescription;
    protected String adName;
    protected BufferedImage adPreview;

    /**
     * Gets the value of the adDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdDescription() {
        return adDescription;
    }

    /**
     * Sets the value of the adDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdDescription(String value) {
        this.adDescription = value;
    }

    /**
     * Gets the value of the adName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdName() {
        return adName;
    }

    /**
     * Sets the value of the adName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdName(String value) {
        this.adName = value;
    }

    /**
     * Gets the value of the adPreview property.
     * 
     * @return
     *     possible object is
     *     {@link BufferedImage }
     *     
     */
    public BufferedImage getAdPreview() {
        return adPreview;
    }

    /**
     * Sets the value of the adPreview property.
     * 
     * @param value
     *     allowed object is
     *     {@link BufferedImage }
     *     
     */
    public void setAdPreview(BufferedImage value) {
        this.adPreview = value;
    }

}
