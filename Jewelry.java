public class Jewelry {
    int jewelryId;
    String type;
    String material;
    String color;
    String brand;
    double price;
    String gender;



   
    public Jewelry() {
        System.out.println("Default constructor called for Jewelry");
    }

    // Parameterized constructor
    public Jewelry(int jewelryId, String type, String material, String color, String brand, double price, String gender) {
        System.out.println("Parameterized constructor called for Jewelry: " + type);
        this.jewelryId = jewelryId;
        this.type = type;
        this.material = material;
        this.color = color;
        this.brand = brand;
        this.price = price;
        this.gender = gender;
    }

    void getInfo() {
        System.out.println("Jewelry ID: " + jewelryId);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Gender: " + gender);
        System.out.println("------------------------------------");
    }
}
