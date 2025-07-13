class Paytm {
    static String name;
    static String email;
    static long phone;
    static String password;
    static boolean isKYCVerified;
    static String linkedBank;

    public static boolean createAccount(String n, String e, long p, String pass, boolean kyc, String bank) {
        boolean isValid = true;

        if (n != null) {
            name = n;
        } else {
            System.out.println("Name invalid");
            isValid = false;
        }

        if (e != null) {
            email = e;
        } else {
            System.out.println("Email invalid");
            isValid = false;
        }

        if (p > 0) {
            phone = p;
        } else {
            System.out.println("Phone invalid");
            isValid = false;
        }

        if (pass != null) {
            password = pass;
        } else {
            System.out.println("Password invalid");
            isValid = false;
        }

        isKYCVerified = kyc;

        if (bank != null) {
            linkedBank = bank;
        } else {
            System.out.println("Linked bank invalid");
            isValid = false;
        }

        return isValid;
    }

    public static void getAccount() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("KYC Verified: " + isKYCVerified);
        System.out.println("Linked Bank: " + linkedBank);
    }
}
