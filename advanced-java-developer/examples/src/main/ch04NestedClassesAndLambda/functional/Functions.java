package main.ch04NestedClassesAndLambda.functional;

import java.util.function.Function;

public class Functions {
    public static void main(String[] args) {
        Function<String, Integer> f1 = s -> s.length();
        System.out.println(f1.apply("football"));
    }
}
