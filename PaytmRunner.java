class PaytmRunner {
    public static void main(String[] args) {
        boolean created = Paytm.createAccount("Amit", "amit@example.com", 9876543212L, "amit123", true, "SBI Bank");
        System.out.println("Account created? " + created);
        if (created) {
            Paytm.getAccount();
        }
    }
}
