class DocumentCheck {
    public static void verifyDocuments(String name, String property, String location, int budget, int price) {
        System.out.println(" Checking document verification for the property: " + property);
        System.out.println(" Owner: " + name);
        System.out.println(" Location: " + location);

        
        LegalCheck.verifyLegality(name, property, location, budget, price);
    }
}
