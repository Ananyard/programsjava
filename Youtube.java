class Youtube{
static String channelName;
static String ownerName;
static String email;
static long phoneNumber;
static String category;
static int totalVideos;
static int subscribers;
static boolean isChannelActive;

public static boolean createChannel( String cName, String oName, String mail, long phNo, String cat, int tVedios, int sub, boolean isCActive){

		boolean isChannelCreated =  false;
		boolean channelNameValid = false;
		boolean ownerNameValid =  false;
		boolean emailValid = false;
		boolean phNoValid = false;
		boolean catValid =  false;
		boolean totalVideosValid = false;
		boolean subValid = false;
		boolean isCActiveValid =  false;
		



if(cName !=null){
	channelName = cName;
	channelNameValid = true;
}
else{
System.out.println(" channel Name is invalid!");
}


if(oName !=null){
		ownerName = oName;
		ownerNameValid = true;
}
else{
System.out.println(" owner Name is invalid!");
}

if (mail !=null){
	
	email = mail;
	emailValid = true;
}

else{
System.out.println(" email is invalid!");
}

if(phNo > 0){
	phoneNumber =  phNo;
	phNoValid = true;
}
else{
System.out.println(" phone number is invalid!");
}

if(sub >0){
subscribers = sub;
subValid =  true;
}
else{
System.out.println("subscribers is invalid!");
}

if(tVedios >0){
	totalVideos = tVedios;
	totalVideosValid = true;
}
else{
System.out.println(" ctotal vedios is invalid!");
}

if(cat !=null){
	category = cat;
catValid = true;
}
else{
System.out.println(" category Name is invalid!");
}


if(phNoValid == true && channelNameValid == true && ownerNameValid == true && emailValid == true && catValid == true &&
	totalVideosValid == true && subValid == true ){
		
		isChannelCreated = true;
	}
	return isChannelCreated;

 


}

public static void getChannelInfo(){
	System.out.println(" the channel name is " + channelName );
System.out.println(" the owner name is " + ownerName );
System.out.println("category is : " + category);
System.out.println("phone no  is set: " + phoneNumber);
System.out.println("email is set: " + email);
System.out.println("total videos is : " + totalVideos);
System.out.println("subscribers is : " + subscribers);
	
	
	
	
	
}
}