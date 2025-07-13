class Radio {

static String color = "white";
static int buttons = 4;
static int volume = 10;
static boolean isOn = false;
static String brand = "boat";

public static String getColor(){
	return color;
}

public static int getButton(){
	return buttons;
}

public static int getVolume(){
	return volume;	
}

public static boolean getIsOn(){
	boolean isOn = true;
	return isOn;
}

public static String getBrand(){
	return brand;
}
}