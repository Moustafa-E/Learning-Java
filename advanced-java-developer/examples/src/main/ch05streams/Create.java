package main.ch05streams;

import java.util.List;
import java.util.stream.Stream;

public class Create {
    public static void main(String[] args) {
        
        // Creating streams manually
        Stream<String> empty = Stream.empty(); System.out.println(empty);
        Stream<Integer> singleElement = Stream.of(1); System.out.println(singleElement);
        Stream<Integer> manyElements = Stream.of(1,2,3,4); System.out.println(manyElements);

        // create stream from collection
        List<String> list = List.of("a", "b", "c", "d");
        Stream<String> streamFromList  = list.stream();
        streamFromList.forEach( s -> System.out.println(s + " "));

        // TODO: Figure out a terminal operation for the JVM streams. 
        // JVM generated streams. These are infinite. Use ctrl + c in terminal to stop
        /* 
        Stream<Double> randomNums = Stream.generate(Math::random); 
        randomNums.forEach( System.out::println );
        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
        oddNumbers.forEach( System.out::println ); 
        */
        // Lacking terminal operations. See Terminal.java

    }
}
