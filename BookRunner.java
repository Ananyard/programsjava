class BookRunner {

    public static void main(String[] args) {

        String title = Book.getTitle();
        System.out.println("The book title is " + title);

        String author = Book.getAuthor();
        System.out.println("The author is " + author);

        int pages = Book.getPages();
        System.out.println("Total number of pages: " + pages);

        double price = Book.getPrice();
        System.out.println("The price is ₹" + price);

        boolean available = Book.getIsAvailable();
        System.out.println("Is the book available? " + available);

        String publisher = Book.getPublisher();
        System.out.println("Published by: " + publisher);
    }
}
