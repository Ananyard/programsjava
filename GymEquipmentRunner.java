public class GymEquipmentRunner {
    public static void main(String[] args) {

        System.out.println("main started");

        GymEquipment e1 = new GymEquipment(1, "Dumbbell", "FlexFit", "Steel", 999.99, "Strength", 10.0);
        GymEquipment e2 = new GymEquipment(2, "Treadmill", "RunPro", "Aluminum", 54999.00, "Cardio", 75.0);
        GymEquipment e3 = new GymEquipment(3, "Exercise Bike", "CycloTech", "Steel", 29999.00, "Cardio", 55.0);
        GymEquipment e4 = new GymEquipment(4, "Bench Press", "IronGain", "Iron", 7999.00, "Strength", 40.0);
        GymEquipment e5 = new GymEquipment(5, "Kettlebell", "FitZone", "Cast Iron", 1499.00, "Strength", 12.0);
        GymEquipment e6 = new GymEquipment(6, "Rowing Machine", "RowX", "Alloy", 39999.00, "Cardio", 60.0);
        GymEquipment e7 = new GymEquipment(7, "Pull-up Bar", "CoreFit", "Steel", 2999.00, "Strength", 15.0);
        GymEquipment e8 = new GymEquipment(8, "Resistance Bands", "BandX", "Rubber", 799.00, "Flexibility", 1.5);
        GymEquipment e9 = new GymEquipment(9, "Leg Press", "MuscleTech", "Iron", 19999.00, "Strength", 85.0);
        GymEquipment e10 = new GymEquipment(10, "Ab Roller", "CorePro", "Plastic", 499.00, "Core", 2.0);
        GymEquipment e11 = new GymEquipment(11, "Lat Pulldown", "PowerGym", "Steel", 14999.00, "Strength", 70.0);
        GymEquipment e12 = new GymEquipment(12, "Battle Ropes", "RopeKing", "Nylon", 3999.00, "Conditioning", 7.0);
        GymEquipment e13 = new GymEquipment(13, "Medicine Ball", "FitCore", "Rubber", 999.00, "Strength", 5.0);
        GymEquipment e14 = new GymEquipment(14, "Stepper Machine", "StepUp", "Aluminum", 24999.00, "Cardio", 45.0);
        GymEquipment e15 = new GymEquipment(15, "Jump Rope", "SpeedX", "PVC", 299.00, "Cardio", 0.5);
        GymEquipment e16 = new GymEquipment(16, "Weight Plate", "StrongFit", "Iron", 799.00, "Strength", 20.0);
        GymEquipment e17 = new GymEquipment(17, "Barbell", "IronCore", "Steel", 3499.00, "Strength", 15.0);
        GymEquipment e18 = new GymEquipment(18, "Incline Bench", "MuscleFlex", "Iron", 4999.00, "Strength", 30.0);
        GymEquipment e19 = new GymEquipment(19, "Cable Machine", "FlexPro", "Steel", 59999.00, "Strength", 95.0);
        GymEquipment e20 = new GymEquipment(20, "Smith Machine", "PowerZone", "Iron", 69999.00, "Strength", 100.0);

        e1.getInfo();  e2.getInfo();  e3.getInfo();  e4.getInfo();  e5.getInfo();
        e6.getInfo();  e7.getInfo();  e8.getInfo();  e9.getInfo();  e10.getInfo();
        e11.getInfo(); e12.getInfo(); e13.getInfo(); e14.getInfo(); e15.getInfo();
        e16.getInfo(); e17.getInfo(); e18.getInfo(); e19.getInfo(); e20.getInfo();

        System.out.println("main ended");
    }
}
