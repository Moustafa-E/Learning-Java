package main.ch05streams;

import java.util.Optional;

public class Optionals {
    public static void main(String[] args) {
        Optional<Double> avg = average(10,20);
        if (avg.isPresent()) {
            System.out.println(avg.get());
        } else {
            System.out.println("At least 3 values required.");
        }

        System.out.println(average(10,20,30)); // >> Optional[20.0]
    }
    private static Optional<Double> average(int... values) { 
    // int... means it will take an array of arguments. Can be supplied as an array or like average(x,y,z,etc)
        
        if (values.length < 3) {
            return Optional.empty();
            // Won't execute remainder of function if true.
        }
        
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return Optional.of( (double) sum / values.length );
    }
}
