class ForestSafari {
    String name;
    String location;
    double areaSqKm;
    double entryFee;
    boolean hasTigers;
    String openTime;

	ForestSafari(){
	 System.out.println("Default constructor invoked");
	}
	
    // Constructor
    public ForestSafari(String name, String location, double areaSqKm, double entryFee, boolean hasTigers, String openTime) {
        this.name = name;
        this.location = location;
        this.areaSqKm = areaSqKm;
        this.entryFee = entryFee;
        this.hasTigers = hasTigers;
        this.openTime = openTime;
    }
    public void getInfo() {
        System.out.println("Safari Name: " + name);
        System.out.println("Location : " + location);
        System.out.println("Area (sq.km) : " + areaSqKm);
        System.out.println("Entry Fee (₹) : " + entryFee);
        System.out.println("Has Tigers  : " + hasTigers);
        System.out.println("Opening Time  : " + openTime);
        System.out.println();
    }
}
