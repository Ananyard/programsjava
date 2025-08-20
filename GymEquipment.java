public class GymEquipment {
    int equipmentId;
    String name;
    String brand;
    String material;
    double price;
    String category;
    double weight;

    GymEquipment() {
        System.out.println("Default constructor");
    }

    GymEquipment(int equipmentId) {
        this.equipmentId = equipmentId;
    }

    GymEquipment(int equipmentId, String name) {
        this.equipmentId = equipmentId;
        this.name = name;
        
    }

    GymEquipment(int equipmentId, String name, String brand) {
        this.equipmentId = equipmentId;
        this.name = name;
        this.brand = brand;
        
    }

    GymEquipment(int equipmentId, String name, String brand, String material) {
        this.equipmentId = equipmentId;
        this.name = name;
        this.brand = brand;
        this.material = material;
      
    }

    GymEquipment(int equipmentId, String name, String brand, String material, double price) {
        this.equipmentId = equipmentId;
        this.name = name;
        this.brand = brand;
        this.material = material;
        this.price = price;
        
    }

    GymEquipment(int equipmentId, String name, String brand, String material, double price, String category) {
        this.equipmentId = equipmentId;
        this.name = name;
        this.brand = brand;
        this.material = material;
        this.price = price;
        this.category = category;

    }

    GymEquipment(int equipmentId, String name, String brand, String material, double price, String category, double weight) {
        this.equipmentId = equipmentId;
        this.name = name;
        this.brand = brand;
        this.material = material;
        this.price = price;
        this.category = category;
        this.weight = weight;
        
    }

    public void getInfo() {
        System.out.println("ID: " + equipmentId);
        System.out.println("Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Price: ₹" + price);
        System.out.println("Category: " + category);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("----------------------");
    }
}
