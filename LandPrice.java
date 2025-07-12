class LandPrice{
public static void priceCheck(String name, String property,String location ,int budget, int price){

if(price <= budget){

System.out.println("want to buy the prodcut");
}
else{
System.out.println("not intrested to buy the prodcut");

}
LandVerification.lV( name,  property, location , budget, price);

}
}

