class FacebookUserValidater{
	
static String givenName;
static String surName;
static String email;
static long phone;
static String password;

public static boolean validateFacebookUser(String gName ,String e, String sName ,long p, String pass){

     //validation 

		boolean isUserRegistered = false;
		boolean givenNameValid = false;
		boolean surNameValid =  false;
		boolean emailValid = false;
		boolean phoneValid = false;
		boolean passValid = false;
		//boolean phNoValid = false;
	//	boolean passValid = false;
    //	boolean genderValid =  false;
	//	boolean emailValid =false;
	//	boolean dobValid = false;
	//	boolean cPassValid = false;
		//null !=null
	if(gName != null){  
	
	givenName = gName;
	givenNameValid = true;
   }
   else{
	   
	   System.out.println("gievn is not valid");
   }
	   
   if(sName !=null){
				surName   =  sName;
				surNameValid = true;
   }
   
    else System.out.println("surname  is not valid");
   
   
   
   if(givenNameValid == true && surNameValid == true){
	   isUserRegistered = true;
	   
   }
return isUserRegistered;

}
}