package com.intraxxion.app;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class OmdbApiClient {

    public static void main(String[] args) throws IOException, InterruptedException {
        omdbClient(args);
    }
    public static void omdbClient(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newBuilder()
                            .version(Version.HTTP_2)
                            .followRedirects(Redirect.NORMAL)
//                            .authenticator(Authenticator.getDefault())
                            .build();

        String apiKey = "1e33b3bf";
        String movieTitle = "Top+Gun";
        String uri = "https://www.omdbapi.com/?apikey="+ apiKey +"&t=" + movieTitle + "&plot=full";

        System.out.println(uri);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .timeout(Duration.ofMinutes(2))
                .header("Content-Type", "application/json")
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}

