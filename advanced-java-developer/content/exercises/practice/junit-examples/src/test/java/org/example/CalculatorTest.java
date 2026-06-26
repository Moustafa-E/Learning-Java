package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator;
    String str;

    // this method defines something that must happen before each test
    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(11, calculator.add(5,6));
    }

    @Test
    public void testStr() {
        assertNull(str);
    }

    @Test
    public void truth() {
        assertTrue(true);
    }

}
