class Tv{

static boolean isConnected;
static int  currentVolume;
static int maxVolume = 10;
static int  minVolumne = 0;

public static void onOrOff(){


if (isConnected ==  false) {
isConnected = true ;
System.out.println("tv turned on");

}
else {
isConnected = false;
System.out.println("tv turned off");
}
}



public static void increaseSpeed(){

if(isConnected == true){
	if(currentVolume < maxVolume){
		currentVolume = currentVolume + 1;
		 System.out.println("TV volume: " + currentVolume);
	}
	else{
		 System.out.println(" volume is already at max");
	}
}
	else{
		 System.out.println("on the tv gube");
	}
}



public static void decreaseVolume(){
if (isConnected = true){
if (currentVolume > 0){
currentVolume = currentVolume - 1;
   System.out.println("TV volume: " + currentVolume);
            } else {
                System.out.println("Volume is already at min");
            }
}
else{
	System.out.println("turn on tv");
	
	
	
	
	
}
}
}