class SwiggyRunner {
    public static void main(String[] args) {
        boolean created = Swiggy.createAccount("Sneha", "sneha@example.com", 9876543211L, "Koramangala", "Veg", "Card");
        System.out.println("Account created? " + created);
        if (created) {
            Swiggy.getAccount();
        }
    }
}
