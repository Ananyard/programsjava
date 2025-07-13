class DunzoRunner {
    public static void main(String[] args) {

        boolean accountCreated = Dunzo.createAccount("Rahul Verma", "rahul@dunzo.com", 9876543210L, "Koramangala", "UPI", true);
        System.out.println("is accountCreated " + accountCreated);

        if (accountCreated) {
            Dunzo.getAccountInfo();
        }
    }
}
