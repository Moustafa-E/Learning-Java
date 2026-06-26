package ch07concurrency;

public class Runnables implements Runnable {

    public static void main(String[] args) {
        Runnables runnables = new Runnables();
        new Thread(runnables).start();
        System.out.println("Finished");
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " says hello");
    }
}
