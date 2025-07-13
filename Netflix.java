class Netflix {
    static String profileName;
    static String email;
    static long phoneNumber;
    static String planType;
    static int numberOfDevices;

    public static boolean createAccount(String pName, String mail, long phNo, String plan, int devices) {
        boolean isAccountCreated = false;
        boolean profileNameValid = false;
        boolean emailValid = false;
        boolean phoneValid = false;
        boolean planValid = false;
        boolean devicesValid = false;

        if (pName != null) {
            profileName = pName;
            profileNameValid = true;
        } else {
            System.out.println("profile name is invalid!");
        }

        if (mail != null) {
            email = mail;
            emailValid = true;
        } else {
            System.out.println("email is invalid!");
        }

        if (phNo > 0) {
            phoneNumber = phNo;
            phoneValid = true;
        } else {
            System.out.println("phone number is invalid!");
        }

        if (plan != null) {
            planType = plan;
            planValid = true;
        } else {
            System.out.println("plan is invalid!");
        }

        if (devices > 0) {
            numberOfDevices = devices;
            devicesValid = true;
        } else {
            System.out.println("number of devices is invalid!");
        }

        if (profileNameValid == true && emailValid == true && phoneValid == true && planValid == true && devicesValid == true) {
            isAccountCreated = true;
        }
        return isAccountCreated;
    }

    public static void getAccountInfo() {
        System.out.println("profile name is " + profileName);
        System.out.println("email is " + email);
        System.out.println("phone number is " + phoneNumber);
        System.out.println("plan type is " + planType);
        System.out.println("number of devices is " + numberOfDevices);
    }
}
