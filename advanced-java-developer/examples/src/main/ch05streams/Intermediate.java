package main.ch05streams;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class Intermediate {
    public static void main(String[] args) {
        System.out.println("Filer");
        Stream<String> stream = Stream.of("one", "two", "three");
        stream.filter( w -> w.contains("t") )
            .forEach( System.out::println );

        System.out.println("\nMap");
        stream = Stream.of("one", "two", "three");
        stream.map(String::length).forEach( System.out::println );

        System.out.println( "\nMultiple streams merged with flatmap");
        List<String> zero = List.of();
        List<String> one = List.of("one");
        List<String> two = List.of("two", "three");

        Stream<List<String>> statements = Stream.of(zero, one, two);
        statements.flatMap(Collection::stream).forEach(System.out::println);

        System.out.println("\nMapping with mapMulti");
        List<String> stringList = List.of("1", "two", "3", "4", "5");
        List<Object> nums = stringList.stream().mapMulti((str, consumer) -> {
            try {
                consumer.accept(Integer.parseInt(str));

            } catch (NumberFormatException e) {
                // ignore it idc
            }
        }).toList();

        nums.forEach(s -> System.out.println(s + " "));

        System.out.println("\nLimit and Skip");
        Stream<Integer> ints = Stream.iterate(1, n -> n + 1);
        // go to position 6 and return 5 values.
        ints.skip(5).limit(5).forEach(s -> System.out.println(s + " "));

        System.out.println("\nPeeked at and counted");
        stream = Stream.of("one", "two", "three");
        long counter = stream.filter( w -> w.contains("r"))
            .peek(System.out::println)
            .count();
        System.out.println("Number retrieved: " + counter);
    }
}
