package ch07concurrency;

import java.util.List;
import java.util.stream.Stream;

public class ParallelStreams {

    public static void main(String[] args) {

        System.out.println("Serial");
        List.of(1,2,3,4,5,6).stream().forEach(n -> System.out.print(n + " "));

        System.out.println("\nParallel");
        List.of(1,2,3,4,5,6).parallelStream().forEach(n -> System.out.print(n + " "));

        System.out.println("\nParallel but ordered");
        List.of(1,2,3,4,5,6).parallelStream().forEachOrdered(n -> System.out.print(n + " "));

        System.out.println("\nParallel word");
        List<String> list = List.of("a","b","c","d");
        Stream<String> ps = list.parallelStream();
        String word = ps.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
        System.out.println(word);
    }

}
