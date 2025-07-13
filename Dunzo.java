class Dunzo {
    static String fullName;
    static String email;
    static long phoneNumber;
    static String deliveryLocation;
    static String preferredPaymentMethod;
    static boolean isSubscribed;

    public static boolean createAccount(String name, String mail, long phNo, String location, String payment, boolean subscribed) {

        boolean isAccountCreated = false;
        boolean fullNameValid = false;
        boolean emailValid = false;
        boolean phNoValid = false;
        boolean locationValid = false;
        boolean paymentValid = false;

        if (name != null) {
            fullName = name;
            fullNameValid = true;
        } else {
            System.out.println("full name is invalid!");
        }

        if (mail != null) {
            email = mail;
            emailValid = true;
        } else {
            System.out.println("email is invalid!");
        }

        if (phNo > 0) {
            phoneNumber = phNo;
            phNoValid = true;
        } else {
            System.out.println("phone number is invalid!");
        }

        if (location != null) {
            deliveryLocation = location;
            locationValid = true;
        } else {
            System.out.println("delivery location is invalid!");
        }

        if (payment != null) {
            preferredPaymentMethod = payment;
            paymentValid = true;
        } else {
            System.out.println("payment method is invalid!");
        }

        if (fullNameValid == true && emailValid == true && phNoValid == true && locationValid == true && paymentValid == true) {
            isSubscribed = subscribed;
            isAccountCreated = true;
        }

        return isAccountCreated;
    }

    public static void getAccountInfo() {
        System.out.println("full name is " + fullName);
        System.out.println("email is " + email);
        System.out.println("phone number is " + phoneNumber);
        System.out.println("delivery location is " + deliveryLocation);
        System.out.println("preferred payment method is " + preferredPaymentMethod);
        System.out.println("is subscribed: " + isSubscribed);
    }
}
