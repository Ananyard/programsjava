class BookMyShowRunner {
    public static void main(String[] args) {

        boolean accountCreated = BookMyShow.createAccount("Kriti Mehra", "kriti@bms.com", 9123456789L, "Bengaluru", "Kannada", true);
        System.out.println("is accountCreated " + accountCreated);

        if (accountCreated) {
            BookMyShow.getAccountInfo();
        }
    }
}
