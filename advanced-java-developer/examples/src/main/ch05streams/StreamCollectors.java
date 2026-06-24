package main.ch05streams;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectors {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("b", "c", "a", "c", "d", "c");
        StringBuilder word = stream.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
        System.out.println(word);

        stream = Stream.of("b", "c", "a", "c", "d", "c");
        Set<String> set = stream.collect(Collectors.toSet());
        System.out.println(set);
        System.out.println(set.getClass());

        stream = Stream.of("b", "c", "a", "c", "d", "c", "a", "a");
        Set<String> set2 = stream.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
        System.out.println(set2);
        System.out.println(set2.getClass());

    }
}
