class FanR{
static boolean isConnected;
static int maxSpeed = 5;
static int currentSpeed;
static int minSpeed = 1;
public static void onOrOff(){

if(isConnected == false) {
	
	isConnected = true;
	System.out.println("turned on" + isConnected);
}
else{
	System.out.println("turned off");
}
}
public static void increaseSpeed(){
	
	if(isConnected = true){
		
		if(currentSpeed < maxSpeed){
			currentSpeed = currentSpeed + 1;
			System.out.println("fan speed" + currentSpeed);
		}
		else{
			System.out.println("fan speed at max");
		}
	}
	
	else{
		System.out.println("turn on fan");
	}	
}


public static void decreaseSpeed(){
	if (isConnected =  true){
		if(currentSpeed > minSpeed){
			currentSpeed = currentSpeed - 1;
			
			System.out.println("speed is" + currentSpeed);
		}
		else{
			System.out.println("max speed reached");
		}
	}
	else{
		System.out.println("turn on fan");
		
	
	
	}
	
}
}