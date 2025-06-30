class FireBoltSmartwatch {

    public static void main(String[] args) {

        System.out.println("main started");

        String brand = "Fire-Boltt";
        String product = "Fire-Boltt Phoenix Smartwatch";
        double price = 1699.99;
        String rating = "4.2 out of 5 stars (45,000 ratings)";
        String color = "Black";
        String displayType = "HD LCD";
        int batteryLife = 7; // in days
        double screenSize = 1.3; // in inches
        String specialFeature = "Bluetooth Calling, Fitness Tracking";
        String shape = "Round";

        String a = "Brand: ";
        String b = "Product: ";
        String c = "Price: ";
        String d = "Rating: ";
        String e = "Color: ";
        String f = "Display Type: ";
        String g = "Battery Life: ";
        String h = "Screen Size: ";
        String i = "Special Feature: ";
        String j = "Shape: ";

        System.out.println(a + brand);
        System.out.println(b + product);
        System.out.println(c + "₹" + price);
        System.out.println(d + rating);
        System.out.println(e + color);
        System.out.println(f + displayType);
        System.out.println(g + batteryLife + " days");
        System.out.println(h + screenSize + " inches");
        System.out.println(i + specialFeature);
        System.out.println(j + shape);

        System.out.println("main ended");
    }
}
