class LegalCheck {
    public static void verifyLegality(String name, String property, String location, int budget, int price) {
        System.out.println(" Performing legal verification for the property: " + property);
        System.out.println("Property has no legal issues. Proceeding to physical verification...");

        PhysicalVerification.verifySite(name, property, location, budget, price);
    }
}
