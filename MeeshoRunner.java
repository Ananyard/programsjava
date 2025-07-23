class MeeshoRunner{
static String fullName;
static long phoneNumber;
static String dateOfBirth;
static String gender;
static String email;
static String password;
static String confirmPass;
static String businessType;

public static boolean registerUser ( String fName, String dOb, String gndr, String mail, String pswd, String cpswd, String business){
			boolean isUserRegistered = false;
			boolean userValidate = Meesho.validateUser(fName,dOb,gndr,mail,pswd,cpswd,business);
			if(userValidate == true)
			 isUserRegistered = true;
			else 
				System.out.println("");
				
return isUserRegistered;

}
public static void getUserInfo(){
	
	
	fullName = Meesho.fullName;
	dateOfBirth = Meesho.dateOfBirth;

System.out.println(" the first name is " + fullName );
System.out.println("date of birth is set: " + dateOfBirth);
System.out.println("gnder is set: " + gender);
System.out.println("email is set: " + email);
System.out.println("Password is set: " + password);
System.out.println("confirm Password is set: " + confirmPass);
System.out.println("businessType is : " + businessType);


}
public static void main (String[] meesh){

boolean userRegistered =  Meesho.validateUser( "an", "10/05/2003", "f", "assd", "kok", "kok", "retail");
 System.out.println(" is registered?"+ userRegistered);

if(userRegistered){
	getUserInfo();
}

}




}