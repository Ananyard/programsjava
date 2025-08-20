class Blade {
    int bladeId;
    String size;
    String color;
    String material;
    String brand;
    double price;
    String type;

	Blade(){
	System.out.println(" Default Constructor invoked for Blade ID ");
	
	}



    Blade(int bladeId, String size, String color, String material, String brand, double price, String type) {
        this.bladeId = bladeId;
        this.size = size;
        this.color = color;
        this.material = material;
        this.brand = brand;
        this.price = price;
        this.type = type;
        System.out.println("Constructor invoked");
    }

    void getBladeInfo() {
        System.out.println("ID: " + bladeId + ", Size: " + size + ", Color: " + color + ", Material: " + material +
                           ", Brand: " + brand + ", Price: " + price + ", Type: " + type);
    }
}
