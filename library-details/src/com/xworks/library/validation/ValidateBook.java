package com.xworks.library.validation;
import com.xworks.library.book.Book;
public class ValidateBook {
     Book book;

    public boolean validateBookInfo(Book book) {
        boolean validation = false;
        boolean validId = false;
        boolean validTitle = false;
        boolean validAuthor = false;
        boolean validDate = false;
        boolean validPrice = false;
        boolean validPages = false;

        if (book.getBookId() > 0) {
            validId = true;
        } else System.out.println("Invalid book ID");

        if (book.getTitle() != null && !book.getTitle().isEmpty()) {
            validTitle = true;
        } else System.out.println("Invalid title");

        if (book.getAuthor() != null && !book.getAuthor().isEmpty()) {
            validAuthor = true;
        } else System.out.println("Invalid author");

        if (book.getPublicationDate() != null && !book.getPublicationDate().isEmpty()) {
            validDate = true;
        } else System.out.println("Invalid publication date");

        if (book.getPrice() > 0) {
            validPrice = true;
        } else System.out.println("Invalid price");

        if (book.getPages() > 0) {
            validPages = true;
        } else System.out.println("Invalid number of pages");

        if (validId && validTitle && validAuthor && validDate && validPrice && validPages) {
            this.book = book;
            return true;
        }

        return validation;
    }
}
