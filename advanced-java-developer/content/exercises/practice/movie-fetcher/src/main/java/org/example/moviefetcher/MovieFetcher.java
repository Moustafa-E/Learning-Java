package org.example.moviefetcher;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MovieFetcher {

    public static String fetchMovie(String omdbApiKey, String imdbID) throws Exception {
        var request = HttpRequest.newBuilder()
                .uri(URI.create(String.format("https://www.omdbapi.com/?apikey=%s&i=%s", omdbApiKey, imdbID)))
                .header("Cache-Control", "no-cache")
                .GET()
                .build();
        var response = HttpClient.newBuilder()
                .build()
                .send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}
