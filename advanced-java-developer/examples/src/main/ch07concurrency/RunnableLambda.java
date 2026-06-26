package ch07concurrency;

public class RunnableLambda {

    public static void main(String[] args) {

        Thread thread0 = new Thread(
                () -> {
                    for (int i=1; i <= 10; i++) {
                        System.out.println(i + " sleeping for 500ms");
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            // keep going
                        }
                    }
                }
        );
        thread0.start();
        System.out.println("Finished");
    }
}
