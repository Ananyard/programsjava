class Broker {
    public static void brokerage(String vegetable, String quantity) {
        System.out.println("Broker: Handling " + vegetable + ", quantity: " + quantity);
        Farmer.farm(vegetable, quantity); // Only call Farmer
    }
}