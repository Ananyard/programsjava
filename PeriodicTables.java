/*class PeriodicTables {

    // Static individual element variables (external references)
    static String h = "Hydrogen";
    static String he = "Helium";
    static String li = "Lithium";
    static String be = "Beryllium";
    static String b = "Boron";
    static String c = "Carbon";
    static String n = "Nitrogen";
    static String o = "Oxygen";
    static String f = "Fluorine";
    static String ne = "Neon";
    static String na = "Sodium";
    static String mg = "Magnesium";

    static String[] elements = {h, he, li, be, b, c, n, o, f, ne, na, mg};

    public static void main(String[] args) {
        System.out.println(elements[0] + " " + elements[1] + " " + elements[2] + " " +
                           elements[3] + " " + elements[4] + " " + elements[5] + " " +
                           elements[6] + " " + elements[7] + " " + elements[8] + " " +
                           elements[9] + " " + elements[10] + " " + elements[11]);

        System.out.println(h);
        System.out.println(he);
    }
}*/

class PeriodicTable {
    public static void main(String[] args) {

        // 🔹 Local variables for elements
        String h = "Hydrogen";
        String he = "Helium";
        String li = "Lithium";
        String be = "Beryllium";
        String b = "Boron";
        String c = "Carbon";
        String n = "Nitrogen";
        String o = "Oxygen";
        String f = "Fluorine";
        String ne = "Neon";
        String na = "Sodium";
        String mg = "Magnesium";

      
        String[] elements = {h, he, li, be, b, c, n, o, f, ne, na, mg};

     
        System.out.println(
            elements[0] + " " + elements[1] + " " + elements[2] + " " +
            elements[3] + " " + elements[4] + " " + elements[5] + " " +
            elements[6] + " " + elements[7] + " " + elements[8] + " " +
            elements[9] + " " + elements[10] + " " + elements[11]);

     
        System.out.println(h);
        System.out.println(he);

        
        for (String element : elements) {
            System.out.println(element);
        }
    }
}
