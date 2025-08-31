package com.xworks.library.details;
import com.xworks.library.book.Book;
import com.xworks.library.validation.ValidateBook;
public class LibraryDetails {
     Book book;

    public boolean addBook(Book book) {
        ValidateBook validateBook = new ValidateBook();
        boolean isValid = validateBook.validateBookInfo(book);

        if (isValid) {
            this.book = book;
            return true;
        }
        return false;
    }

    public void showBookDetails() {
        System.out.println("Book ID: " + book.getBookId());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Publication Date: " + book.getPublicationDate());
        System.out.println("Price: ₹" + book.getPrice());
        System.out.println("Pages: " + book.getPages());
    }
}
