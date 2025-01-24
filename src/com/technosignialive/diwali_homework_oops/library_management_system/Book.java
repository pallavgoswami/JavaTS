package com.technosignialive.diwali_homework_oops.library_management_system;
// 2.	Library Management
//	•	Create a Book class with attributes like title, author, and ISBN.
//	Create a Library class that contains a collection of Book objects. Add methods to add, remove, and search for books by title.


public class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
