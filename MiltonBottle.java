class MiltonBottle {
 static String brand = "Milton";
      static  String product = "Milton Thermosteel Water Bottle";
       static double price = 599.50;
      static  long capacity = 1000; 
      static  String color = "Silver";
     static   String material = "Stainless Steel";
      static  String insulation = "Double Wall Vacuum";
     static   double weight = 0.48;
    public static void main(String[] args) {

        System.out.println("main started");

        

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
