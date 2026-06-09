package main.ch02generics;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {
    public static void main(String[] args) {

        List<Object> objectList = new ArrayList<>();
        objectList.add(new Object());
        printList(objectList); 
        addToList(objectList);

        List<String> stringList = new ArrayList<>();
        stringList.add("Java");
        stringList.add("Python");
        // printList(stringList); gives compiler error. Was expecting a list of Strings, not Objects. String does not extend Object.
        wildPrintList(stringList); 
        addToList(stringList);

        List<Integer> numberList = new ArrayList<>();
        numberList.add(5);
        numberList.add(6);

        System.out.println(total(numberList)); // this would also work with a list of Longs: List<Long> & 5L, 6L.


    }

    private static void printList(List<Object> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }
    // Accepts an arg that's evaluated when we run the method. Wildcard "?" means a list of "something"
    private static void wildPrintList(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }
    // Lower-bounded wildcards restrict the types accepted to anything that is a superclass to String, or String itself: <superclass> super <subclass>
    // Used for methods that consume data. PECS - Producer Extends Consumer Super
    private static void addToList(List<? super String> list) {
        list.add("additional element");
    }
    // Upper-bounded wildcards restrict accepted types to anything that extends Number or Number itself: <subclass> extends <superclass>
    // Used for methods that produce data.
    private static int total(List<? extends Number> list) {
        int sum = 0;
        for (Number number : list) {
            sum += number.intValue();
        }
        return sum;
    }


}
