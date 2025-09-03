package com.xworkz.libraryapp;

import com.xworkz.libraryapp.book.Book;
import com.xworkz.libraryapp.library.Library;

public class LibraryRunner {
    public static void main(String[] args){
        Book book = new Book();
        book.setBookId(1);
        book.setBookName("The Great Gatsby");

        Book book1 = new Book();
        book1.setBookId(2);
        book1.setBookName("A Brief History of Time");

        Book book2 = new Book();
        book2.setBookId(3);
        book2.setBookName("Wings of Fire");

        Book book3 = new Book();
        book3.setBookId(4);
        book3.setBookName("Harry Potter and the Philosopher’s Stone");

        Book book4 = new Book();
        book4.setBookId(5);
        book4.setBookName("War and Peace");

        Book book5 = new Book();
        book5.setBookId(6);
        book5.setBookName("The Alchemist");

        Book book6 = new Book();
        book6.setBookId(7);
        book6.setBookName("The Discovery of India");

        Book book7 = new Book();
        book7.setBookId(8);
        book7.setBookName("Pride and Prejudice");

        Book book8 = new Book();
        book8.setBookId(9);
        book8.setBookName("Data Structures and Algorithms in Python");

        Book book9 = new Book();
        book9.setBookId(10);
        book9.setBookName("The Art of War");

        Book book10 = new Book();
        book10.setBookId(11);
        book10.setBookName("The Bhagavad Gita");

        Book book11 = new Book();
        book11.setBookId(12);
        book11.setBookName("To Kill a Mockingbird");

        Book book12 = new Book();
        book12.setBookId(13);
        book12.setBookName("The Lean Startup");

        Book book13 = new Book();
        book13.setBookId(14);
        book13.setBookName("The Lean Startup");

        Library library = new Library();

        library.addBooks(book);
        library.addBooks(book1);
        library.addBooks(book2);
        library.addBooks(book3);
        library.addBooks(book4);
        library.addBooks(book5);
        library.addBooks(book6);
        library.addBooks(book7);
        library.addBooks(book8);
        library.addBooks(book9);
        library.addBooks(book10);
        library.addBooks(book11);
        library.addBooks(book12);
        library.addBooks(book13);

        library.getAllBooks();
    }
}
