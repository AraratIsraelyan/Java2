package post_advertisement;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Endpoint;

@WebService(serviceName = "PostAdvertisement", portName = "PostAdvertisementPort")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class PostAdvertisementService {

    @WebMethod(operationName = "CreateStatement")
    public PostAdvertisementStatement createStatement(User user, String adName) {
        PostAdvertisementStatement statement = new PostAdvertisementStatement();
        Advertisement advertisement = new Advertisement();
        advertisement.setAdName(adName);
        statement.setUser(user);
        statement.setAdvertisement(advertisement);
        return statement;
    }

    @WebMethod(operationName = "EditDescription")
    public PostAdvertisementStatement editAdvertisement(PostAdvertisementStatement statement, String description) {

        Advertisement advertisement = new Advertisement();
        advertisement.setAdName(statement.getAdvertisement().getAdName());
        advertisement.setAdDescription(description);

        statement.setAdvertisement(advertisement);
        System.out.println("Your advertisement was submitted fow moderator review");

        return statement;
    }

    @WebMethod(operationName = "SubmitForReview")
    public PostAdvertisementStatement showRelevantStations(PostAdvertisementStatement statement) {

        statement.setAgreement(false);

        System.out.println("Your advertisement was submitted for moderator review");
        System.out.println("Result will be sent to your Email");

        return statement;
    }

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8081/PostAdvertisement", new PostAdvertisementService());
    }
}
