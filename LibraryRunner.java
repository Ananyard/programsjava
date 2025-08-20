class LibraryRunner{


public static void main(String[] lib){

Library library = new Library();
library.libraryId = 20;
library.libName = "krishna";
library.libRepName = "radha";

Shelf shelf = new Shelf();
library.shelf =  shelf;
shelf.noOfShelf = 25;
shelf.material = "wood";

Book book = new Book();
shelf.book = book;
book.bookName="rich dad poor dad";
book.noOfBooks= 1000;
book.bookId = 25;
book.barrowerName = "chin";
book.authName="rich";

library.getLibInfo();

}


}