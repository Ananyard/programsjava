class DunzoRunnerF {
    static String fullName;
    static String email;
    static long phoneNumber;
    static String deliveryLocation;
    static String preferredPaymentMethod;
    static boolean isSubscribed;

    public static boolean registerUser(String name, String mail, long phNo, String location, String payment){
	boolean isUserRegistred = false;
	boolean userValidate = DunzoRunnerF.validateUser(name,mail,phNo,location,payment);
	if (userValidate == true){
	isUserRegistred = true;
	}
	else{
		System.out.println("plz create ");	
	
	}
	
	
	return isUserRegistred;
	}
	
	
	
	public static boolean validateUser(String name, String mail, long phNo, String location, String payment) {

        boolean isValidateUser = false;
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
            isValidateUser = true;
		}
			return isValidateUser;

       
    }

    public static void getAccountInfo() {
        System.out.println("full name is " + fullName);
        System.out.println("email is " + email);
        System.out.println("phone number is " + phoneNumber);
        System.out.println("delivery location is " + deliveryLocation);
       System.out.println("preferred payment method is " + preferredPaymentMethod);
       
    }

	
public static void main(String[] args) {

        boolean accountCreated = DunzoRunnerF.validateUser("Rahul Verma", "rahul@dunzo.com", 9876543210L, "Koramangala", "UPI");
        System.out.println("is accountCreated " + accountCreated);

        if (accountCreated) {
            getAccountInfo();
        }
    }
}
