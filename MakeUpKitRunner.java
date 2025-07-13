class MakeUpKitRunner {
    public static void main(String[] args) {
        String brand = MakeUpKit.getBrand();
        System.out.println("Brand: " + brand);
        int items = MakeUpKit.getNumberOfItems();
        System.out.println("Number of items: " + items);
        boolean mirror = MakeUpKit.getHasMirror();
        System.out.println("Has mirror? " + mirror);
        String color = MakeUpKit.getCaseColor();
        System.out.println("Case color: " + color);
        double price = MakeUpKit.getPrice();
        System.out.println("Price: ₹" + price);
        boolean travel = MakeUpKit.getIsTravelFriendly();
        System.out.println("Travel-friendly? " + travel);
    }
}