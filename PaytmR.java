class PaytmR {
    static String name;
    static String email;
    static long phone;
    static String password;
    static boolean isKYCVerified;
    static String linkedBank;

    public static boolean validateUser(String n, String e, long p, String pass, boolean kyc, String bank) {
        boolean isValid = false;
		boolean nameValid = false;
		boolean emailValid = false;
		boolean phoneValid = false;
		boolean passValid = false;
		boolean bankValid = false;

        if (n != null) {
            name = n;
        } else {
            System.out.println("Name invalid");
            nameValid = true;
        }

        if (e != null) {
            email = e;
        } else {
            System.out.println("Email invalid");
            emailValid = true;
        }

        if (p > 0) {
            phone = p;
        } else {
            System.out.println("Phone invalid");
            phoneValid = true;
        }

        if (pass != null) {
            password = pass;
			passValid = true;
        } else {
            System.out.println("Password invalid");
            
        }

        isKYCVerified = kyc;

        if (bank != null) {
            linkedBank = bank;
			bankValid  = true;
        } else {
            System.out.println("Linked bank invalid");
            
        }


if(nameValid == true && emailValid == true && phoneValid == true && passValid == true && bankValid == true){
	isValid = true;
}
        return isValid;
    }
}
