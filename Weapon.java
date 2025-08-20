class Weapon {
    int weaponId;
    String type;
    String material;
    double weight;
    double length;
    String manufacturer;
    boolean isAutomatic;

    public Weapon() {
        System.out.println("Default constructor invoked");
    }

    public Weapon(int weaponId) {
        this.weaponId = weaponId;
        System.out.println("Constructor with 1 param: ID = " + weaponId);
    }

    public Weapon(int weaponId, String type) {
        this.weaponId = weaponId;
        this.type = type;
        System.out.println("Constructor with 2 params: ID = " + weaponId + ", Type = " + type);
    }

    public Weapon(int weaponId, String type, String material) {
        this.weaponId = weaponId;
        this.type = type;
        this.material = material;
        System.out.println("Constructor with 3 params");
    }

    public Weapon(int weaponId, String type, String material, double weight) {
        this.weaponId = weaponId;
        this.type = type;
        this.material = material;
        this.weight = weight;
        System.out.println("Constructor with 4 params");
    }

    public Weapon(int weaponId, String type, String material, double weight, double length) {
        this.weaponId = weaponId;
        this.type = type;
        this.material = material;
        this.weight = weight;
        this.length = length;
        System.out.println("Constructor with 5 params");
    }

    public Weapon(int weaponId, String type, String material, double weight, double length, String manufacturer) {
        this.weaponId = weaponId;
        this.type = type;
        this.material = material;
        this.weight = weight;
        this.length = length;
        this.manufacturer = manufacturer;
        System.out.println("Constructor with 6 params");
    }

    public Weapon(int weaponId, String type, String material, double weight, double length, String manufacturer, boolean isAutomatic) {
        this.weaponId = weaponId;
        this.type = type;
        this.material = material;
        this.weight = weight;
        this.length = length;
        this.manufacturer = manufacturer;
        this.isAutomatic = isAutomatic;
        System.out.println("Constructor with 7 params (full)");
    }

    public void getInfo() {
        System.out.println("Weapon ID: " + weaponId);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Length: " + length + " cm");
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Is Automatic: " + isAutomatic);
        System.out.println("------------------------");
    }
}
