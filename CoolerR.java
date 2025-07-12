class CoolerR{
	
static int maxSpeed=5;
static int minSpeed;
static int currentSpeed;
static boolean isConnected;
   static int maxVolume = 7;
public static void onOrOff(){
if(isConnected == false ){//speaker is off in the beginning {
		isConnected	= true; //making it on 
	 System.out.println("cooler is turned on!");
	}
		else {
		isConnected = false; //if it is on make it off.
		System.out.println("cooler is turned off!");
		}

}

public static void increaseSpeed(){

System.out.println("increaseSpeed");
if(isConnected == true){
	if(currentSpeed < maxSpeed){
		currentSpeed = currentSpeed+1;
		System.out.println("currentcooler is "+ currentSpeed);
	}
	else{
		System.out.println("max speed reached ");
	}
}
else{

	System.out.println("cooler is turned off!  gubee on madu cooler naaaa");
}

}
public static void decreaseSpeed(){
	System.out.println("decreaseSpeed");
	
	if(isConnected == true){
	if(currentSpeed == maxSpeed){
		currentSpeed--;
		System.out.println("currentVolume is "+ currentSpeed);
	}
	else{
		System.out.println("max volume reached ");
	}
}
else{

	System.out.println("speaker is turned off!  gubee on madu speaker naaaa");
}


}
}
