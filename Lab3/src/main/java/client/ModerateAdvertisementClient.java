package client;

import org.camunda.bpm.client.ExternalTaskClient;

import javax.xml.ws.Response;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.logging.Logger;

public class ModerateAdvertisementClient {

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

	public User createModerator() {

		User user = new User();
		user.setUserLogin("Moderator");
		user.setUserPassword("Pass");
		user.setUserEmail("moderator@email.ru");
		user.setUserAge(25);

		return user;
	}

	public PostAdvertisementStatement createAdvertisementStatement(User user) {

		PostAdvertisementStatement statement = new PostAdvertisementStatement();
		statement.setUser(user);
		statement.setAdvertisement(null);
		statement.setAgreement(false);

		return statement;
	}

	public ModerateAdvertisementStatement processPolling(URL url, PostAdvertisementStatement postAdvertisementStatement)
	{

		User user = createModerator();
		// PostAdvertisementStatement postAdvertisementStatement = createAdvertisementStatement(user);

		Random random = new Random();
		boolean result = random.nextBoolean();

		Moderate svc = new Moderate(url);
		ModerateAdvertisementService port = svc.getModeratePort();
		ModerateAdvertisementStatement statement = port.createStatement(user, postAdvertisementStatement);
		Response<AllowAdvertisementResponse> response = port.allowAdvertisementAsync(statement, result);
		ModerateAdvertisementStatement statement1 = new ModerateAdvertisementStatement();
		System.out.println("Polling started");
		while(!response.isDone()) {
			try {
				System.out.println("Polling...");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {

			statement1 = response.get().getReturn();

			if (result) {
				System.out.println("Advertisement was allowed.");
			}
			else {
				System.out.println("Advertisement was denied.");
			}

			System.out.println("The result was sent to the user.");

		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		return statement1;
	}

	public void process(URL url) {
		ExternalTaskClient client = ExternalTaskClient.create()
				.baseUrl("http://localhost:8080/engine-rest")
				.asyncResponseTimeout(10000) // long polling timeout
				.build();

		client.subscribe("moderate_topic")
				.lockDuration(1000) // the default lock duration is 20 seconds, but you can override this
				.handler((externalTask, externalTaskService) -> {

					PostAdvertisementStatement postAdvertisementStatement = externalTask.getVariable("Post");
					ModerateAdvertisementStatement statement = processPolling(url, postAdvertisementStatement);

					try {
						Desktop.getDesktop().browse(new URI("https://docs.camunda.org/get-started/quick-start/complete"));
					} catch (Exception e) {
						e.printStackTrace();
					}
					//
					Map<String, Object> map = new HashMap<>();
					map.put("Moderate", statement);
					map.put("isAgreed", statement.getStatement().isAgreement());

					// Complete the task
					externalTaskService.complete(externalTask, map);
				})
				.open();
	}

	public static void main(String[] args) {
		URL url = getWSDLURL("http://localhost:8082/ModerateAdvertisement");
		ModerateAdvertisementClient client = new ModerateAdvertisementClient();
		client.process(url);
	}

}
