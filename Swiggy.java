class Swiggy {
    static String name;
    static String email;
    static long phone;
    static String address;
    static String foodPreference;
    static String paymentOption;

    public static boolean createAccount(String n, String e, long p, String addr, String food, String pay) {
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

        if (addr != null) {
            address = addr;
        } else {
            System.out.println("Address invalid");
            isValid = false;
        }

        if (food != null) {
            foodPreference = food;
        } else {
            System.out.println("Food preference invalid");
            isValid = false;
        }

        if (pay != null) {
            paymentOption = pay;
        } else {
            System.out.println("Payment option invalid");
            isValid = false;
        }

        return isValid;
    }

    public static void getAccount() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
        System.out.println("Food Preference: " + foodPreference);
        System.out.println("Payment Option: " + paymentOption);
    }
}
