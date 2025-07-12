 class Producer{
 
 public static void produce(String movName,String budget,String actor,String actress){
 
 System.out.println("the name of the movie decided is :" + movName + " , the current budget for the movie is : " + budget);	
 System.out.println("Checks the script whether the script is good or no");	
 
 Director.direct(movName,budget,actor,actress);
 }
 
 }
 