class NykaaUser {
    static String fullName;
    static String email;
    static long phoneNumber;
    static String password;
    static String confirmPassword;
    static String gender;
    static String dateOfBirth;
    static String address;
    static int pinCode;
    static String preferredCategory;
	
	 public static boolean createAccount(String fName, String mail, long phone, String gndr, String dob,
	 String addr, int pin, String pass, String cPass, String category) {
        boolean isUserValid = false;
		boolean fullNameValid = false;
		boolean emailValid = false;
		boolean phoneValid = false;
		boolean genderValid = false;
		boolean dateOfBirthValid = false;
		boolean addrValid = false;
		boolean pinValid = false;
		boolean passValid = false;
		boolean cPassValid = false;
		boolean categoryValid = false;
		
		
		
	if( fName !=null){
		fullName =fName;
		fullNameValid = true;	
	}
	else{
		System.out.println("fname is invalid!");
	}
	
	if( mail != null){
		email = mail;
		emailValid = true;
	}
	else{
		System.out.println("mail is invalid!");
	}
	
	if(phone > 0){
		phoneNumber= phone;
		phoneValid = true;
	}
	else{
		System.out.println("phone Number is invalid!");
	}
		
	if (gndr !=null){
		gender = gndr;
		genderValid = true;
		
	}
	else{
		System.out.println("gender is invalid!");
	}
	
	if( dob !=null){
		dateOfBirth = dob;
		dateOfBirthValid = true;	
	}
	else{
		System.out.println("date of birth is invalid!");
	}
	
	if(addr !=null){
		address = addr;
		addrValid = true;
	}
	else{
		System.out.println("address is invalid!");
	}
	
	if(pin > 0 ){
		pinCode = pin;
		pinValid = true;	
	}
	else{
		System.out.println("pin  is invalid!");
	}
	if(pass !=null){
		password = pass;
		passValid = true;	
	}
	else{
		System.out.println("password is invalid!");
	}
	 if (cPass !=null && cPass == pass){
		 confirmPassword = cPass;
		 cPassValid = true;
	 }
	 else{
		System.out.println("enter same password");
	}
	
	if(category !=null){
		preferredCategory = category;
		categoryValid = true;
	}
	else{
		System.out.println("category  is invalid!");
	}
	
	if (fullNameValid == true && emailValid == true && phoneValid == true && genderValid == true && dateOfBirthValid == true && pinValid == true && 
			addrValid == true && cPassValid == true && passValid == true && categoryValid == true){
					isUserValid = true;
	 }
	 return isUserValid;
	
	
	 }
	public static void getUserInfo(){
	

System.out.println(" the first name is " + fullName );
System.out.println("date of birth is set: " + dateOfBirth);
System.out.println("gnder is set: " + gender);
System.out.println("email is set: " + email);
System.out.println("Password is : " + password);
System.out.println("confirm Password is : " + confirmPassword);
System.out.println("category  is : " + preferredCategory);
System.out.println("pincode  is : " + pinCode);
System.out.println("address  is : " + address);
System.out.println("ph number is  is : " + phoneNumber );


}




}


