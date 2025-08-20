public class Flowers {
    int flowerId;
    String name;
    String color;
    boolean hasFragrance;
    int petalCount;
    double price;

    // Default constructor
    Flowers() {
    }

    // Constructor 1: Full details
    Flowers(int flowerId, String name, String color, boolean hasFragrance, int petalCount, double price) {
        this.flowerId = flowerId;
        this.name = name;
        this.color = color;
        this.hasFragrance = hasFragrance;
        this.petalCount = petalCount;
        this.price = price;
    }

    // Constructor 2: Only name and color
    Flowers(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // Constructor 3: Only ID and name
    Flowers(int flowerId, String name) {
        this.flowerId = flowerId;
        this.name = name;
    }

    public void getInfo() {
        System.out.println("Flower ID: " + flowerId);
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Has Fragrance: " + hasFragrance);
        System.out.println("Petal Count: " + petalCount);
        System.out.println("Price: ₹" + price);
        System.out.println("-------------------------");
    }
}
