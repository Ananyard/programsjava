class FacebookSevaRunner{

static String givenName;
static String surName;
static String email;
static long phone;
static String password;
public static boolean registerUser(String gName , String sName ,String e, long p, String pass ){
	boolean isUserRegistered = false;
	boolean userValidated = FacebookUserValidater.validateFacebookUser(gName,sName,e,p, pass);
	
	if (userValidated == true) // or if (userValidated)
	      isUserRegistered = true;
else System.out.println("user is not validated ... try again");	

   return isUserRegistered; 			
}

public static void getUserInfo(){
	
	givenName = FacebookUserValidater.givenName;
	surName =FacebookUserValidater.surName;
	email =FacebookUserValidater.email;
	phone =FacebookUserValidater.phone;
	password =FacebookUserValidater.password;
	
System.out.println(" the given name is " + FacebookUserValidater.givenName );
System.out.println(" the sur name is " + surName );
System.out.println(" the email name is " + email );
System.out.println(" the pgpone name is " + phone );
System.out.println(" the pass name is " + password );

}
 public static void main(String[] args) {
        boolean isRegistered = FacebookUserValidater.validateFacebookUser("Ananya", "Sharma","fg",9874563210l,"");
			 System.out.println("Account created? " + isRegistered);
         getUserInfo();
        }
    }




