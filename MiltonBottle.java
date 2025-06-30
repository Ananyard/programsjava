class MiltonBottle {

    public static void main(String[] args) {

        System.out.println("main started");

        String brand = "Milton";
        String product = "Milton Thermosteel Water Bottle";
        double price = 599.50;
        long capacity = 1000; 
        String color = "Silver";
        String material = "Stainless Steel";
        String insulation = "Double Wall Vacuum";
        double weight = 0.48;

        String a = "Brand: ";
        String b = "Product: ";
        String c = "Price: ";
        String d = "Capacity: ";
        String e = "Color: ";
        String f = "Material: ";
        String g = "Insulation Type: ";
        String h = "Weight: ";

        System.out.println(a + brand);
        System.out.println(b + product);
        System.out.println(c + "₹" + price);
        System.out.println(d + capacity + " ml");
        System.out.println(e + color);
        System.out.println(f + material);
        System.out.println(g + insulation);
        System.out.println(h + weight + " kg");

        System.out.println("main ended");
    }
}
