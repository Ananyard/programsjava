class CromptonFan {

    public static void main(String[] args) {

        System.out.println("main started");

        String brand = "Crompton";
        String product = "Crompton Hill Briz 1200mm Ceiling Fan";
        int price = 1499;
        double sweepSize = 1200.0; 
        String color = "Brown";
        int power = 75; 
        long rpm = 370; 
        String material = "Aluminium";
        String feature = "High Speed";

        String a = "Brand: ";
        String b = "Product: ";
        String c = "Price: ";
        String d = "Sweep Size: ";
        String e = "Color: ";
        String f = "Power Consumption: ";
        String g = "Speed (RPM): ";
        String h = "Material: ";
        String i = "Feature: ";

        System.out.println(a + brand);
        System.out.println(b + product);
        System.out.println(c + "₹" + price);
        System.out.println(d + sweepSize + " mm");
        System.out.println(e + color);
        System.out.println(f + power + "W");
        System.out.println(g + rpm);
        System.out.println(h + material);
        System.out.println(i + feature);

        System.out.println("main ended");
    }
}
