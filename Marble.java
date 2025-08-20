public class Marble {
    public int marbleId;
    public String name;
    public String origin;
    public String color;
    public double hardness;
    public double pricePerSqFt;
    public boolean isPolished;
    public String texture;

    public Marble() {
        System.out.println("Default constructor called");
    }

    public Marble(int marbleId) {
        this.marbleId = marbleId;
        System.out.println("Constructor with 1 param: marbleId = " + marbleId);
    }

    public Marble(int marbleId, String name) {
        this.marbleId = marbleId;
        this.name = name;
        System.out.println("Constructor with 2 params: ID = " + marbleId + ", Name = " + name);
    }

    public Marble(int marbleId, String name, String origin) {
        this.marbleId = marbleId;
        this.name = name;
        this.origin = origin;
        System.out.println("Constructor with 3 params");
    }

    public Marble(int marbleId, String name, String origin, String color) {
        this.marbleId = marbleId;
        this.name = name;
        this.origin = origin;
        this.color = color;
        System.out.println("Constructor with 4 params");
    }

    public Marble(int marbleId, String name, String origin, String color, double hardness) {
        this.marbleId = marbleId;
        this.name = name;
        this.origin = origin;
        this.color = color;
        this.hardness = hardness;
        System.out.println("Constructor with 5 params");
    }

    public Marble(int marbleId, String name, String origin, String color, double hardness, double pricePerSqFt) {
        this.marbleId = marbleId;
        this.name = name;
        this.origin = origin;
        this.color = color;
        this.hardness = hardness;
        this.pricePerSqFt = pricePerSqFt;
        System.out.println("Constructor with 6 params");
    }

    public Marble(int marbleId, String name, String origin, String color, double hardness, double pricePerSqFt, boolean isPolished) {
        this.marbleId = marbleId;
        this.name = name;
        this.origin = origin;
        this.color = color;
        this.hardness = hardness;
        this.pricePerSqFt = pricePerSqFt;
        this.isPolished = isPolished;
        System.out.println("Constructor with 7 params");
    }

    public Marble(int marbleId, String name, String origin, String color, double hardness, double pricePerSqFt, boolean isPolished, String texture) {
        this.marbleId = marbleId;
        this.name = name;
        this.origin = origin;
        this.color = color;
        this.hardness = hardness;
        this.pricePerSqFt = pricePerSqFt;
        this.isPolished = isPolished;
        this.texture = texture;
        System.out.println("Full constructor with 8 params");
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
