package com.example.shoppingcart;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Cart {
    // 1 cart, many items in a map. 
    private Map<String, Integer> items;
    public Cart(){
        items = new HashMap<>();
    }
    public void add(String product, int quantity){
        product = product.toLowerCase();
        if (items.containsKey(product)) {

            int currentQuantity = items.get(product);
            items.put(product, quantity + currentQuantity);
        
        } else {
            items.put(product, quantity);
        }
    }
    public void remove(String product, int quantity) throws Exception {
        product = product.toLowerCase();
        if (items.containsKey(product)){
            int currentQuantity = items.get(product);
            int newQuantity = currentQuantity - quantity;
            items.put(product, newQuantity < 0 ? 0 : newQuantity );
        } else {
            throw new Exception("product not in map");
        }
    }
    
    public void removeAll(String product) throws Exception{
        if (items.containsKey(product)){
            items.remove(product);
        } else {
            throw new Exception("product not in map");
        }
    }

    public Set<String> getProducts() {
        return items.keySet();
    }
    public Map<String, Integer> getItems() {
        return Collections.unmodifiableMap(items);
    } 


}
