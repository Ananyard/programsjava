class Shop{
public static void sell(String vegetable, String quantity){
System.out.println("vegetable received from agent " + vegetable + "in the quantity " + quantity);
System.out.println("vegetable purchased from agent " + vegetable + "in the quantity " + quantity);
System.out.println("vegetable sending  to shop " + vegetable + "in the quantity " + quantity);
System.out.println("vegetable selling " + vegetable + "in the quantity " + quantity);
Agent.purchase(vegetable,quantity);


}}

