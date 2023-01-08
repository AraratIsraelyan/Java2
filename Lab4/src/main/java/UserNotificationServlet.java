import client.Advertisement;
import client.ModerateAdvertisementStatement;
import client.PostAdvertisementStatement;
import client.User;
import org.camunda.bpm.client.ExternalTaskClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.awt.*;
import java.io.IOException;
import java.net.URI;

@Path("/user")
public class UserNotificationServlet {

    // http://localhost:8083/my-app/rest/user/notification

    public User createUser(String login, String password, int age, String email) {
        User user = new User();
        user.setUserLogin(login);
        user.setUserPassword(password);
        user.setUserAge(age);
        user.setUserEmail(email);
        return user;
    }

    public Advertisement createAdvertisement() {
        Advertisement advertisement = new Advertisement();
        advertisement.setAdName("I will sell the garage");
        advertisement.setAdDescription("Nice garage! Nice garage. You won't regret it!");
        return advertisement;
    }

    public PostAdvertisementStatement createPost() {
        PostAdvertisementStatement statement = new PostAdvertisementStatement();
        statement.setUser(createUser("Maksim", "Pass", 21, "evilmax@gmail.com"));
        statement.setAdvertisement(createAdvertisement());
        statement.setAgreement(true);
        return statement;
    }

    public ModerateAdvertisementStatement createModer() {
        ModerateAdvertisementStatement statement = new ModerateAdvertisementStatement();
        statement.setModerator(createUser("Moder", "Password", 25, "moderator@email.ru"));
        statement.setStatement(createPost());
        return statement;
    }

    @GET
    @Path("/notification")
    @Produces({MediaType.APPLICATION_JSON})
    public Response returnPurchaseResult() throws IOException {

        ModerateAdvertisementStatement statement = createModer();

        String message;

        ExternalTaskClient client = ExternalTaskClient.create()
                .baseUrl("http://localhost:8080/engine-rest")
                .asyncResponseTimeout(10000) // long polling timeout
                .build();

        client.subscribe("notification_topic")
                .lockDuration(1000) // the default lock duration is 20 seconds, but you can override this
                .handler((externalTask, externalTaskService) -> {

                    ModerateAdvertisementStatement statement1 = externalTask.getVariable("Moderate");

                    try {
                        Desktop.getDesktop().browse(new URI("https://docs.camunda.org/get-started/quick-start/complete"));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    // Complete the task
                    externalTaskService.complete(externalTask);
                })
                .open();

        message = " Dear <" + statement.getStatement().getUser().getUserLogin()
                + "> Your ad <" + statement.getStatement().getAdvertisement().getAdName()
                + "> has been verified by our moderator. \n The ad has been approved! \n " +
                "Further instructions have been sent to your email. \n Thanks for using our service! ;)";
        return Response.ok(message).build();
    }
}
