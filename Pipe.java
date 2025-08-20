public class Pipe {
    int pipeId;
    String material;
    double length;
    double diameter;
    boolean isInsulated;
    String color;

     Pipe(int pipeId, String material, double length, double diameter, boolean isInsulated, String color) {
        this.pipeId = pipeId;
        this.material = material;
        this.length = length;
        this.diameter = diameter;
        this.isInsulated = isInsulated;
        this.color = color;
    }

    public void getPipeInfo() {
        System.out.println("Pipe ID: " + pipeId);
        System.out.println("Material: " + material);
        System.out.println("Length: " + length + " meters");
        System.out.println("Diameter: " + diameter + " inches");
        System.out.println("Is Insulated: " + isInsulated);
        System.out.println("Color: " + color);
        System.out.println("-------------");
    }
}
