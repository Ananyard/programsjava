class AmusementPark {
	int rideId;
    String rideName;
    String rideType;
    String operatorName;
    int minHeight;
    boolean isOpen;
	
	
	
	AmusementPark(){
		
	}
			AmusementPark(int rideId){
		
		System.out.println("amusment parameterised cons invoked");
		this.rideId = rideId;
		
		
	}

			AmusementPark(String rideName,String rideType){
			this.rideName= rideName;
			this.rideType=rideType;
			}
			
			
		AmusementPark(String operatorName,int minHeight, boolean isOpen){
			this.operatorName=operatorName;
			this.minHeight=minHeight;
			this.isOpen =isOpen;
		 }		
	
	
	public void  getAmusementInfo(){
		System.out.println("ride id: " + rideId);
        System.out.println("ride name: " + rideName);
        System.out.println("ride type: " + rideType);
        System.out.println("operator name: " + operatorName);
        System.out.println("min height: " + minHeight);
        System.out.println("is open: " + isOpen);
		
		
		
	}
	
}
