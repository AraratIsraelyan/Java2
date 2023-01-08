
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

    private final static QName _SubmitForReview_QNAME = new QName("http://post_advertisement/", "SubmitForReview");
    private final static QName _SubmitForReviewResponse_QNAME = new QName("http://post_advertisement/", "SubmitForReviewResponse");
    private final static QName _CreateStatement_QNAME = new QName("http://post_advertisement/", "CreateStatement");
    private final static QName _CreateStatementResponse_QNAME = new QName("http://post_advertisement/", "CreateStatementResponse");
    private final static QName _EditDescriptionResponse_QNAME = new QName("http://post_advertisement/", "EditDescriptionResponse");
    private final static QName _EditDescription_QNAME = new QName("http://post_advertisement/", "EditDescription");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EditDescription }
     * 
     */
    public EditDescription createEditDescription() {
        return new EditDescription();
    }

    /**
     * Create an instance of {@link CreateStatementResponse }
     * 
     */
    public CreateStatementResponse createCreateStatementResponse() {
        return new CreateStatementResponse();
    }

    /**
     * Create an instance of {@link EditDescriptionResponse }
     * 
     */
    public EditDescriptionResponse createEditDescriptionResponse() {
        return new EditDescriptionResponse();
    }

    /**
     * Create an instance of {@link CreateStatement }
     * 
     */
    public CreateStatement createCreateStatement() {
        return new CreateStatement();
    }

    /**
     * Create an instance of {@link SubmitForReviewResponse }
     * 
     */
    public SubmitForReviewResponse createSubmitForReviewResponse() {
        return new SubmitForReviewResponse();
    }

    /**
     * Create an instance of {@link SubmitForReview }
     * 
     */
    public SubmitForReview createSubmitForReview() {
        return new SubmitForReview();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitForReview }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://post_advertisement/", name = "SubmitForReview")
    public JAXBElement<SubmitForReview> createSubmitForReview(SubmitForReview value) {
        return new JAXBElement<SubmitForReview>(_SubmitForReview_QNAME, SubmitForReview.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitForReviewResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://post_advertisement/", name = "SubmitForReviewResponse")
    public JAXBElement<SubmitForReviewResponse> createSubmitForReviewResponse(SubmitForReviewResponse value) {
        return new JAXBElement<SubmitForReviewResponse>(_SubmitForReviewResponse_QNAME, SubmitForReviewResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateStatement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://post_advertisement/", name = "CreateStatement")
    public JAXBElement<CreateStatement> createCreateStatement(CreateStatement value) {
        return new JAXBElement<CreateStatement>(_CreateStatement_QNAME, CreateStatement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateStatementResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://post_advertisement/", name = "CreateStatementResponse")
    public JAXBElement<CreateStatementResponse> createCreateStatementResponse(CreateStatementResponse value) {
        return new JAXBElement<CreateStatementResponse>(_CreateStatementResponse_QNAME, CreateStatementResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditDescriptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://post_advertisement/", name = "EditDescriptionResponse")
    public JAXBElement<EditDescriptionResponse> createEditDescriptionResponse(EditDescriptionResponse value) {
        return new JAXBElement<EditDescriptionResponse>(_EditDescriptionResponse_QNAME, EditDescriptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://post_advertisement/", name = "EditDescription")
    public JAXBElement<EditDescription> createEditDescription(EditDescription value) {
        return new JAXBElement<EditDescription>(_EditDescription_QNAME, EditDescription.class, null, value);
    }

}
