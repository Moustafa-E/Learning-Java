package main.ch05streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MapFilterCollect {
    public static void main(String[] args) {
        Collection<Integer> nums = List.of(1,2,3,4,5,6);
        int sumOfOddCubes = 0;

        ArrayList<Integer> oddCubes = nums.stream()
            .filter( n -> n % 2 == 1 )
            .map( n -> (int) Math.pow(n,3) )
            .collect( ArrayList::new, ArrayList::add, ArrayList::addAll);
        
        System.out.println(oddCubes);

        // to sum:
        sumOfOddCubes = nums.stream()
            .filter( n -> n % 2 == 1 )
            .mapToInt ( n -> n )
            .map( n -> (int) Math.pow(n, 3) )
            .sum();
        
        System.out.println("Sum using streams: " + sumOfOddCubes);
    }
}
