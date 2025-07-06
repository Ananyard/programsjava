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

class BankAccount{

	static double balance;
	
	public static void main(String acount[]){
	
		System.out.println("main started");
		
		System.out.println(BankAccountRunner.balance);
		//methodName
		BankAccountRunner.credit(10.00);
		//BankAccountRunner.credit(10000.00);
		System.out.println("The current balance is"+" "+BankAccountRunner.balance);

		//methosName
		BankAccountRunner.debit(5000.00);	
		System.out.println("The current balance is"+" "+BankAccountRunner.balance);
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