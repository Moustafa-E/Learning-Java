package main.ch04NestedClassesAndLambda.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Compositions {
    public static void main(String[] args) {
        Predicate<Integer> p1 = n -> n > 5;
        Predicate<Integer> p2 = n -> n % 2 == 0;
        Predicate<Integer> p3 = p1.and(p2); // && doesn't directly work for some reason. 
        Predicate<Integer> p4 = n -> p1.test(n) && p2.test(n); 

        System.out.println(p3.test(8));
        System.out.println(p4.test(7));

        List<String> words = new ArrayList<>();
        Consumer<String> addToWords = words::add;
        Consumer<String> print = System.out::print;
        Consumer<String> both = addToWords.andThen(print);
        both.accept("Hello");
        both.accept("World");
        System.out.println("\n" + words);
    }
}
