package main.ch03collections;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        SortedSet<Integer> sortedSet = new TreeSet<>();
        
        int[] nums = {6,100,7,8,6};
        int[] moreNums = {3,5,2,4,6,1};
        
        for (int i : nums) {
            set.add(i);
            sortedSet.add(i);
        }

        List<Integer> evenMoreNums = new ArrayList<>(
            List.of(5,7,6,8,9,1)
        );
        
        evenMoreNums.addAll(evenMoreNums); // don't need a loop if you pass a Collection of things that extend Integer 
        // (hover over addAll() and check the upper bound wildcard parameter)

        System.out.println(set);
        System.out.println(sortedSet);

        

    }
}
