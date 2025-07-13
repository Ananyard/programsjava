class Uber {
    static String name;
    static String email;
    static long phone;
    static String paymentMethod;
    static String preferredCarType;
    static String location;

    public static boolean createAccount(String n, String e, long p, String pay, String car, String loc) {
        boolean isValid = false;
        boolean nameValid = false;
        boolean emailValid = false;
        boolean phoneValid = false;
        boolean payValid = false;
        boolean carValid = false;
        boolean locValid = false;

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

        if (pay != null) {
            paymentMethod = pay;
            payValid = true;
        } else {
            System.out.println("Payment method invalid");
        }

        if (car != null) {
            preferredCarType = car;
            carValid = true;
        } else {
            System.out.println("Car type invalid");
        }

        if (loc != null) {
            location = loc;
            locValid = true;
        } else {
            System.out.println("Location invalid");
        }

        if (nameValid && emailValid && phoneValid && payValid && carValid && locValid) {
            isValid = true;
        }

        return isValid;
    }

    public static void getAccount() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Preferred Car Type: " + preferredCarType);
        System.out.println("Location: " + location);
    }
}
