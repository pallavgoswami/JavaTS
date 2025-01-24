package com.technosignialive.diwali_homework_oops.library_management_system;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // books creation
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084");
        Book book2 = new Book("Harry Potter", "JK Rowling", "9780061124857");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780061124627");

        // Add to library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // List all books
        library.listBooks();

        // Search for a book
        library.searchBook("1984");

        // Remove a book
        library.removeBook("The Great Gatsby");

        // List books after removal
        library.listBooks();

    }
}
