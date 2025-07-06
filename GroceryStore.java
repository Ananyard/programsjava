class GroceryStore {

    public static void main(String[] args) {
        storeName();
        item( 2, 60);   
        item 3, 25);   
        openHours();
    }

    public static void storeName() {
        System.out.println("Store: GreenMart Supermarket");
    }

    public static void item(int quantity, int pricePerUnit) {
        int total = quantity * pricePerUnit;
        System.out.println( total);
    }

    public static void openHours() {
		String time = "Open: 8 AM to 9 PM";
        System.out.println(time);
    }
}
