class AmusementParkRunner {
    public static void main(String[] args) {
	
	
	
	AmusementPark ride1	= new AmusementPark(20);
	System.out.println("the id of ride is : " + ride1.rideId);
	
	AmusementPark ride2 = new AmusementPark("wheel" , "circle");
	System.out.println("the name of ride is " + ride2.rideName + "its type is " + ride2.rideType);
	
	AmusementPark ride3 = new AmusementPark("manoj",5,true);
	System.out.println("the op name is : "+ ride3.operatorName + " min height require " + ride3.minHeight + " open " + ride3.isOpen);
	
	ride1.getAmusementInfo();
	ride2.getAmusementInfo();
	ride3.getAmusementInfo();

	}
}
 
