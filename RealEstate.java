class RealEstate {
    public static void main(String[] args) {
        property("2BHK", 4500000);
        property("3BHK", 6000000);
        location("Whitefield");
    }

    public static void property(String type, int price) {
        System.out.println(type + " - ₹" + price);
    }

    public static void location(String area) {
        System.out.println("Location: " + area);
    }
}
