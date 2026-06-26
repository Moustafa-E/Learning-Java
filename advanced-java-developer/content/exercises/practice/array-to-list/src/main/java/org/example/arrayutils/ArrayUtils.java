package org.example.arrayutils;

import java.util.LinkedList;
import java.util.List;

public class ArrayUtils {

    public static <T> List<T> toList(T[] array) {

        LinkedList<T> list = new LinkedList<>();
        for (T object : array) {
            list.add(object);
        }
        return list;
    }

}
