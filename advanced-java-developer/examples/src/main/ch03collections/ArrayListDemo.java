package main.ch03collections;

import java.util.List;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(100); // initial capacity can be defined by passing in an integer. 

        nums.add(1);
        nums.add(2);
        nums.add(3);
        
        nums.addFirst(0);
        nums.remove(3);

        for (int num : nums){
            System.out.println(num);
        }

        System.out.println(nums.size());
        System.out.println("index of 1: " + nums.indexOf(1));
    }

    
}
