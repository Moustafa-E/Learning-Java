package org.example.bookstore.stores;

import org.example.bookstore.models.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.LogManager;

import static org.junit.jupiter.api.Assertions.*;

public class BookStoreTest {

    private BookStore bookStore;
    private Book animalFarm;

    static {
        InputStream inputStream = BookStoreTest.class.getResourceAsStream("/logging.properties");
        try {
            LogManager.getLogManager().readConfiguration(inputStream);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @BeforeEach
    public void setUp() {
        bookStore = new BookStore();
        animalFarm = new Book("Animal Farm", "George Orwell");
    }

    @Test
    public void testAddNewBook() {
        bookStore.addBook(animalFarm);
        assertEquals(1, bookStore.numBooks());
    }

    @Test
    public void testAddDuplicateBook() {
        bookStore.addBook(animalFarm);
        bookStore.addBook(animalFarm);
        assertEquals(1, bookStore.numBooks());
    }
    @Test
    public void testFindByPartialTitleWhenThereAreMatchingTitles() {
        bookStore.addBook(animalFarm);
        assertEquals(1, bookStore.findByPartialTitle("far").size());
    }

    @Test
    public void testFindByPartialTitleWhenThereAreNoMatchingTitles() {
        assertEquals(0, bookStore.findByPartialTitle("far").size());
    }

}
