package org.example.bookstore.stores;

import org.example.bookstore.models.Book;

import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

public class BookStore {

    private List<Book> books;
    private static final Logger logger = Logger.getLogger(BookStore.class.getName());

    public BookStore() {
        books = new LinkedList<>();
    }

    public void addBook(Book book) {
        logger.info(String.format("Adding book: %s\n", book));
        if (!bookIsAlreadyInTheStore(book.getTitle())) {
            books.add(book);
        } else {
            logger.warning(String.format("Tried to add a duplicate book: %s\n", book));
        }
    }

    private boolean bookIsAlreadyInTheStore(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }
        return false;
    }

    public int numBooks() {
        return books.size();
    }

    public List<Book> findByPartialTitle(String partialTitle) {
        List<Book> matchingBooks = new LinkedList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(partialTitle.toLowerCase())) {
                matchingBooks.add(book);
            }
        }
        return matchingBooks;
    }

    public List<Book> findByAuthor(String author) {
        List<Book> matchingBooks = new LinkedList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                matchingBooks.add(book);
            }
        }
        return matchingBooks;
    }
}
