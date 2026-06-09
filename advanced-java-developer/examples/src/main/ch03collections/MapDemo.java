package main.ch03collections;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> cities = new HashMap<>();
        cities.put("Shanghai", 23_000_000);
        cities.put("Cairo", 17_000_000);
        cities.put("London", (9_000_000));
        cities.put("Shanghai", 22_000_000); // Overrides the first one. 

        System.out.println(cities);
        System.out.println(cities.size());
        System.out.println(cities.get("Paris"));
        System.out.println(cities.containsKey("Cairo"));
        System.out.println(cities.containsValue(1_000_000));
        System.out.println(cities.entrySet() + "\n");
        
        for (String key : cities.keySet()) {
            System.out.println(key + " - " + cities.get(key));
        }

        NavigableMap<String, Integer> cities2 = new TreeMap<>(cities);
        System.out.println(cities2);
        cities2 = cities2.descendingMap();
        System.out.println(cities2);

    }
}
