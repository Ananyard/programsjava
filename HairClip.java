public class HairClip {
    public int hairClipId;
    public String size;
    public String color;
    public String material;
    public String brand;
    public double price;
    public String type;

    public void getInfo() {
        System.out.println("hairclip id: " + hairClipId);
        System.out.println("size is: " + size);
        System.out.println("color is: " + color);
        System.out.println("material is: " + material);
        System.out.println("brand is: " + brand);
        System.out.println("price for hairclip: " + price);
        System.out.println("type: " + type);
        System.out.println();
    }
}
