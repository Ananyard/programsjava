public class Blazer {
    int blazerId;
    String size;
    String color;
    String material;
    String brand;
    double price;
    String gender;

    public Blazer() {
        System.out.println("Default constructor invoked");
    }

    public Blazer(int blazerId, String size) {
        this.blazerId = blazerId;
        this.size = size;
        System.out.println("Constructor with ID and Size invoked");
    }

    public Blazer(String brand, double price) {
        this.brand = brand;
        this.price = price;
        System.out.println("Constructor with Brand and Price invoked");
    }

    public Blazer(String color, String material, String gender) {
        this.color = color;
        this.material = material;
        this.gender = gender;
        System.out.println("Constructor with Color, Material, Gender invoked");
    }

    public Blazer(int blazerId, String size, String color, String material, String brand, double price, String gender) {
        this.blazerId = blazerId;
        this.size = size;
        this.color = color;
        this.material = material;
        this.brand = brand;
        this.price = price;
        this.gender = gender;
        System.out.println("Full Constructor invoked for ID: " + blazerId);
    }

    public void getBlazerInfo() {
        System.out.println("Blazer ID : " + blazerId);
        System.out.println("Size      : " + size);
        System.out.println("Color     : " + color);
        System.out.println("Material  : " + material);
        System.out.println("Brand     : " + brand);
        System.out.println("Price     : ₹" + price);
        System.out.println("Gender    : " + gender);
        System.out.println("---------------------------------");
    }
}
