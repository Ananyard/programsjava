public class Roti {
    int rotiId;
    String type;
    double diameterCm;
    int calories;
    boolean isWholeWheat;
    double pricePerPiece;

     Roti(int rotiId, String type, double diameterCm, int calories, boolean isWholeWheat, double pricePerPiece) {
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
