class Agent{
public static void purchase(String vegetable, String quantity){

System.out.println("vegetable received from broker " + vegetable + "in the quantity " + quantity);
System.out.println("vegetable sending  to shop " + vegetable + "in the quantity " + quantity);
Broker.brokerage(vegetable,quantity);

}}


