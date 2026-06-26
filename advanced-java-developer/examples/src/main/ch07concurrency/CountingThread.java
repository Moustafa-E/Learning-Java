package ch07concurrency;

public class CountingThread {

    public static void main(String[] args) {
        CountingThreadClass thread0 = new CountingThreadClass(1, 500);
        CountingThreadClass thread1 = new CountingThreadClass(1000, 1500);
        thread0.start();
        thread1.start();
    }

    static class CountingThreadClass extends Thread {
        private int start;
        private int finish;

        public CountingThreadClass(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }

        public void run() {
            System.out.println(getName() + " started...");
            for (int i = start; i <= finish; i++) {
                System.out.print(i + " ");
            }
            System.out.println(getName() + " finished!");
        }
    }

}
