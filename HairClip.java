public class HairClip {
    int hairClipId;
    String size;
    String color;
    String material;
    String brand;
    double price;
    String type;

		HairClip(){
		System.out.println(" default cons incoked");
		}
		
			

    // Constructor
    HairClip(int hairClipId, String size, String color, String material, String brand, double price, String type) {
        this.hairClipId = hairClipId;
        this.size = size;
        this.color = color;
        this.material = material;
        this.brand = brand;
        this.price = price;
        this.type = type;
        System.out.println("cons incoked");
		
    }

    void getInfo() {
        System.out.println("HairClip ID: " + hairClipId);
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Type: " + type);
        System.out.println("--------------------------------");
    }
}
