 class Hat {
    public int hatId;
    public String style;
    public String color;
    public String material;
    public String brand;
    public double price;
    public boolean isAdjustable;

    public void getInfo() {
        System.out.println("Hat ID: " + hatId);
        System.out.println("Style: " + style);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Is Adjustable: " + isAdjustable);
        System.out.println();
    }
}
