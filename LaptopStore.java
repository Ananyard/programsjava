class LaptopStore {
    public static void main(String[] args) {
        laptop("Dell", 55000);
        laptop("HP", 48000);
        laptop("Asus", 60000);
    }

    public static void laptop(String name, int price) {
        System.out.println(name + " - ₹" + price);
    }
}
