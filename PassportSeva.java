class PassportSeva{

static String givenName;
static String surName;

public static boolean registerUser(String gName , String sName ){
//all property checkk 
			boolean	isUserRegistered = false;
			boolean givenNameValid = false;
			boolean surNameValid =  false;
	//property check	

		//null !=null;
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

public static void getUserInfo(){
	

System.out.println(" the given name is " + givenName );
System.out.println(" the sur name is " + surName );

}
}

