class WeaponRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        Weapon w1 = new Weapon();
        Weapon w2 = new Weapon(101);
		    Weapon w7 = new Weapon(106, "Axe", "Alloy", 5.0, 60.0, "BladeWorks");
        Weapon w3 = new Weapon(102, "Sword");
        Weapon w4 = new Weapon(103, "Rifle", "Steel");
        Weapon w5 = new Weapon(104, "Pistol", "Iron", 2.5);
        Weapon w6 = new Weapon(105, "Sniper", "Carbon", 3.1, 95.0);
    
        Weapon w8 = new Weapon(107, "Laser Gun", "Titanium", 4.2, 100.0, "SciTech Arms", true);

     
        System.out.println("Weapon 2 ID: " + w2.weaponId);
        System.out.println("Weapon 3 Type: " + w3.type);
        System.out.println("Weapon 4 Material: " + w4.material);
        System.out.println("Weapon 5 Weight: " + w5.weight + " kg");
        System.out.println("Weapon 6 Length: " + w6.length + " cm");
        System.out.println("Weapon 7 Manufacturer: " + w7.manufacturer);
        System.out.println("Weapon 8 Is Automatic: " + w8.isAutomatic);

        System.out.println("\nCalling getInfo():");
        w1.getInfo();
        w2.getInfo();
        w3.getInfo();
        w4.getInfo();
        w5.getInfo();
        w6.getInfo();
        w7.getInfo();
        w8.getInfo();

        System.out.println("Main ended");
    }
}
