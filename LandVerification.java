class LandVerification{

public static void lV(String name, String property,String location, int budget, int price){

System.out.println("property name : " + property);
System.out.println("located in " + location);
System.out.println("");
DocumentCheck.verifyDocuments(name, property, location, budget, price);
}
}

