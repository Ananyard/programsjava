class ZomatoRunner {
    public static void main(String[] args) {

        boolean accountCreated = Zomato.createAccount("Priya Sharma", "priya@zomato.com", 9876543210L, "Mumbai", "Vegetarian", true);
        System.out.println("is accountCreated " + accountCreated);

        if (accountCreated) {
            Zomato.getAccountInfo();
        }
    }
}
