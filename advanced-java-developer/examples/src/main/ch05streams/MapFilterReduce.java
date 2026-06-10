package main.ch05streams;

import java.util.Collection;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;


public class MapFilterReduce {
    public static void main(String[] args) {
        Collection<Integer> nums = List.of(1,2,3,4,5,6);
        int sumOfOddCubes = 0;

        for (int num : nums) {
            if (num % 2 == 1) {
                double cube = Math.pow(num, 3);
                sumOfOddCubes += cube;
            }
        }

        System.out.println("Sum using traditional loop: " + sumOfOddCubes);

        Predicate<Integer> isOdd = n -> n % 2 == 1;
        Function<Integer, Integer> toCube = n -> (int) Math.pow(n,3);
        BinaryOperator<Integer> sum = (total, n) -> total + n;
        
        sumOfOddCubes = nums.stream()
            .filter(isOdd)
            .map(toCube)
            .reduce(0, sum);
        
        System.out.println("Sum using streams: " + sum);
        
    }
}
