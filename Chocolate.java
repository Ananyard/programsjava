class Chocolate{

int chocolateId;
String indegreints[];
String chocolateName;
String brand;
double price;
String quantity;

Chocolate(){
}
Chocolate( int chocolateId,String indegreints[]){
	this.chocolateId = chocolateId;
	this.indegreints = indegreints;
}


Chocolate( String brand, double price ,String quantity){
	this.brand =brand;
	this.price =price;
	this.quantity =quantity;
}

Chocolate(String chocolateName){
	this.chocolateName = chocolateName;	
}
//instance members(variable/methods) - belong to copies
//static members (variable/methods) - belong to class

public void getChocolateDetails(){
	System.out.println("the indegreints of " + chocolateName + "are");
		if(indegreints !=null){
			
	for (String indegreint : indegreints)
		System.out.println(indegreint);
		}
		else{
			System.out.println("");
		}	
}

}