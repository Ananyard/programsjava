class BladeRunner {
    public static void main(String[] args) {

        // External arrays for material types
    

        Blade blade = new Blade(); // default
        blade.materials = materials1;
        blade.bladeName = "Gillette Fusion";

        Blade blade1 = new Blade();
        blade1.materials = materials2;
        blade1.bladeName = "SuperMax Swift";

        Blade blade2 = new Blade();
        blade2.bladeName = "Wilkinson Sword";
        blade2.materials = materials3;

        Blade blade3 = new Blade("LaserEdge");
        System.out.println("The blade name is " + blade3.bladeName);

        Blade blade4 = new Blade("Gillette", 45.5, "Pack of 5");
        System.out.println(blade4.brand + " costs ₹" + blade4.price + " for " + blade4.quantity);

        blade.getBladeDetails();
        blade1.getBladeDetails();
        blade2.getBladeDetails();
        blade3.getBladeDetails();
        blade4.getBladeDetails();
    }
}
