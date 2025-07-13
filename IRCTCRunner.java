class IRCTCRunner {
    public static void main(String[] args) {

        boolean accountCreated = IRCTC.createAccount("Sunil Kumar", "sunil@irctc.com", 9988776655L, "Aadhar", "Delhi", false);
        System.out.println("is accountCreated " + accountCreated);

        if (accountCreated) {
            IRCTC.getAccountInfo();
        }
    }
}
