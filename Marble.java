class Marble {
    int marbleId;
    String name;
    String origin;
    String color;
    double hardness;
    double pricePerSqFt;
    boolean isPolished;
    String texture;

    void getInfo() {
        System.out.println("Marble ID: " + marbleId);
        System.out.println("Name: " + name);
        System.out.println("Origin: " + origin);
        System.out.println("Color: " + color);
        System.out.println("Hardness: " + hardness);
        System.out.println("Price Per SqFt: $" + pricePerSqFt);
        System.out.println("Is Polished: " + isPolished);
        System.out.println("Texture: " + texture);
        System.out.println();
    }
}
