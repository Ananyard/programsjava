public class RodRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        Rod r1 = new Rod(1, "Steel", 2.5, 5.2, "Silver", false, "Construction", "India");
        Rod r2 = new Rod(2, "Carbon Fiber", 1.8, 1.2, "Black", true, "Fishing", "Japan");
        Rod r3 = new Rod(3, "Aluminum", 2.0, 3.0, "Grey", true, "Camping", "USA");
        Rod r4 = new Rod(4, "Plastic", 1.2, 0.8, "White", true, "Toy", "China");
        Rod r5 = new Rod(5, "Wood", 1.5, 2.5, "Brown", false, "Martial Arts", "Korea");
        Rod r6 = new Rod(6, "Fiberglass", 2.1, 1.9, "Transparent", true, "Antenna", "Germany");
        Rod r7 = new Rod(7, "Titanium", 1.6, 2.2, "Silver", false, "Medical Use", "USA");
        Rod r8 = new Rod(8, "Iron", 3.0, 6.0, "Rusty", false, "Construction", "India");
        Rod r9 = new Rod(9, "Copper", 2.2, 4.1, "Reddish", false, "Electrical", "Chile");
        Rod r10 = new Rod(10, "Bamboo", 1.4, 1.3, "Green", true, "Decor", "Thailand");

        Rod r11 = new Rod(11, "Graphite", 1.7, 0.9, "Dark Grey", true, "Fishing", "Canada");
        Rod r12 = new Rod(12, "PVC", 2.3, 2.0, "Blue", true, "Plumbing", "India");
        Rod r13 = new Rod(13, "Steel", 2.8, 4.5, "Black", false, "Railings", "Germany");
        Rod r14 = new Rod(14, "Rubber", 1.3, 1.1, "Red", true, "Sports", "Malaysia");
        Rod r15 = new Rod(15, "Carbon Steel", 2.6, 5.0, "Silver", false, "Machinery", "USA");
        Rod r16 = new Rod(16, "Glass", 1.1, 2.2, "Clear", false, "Decor", "Italy");
        Rod r17 = new Rod(17, "Lead", 1.9, 7.0, "Grey", false, "Shielding", "Australia");
        Rod r18 = new Rod(18, "Nylon", 1.6, 0.7, "Yellow", true, "Textile", "India");
        Rod r19 = new Rod(19, "Plastic", 1.0, 0.5, "Orange", true, "Kids Toys", "Vietnam");
        Rod r20 = new Rod(20, "Steel Alloy", 3.2, 6.2, "Dark Blue", false, "Industrial", "USA");

        r1.getInfo();  r2.getInfo();  r3.getInfo();  r4.getInfo();  r5.getInfo();
        r6.getInfo();  r7.getInfo();  r8.getInfo();  r9.getInfo();  r10.getInfo();
        r11.getInfo(); r12.getInfo(); r13.getInfo(); r14.getInfo(); r15.getInfo();
        r16.getInfo(); r17.getInfo(); r18.getInfo(); r19.getInfo(); r20.getInfo();

        System.out.println("Main ended");
    }
}
