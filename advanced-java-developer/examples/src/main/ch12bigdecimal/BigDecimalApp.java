package ch12bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalApp {

    public static void main(String[] args) {

        // BigDecimal is a class that we use to represent numbers with a high degree of precision
        // We can for calculations where accuracy is very important, notably financial calculations
        // The numbers consist of an unscaled value and a scale (the number of decimal places)
        // eg 7.34 has an unscaled value of 734 and a scale of 2
        BigDecimal bd1 = new BigDecimal("0.1");
        BigDecimal bd2 = new BigDecimal(new char[]{'7','.','3','4'});
        BigDecimal bd3 = new BigDecimal(427);
        System.out.println(bd1);
        System.out.println(bd2);
        System.out.println(bd3);
        // doubles can still be trouble
        BigDecimal bd4 = new BigDecimal(0.1); // unpredictable new BigDecimal call
        System.out.println(bd4);
        // use valueOf() to convert a double to a String first
        BigDecimal bd5 = BigDecimal.valueOf(0.1);
        System.out.println(bd5);
        System.out.println(bd1.compareTo(bd5) == 0 ? "equal" : "not equal");
        System.out.println(bd1.compareTo(bd4) == 0 ? "equal" : "not equal");
        BigDecimal bd6 = new BigDecimal(0.10);
        System.out.println(bd1.compareTo(bd6) == 0 ? "equal" : "not equal");

        // BigDecimal is immutable, so methods like add(), subtract(), etc. return a new BigDecimal
        BigDecimal sum = bd1.add(bd2).add(bd5);
        System.out.println(sum);
        // round to 2 decimal places
        BigDecimal bd7 = new BigDecimal("1234.665");
        System.out.println(bd7.setScale(2, RoundingMode.HALF_UP));
        System.out.println(bd7.setScale(2, RoundingMode.HALF_EVEN));
        
    }
}
