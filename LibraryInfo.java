class class LibraryInfo {

    public static void main(String[] args) {
        bookCount();                    
        librarianName("Meera");         
        openHours();                    
        totalBooksBorrowed(120, 35);    
    }

    public static void bookCount() {
        int books = 5000;
        System.out.println("Total Books in Library: " + books);
    }

    public static void librarianName(String name) {
        System.out.println("Librarian: " + name);
    }

    public static void openHours() {
        System.out.println("Library Timings: 9 AM to 5 PM");
    }

    public static void totalBooksBorrowed(int fiction, int nonFiction) {
        int total = fiction + nonFiction;
        System.out.println(total);
    }
}
