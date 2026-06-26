package ch07concurrency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWrite {

    public static void main(String[] args) {

        List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(4, 3, 25, 7));
        for (int item : list) {
            System.out.print(item + " ");
            list.add(9);
        }
        System.out.println(list.size());

        for (int item : list) {
            System.out.print(item + " ");
        }
    }
}
