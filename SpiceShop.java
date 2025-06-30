/*class SpiceShop {
    static String spices[] = {"Turmeric", "Cumin", "Coriander", "Mustard", "Fennel", "Cardamom", "Clove", "Cinnamon", "Bay Leaf", "Pepper",
        "Fenugreek", "Nutmeg", "Ginger", "Red Chili"};

    public static void main(String[] spices) {
        System.out.println(spices[0] + " " + spices[1] + " " + spices[2] + " " + spices[3] + " " + spices[4] + " " +spices[5] + " " + 
		spices[6] + " " + spices[7] + " " + spices[8] + " " + spices[9] + " " +spices[10] + " " + spices[11] + " " + spices[12] + " " + spices[13]);
    }
}*/

class SpiceShop {

    static String spices[] = {
        "Turmeric", "Cumin", "Coriander", "Mustard", "Fennel",
        "Cardamom", "Clove", "Cinnamon", "Bay Leaf", "Pepper",
        "Fenugreek", "Nutmeg", "Ginger", "Red Chili"
    };

    public static void main(String[] args) {
        for (String spice : spices) {
            System.out.println(spice);
        }
    }
}
