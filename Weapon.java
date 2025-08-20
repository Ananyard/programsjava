public class Weapon {
    int weaponId;
    String type;
    String material;
    double weight;
    double length;
    String manufacturer;
    boolean isAutomatic;

    public void getInfo() {
        System.out.println("Weapon ID: " + weaponId);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Weight: " + weight);
        System.out.println("Length: " + length);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Is Automatic: " + isAutomatic);
        System.out.println();
    }
}
