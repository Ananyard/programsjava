class Mixer{
static int currentSpeed = 0;
static int maxSpeed = 3;
static int isConnected;
public static void onOrOff(){
if(isConnected==false){
isConnected=true;
 System.out.println("cooler is turned on!");
	}
		else {
		isConnected = false; //if it is on make it off.
		System.out.println("cooler is turned off!");
		}
}
public static void incresaseSpeed(){
if(isConnected = true){
if (currentSpeed < maxSpeed ){
 currentSpeed = currentSpeed + 1;
  System.out.println("Mixer speed: " + currentSpeed);
 }
 else {
                System.out.println("Mixer is already at max speed");
            }
        } else {
            System.out.println("Mixer is OFF. Turn it on first.");
        }
}

 public static void decreaseSpeed() {
        if (isConnected) {
            if (currentSpeed > 0) {
                currentSpeed--;
                System.out.println("Mixer speed: " + currentSpeed);
            } else {
                System.out.println("Mixer is already at min speed");
            }
        } else {
            System.out.println("Mixer is OFF. Turn it on first.");
        }
    }






}