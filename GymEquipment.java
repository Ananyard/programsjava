public class GymEquipment {
    int equipmentId;
    String name;
    String brand;
    String material;
    double price;
    String type;
    double weight;

    public GymEquipment(int equipmentId, String name, String brand, String material, double price, String type, double weight) {
        System.out.println("Invoking parameterized constructor of GymEquipment");
        this.equipmentId = equipmentId;
        this.name = name;
        this.brand = brand;
        this.material = material;
        this.price = price;
        this.type = type;
        this.weight = weight;
    }

    void getInfo() {
        System.out.println("ID: " + equipmentId);
        System.out.println("Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Price: ₹" + price);
        System.out.println("Type: " + type);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("-------------------------------------");
    }
}
