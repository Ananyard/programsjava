class MeeshoRunner{

public static void main (String[] meesh){

boolean userRegistered =  Meesho.createAccount( "an", "10/05/2003", "f", "assd", "kk", "kok", "retail");
 System.out.println(" is registered?"+ userRegistered);

if(userRegistered){
	Meesho.getUserInfo();
}

}




}