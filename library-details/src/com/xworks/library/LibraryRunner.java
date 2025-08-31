package com.xworks.library;
import com.xworks.library.book.Book;
import com.xworks.library.details.LibraryDetails;
public class LibraryRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        Book book = new Book();
        book.setBookId(101);
        book.setTitle("Java Programming");
        book.setAuthor("James Gosling");
        book.setPublicationDate("15 Aug 1995");
        book.setPrice(499.99);
        book.setPages(850);

        LibraryDetails details = new LibraryDetails();
        boolean added = details.addBook(book);
        System.out.println("Book added: " + added);

        if (added) {
            details.showBookDetails();
        }

        System.out.println("Main ended");
    }
}
