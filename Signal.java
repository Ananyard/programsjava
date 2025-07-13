class Signal {

static  String stopColor = "red";
static String readyColor = "yellow";
static String goColor = "green";
static int seconds = 30;
static  boolean camAttached = false;
static String road = "mangalore";
static int id = 101;
static boolean soundAlert = false;

public static String getStopColor(){
	return stopColor;
	
}

public static String getReadyColor(){
	return readyColor;
	
}
public static String getGoColor(){
	return goColor;
	
	
}

public static int getSeconds(){
	return seconds;
}


public static boolean getCamAttached(){
	boolean camAttached = true;
	return camAttached;
	
	
}
public static boolean getSoundAlert(){
	boolean soundAlert = true;
	return soundAlert;
	
	
}

public static String getRoad(){
	return road;
	
	
}
public static int getId(){
	return id;
}

}