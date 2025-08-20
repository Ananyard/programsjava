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
    // Parameterized constructor
    public Blazer(int blazerId, String size, String color, String material, String brand, double price, String gender) {
        this.blazerId = blazerId;
        this.size = size;
        this.color = color;
        this.material = material;
        this.brand = brand;
        this.price = price;
        this.gender = gender;
    }

   
    public void getBlazerInfo() {
        System.out.println("Blazer ID : " + blazerId);
        System.out.println("Size : " + size);
        System.out.println("Color  : " + color);
        System.out.println("Material : " + material);
        System.out.println("Brand  : " + brand);
        System.out.println("Price  : ₹" + price);
        System.out.println("Gender : " + gender);
        System.out.println();
    }
}
