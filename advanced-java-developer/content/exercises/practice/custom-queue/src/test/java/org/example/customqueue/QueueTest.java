package org.example.customqueue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class QueueTest {

    private Queue<String> queue;

    @BeforeEach
    public void setUp() {
        queue = new Queue<>(3);
    }

    @Test
    public void testAdd() throws Exception {
        //queue.add(LocalDate.now());
        queue.add("Hello");
        //queue.add(59);
        queue.add("Goodbye");
    }
}
