class Flowers {
    int flowerId;
    String flowerName;
    String color;
    boolean isFragrant;
    int averageHeightCm;
    double pricePerStem;

 public   void getInfo() {
        System.out.println("Flower ID: " + flowerId);
        System.out.println("Flower Name: " + flowerName);
        System.out.println("Color: " + color);
        System.out.println("Is Fragrant: " + isFragrant);
        System.out.println("Average Height (cm): " + averageHeightCm);
        System.out.println("Price per Stem (INR): " + pricePerStem);
        System.out.println();  // Blank line for readability
    }
}
