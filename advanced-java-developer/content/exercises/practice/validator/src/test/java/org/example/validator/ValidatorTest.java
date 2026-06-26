package org.example.validator;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class ValidatorTest {

    @Test
    public void testValidatorWithNotBlank() throws IllegalAccessException {
        Validator validator = new Validator();
        Map<String, List<String>> errors = validator.validate(new Person(null, 37), Person.class);
        assertEquals(1, errors.size());
        assertEquals(1, errors.get("name").size());
        assertTrue(errors.get("name").contains("name is blank"));
    }

    @Test
    public void testValidatorWithInRange() throws IllegalAccessException {
        Validator validator = new Validator();
        Map<String, List<String>> errors = validator.validate(new Person("Steve", -37), Person.class);
        assertEquals(1, errors.size());
        assertEquals(1, errors.get("age").size());
        assertTrue(errors.get("age").contains("age is out of range"));
    }

    @Test
    public void testValidatorWithNotBlankAndInRange() throws IllegalAccessException {
        Validator validator = new Validator();
        Map<String, List<String>> errors = validator.validate(new Person(null, -37), Person.class);
        assertEquals(2, errors.size());
        assertEquals(1, errors.get("name").size());
        assertEquals(1, errors.get("age").size());
        assertTrue(errors.get("name").contains("name is blank"));
        assertTrue(errors.get("age").contains("age is out of range"));
    }
}
