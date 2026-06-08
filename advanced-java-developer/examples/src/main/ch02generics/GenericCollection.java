package main.ch02generics;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GenericCollection {
    public static void main(String[] args) {
        // List is an interface, so notice you can't create a "new List()"
        List<String> stringList = new ArrayList<>(); // infers "String" in the ArrayList type parameter <>.
        
        stringList.add( "James" );
        stringList.add( LocalDate.now().toString() );
        stringList.add( ((Integer) 23).toString() );

        for (String item : stringList) {
            System.out.println(item.toUpperCase());
        }
    }
}
