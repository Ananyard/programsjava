class HotelRunner{

public static void main(String[] ht){

//Hotel hotel = new Hotel("","",55,floor);

Floor floor = new Floor();
//Hotel hotel = new Hotel("taj","bab",55,floor);																																			
//has-A- relationship

/*String hotelName = "Taj";
hotel.hotelName = hotelName;
hotel.ownerName = "taj bba";
hotel.noOfWorkers = 70;*/

//hotel.ownerName = ownerName;


/*Floor floor = new Floor();
hotel.floor = floor;*/

Hotel hotel = new Hotel();
hotel.hotelName = "taj";
hotel.noOfWorkers = 70;




floor.noOfFloor = 30;
floor.nameOfFloor = "classic";

System.out.println(hotel.floor);
hotel.floor = floor;

Room room = new Room();
room.roomSize = "90";
room.roomNo = 102;
	room.type = "ac";
	room.isBalconyAvailable = true;
	room.bedType ="queen" ;


floor.room = room;

hotel.getHotelInfo();

}
}
