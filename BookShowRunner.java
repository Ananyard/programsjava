class BookShowRunner {
	static String fullName;
    static String email;
    static long phoneNumber;
    static String city;
    static String preferredLanguage;
    static boolean hasMembership;

public static boolean registerUser(String name, String mail, long phNo, String userCity, String language, boolean member){
	boolean isUserRegistered = false;
	boolean userValidated = BookShowRunner.validateUser(name,mail,phNo,userCity,language,member);
	
	if(userValidated == true){
	isUserRegistered = true;
	}
	else{
	System.out.println("plz create ");	
}
return isUserRegistered;
}
 public static boolean validateUser(String name, String mail, long phNo, String userCity, String language, boolean member) {
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
			return true;
			
        }else{
			return false;
		}
		
 }

 

public static void getAccountInfo(){

	System.out.println("name is " + fullName);
	System.out.println("mail is " + email);
	
}
    public static void main(String[] args) {

        boolean accountCreated = BookShowRunner.registerUser("Kriti Mehra", "kriti@bms.com", 9123456789L, "Bengaluru", "Kannada", true);
        System.out.println("is accountCreated " + accountCreated);

        if (accountCreated) {
           getAccountInfo();
        }
    }
}

