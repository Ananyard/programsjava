public class KingRunner {
    public static void main(String[] args) {

        System.out.println("main started");

        King k1 = new King(201, "Ashoka", "Maurya Empire", -268, -232, true);
        King k2 = new King(202, "Akbar", "Mughal Empire", 1556, 1605, true);
        King k3 = new King(203, "Chandragupta", "Maurya Empire", -321, -297, false);
        King k4 = new King(204, "Harsha", "Kanauj", 606, 647, false);
        King k5 = new King(205, "Raja Raja Chola", "Chola Empire", 985, 1014, true);
        King k6 = new King(206, "Prithviraj Chauhan", "Chauhan Dynasty", 1178, 1192, true);
        King k7 = new King(207, "Tipu Sultan", "Mysore Kingdom", 1782, 1799, true);
        King k8 = new King(208, "Shivaji", "Maratha Empire", 1674, 1680, true);
        King k9 = new King(209, "Bahadur Shah Zafar", "Mughal Empire", 1837, 1857, false);
        King k10 = new King(210, "Samudragupta", "Gupta Empire", 335, 375, true);
        King k11 = new King(211, "Krishnadevaraya", "Vijayanagara Empire", 1509, 1529, true);
        King k12 = new King(212, "Ranjit Singh", "Sikh Empire", 1801, 1839, true);
        King k13 = new King(213, "Kanishka", "Kushan Empire", 127, 150, false);
        King k14 = new King(214, "Pulakeshin II", "Chalukya Dynasty", 610, 642, true);
        King k15 = new King(215, "Bimbisara", "Magadha", -544, -492, false);
        King k16 = new King(216, "Ajatashatru", "Magadha", -492, -460, false);
        King k17 = new King(217, "Narendra Dev", "Nepal", 643, 679, false);
        King k18 = new King(218, "Lalitaditya Muktapida", "Karkota Dynasty", 724, 760, false);
        King k19 = new King(219, "Raja Bhoja", "Paramara Dynasty", 1010, 1055, true);
        King k20 = new King(220, "Vikramaditya", "Ujjain", 57, 78, true);

        k1.getKingInfo();  k2.getKingInfo();  k3.getKingInfo();  k4.getKingInfo();  k5.getKingInfo();
        k6.getKingInfo();  k7.getKingInfo();  k8.getKingInfo();  k9.getKingInfo();  k10.getKingInfo();
        k11.getKingInfo(); k12.getKingInfo(); k13.getKingInfo(); k14.getKingInfo(); k15.getKingInfo();
        k16.getKingInfo(); k17.getKingInfo(); k18.getKingInfo(); k19.getKingInfo(); k20.getKingInfo();

        System.out.println("main ended");
    }
}
