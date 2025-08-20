public class Rod {
    public int rodId;
    public String material;
    public String usage;
    public double length;
    public double diameter;
    public double weight;
    public String color;

    public void getInfo() {
        System.out.println("Rod ID: " + rodId);
        System.out.println("Material: " + material);
        System.out.println("Usage: " + usage);
        System.out.println("Length: " + length);
        System.out.println("Diameter: " + diameter);
        System.out.println("Weight: " + weight);
        System.out.println("Color: " + color);
        System.out.println();
    }
}
