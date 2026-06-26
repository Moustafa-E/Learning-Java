package ch07concurrency;

import java.util.ArrayList;
import java.util.List;

public class DataProcessor {

    public static void main(String[] args) {
        DataProcessor processor = new DataProcessor();
        List<Integer> data = new ArrayList<>();
        for (int i=0; i < 2000; i++) {
            data.add(i);
        }
        long start = System.currentTimeMillis();
        processor.processAll(data);
        long finish = System.currentTimeMillis();
        System.out.println("Time taken: " + (finish - start) / 1000);
    }

    private void processAll(List<Integer> list) {
        //list.stream().map( i -> processElement(i)).toList();
        list.parallelStream().map( i -> processElement(i)).toList();
    }

    private int processElement(int input) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return input + 1;
    }
}
