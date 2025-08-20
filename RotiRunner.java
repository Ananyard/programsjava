public class RotiRunner {
    public static void main(String[] args) {

        System.out.println("Main started");

        Roti r1 = new Roti(1, "Wheat", 15.5, 120, true, 10.0);
        Roti r2 = new Roti(2, "Multigrain", 16.0, 110, false, 12.5);
        Roti r3 = new Roti(3, "Bajra", 14.0, 130, true, 11.0);
        Roti r4 = new Roti(4, "Jowar", 13.5, 125, false, 9.5);
        Roti r5 = new Roti(5, "Ragi", 12.0, 100, true, 8.0);
        Roti r6 = new Roti(6, "Maize", 14.5, 105, false, 9.0);
        Roti r7 = new Roti(7, "Oats", 15.0, 98, true, 10.5);
        Roti r8 = new Roti(8, "Quinoa", 13.0, 115, true, 13.0);
        Roti r9 = new Roti(9, "Barley", 15.0, 108, false, 9.8);
        Roti r10 = new Roti(10, "Amaranth", 12.5, 95, true, 10.2);
        Roti r11 = new Roti(11, "Wheat", 14.8, 117, true, 10.0);
        Roti r12 = new Roti(12, "Sorghum", 13.2, 102, false, 9.3);
        Roti r13 = new Roti(13, "Multigrain", 15.6, 118, true, 11.7);
        Roti r14 = new Roti(14, "Ragi", 12.3, 96, true, 8.9);
        Roti r15 = new Roti(15, "Bajra", 14.4, 112, false, 10.4);
        Roti r16 = new Roti(16, "Wheat", 16.5, 122, true, 11.0);
        Roti r17 = new Roti(17, "Maize", 13.9, 106, false, 9.1);
        Roti r18 = new Roti(18, "Jowar", 12.8, 101, true, 9.6);
        Roti r19 = new Roti(19, "Multigrain", 14.7, 119, true, 12.0);
        Roti r20 = new Roti(20, "Wheat", 15.9, 123, true, 10.8);

        // Call getRotiInfo for each object
        r1.getRotiInfo(); r2.getRotiInfo(); r3.getRotiInfo(); r4.getRotiInfo(); r5.getRotiInfo();
        r6.getRotiInfo(); r7.getRotiInfo(); r8.getRotiInfo(); r9.getRotiInfo(); r10.getRotiInfo();
        r11.getRotiInfo(); r12.getRotiInfo(); r13.getRotiInfo(); r14.getRotiInfo(); r15.getRotiInfo();
        r16.getRotiInfo(); r17.getRotiInfo(); r18.getRotiInfo(); r19.getRotiInfo(); r20.getRotiInfo();

        System.out.println("Main ended");
    }
}
