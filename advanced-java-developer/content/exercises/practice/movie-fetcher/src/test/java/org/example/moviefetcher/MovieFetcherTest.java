package org.example.moviefetcher;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

import static org.example.moviefetcher.MovieFetcher.fetchMovie;

public class MovieFetcherTest {

    private String omdbApiKey = "d2205c8c";

    private List<String> getRandomImdbIDs(int numIDs) throws IOException {
        return Files.lines(Path.of("imdb-movies.csv"))
                .skip(1)
                .limit(numIDs)
                .map(row -> row.split(",")[0])
                .collect(Collectors.toList());
    }

    @Test
    public void testFetchMovieOneThread() throws IOException {
        long start = System.currentTimeMillis();
        getRandomImdbIDs(50).forEach(imdbId -> {
            try {
                String movie = fetchMovie(omdbApiKey, imdbId);
                System.out.println(movie);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        });
        System.out.println(System.currentTimeMillis() - start);
    } // 12512

    @Test
    public void testFetchMovieManyThreads() throws IOException {
        long start = System.currentTimeMillis();
        List<Future<String>> futures = new LinkedList<>();
        try (ExecutorService service = Executors.newFixedThreadPool(50)) {
            getRandomImdbIDs(50).forEach(imdbId -> {
                futures.add(service.submit(() -> fetchMovie(omdbApiKey, imdbId)));
            });
            futures.forEach(future -> {
                try {
                    String movie = future.get();
                    System.out.println(movie);
                } catch (InterruptedException | ExecutionException e) {
                    System.out.println(e.getMessage());
                }
            });
            System.out.println(System.currentTimeMillis() - start);
        }
    } // 2991 for 10, 2929 for 50

    @Test
    public void testFetchMovieParallelStream() throws IOException {
        long start = System.currentTimeMillis();
        getRandomImdbIDs(50).parallelStream()
                .map(imdbId -> {
                    try {
                        return fetchMovie(omdbApiKey, imdbId);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        return null;
                    }
                }).forEach(System.out::println);
        System.out.println(System.currentTimeMillis() - start);
    } // 2345
}
