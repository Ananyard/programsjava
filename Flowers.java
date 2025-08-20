class Flowers {
    int flowerId;
    String flowerName;
    String color;
    boolean isFragrant;
    int averageHeightCm;
    double pricePerStem;

	Flowers(){
	 System.out.println("cons invoked");
	 }


    Flowers(int flowerId, String flowerName, String color, boolean isFragrant, int averageHeightCm, double pricePerStem) {
        System.out.println("cons invoked");
        this.flowerId = flowerId;
        this.flowerName = flowerName;
        this.color = color;
        this.isFragrant = isFragrant;
        this.averageHeightCm = averageHeightCm;
        this.pricePerStem = pricePerStem;
    }

    void getInfo() {
        System.out.println("Flower ID: " + this.flowerId);
        System.out.println("Flower Name: " + this.flowerName);
        System.out.println("Color: " + this.color);
        System.out.println("Is Fragrant: " + this.isFragrant);
        System.out.println("Average Height (cm): " + this.averageHeightCm);
        System.out.println("Price per Stem: " + this.pricePerStem);
        System.out.println("--------------------------------------");
    }
}
