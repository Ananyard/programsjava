/*class BankAccount{
public static void main(String[] amt){
System.out.println("main started");
//methodName();*
BankAccountRunner.credit(0.0);
//BankAccountRunner.credit(1000.0);
BankAccountRunner.debit(200.00);
System.out.println("credited amount is"+ BankAccountRunner.balance);
System.out.println("debited amount is"+ BankAccountRunner.balance);
System.out.println("main ended");
}
//data type &variable = par               ameter
//<access-specifier> returnType methodName(parameter)
}*/

class BankAccountRunner{


	
	
	public static void main(String acount[]){
	
		System.out.println("main started");
		
		//System.out.println(BankAccountRunner.getBalance);
		//methodNameptp
		
	boolean amountIsCredited = BankAccount.credit(1.00);
		//BankAccountRunner.credit(10000.00);
		System.out.println("The credit sucussful is"+" "+amountIsCredited);
		System.out.println("The current balance is"+" "+BankAccount.getBalance());

		//methosName
	boolean amountIsDebited	 = BankAccount.debit(10.00);
	System.out.println("The current balance is"+" "+amountIsDebited);
		System.out.println("The current balance is"+" "+BankAccount.getBalance());
		System.out.println("main ended");
	}
	
	/*public static void debit(double amount){
	
		System.out.println("debit started");
			balance = balance-amount;
		System.out.println("debit ended");
	}
	
	public static void credit(double amount){
	
		System.out.println("credit started");
			balance = balance+amount 
		System.out.println("debit ended");
	}*/
}