class BlinkitRunner {
    public static void main(String[] args) {
        double cost = Blinkit.takeOrder("Milk");
        System.out.println("The price is ₹" + cost);
    }
}
