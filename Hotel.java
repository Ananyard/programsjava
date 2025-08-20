class Hotel{

String hotelName;
String ownerName;
int noOfWorkers;


/*Hotel(){
	
}*/

Floor floor = new Floor();

/*Hotel(String hotelName,String ownerName,int noOfWorkers,Floor floor){
this.hotelName =hotelName;
this.ownerName = ownerName;
this.noOfWorkers = noOfWorkers;
this.floor = floor;

}*/

public void getHotelInfo(){
System.out.println("hotel info is fetched");
System.out.println("hotel name is : " + hotelName);
System.out.println("hotel owner Name is : " + ownerName);
System.out.println("no of workers" + noOfWorkers);
System.out.println();


this.floor.getFloorInfo();

}
}