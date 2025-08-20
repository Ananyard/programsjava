public class WeaponRunner {
    public static void main(String[] args) {

        System.out.println("Main started");

        Weapon w1 = new Weapon(101, "Sword", "Steel", 3.5, 90.0, "BladeWorks", false);
        Weapon w2 = new Weapon(102, "Pistol", "Aluminum", 1.2, 22.5, "Glock", true);
        Weapon w3 = new Weapon(103, "Rifle", "Carbon Fiber", 4.0, 100.0, "Remington", true);
        Weapon w4 = new Weapon(104, "Dagger", "Iron", 0.8, 30.0, "ForgedEdge", false);
        Weapon w5 = new Weapon(105, "Shotgun", "Steel", 3.9, 95.0, "Beretta", false);
        Weapon w6 = new Weapon(106, "Sniper", "Alloy", 6.5, 120.0, "Barrett", true);
        Weapon w7 = new Weapon(107, "Crossbow", "Wood & Iron", 4.3, 80.0, "CrossEdge", false);
        Weapon w8 = new Weapon(108, "Machine Gun", "Titanium", 7.2, 110.0, "DefTech", true);
        Weapon w9 = new Weapon(109, "Axe", "Steel", 5.0, 60.0, "BattleAxes", false);
        Weapon w10 = new Weapon(110, "Spear", "Iron", 4.1, 150.0, "TribalGear", false);
        Weapon w11 = new Weapon(111, "Grenade", "Steel", 0.4, 10.0, "BoomWorks", true);
        Weapon w12 = new Weapon(112, "Katana", "Carbon Steel", 2.3, 100.0, "Shinobi Blades", false);
        Weapon w13 = new Weapon(113, "Flamethrower", "Aluminum", 8.5, 130.0, "FireBlaze", true);
        Weapon w14 = new Weapon(114, "Trident", "Bronze", 3.0, 160.0, "Poseidon Forge", false);
        Weapon w15 = new Weapon(115, "Nunchaku", "Wood & Chain", 1.1, 60.0, "NinjaTech", false);
        Weapon w16 = new Weapon(116, "Hammer", "Iron", 6.0, 70.0, "Thor Gear", false);
        Weapon w17 = new Weapon(117, "Laser Gun", "Composite", 2.5, 85.0, "SciTech Arms", true);
        Weapon w18 = new Weapon(118, "Boomerang", "Wood", 0.9, 40.0, "AeroFlight", false);
        Weapon w19 = new Weapon(119, "Blowgun", "Plastic", 0.5, 100.0, "SilentStrike", false);
        Weapon w20 = new Weapon(120, "Chainsaw Sword", "Steel", 7.5, 95.0, "DeadGear", true);

        w1.getInfo();   w2.getInfo();   w3.getInfo();   w4.getInfo();   w5.getInfo();
        w6.getInfo();   w7.getInfo();   w8.getInfo();   w9.getInfo();   w10.getInfo();
        w11.getInfo();  w12.getInfo();  w13.getInfo();  w14.getInfo();  w15.getInfo();
        w16.getInfo();  w17.getInfo();  w18.getInfo();  w19.getInfo();  w20.getInfo();

        System.out.println("Main ended");
    }
}
