class PhysicalVerification {
    public static void verifySite(String name, String property, String location, int budget, int price) {
        System.out.println("Visiting the site: " + property + " located at " + location);
        System.out.println("Site verified physically. All looks good.");

        Registration.register(name, property, location, budget, price);
    }
}
