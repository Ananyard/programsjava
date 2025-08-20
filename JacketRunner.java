class JacketRunner{

public static void main(String[] jac){
 System.out.println("main started");
 
 Jacket jacket = new Jacket(1, "red","H&M",'m',1599.89,"cotton");


 jacket.readJacketDetails();
 
 
 Jacket jacket1 = new Jacket();
 jacket1.size = 'l';
 
 jacket1.readJacketDetails();
 
  System.out.println("main ended");
}
}

