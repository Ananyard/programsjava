class Swiggy {
    static String name;
    static String email;
    static long phone;
    static String address;
    static String foodPreference;
    static String paymentOption;

    public static boolean createAccount(String n, String e, long p, String addr, String food, String pay) {
        boolean isValid = false;
        boolean nameValid = false;
        boolean emailValid = false;
        boolean phoneValid = false;
        boolean addressValid = false;
        boolean foodValid = false;
        boolean paymentValid = false;

        if (n != null) {
            name = n;
            nameValid = true;
        } else {
            System.out.println("Name invalid");
        }

        if (e != null) {
            email = e;
            emailValid = true;
        } else {
            System.out.println("Email invalid");
        }

        if (p > 0) {
            phone = p;
            phoneValid = true;
        } else {
            System.out.println("Phone invalid");
        }

        if (addr != null) {
            address = addr;
            addressValid = true;
        } else {
            System.out.println("Address invalid");
        }

        if (food != null) {
            foodPreference = food;
            foodValid = true;
        } else {
            System.out.println("Food preference invalid");
        }

        if (pay != null) {
            paymentOption = pay;
            paymentValid = true;
        } else {
            System.out.println("Payment option invalid");
        }

        if (nameValid && emailValid && phoneValid && addressValid && foodValid && paymentValid) {
            isValid = true;
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
