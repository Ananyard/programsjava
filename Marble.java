public class Marble {
    public int marbleId;
    public String name;
    public String origin;
    public String color;
    public double hardness;
    public double pricePerSqFt;
    public boolean isPolished;
    public String texture;

     Marble(int marbleId, String name, String origin, String color,
                  double hardness, double pricePerSqFt, boolean isPolished, String texture) {
        this.marbleId = marbleId;
        this.name = name;
        this.origin = origin;
        this.color = color;
        this.hardness = hardness;
        this.pricePerSqFt = pricePerSqFt;
        this.isPolished = isPolished;
        this.texture = texture;
    }

    public void getInfo() {
        System.out.println("Marble ID: " + marbleId);
        System.out.println("Name: " + name);
        System.out.println("Origin: " + origin);
        System.out.println("Color: " + color);
        System.out.println("Hardness: " + hardness);
        System.out.println("Price per Sq Ft: $" + pricePerSqFt);
        System.out.println("Polished: " + (isPolished ? "Yes" : "No"));
        System.out.println("Texture: " + texture);
        System.out.println("-------------------------------");
    }
}
