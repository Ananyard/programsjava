public class AmusementPark {
	
	AmusementPark(){
		
		System.out.println("cons invoked");
	}
		
			AmusementPark(int rideId,String rideName,String rideType,String operatorName,int minHeight,boolean isOpen){
		
		System.out.println("amusment parameterised cons invoked");
		this.rideId = rideId;
		this.rideName= rideName;
		this.rideType=rideType;
		this.operatorName=operatorName;
		this.minHeight=minHeight;
		this.isOpen =isOpen;
	}

      int rideId;
    String rideName;
    String rideType;
    String operatorName;
    int minHeight;
    boolean isOpen;
	
	
	public void  getAmusementInfo(){
		System.out.println("ride id: " + rideId);
        System.out.println("ride name: " + rideName);
        System.out.println("ride type: " + rideType);
        System.out.println("operator name: " + operatorName);
        System.out.println("min height: " + minHeight);
        System.out.println("is open: " + isOpen);
		
		
		
	}
	
}
