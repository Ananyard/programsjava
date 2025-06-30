class PumaShoes {

    public static void main(String[] args) {

        System.out.println("main started");

        String brand = "Puma";
        String product = "Puma Men's Running Shoes";
        int price = 2499;
        double shoeSize = 9.0; // UK Size
        String color = "Navy Blue";
        String soleMaterial = "Rubber";
        String closureType = "Lace-Up";
        double weight = 0.85; // in kg

        String a = "Brand: ";
        String b = "Product: ";
        String c = "Price: ";
        String d = "Shoe Size: ";
        String e = "Color: ";
        String f = "Sole Material: ";
        String g = "Closure Type: ";
        String h = "Weight: ";

        System.out.println(a + brand);
        System.out.println(b + product);
        System.out.println(c + "₹" + price);
        System.out.println(d + shoeSize + " UK");
        System.out.println(e + color);
        System.out.println(f + soleMaterial);
        System.out.println(g + closureType);
        System.out.println(h + weight + " kg");

        System.out.println("main ended");
    }
}
