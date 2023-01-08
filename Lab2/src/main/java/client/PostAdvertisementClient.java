package client;

import org.camunda.bpm.client.ExternalTaskClient;

import java.awt.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class PostAdvertisementClient {

    private static URL getWSDLURL(String urlStr) {
        URL url = null;
        try {
            url = new URL(urlStr);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return url;
    }

    public User createUser() {
        User user = new User();

        user.setUserLogin("Login");
        user.setUserPassword("Pass");
        user.setUserAge(23);
        user.setUserEmail("email@email.ru");

        return user;
    }

    public String createAdName() {
        String adName = new String();

        adName = "AdName!";

        return adName;
    }

    public String createDescription() {
        String adDescription = new String();

        adDescription = "This is advertisement description!";

        return adDescription;
    }

    private void processClient(URL url) {
        PostAdvertisement searchDestination = new PostAdvertisement(url);
        PostAdvertisementService searchDestinationPort = searchDestination.getPostAdvertisementPort();

        User user = createUser();
        String adName = createAdName();
        String adDescription = createDescription();

        PostAdvertisementStatement statement = searchDestinationPort.createStatement(user, adName);
        statement = searchDestinationPort.editDescription(statement, adDescription);
        statement = searchDestinationPort.submitForReview(statement);

        System.out.println("Your advertisement was submitted for moderator review");
        System.out.println("Result will be sent to your Email");

        ExternalTaskClient client = ExternalTaskClient.create()
                .baseUrl("http://localhost:8080/engine-rest")
                .asyncResponseTimeout(10000) // long polling timeout
                .build();

        PostAdvertisementStatement finalStatement = statement;
        client.subscribe("create_topic")
                .lockDuration(1000) // the default lock duration is 20 seconds, but you can override this
                .handler((externalTask, externalTaskService) -> {

                    try {
                        Desktop.getDesktop().browse(new URI("https://docs.camunda.org/get-started/quick-start/complete"));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    //
                    Map<String, Object> map = new HashMap<>();
                    map.put("Post", finalStatement);

                    // Complete the task
                    externalTaskService.complete(externalTask, map);
                })
                .open();
    }

    public static void main(String[] args) {
        URL url = getWSDLURL("http://localhost:8081/PostAdvertisement");
        PostAdvertisementClient client = new PostAdvertisementClient();
        client.processClient(url);
    }
}
