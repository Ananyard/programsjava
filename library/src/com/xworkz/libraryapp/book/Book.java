package com.xworkz.libraryapp.book;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    private int bookId;
    private String bookName;
    private String authorName;
    private String edition;
    private int publishedYear;
    private String publisher;

}
