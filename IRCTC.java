class IRCTC {
    static String userName;
    static String email;
    static long phoneNumber;
    static String idProof;
    static String city;
    static boolean isSeniorCitizen;

    public static boolean createAccount(String name, String mail, long phNo, String proof, String cityName, boolean senior) {

        boolean isAccountCreated = false;
        boolean userNameValid = false;
        boolean emailValid = false;
        boolean phNoValid = false;
        boolean proofValid = false;
        boolean cityValid = false;

        if (name != null) {
            userName = name;
            userNameValid = true;
        } else {
            System.out.println("user name is invalid!");
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

        if (proof != null) {
            idProof = proof;
            proofValid = true;
        } else {
            System.out.println("ID proof is invalid!");
        }

        if (cityName != null) {
            city = cityName;
            cityValid = true;
        } else {
            System.out.println("city is invalid!");
        }

        if (userNameValid == true && emailValid == true && phNoValid == true && proofValid == true && cityValid == true) {
            isSeniorCitizen = senior;
            isAccountCreated = true;
        }

        return isAccountCreated;
    }

    public static void getAccountInfo() {
        System.out.println("user name is " + userName);
        System.out.println("email is " + email);
        System.out.println("phone number is " + phoneNumber);
        System.out.println("ID proof is " + idProof);
        System.out.println("city is " + city);
        System.out.println("is senior citizen: " + isSeniorCitizen);
    }
}
