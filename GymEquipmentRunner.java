public class GymEquipmentRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        GymEquipment e1 = new GymEquipment();
        GymEquipment e2 = new GymEquipment(1);
        GymEquipment e3 = new GymEquipment(2, "Treadmill");
        GymEquipment e4 = new GymEquipment(3, "Bench Press", "IronGain");
        GymEquipment e5 = new GymEquipment(4, "Dumbbell", "FlexFit", "Steel");
        GymEquipment e6 = new GymEquipment(5, "Kettlebell", "FitZone", "Cast Iron", 1499.00);
        GymEquipment e7 = new GymEquipment(6, "Rowing Machine", "RowX", "Alloy", 39999.00, "Cardio");
        GymEquipment e8 = new GymEquipment(7, "Pull-up Bar", "CoreFit", "Steel", 2999.00, "Strength", 15.0);

        System.out.println("e2 ID: " + e2.equipmentId);
        System.out.println("e3 Name: " + e3.name);
        System.out.println("e4 Brand: " + e4.brand);
        System.out.println("e5 Material: " + e5.material);
        System.out.println("e6 Price: ₹" + e6.price);
        System.out.println("e7 Category: " + e7.category);
        System.out.println("e8 Weight: " + e8.weight + " kg");

        System.out.println("\nCalling getInfo():");
        e1.getInfo();
        e2.getInfo();
        e3.getInfo();
        e4.getInfo();
        e5.getInfo();
        e6.getInfo();
        e7.getInfo();
        e8.getInfo();

        System.out.println("main ended");
    }
}
