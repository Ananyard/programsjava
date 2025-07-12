/*class BankAccountRunner{	
static double balance=0;
public static void debit(double amount){
System.out.println("debit started");
boolean var = amount <= balance;
if (var){
balance = balance - amount ;
}
else{
	System.out.println("insufficient fund");	
}
//System.out.println("available balance is " + balance);
System.out.println("debit ended");
}
public static void credit(double amount){
	System.out.println("credit started");
	
	boolean var = amount > 0.00;
	if (var){
balance = balance + amount;
	}
else {
	System.out.println("sufficient fund");
}	
//System.out.println("available balance is " + balance); 
System.out.println("credit ended");
}
}*/




class BankAccount{
	static double balance = 500.00 ;
	
	
	public static double  getBalance(){
		  return balance;
		  
	  }
	static String iscCode;
	
	
	public static boolean credit(double amount){
	boolean isCredited = false;
		System.out.println("credit started");
		
				boolean check = amount > 0.00;
					if(check){			
			balance = balance+amount;
			isCredited  = true;
				}
					else{
		System.out.println("credit the suffecient amount");			
				}
		System.out.println("credit ended");
		return isCredited;
	}
	
	
	
	public static boolean debit(double amount){
	boolean isDebited = false;
		System.out.println("debit started");
		
			boolean check = amount<=balance;
					if(check){
			balance = balance-amount;
			isDebited = true;
					}
					else{
		System.out.println("No funds available");
					}		
					
		System.out.println("debit ended");
		return isDebited;
	}
	
}

