package main.ch04NestedClassesAndLambda.functional;

import java.util.function.Consumer;

public class Consumers {
    public static void main(String[] args) {
        Consumer<String> c1 = s -> System.out.println(s);
        Consumer<String> c2 = System.out::println;

        c1.accept("Hello");
        c2.accept("Goodbye");
    }
}
