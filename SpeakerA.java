class SpeakerA {

static int minVolume;
static int currentVolume;
static boolean isConnected;
   static int maxVolume = 7;
	  
 //on or off
 
 public static void onOrOff(){
 
	if(isConnected == false ){//speaker is off in the beginning {
		isConnected	= true; //making it on 
	 System.out.println("speaker is turned on!");
	}
		else {
		isConnected = false; //if it is on make it off.
		System.out.println("speaker is turned off!");
		}

	}
//increaseVolume 


 public static void increaseVolume(){

System.out.println("increaseVolume");
if(isConnected == true){
	if(currentVolume < maxVolume){
		currentVolume = currentVolume+1;
		System.out.println("currentVolume is "+ currentVolume);
	}
	else{
		System.out.println("max volume reached ");
	}
}
else{

	System.out.println("speaker is turned off!  gubee on madu speaker naaaa");
}


}
 public static void decreaseVolume(){

System.out.println("decreaseVolume");
if(isConnected == true){
	if(currentVolume == maxVolume){
		currentVolume--;
		System.out.println("currentVolume is "+ currentVolume);
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