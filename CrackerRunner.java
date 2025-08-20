class CrackerRunner {
    public static void main(String[] crack) {
        System.out.println("main started");

        Crackers c1  = new Crackers(101, "Sparkle Blast",    "Sparkler",    30,  50.0,  true);
        Crackers c2  = new Crackers(102, "Boomer Thunder",   "Flower Pot",  45,  80.0,  false);
        Crackers c3  = new Crackers(103, "Star Light",       "Chakra",      60, 120.0,  true);
        Crackers c4  = new Crackers(104, "Thunder Clap",     "Anar",        40,  70.0,  false);
        Crackers c5  = new Crackers(105, "Lightning Flash",  "Chakri",      35,  55.0,  true);
        Crackers c6  = new Crackers(106, "Rainbow Wheel",    "Phooljhadi",  50,  90.0,  true);
        Crackers c7  = new Crackers(107, "Fire Star",        "Flower Pot",  55, 100.0,  false);
        Crackers c8  = new Crackers(108, "Golden Spark",     "Sparkler",    25,  45.0,  true);
        Crackers c9  = new Crackers(109, "Silver Ring",      "Chakri",      60, 130.0,  true);
        Crackers c10 = new Crackers(110, "Fire Wheel",       "Chakra",      50,  95.0,  false);
        Crackers c11 = new Crackers(111, "Sparkling Sun",    "Sparkler",    40,  65.0,  true);
        Crackers c12 = new Crackers(112, "Flame Burst",      "Anar",        35,  55.0,  false);
        Crackers c13 = new Crackers(113, "Magic Spark",      "Phooljhadi",  45,  85.0,  true);
        Crackers c14 = new Crackers(114, "Blue Spark",       "Sparkler",    30,  50.0,  true);
        Crackers c15 = new Crackers(115, "Red Glow",         "Chakra",      55, 100.0,  false);
        Crackers c16 = new Crackers(116, "Golden Flame",     "Flower Pot",  40,  70.0,  true);
        Crackers c17 = new Crackers(117, "Silver Shine",     "Chakri",      60, 125.0,  true);
        Crackers c18 = new Crackers(118, "Thunder Strike",   "Anar",        35,  60.0,  false);
        Crackers c19 = new Crackers(119, "Rainbow Spin",     "Phooljhadi",  50,  85.0,  true);
        Crackers c20 = new Crackers(120, "Golden Fire",      "Sparkler",    30,  55.0,  true);

        c1.getCrackerInfo();  c2.getCrackerInfo();  c3.getCrackerInfo();  c4.getCrackerInfo();  c5.getCrackerInfo();
        c6.getCrackerInfo();  c7.getCrackerInfo();  c8.getCrackerInfo();  c9.getCrackerInfo();  c10.getCrackerInfo();
        c11.getCrackerInfo(); c12.getCrackerInfo(); c13.getCrackerInfo(); c14.getCrackerInfo(); c15.getCrackerInfo();
        c16.getCrackerInfo(); c17.getCrackerInfo(); c18.getCrackerInfo(); c19.getCrackerInfo(); c20.getCrackerInfo();

        System.out.println("main ended");
    }
}
