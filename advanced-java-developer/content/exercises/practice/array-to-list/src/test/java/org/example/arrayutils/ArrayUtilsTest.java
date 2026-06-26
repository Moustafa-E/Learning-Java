package org.example.arrayutils;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArrayUtilsTest {

    @Test
    public void testToList() {
        List<String> list = ArrayUtils.toList(new String[] {"a", "b", "c"});
        assertTrue(list.contains("a"));
        assertTrue(list.contains("b"));
        assertTrue(list.contains("c"));
        assertEquals(3, list.size());
    }

}
