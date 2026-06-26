package ch07concurrency;

public class Joins {

    public static void main(String[] args) {

        Thread thread0 = new Thread( () -> System.out.println("Hello") );
        thread0.start();
        try {
            thread0.join();
        } catch (InterruptedException e) {
            // keep going
        }
        System.out.println("Goodbye");
    }
}
