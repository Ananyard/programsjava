class IRCTC {
    static String userName;
    static String email;
    static long phoneNumber;
    static String idProof;
    static String city;
    static boolean isSeniorCitizen;
	
	public static boolean registerUser(String name, String mail, long phNo, String proof, String cityName, boolean senior){
	boolean	isUserRegistered = false;
	boolean userValidate =  IRCTCRunner.validateUser(name,mail,phNo,proof,cityName,senior);
	if(userValidate == true)
	isUserRegistered = true;
	
	else
	System.out.println("plz create");
	
	return isUserRegistered;
}

public static void getAccountInfo() {

userName = IRCTCRunner.userName;
email = IRCTCRunner.email;
phoneNumber = IRCTCRunner.phoneNumber;
idProof =IRCTCRunner.idProof;
city = IRCTCRunner.city;
isSeniorCitizen = IRCTCRunner.isSeniorCitizen;


        System.out.println("user name is " + userName);
        System.out.println("email is " + email);
        System.out.println("phone number is " + phoneNumber);
        System.out.println("ID proof is " + idProof);
        System.out.println("city is " + city);
        System.out.println("is senior citizen: " + isSeniorCitizen);
    }


    public static void main(String[] args) {

        boolean accountCreated = IRCTCRunner.validateUser("Sunil Kumar", "sunil@irctc.com", 9988776655L, "Aadhar", "Delhi", false);
        System.out.println("is accountCreated " + accountCreated);

        if (accountCreated) {
            getAccountInfo();
        }
    }
}
