package main.ch04NestedClassesAndLambda.functional;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Operators {
    public static void main(String[] args) {
        UnaryOperator<String> o1 = s -> s.toUpperCase();
        UnaryOperator<String> o2 = String::toUpperCase;
        
        System.out.println(o1.apply("edinburgh"));
        System.out.println(o2.apply("cairo"));

        BinaryOperator<String> bo1 = (str, toAdd) -> str.concat(toAdd);
        BinaryOperator<String> bo2 = String::concat;

        System.out.println(bo1.apply("football", "game"));
        System.out.println(bo2.apply("boxing", "match"));


    }
}
