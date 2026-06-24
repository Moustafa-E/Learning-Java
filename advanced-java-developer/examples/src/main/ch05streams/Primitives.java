package main.ch05streams;

import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Primitives {
    public static void main(String[] args) {
        
        // without primitive streams
        System.out.println("sum");
        Stream<Integer> nonPrimitive = Stream.of(60,70,80);
        System.out.println(nonPrimitive.mapToInt( n -> n ).sum());

        // using primitive streams
        System.out.println("\nAverage");
        IntStream intStream = IntStream.of(60,70,80);
        OptionalDouble opt = intStream.average();
        if (opt.isPresent()){
            System.out.println(opt.getAsDouble());
        }

        System.out.println("\nRange 1-10");
        intStream = IntStream.iterate(1, n -> n+1).limit(10); //IntStream.range(1,11) where 11 is exclusive. IntStream.rangeClosed(1,10) for inclusive end
        System.out.println(range(intStream));
    }

    private static int range(IntStream is) {
        IntSummaryStatistics stats = is.summaryStatistics();
        return stats.getMax() - stats.getMin();
    }

}
