class RestaurantMenu {
    public static void main(String[] args) {
        restaurantName();
        item("Dosa", 40);
        item("Idli", 30);
        openHours();
    }

    public static void restaurantName() {
		String hotelName = " South Spice";
        System.out.println(hotelName);
    }

    public static void item(String name, int price) {
		
        System.out.println(name + " - ₹" + price);
    }

    public static void openHours() {
        System.out.println("Open: 7 AM to 10 PM");
    }
}
