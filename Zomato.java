class Zomato {
    static String fullName;
    static String email;
    static long phoneNumber;
    static String address;
    static String foodPreference;
    static boolean isPrimeMember;

    public static boolean createAccount(String name, String mail, long phNo, String addr, String preference, boolean isPrime) {

        boolean isAccountCreated = false;
        boolean fullNameValid = false;
        boolean emailValid = false;
        boolean phNoValid = false;
        boolean addressValid = false;
        boolean preferenceValid = false;

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

        if (addr != null) {
            address = addr;
            addressValid = true;
        } else {
            System.out.println("address is invalid!");
        }

        if (preference != null) {
            foodPreference = preference;
            preferenceValid = true;
        } else {
            System.out.println("food preference is invalid!");
        }

        if (fullNameValid == true && emailValid == true && phNoValid == true && addressValid == true && preferenceValid == true) {
            isPrimeMember = isPrime;
            isAccountCreated = true;
        }

        return isAccountCreated;
    }

    public static void getAccountInfo() {
        System.out.println("full name is " + fullName);
        System.out.println("email is " + email);
        System.out.println("phone number is " + phoneNumber);
        System.out.println("address is " + address);
        System.out.println("food preference is " + foodPreference);
        System.out.println("prime member: " + isPrimeMember);
    }
}
