package org.example.shoppingcart;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Cart {

    private Map<String, Integer> items;

    public Cart() {
        items = new HashMap<>();
    }

    public void add(String product, int qty) {
        product = product.toLowerCase();
        if (items.containsKey(product)) {
            int currentQty = items.get(product) + qty;
            items.put(product, currentQty);
        } else {
            items.put(product, qty);
        }
    }

    public void remove(String product, int qty) throws Exception {
        product = product.toLowerCase();
        if (items.containsKey(product)) {
            int currentQty = items.get(product);
            if (currentQty - qty >= 0) {
                currentQty -= qty;
                items.put(product, currentQty);
            } else {
                throw new Exception("You only have " + items.get(product) + " in the cart");
            }
        } else {
            throw new Exception(product + " is not in the cart");
        }
    }

    public void removeAll(String product) throws Exception {
        product = product.toLowerCase();
        if (items.containsKey(product)) {
            items.remove(product);
        } else {
            throw new Exception(product + " was never in the cart");
        }
    }

    public Set<String> getProducts() {
        return items.keySet();
    }

    public Map<String, Integer> getItems() {
        return Collections.unmodifiableMap(items);
    }
}
