package main.ch05streams;

import java.util.stream.Stream;

public class Terminal {
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("one", "two", "three");
        System.out.println(stream.count());
        // System.out.println(stream.count()); 
        // ^ trying this again will give an exception because using println() on a stream will terminate it.
        stream = Stream.of("one", "two", "three");
        System.out.println( stream.max( (s1, s2) -> s1.length() - s2.length()) ); // min() same syntax
    }
}
