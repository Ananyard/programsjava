class RotiRunner {
    public static void main(String[] args) {

        System.out.println("Main started");

        Roti roti1 = new Roti();  
        roti1.rotiId = 1;
        roti1.type = "Wheat";
        roti1.diameterCm = 15.0;
        roti1.calories = 120;
        roti1.isWholeWheat = true;
        roti1.pricePerPiece = 10.0;

        Roti roti2 = new Roti(2); 
        System.out.println("Roti ID is: " + roti2.rotiId);

        Roti roti3 = new Roti(3, "Multigrain"); 
        System.out.println("Roti ID: " + roti3.rotiId + ", Type: " + roti3.type);

        Roti roti4 = new Roti(4, "Ragi", 12.5); 
        System.out.println("Roti ID: " + roti4.rotiId + ", Type: " + roti4.type + ", Diameter: " + roti4.diameterCm);

        Roti roti5 = new Roti(5, "Bajra", 14.0, 110); 
        System.out.println("Roti ID: " + roti5.rotiId + ", Type: " + roti5.type + ", Diameter: " + roti5.diameterCm + ", Calories: " + roti5.calories);

        Roti roti6 = new Roti(6, "Jowar", 13.0, 115, true); 
        System.out.println("Roti ID: " + roti6.rotiId + ", Type: " + roti6.type + ", Diameter: " + roti6.diameterCm + ", Calories: " + roti6.calories + ", WholeWheat: " + roti6.isWholeWheat);

        Roti roti7 = new Roti(7, "Maize", 14.0, 100, false, 9.5); 
        System.out.println("Roti brand new full details set!");


        roti1.getRotiInfo();
        roti2.getRotiInfo();
        roti3.getRotiInfo();
        roti4.getRotiInfo();
        roti5.getRotiInfo();
        roti6.getRotiInfo();
        roti7.getRotiInfo();

        System.out.println("Main ended");
    }
}
