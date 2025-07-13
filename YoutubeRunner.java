class YoutubeRunner{
public static void main(String[] yt){

 
		boolean accountCreated = Youtube.createChannel("godzela", "chin", "as", 45414521458l, "gaming", 10, 1000000 , false);
		System.out.println(" is accountCreated" + accountCreated);



if(accountCreated){
Youtube.getChannelInfo();
}









}
}