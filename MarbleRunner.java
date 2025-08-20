class MarbleRunner {
    public static void main(String[] args) {

        System.out.println("main started");

        Marble m1 = new Marble();
        Marble m2 = new Marble(101);
        Marble m3 = new Marble(102, "Carrara");
        Marble m4 = new Marble(103, "Calacatta", "Italy");
        Marble m5 = new Marble(104, "Crema Marfil", "Spain", "Beige");
        Marble m6 = new Marble(105, "Emperador", "Spain", "Dark Brown", 3.1);
        Marble m7 = new Marble(106, "Black Marquina", "Spain", "Black", 3.2, 16.0);
        Marble m8 = new Marble(107, "Thassos", "Greece", "White", 3.0, 17.0, true);
        Marble m9 = new Marble(108, "Panda White", "India", "White with Black Veins", 3.4, 16.5, true, "Fine Grain");

        
        System.out.println("Marble 2 ID: " + m2.marbleId);
        System.out.println("Marble 3 Name: " + m3.name);
        System.out.println("Marble 4 Origin: " + m4.origin);
        System.out.println("Marble 5 Color: " + m5.color);
        System.out.println("Marble 6 Hardness: " + m6.hardness);
        System.out.println("Marble 7 Price: $" + m7.pricePerSqFt);
        System.out.println("Marble 8 Polished: " + m8.isPolished);
        System.out.println("Marble 9 Texture: " + m9.texture);

       
        System.out.println("\nCalling getInfo():");
        m1.getInfo();
        m2.getInfo();
        m3.getInfo();
        m4.getInfo();
        m5.getInfo();
        m6.getInfo();
        m7.getInfo();
        m8.getInfo();
        m9.getInfo();

        System.out.println("main ended");
    }
}
