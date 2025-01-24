package com.technosignialive.diwali_homework_oops.library_management_system;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added: " + book);
    }

    public void removeBook(String title) {
        Book bookToRemove = searchBook(title);
        if (bookToRemove != null) {
            books.remove(bookToRemove);
            System.out.println("Removed: " + bookToRemove);
        } else {
            System.out.println("Book not found: " + title);
        }
    }

    public Book searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        System.out.println("Book not found: " + title);
        return null;
    }

    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            System.out.println("Books in the library:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}
