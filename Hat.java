public class Hat {
    int hatId;
    String style;
    String color;
    String material;
    String brand;
    double price;
    boolean isAdjustable;
	
	Hat(){
		System.out.println("cons invoked");
	}

     Hat(int hatId, String style, String color, String material, String brand, double price, boolean isAdjustable) {
        this.hatId = hatId;
        this.style = style;
        this.color = color;
        this.material = material;
        this.brand = brand;
        this.price = price;
        this.isAdjustable = isAdjustable;
		System.out.println("cons invoked");
    }

    void getInfo() {
        System.out.println("Hat ID: " + hatId);
        System.out.println("Style: " + style);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Brand: " + brand);
        System.out.println("Price: ₹" + price);
        System.out.println("Adjustable: " + isAdjustable);
        System.out.println("------------------------------");
    }
}
