class BikeShowroom {
    public static void main(String[] args) {
        bike("Honda", 95000);
        bike("Royal Enfield", 160000);
        bike("Yamaha", 110000);
    }

    public static void bike(String brand, int price) {
        System.out.println(brand + " - ₹" + price);
    }
}
