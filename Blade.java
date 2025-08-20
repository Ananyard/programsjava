public class Blade {
    int bladeId;
    String size;
    String color;
    String material;
    String brand;
    double price;
    String type;

    // Default constructor
    Blade() {
        System.out.println("Default constructor invoked for Blade");
    }

    // Constructor with id and brand
    Blade(int bladeId, String brand) {
        this.bladeId = bladeId;
        this.brand = brand;
        System.out.println("Constructor invoked for Brand: " + brand);
    }

    // Constructor with material and type
    Blade(String material, String type) {
        this.material = material;
        this.type = type;
        System.out.println("Constructor invoked for Type: " + type);
    }

    // Constructor with price and size
    Blade(double price, String size) {
        this.price = price;
        this.size = size;
        System.out.println("Constructor invoked for Size: " + size);
    }

    // Full constructor
    Blade(int bladeId, String size, String color, String material, String brand, double price, String type) {
        this.bladeId = bladeId;
        this.size = size;
        this.color = color;
        this.material = material;
        this.brand = brand;
        this.price = price;
        this.type = type;
        System.out.println("Full constructor invoked for Blade ID: " + bladeId);
    }

    void getBladeInfo() {
        System.out.println("Blade ID   : " + bladeId);
        System.out.println("Size       : " + size);
        System.out.println("Color      : " + color);
        System.out.println("Material   : " + material);
        System.out.println("Brand      : " + brand);
        System.out.println("Price      : ₹" + price);
        System.out.println("Type       : " + type);
        System.out.println("-----------------------------------");
    }
}
