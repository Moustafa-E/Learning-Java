package org.example.shoppingcart;

import java.util.Map;

public class CartApp {

    public static void main(String[] args) {

        Cart cart = new Cart();
        cart.add("milk", 1);
        cart.add("banana", 3);
        cart.add("tuna", 1);
        cart.add("apple", 1);
        cart.add("apple", 1);

        try {
            cart.remove("apple", 10);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Map<String,Integer> items = cart.getItems();
        for (String product : items.keySet()) {
            System.out.println(product + " - " + items.get(product));
        }

        try {
            cart.removeAll("apple");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Apples in the cart? " + cart.getItems().containsKey("apple"));
        // the next line will product an exception because items is unmodifiable
        //items.put("apple", 17);
    }
}
