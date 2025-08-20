class Screen {
    int screenNumber;
    int capacity;
    String screenType;
    PVR pvr;

    Screen(int screenNumber, int capacity, String screenType,PVR pvr) {
        this.screenNumber = screenNumber;
        this.capacity = capacity;
        this.screenType = screenType;
        
		this.pvr = pvr;
    }

    void getScreenInfo() {
        System.out.println("\nScreen Info:");
        System.out.println("Screen Number: " + screenNumber);
        System.out.println("Capacity: " + capacity);
        System.out.println("Type: " + screenType);
        this.pvr.getPvrInfo();
    }
}