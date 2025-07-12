class Customer {
    public static void buy(String vegetable, String quantity) {
        System.out.println("Customer: Entering the shop to purchase vegetables.");
        System.out.println("Customer: Bought " + vegetable + " in the quantity " + quantity + ".");
        System.out.println("Customer: Paying the amount for the purchase.");

        Shop.sell(vegetable, quantity);
    }
}
