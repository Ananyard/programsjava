public class Weapon {
    int weaponId;
    String type;
    String material;
    double weight;
    double length;
    String manufacturer;
    boolean isAutomatic;

    public Weapon(int weaponId, String type, String material, double weight, double length, String manufacturer, boolean isAutomatic) {
        this.weaponId = weaponId;
        this.type = type;
        this.material = material;
        this.weight = weight;
        this.length = length;
        this.manufacturer = manufacturer;
        this.isAutomatic = isAutomatic;
    }

    public void getInfo() {
        System.out.println("Weapon ID: " + weaponId);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Length: " + length + " cm");
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Is Automatic: " + isAutomatic);
        System.out.println("-------------");
    }
}
