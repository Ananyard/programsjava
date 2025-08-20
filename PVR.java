class PVR {
    String pvrName;
    String location;
    int totalScreens;
    

    PVR(String pvrName, String location, int totalScreens) {
        this.pvrName = pvrName;
        this.location = location;
        this.totalScreens = totalScreens;
    
    }

    void getPvrInfo() {
        System.out.println("PVR Info:");
        System.out.println("Name: " + pvrName);
        System.out.println("Location: " + location);
        System.out.println("Total Screens: " + totalScreens);
       
    }
}