package org.example.bookstore.models;

import java.util.logging.Logger;

public class Book {

    private String title;
    private String author;
    private static final Logger logger = Logger.getLogger(Book.class.getName());

    public Book(String title, String author) {
        logger.info(String.format("Constructing Book with title=%s and author=%s\n", title, author));
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
