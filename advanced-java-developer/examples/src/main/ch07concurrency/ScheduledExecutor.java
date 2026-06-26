package ch07concurrency;

import java.util.concurrent.*;

public class ScheduledExecutor {

    public static void main(String[] args) {

        ScheduledExecutorService service = Executors.newScheduledThreadPool(20);
        Runnable task1 = () -> System.out.println("task 1 complete");
        Callable<Double> task2 = () -> 45 * 22 * 5.7;
        service.schedule(task1, 10, TimeUnit.SECONDS);
        Future<Double> result = service.schedule(task2, 5, TimeUnit.SECONDS);
        try {
            System.out.println(result.get());
        } catch (InterruptedException | ExecutionException e) {
            System.out.println(e.getMessage());
        }
        service.shutdown();
    }
}
