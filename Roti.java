public class Roti {
    int rotiId;
    String type;
    double diameterCm;
    int calories;
    boolean isWholeWheat;
    double pricePerPiece;

    public void getRotiInfo() {
        System.out.println("Roti ID: " + rotiId);
        System.out.println("Type: " + type);
        System.out.println("Diameter (cm): " + diameterCm);
        System.out.println("Calories: " + calories);
        System.out.println("Is Whole Wheat: " + isWholeWheat);
        System.out.println("Price per Piece: ₹" + pricePerPiece);
        System.out.println("--------------");
    }
}
