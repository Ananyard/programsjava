public class Pipe {
    int pipeId;
    String material;
    double length;
    double diameter;
    boolean isInsulated;
    String color;

    public void getPipeInfo() {
        System.out.println("Pipe ID: " + pipeId);
        System.out.println("Material: " + material);
        System.out.println("Length (meters): " + length);
        System.out.println("Diameter (inches): " + diameter);
        System.out.println("Is Insulated: " + isInsulated);
        System.out.println("Color: " + color);
        System.out.println();
    }
}
