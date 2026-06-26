package ch07concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor {

    public static void main(String[] args) {

        try (ExecutorService service = Executors.newSingleThreadExecutor()) {
            // single threaded, so the next 2 commands will run in sequence
            service.execute(() -> System.out.println("Hello"));
            service.execute(() -> System.out.println("Goodbye"));
            // no longer required because of try-with-resources
            //service.shutdown();
        }

        try (ExecutorService service = Executors.newFixedThreadPool(20)) {
            service.execute(() -> System.out.println("Hello again"));
            service.execute(() -> System.out.println("Goodbye again"));
        }
    }
}
