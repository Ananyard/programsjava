package com.xworkz.libraryapp.library;

import com.xworkz.libraryapp.book.Book;

public class Library {

    private Book[] books = new Book[14];
    private int index = 0;

    public boolean addBooks(Book book) {
        if (book != null && index < books.length) {
            books[index] = book;
            index++;
            return true;
        }
        System.out.println("Book is invalid or library is full!");
        return false;
    }

    public void getAllBooks() {
        System.out.println("📚 Library Book List:");
        for (int i = 0; i < index; i++) {
            Book book = books[i];
            System.out.println("Book Id: " + book.getBookId());
            System.out.println("Book Title: " + book.getBookName());
            System.out.println("Author: " + book.getAuthorName());
            System.out.println("Edition: " + book.getEdition());
            System.out.println("Published Year: " + book.getPublishedYear());
            System.out.println("Publisher: " + book.getPublisher());
            System.out.println("---------------------------");
        }
    }
}
