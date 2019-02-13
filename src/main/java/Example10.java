import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import static java.net.http.HttpClient.Version.HTTP_2;

public class Example10 {
    public static void main(String[] args) throws URISyntaxException {
        HttpClient client = HttpClient
                .newBuilder()
                .version(HTTP_2)
                .build();

        CompletableFuture<HttpResponse<String>> httpResponseCompletableFuture = client.sendAsync(HttpRequest.newBuilder().GET().uri(new URI("https://github.com")).build(), HttpResponse.BodyHandlers.ofString());

        try {
            System.out.println(httpResponseCompletableFuture.get().body());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
