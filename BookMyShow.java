class BookMyShow {
    static String fullName;
    static String email;
    static long phoneNumber;
    static String city;
    static String preferredLanguage;
    static boolean hasMembership;

    public static boolean createAccount(String name, String mail, long phNo, String userCity, String language, boolean member) {

        boolean isAccountCreated = false;
        boolean fullNameValid = false;
        boolean emailValid = false;
        boolean phNoValid = false;
        boolean cityValid = false;
        boolean languageValid = false;

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

        if (userCity != null) {
            city = userCity;
            cityValid = true;
        } else {
            System.out.println("city is invalid!");
        }

        if (language != null) {
            preferredLanguage = language;
            languageValid = true;
        } else {
            System.out.println("language is invalid!");
        }

        if (fullNameValid == true && emailValid == true && phNoValid == true && cityValid == true && languageValid == true) {
            hasMembership = member;
            isAccountCreated = true;
        }

        return isAccountCreated;
    }

    public static void getAccountInfo() {
        System.out.println("full name is " + fullName);
        System.out.println("email is " + email);
        System.out.println("phone number is " + phoneNumber);
        System.out.println("city is " + city);
        System.out.println("preferred language is " + preferredLanguage);
        System.out.println("has membership: " + hasMembership);
    }
}
