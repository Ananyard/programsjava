class Paytm {
    static String name;
    static String email;
    static long phone;
    static String password;
    static boolean isKYCVerified;
    static String linkedBank;

    public static boolean createAccount(String n, String e, long p, String pass, boolean kyc, String bank){

	boolean isUserRegistered = false;
	boolean isUserValidate  = PaytmR.validateUser(n ,e,p,pass,kyc,bank);
	
		if(isUserValidate == true){
		   isUserRegistered = true;
		   }
		   else
		   System.out.println("user invalid");
		   
 return isUserRegistered;

}

public static void getAccount() {


		name = PaytmR.name;

        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("KYC Verified: " + isKYCVerified);
        System.out.println("Linked Bank: " + linkedBank);
    }
	
    public static void main(String[] args) {
        boolean created = Paytm.createAccount("Amit", "amit@example.com", 9876543212L, "amit123", true, "SBI Bank");
        System.out.println("Account created? " + created);
        if (created) {
            getAccount();
        }
    }
}
