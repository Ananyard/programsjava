class Registration {
    public static void register(String name, String property, String location, int budget, int price) {
        System.out.println("Registering the property " + property + " at location " + location + " for " + name);
        System.out.println(" Amount Paid: ₹" + price);
        System.out.println(" Congratulations " + name + "! Property registered successfully.");
    }
}
