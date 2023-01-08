package moderate_advertisement;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Endpoint;

@WebService(serviceName = "Moderate", portName = "ModeratePort")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class ModerateAdvertisementService {

    @WebMethod(operationName = "CreateStatement")
    public ModerateAdvertisementStatement createStatement(User moderator, PostAdvertisementStatement postAdvertisementStatement) {
        ModerateAdvertisementStatement statement = new ModerateAdvertisementStatement();

        statement.setModerator(moderator);
        statement.setStatement(postAdvertisementStatement);

        return statement;
    }

    @WebMethod(operationName = "AllowAdvertisement")
    public ModerateAdvertisementStatement allowAdvertisement(ModerateAdvertisementStatement statement, boolean result) throws InterruptedException {

        Thread.sleep(5000);

        statement.getStatement().setAgreement(result);

        if (result) {
            System.out.println("Advertisement was allowed.");
            System.out.println("Soon it will be posted on the website.");
        }
        else {
            System.out.println("Advertisement was denied.");
            System.out.println("Please correct the errors.");
        }

        return statement;
    }

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8082/ModerateAdvertisement", new ModerateAdvertisementService());
    }
}
