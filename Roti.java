class Roti {
    int rotiId;
    String type;
    double diameterCm;
    int calories;
    boolean isWholeWheat;
    double pricePerPiece;

    public Roti() {
        System.out.println("Default constructor invoked");
    }

    public Roti(int rotiId) {
        this.rotiId = rotiId;
        
    }

    public Roti(int rotiId, String type) {
        this.rotiId = rotiId;
        this.type = type;
     
    }

    public Roti(int rotiId, String type, double diameterCm) {
        this.rotiId = rotiId;
        this.type = type;
        this.diameterCm = diameterCm;
      
    }

    public Roti(int rotiId, String type, double diameterCm, int calories) {
        this.rotiId = rotiId;
        this.type = type;
        this.diameterCm = diameterCm;
        this.calories = calories;
        
    }

    public Roti(int rotiId, String type, double diameterCm, int calories, boolean isWholeWheat) {
        this.rotiId = rotiId;
        this.type = type;
        this.diameterCm = diameterCm;
        this.calories = calories;
        this.isWholeWheat = isWholeWheat;
       
    }

    public Roti(int rotiId, String type, double diameterCm, int calories, boolean isWholeWheat, double pricePerPiece) {
        this.rotiId = rotiId;
        this.type = type;
        this.diameterCm = diameterCm;
        this.calories = calories;
        this.isWholeWheat = isWholeWheat;
        this.pricePerPiece = pricePerPiece;
        
    }

    public void getRotiInfo() {
        System.out.println("Roti ID: " + rotiId);
        System.out.println("Type: " + type);
        System.out.println("Diameter: " + diameterCm + " cm");
        System.out.println("Calories: " + calories);
        System.out.println("Whole Wheat: " + isWholeWheat);
        System.out.println("Price per piece: ₹" + pricePerPiece);
        System.out.println("---------------");
    }
}
