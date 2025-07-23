class Meesho{

static String fullName;
static long phoneNumber;
static String dateOfBirth;
static String gender;
static String email;
static String password;
static String confirmPass;
static String businessType;

public static boolean  validateUser( String fName, String dOb, String gndr, String mail, String pswd, String cpswd, String business){
boolean isUserRegistered = false;

boolean fullNameValid =  false;
boolean dobValid = false;
boolean genderValid  = false;
boolean emailValid = false;
boolean passwordValid = false;
boolean confirmPassValid = false;
boolean businessTypeValid = false;


if (fName !=null){
	fullName = fName;
	fullNameValid = true;
}
else{
	System.out.println("full name invalid!");
}


if (dOb !=null){
	dateOfBirth = dOb;
	dobValid =  true;
}
else{
	System.out.println("date of birth is  invalid!");
}

if (gndr !=null){
	gender = gndr;
	genderValid = true;
}
else{
	System.out.println("gender is  invalid!");
}

if(mail !=null){
	email = mail;
	emailValid = true;
}
else{
	System.out.println("mail  is  invalid!");
}



if (pswd !=null){
	password =pswd;
	passwordValid = true;
}
else{
	System.out.println("enter password!");
}



if (cpswd !=null && pswd==cpswd){
	
	confirmPass = cpswd;
	confirmPassValid = true;
}
else{
	System.out.println("enter same pass");
}
if (business !=null){
	businessType = business;
	businessTypeValid = true;
}


if (fullNameValid == true && dobValid == true && genderValid==true && emailValid==true && businessTypeValid==true &&
						passwordValid ==true && confirmPassValid ==  true){
						isUserRegistered = true;
						
						}
					
						return isUserRegistered;
					

}





}

