/*class Bars {

    static String alc1 = "Whiskey";
    static String alc2 = "Vodka";
    static String alc3 = "Rum";
    static String alc4 = "Beer";
    static String alc5 = "Brandy";
    static String alc6 = "Tequila";
    static String alc7 = "Gin";
    static String alc8 = "Wine";
    static String alc9 = "Absinthe";
    static String alc10 = "Cognac";
    static String alc11 = "Sake";
    static String alc12 = "Scotch";

    static String[] alcoholNames = {alc1, alc2, alc3, alc4, alc5, alc6, alc7, alc8, alc9, alc10, alc11, alc12};

    public static void main(String[] bar) {
        System.out.println(alcoholNames[0] + " " + alcoholNames[1] + " " + alcoholNames[2] + " " + alcoholNames[3] + " " + alcoholNames[4] + " " +
            alcoholNames[5] + " " + alcoholNames[6] + " " + alcoholNames[7] + " " + alcoholNames[8] + " " + alcoholNames[9] + " " +
            alcoholNames[10] + " " + alcoholNames[11]);
        for (String bars : alcoholNames) {
            System.out.println(bars);
        }
    }
}*/

class Bar {

    public static void main(String[] bar) {
        String alc1 = "Whiskey";
        String alc2 = "Vodka";
        String alc3 = "Rum";
        String alc4 = "Beer";
        String alc5 = "Brandy";
        String alc6 = "Tequila";
        String alc7 = "Gin";
        String alc8 = "Wine";
        String alc9 = "Absinthe";
        String alc10 = "Cognac";
        String alc11 = "Sake";
        String alc12 = "Scotch";

        String[] alcoholNames = {alc1, alc2, alc3, alc4, alc5, alc6, alc7, alc8, alc9, alc10, alc11, alc12};
        System.out.println(alcoholNames[0] + " " + alcoholNames[1] + " " + alcoholNames[2] + " " + alcoholNames[3] + " " + alcoholNames[4] + " " +
            alcoholNames[5] + " " + alcoholNames[6] + " " + alcoholNames[7] + " " + alcoholNames[8] + " " + alcoholNames[9] + " " +
            alcoholNames[10] + " " + alcoholNames[11]);
        for (String bars : alcoholNames) {
            System.out.println(bars);
        }
    }
}
