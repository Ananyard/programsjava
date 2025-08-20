public class GymEquipment {
    public int equipmentId;
    public String name;
    public String brand;
    public String material;
    public double price;
    public String type;
    public double weight;

    public void getInfo() {
        System.out.println("Equipment ID: " + equipmentId);
        System.out.println("Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Price: " + price);
        System.out.println("Type: " + type);
        System.out.println("Weight: " + weight);
        System.out.println("--------------------------");
    }
}
