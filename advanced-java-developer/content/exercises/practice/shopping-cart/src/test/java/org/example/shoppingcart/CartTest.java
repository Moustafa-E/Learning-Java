package org.example.shoppingcart;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CartTest {

    private Cart cart;

    @BeforeEach
    public void setUp() {
        cart = new Cart();
    }

    @Test
    public void testAdd() {
        cart.add("milk", 1);
        cart.add("banana", 3);
        cart.add("tuna", 1);
        assertEquals(1, cart.getItems().get("milk"));
        assertEquals(3, cart.getItems().get("banana"));
        assertEquals(1, cart.getItems().get("tuna"));
    }

    @Test
    public void testAddSameProductMultipleTimes() {
        cart.add("tuna", 1);
        cart.add("tuna", 2);
        assertEquals(1, cart.getItems().size());
        assertTrue(cart.getProducts().contains("tuna"));
        assertEquals(3, cart.getItems().get("tuna"));
    }

    @Test
    public void testRemove() throws Exception {
        cart.add("tuna", 2);
        cart.remove("tuna", 1);
        assertEquals(1, cart.getItems().size());
        assertTrue(cart.getProducts().contains("tuna"));
        assertEquals(1, cart.getItems().get("tuna"));
    }

    @Test
    public void testRemoveAll() throws Exception {
        cart.add("tuna", 2);
        cart.removeAll("tuna");
        assertEquals(0, cart.getItems().size());
    }

}
