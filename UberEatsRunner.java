class UberEatsRunner {
    public static void main(String[] args) {
        double price = UberEats.takeOrder("Pizza");
        System.out.println("The price is ₹" + price);
    }
}
