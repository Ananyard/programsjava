class MobileStore {
    public static void main(String[] args) {
        brand("Samsung", 20000);
        brand("Redmi", 15000);
        brand("iPhone", 80000);
    }

    public static void brand(String name, int price) {
        System.out.println(name + " - ₹" + price);
    }
}
