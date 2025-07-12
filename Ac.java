class Ac{
static boolean isConnected;
static int currentTemp;
static int maxTemp = 5;
static int minTemp = 0;

public static void onOrOff(){
if (isConnected == false){
isConnected = true;
System.out.println("ac turned on" + isConnected);
}

else{

System.out.println("ac turned off");
}
}

public static void increaseTemp(){
	
if(isConnected = true) {
	if(currentTemp < maxTemp){
		currentTemp = currentTemp + 1;
		System.out.println("ac temp :" + currentTemp);
	}
	else{
		System.out.println("ac temp is at max" );
	}
}
else{
	System.out.println("turn on ac");	
}
}

public static void decreaseTemp(){
 if (isConnected = true){
	 if(currentTemp > minTemp){
		 currentTemp = currentTemp - 1;
		 System.out.println("ac temp" + currentTemp);
	 }
	 else{
		 System.out.println("max reached");
	 }
 }
 else{
	 System.out.println("turn on ac");
	 
 }


}
}