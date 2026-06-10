package main.ch04NestedClassesAndLambda.functional;

import java.util.function.Predicate;

public class Predicates {

    public static void main(String[] args) {
        Predicate<String> p1 = s -> s.isEmpty();
        Predicate<String> p2 = String::isEmpty;

        System.out.println(p1.test(""));
        System.out.println(p2.test("hello"));
    }

}
