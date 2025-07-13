class UberRunner {
    public static void main(String[] args) {
        boolean created = Uber.createAccount("Ravi", "ravi@example.com", 9876543210L, "UPI", "Sedan", "Bangalore");
        System.out.println("Account created? " + created);
        if (created) {
            Uber.getAccount();
        }
    }
}
