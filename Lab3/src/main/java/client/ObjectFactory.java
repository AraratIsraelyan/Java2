
package client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateStatement_QNAME = new QName("http://moderate_advertisement/", "CreateStatement");
    private final static QName _CreateStatementResponse_QNAME = new QName("http://moderate_advertisement/", "CreateStatementResponse");
    private final static QName _AllowAdvertisementResponse_QNAME = new QName("http://moderate_advertisement/", "AllowAdvertisementResponse");
    private final static QName _AllowAdvertisement_QNAME = new QName("http://moderate_advertisement/", "AllowAdvertisement");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateStatementResponse }
     * 
     */
    public CreateStatementResponse createCreateStatementResponse() {
        return new CreateStatementResponse();
    }

    /**
     * Create an instance of {@link CreateStatement }
     * 
     */
    public CreateStatement createCreateStatement() {
        return new CreateStatement();
    }

    /**
     * Create an instance of {@link AllowAdvertisement }
     * 
     */
    public AllowAdvertisement createAllowAdvertisement() {
        return new AllowAdvertisement();
    }

    /**
     * Create an instance of {@link AllowAdvertisementResponse }
     * 
     */
    public AllowAdvertisementResponse createAllowAdvertisementResponse() {
        return new AllowAdvertisementResponse();
    }

    /**
     * Create an instance of {@link Advertisement }
     * 
     */
    public Advertisement createAdvertisement() {
        return new Advertisement();
    }

    /**
     * Create an instance of {@link Raster }
     * 
     */
    public Raster createRaster() {
        return new Raster();
    }

    /**
     * Create an instance of {@link ModerateAdvertisementStatement }
     * 
     */
    public ModerateAdvertisementStatement createModerateAdvertisementStatement() {
        return new ModerateAdvertisementStatement();
    }

    /**
     * Create an instance of {@link PostAdvertisementStatement }
     * 
     */
    public PostAdvertisementStatement createPostAdvertisementStatement() {
        return new PostAdvertisementStatement();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link BufferedImage }
     * 
     */
    public BufferedImage createBufferedImage() {
        return new BufferedImage();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateStatement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://moderate_advertisement/", name = "CreateStatement")
    public JAXBElement<CreateStatement> createCreateStatement(CreateStatement value) {
        return new JAXBElement<CreateStatement>(_CreateStatement_QNAME, CreateStatement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateStatementResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://moderate_advertisement/", name = "CreateStatementResponse")
    public JAXBElement<CreateStatementResponse> createCreateStatementResponse(CreateStatementResponse value) {
        return new JAXBElement<CreateStatementResponse>(_CreateStatementResponse_QNAME, CreateStatementResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllowAdvertisementResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://moderate_advertisement/", name = "AllowAdvertisementResponse")
    public JAXBElement<AllowAdvertisementResponse> createAllowAdvertisementResponse(AllowAdvertisementResponse value) {
        return new JAXBElement<AllowAdvertisementResponse>(_AllowAdvertisementResponse_QNAME, AllowAdvertisementResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllowAdvertisement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://moderate_advertisement/", name = "AllowAdvertisement")
    public JAXBElement<AllowAdvertisement> createAllowAdvertisement(AllowAdvertisement value) {
        return new JAXBElement<AllowAdvertisement>(_AllowAdvertisement_QNAME, AllowAdvertisement.class, null, value);
    }

}
