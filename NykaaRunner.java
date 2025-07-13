class NykaaRunner{
public static void main(String[] nyka){

		boolean userRegistrered= NykaaUser.createAccount("baba", "abd", 254125674l, "m", "1/5/1998", "lpl", 5478788, "pop","pop", "dress");
					
System.out.println(" is  user Registered " + userRegistrered );

		if(userRegistrered){
					NykaaUser.getUserInfo();
					
					
}








}
}