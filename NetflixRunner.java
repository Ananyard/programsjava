class NetflixRunner {
    public static void main(String[] args) {
        boolean accountCreated = Netflix.createAccount("Asha", "asha@netflix.com", 9876543210L, "Premium", 3);
        System.out.println("is accountCreated " + accountCreated);

        if (accountCreated) {
            Netflix.getAccountInfo();
        }
    }
}
