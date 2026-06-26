package ch07concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class ProtectingData {

    //private volatile int count = 0;
    //private AtomicInteger count = new AtomicInteger(0);
    private int count = 0;

    public static void main(String[] args) {

        ProtectingData pd = new ProtectingData();
        ExecutorService service = Executors.newFixedThreadPool(20);

        for (int i=0; i < 10; i++) {
            service.submit( () -> pd.incrementAndReport() );
        }
        service.shutdown();;
    }

    private synchronized void incrementAndReport() {
        //count.addAndGet(1);
        //synchronized (this) {
            ++count;
            System.out.print(count + " ");
        //}
    }
}
