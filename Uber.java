class Uber {
    static String name;
    static String email;
    static long phone;
    static String paymentMethod;
    static String preferredCarType;
    static String location;

    public static boolean createAccount(String n, String e, long p, String pay, String car, String loc) {
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

        if (pay != null) {
            paymentMethod = pay;
        } else {
            System.out.println("Payment method invalid");
            isValid = false;
        }

        if (car != null) {
            preferredCarType = car;
        } else {
            System.out.println("Car type invalid");
            isValid = false;
        }

        if (loc != null) {
            location = loc;
        } else {
            System.out.println("Location invalid");
            isValid = false;
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