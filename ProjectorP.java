class ProjectorP{
static boolean isConnected;
static int maxVolume =10;
static int minVolume;
static int currentVolume;

public static void onOrOff(){
if(isConnected == false) {
isConnected = true;
System.out.println("turned on" + isConnected);
}
else{
	isConnected = false;
	System.out.println("turned off");
}
}

public static void increaseVolume(){
 if(isConnected == true) {
	 
	 if(currentVolume < maxVolume){
		 currentVolume = currentVolume+1;
		 System.out.println("volume is :" + currentVolume);
	 }
	 else{
		 System.out.println("max volume");
	 }
 }
 else{
	 System.out.println("turn on idiot " );
 }
}

public static void decreaseVolume(){

if (isConnected == true) {
	
	if(currentVolume > minVolume){
		currentVolume = currentVolume-1;
	System.out.println("volume is " + currentVolume);
	}
	else{
		System.out.println("max volmne reached");
	}
}
else{
	System.out.println("turn on projector");
	
	
}
		
}
}