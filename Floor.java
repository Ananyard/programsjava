class Floor{
	int noOfFloor;
	String nameOfFloor;
	
	
	
	Room room;
	
public void getFloorInfo(){
	System.out.println("floor info");
	System.out.println("the flooor  details are:");
	System.out.println("the  no of floor size is " + noOfFloor);
	System.out.println("the  name of floor size is " + nameOfFloor);
	System.out.println();
	this.room.getRoomDetails();
	
}






}