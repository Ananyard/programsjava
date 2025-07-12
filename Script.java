class Script{

public static void writer(String movName, String budget,String actor,String actress){

System.out.println("writes the script for the movie " + movName);
System.out.println("handles the script to the producer");
System.out.println("producer chechks the script if approved will move to next state");			
Producer.produce(movName , budget , actor,actress);
}
}