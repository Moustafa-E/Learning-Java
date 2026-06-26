package org.example.lambdas.interfaces;

import org.example.lambdas.models.Person;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class InterfaceImplementationsTest {

    @Test
    public void testLongStringTester() {
        StringTester tester = s -> s.length() >= 10;
        assertTrue(tester.test("Hello World"));
    }

    @Test
    public void testAlphaCharsOrWhiteSpaceOnlyStringTester() {
        StringTester tester = s -> s.matches("[\\w\\s]+");
        assertTrue(tester.test("Hello World"));
    }

    @Test
    public void testUpperCaseStringTransformer() {
        StringTransformer transformer = s -> s.toUpperCase();
        assertEquals("HELLO WORLD", transformer.transform("Hello World"));
    }

    @Test
    public void testFirstWordStringTransformer() {
        StringTransformer transformer = s -> s.substring(0, s.indexOf(' '));
        assertEquals("Hello", transformer.transform("Hello World"));
    }

    @Test
    public void testEncryptedStringTransformer() {
        StringTransformer transformer = s -> {
            char[] original = s.toCharArray();
            char[] encrypted = new char[s.length()];
            for (int i=0; i < s.length(); i++) {
                encrypted[i] = (char) (original[i] + 1);
            }
            return new String(encrypted);
        };
        assertEquals("bcdef", transformer.transform("abcde"));
    }

    @Test
    public void testStringToLengthTransformer() {
        GenericTransformer<String, Integer> transformer = s -> s.length();
        assertEquals(11, transformer.transform("Hello World"));
    }

    @Test
    public void testStringToFirstCharTransformer() {
        GenericTransformer<String, Character> transformer = s -> s.charAt(0);
        assertEquals('H', transformer.transform("Hello World"));
    }

    @Test
    public void testPersonToFirstNameTransformer() {
        LocalDate dob = LocalDate.of(1944, 7, 30);
        Person person = new Person("Jimmy", "Cliff", dob, "???");
        GenericTransformer<Person, String> transformer = p -> p.getFirstName();
        assertEquals("Jimmy", transformer.transform(person));
    }

    @Test
    public void testPersonToFullNameTransformer() {
        LocalDate dob = LocalDate.of(1946, 8, 20);
        Person person = new Person("Ralph", "Hutter", dob, "???");
        GenericTransformer<Person, String> transformer = p -> p.getFirstName() + " " + p.getLastName();
        assertEquals("Ralph Hutter", transformer.transform(person));
    }
}
