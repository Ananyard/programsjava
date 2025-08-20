public class MarbleRunner {
    public static void main(String[] king) {

        System.out.println("main started");

        Marble marble1 = new Marble(201, "Carrara White", "Italy", "White", 3.0, 15.5, true, "Fine Grain");
        Marble marble2 = new Marble(202, "Calacatta Gold", "Italy", "White with Gold Veins", 3.5, 18.0, true, "Coarse Grain");
        Marble marble3 = new Marble(203, "Crema Marfil", "Spain", "Beige", 3.2, 14.0, false, "Medium Grain");
        Marble marble4 = new Marble(204, "Emperador Dark", "Spain", "Dark Brown", 3.1, 13.5, true, "Fine Grain");
        Marble marble5 = new Marble(205, "Black Marquina", "Spain", "Black", 3.3, 16.0, true, "Coarse Grain");
        Marble marble6 = new Marble(206, "Thassos White", "Greece", "Pure White", 3.0, 17.0, true, "Fine Grain");
        Marble marble7 = new Marble(207, "Volakas", "Greece", "White with Gray Veins", 3.2, 15.0, false, "Medium Grain");
        Marble marble8 = new Marble(208, "Rainforest Brown", "India", "Brown with Green Veins", 3.1, 14.5, true, "Coarse Grain");
        Marble marble9 = new Marble(209, "Panda White", "India", "White with Black Veins", 3.4, 16.5, true, "Fine Grain");
        Marble marble10 = new Marble(210, "Crema Valencia", "Spain", "Cream", 3.0, 13.0, false, "Medium Grain");
        Marble marble11 = new Marble(211, "Fantasy Brown", "India", "Brown", 3.2, 15.5, true, "Coarse Grain");
        Marble marble12 = new Marble(212, "Dark Emperador", "Spain", "Dark Brown", 3.1, 14.0, false, "Fine Grain");
        Marble marble13 = new Marble(213, "Volakas White", "Greece", "White with Gray Veins", 3.3, 16.2, true, "Medium Grain");
        Marble marble14 = new Marble(214, "Venato White", "Italy", "White with Gray Veins", 3.4, 17.5, true, "Fine Grain");
        Marble marble15 = new Marble(215, "Statuario", "Italy", "White with Gray Veins", 3.5, 18.0, true, "Fine Grain");
        Marble marble16 = new Marble(216, "White Macaubas", "Brazil", "White with Green Veins", 3.2, 16.7, true, "Coarse Grain");
        Marble marble17 = new Marble(217, "Rainforest Green", "India", "Dark Green with Brown Veins", 3.1, 14.8, false, "Medium Grain");
        Marble marble18 = new Marble(218, "Teal Shine", "Indonesia", "Teal", 6.9, 55.0, true, "Glossy");
        Marble marble19 = new Marble(219, "Copper Rock", "Chile", "Copper", 5.8, 38.5, false, "Crystalline");
        Marble marble20 = new Marble(220, "Mint Dream", "Pakistan", "Mint", 7.1, 48.9, true, "Smooth");

        marble1.getInfo();  marble2.getInfo();  marble3.getInfo();  marble4.getInfo();  marble5.getInfo();
        marble6.getInfo();  marble7.getInfo();  marble8.getInfo();  marble9.getInfo();  marble10.getInfo();
        marble11.getInfo(); marble12.getInfo(); marble13.getInfo(); marble14.getInfo(); marble15.getInfo();
        marble16.getInfo(); marble17.getInfo(); marble18.getInfo(); marble19.getInfo(); marble20.getInfo();

        System.out.println("main ended");
    }
}
