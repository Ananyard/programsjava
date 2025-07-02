//static

/*class PavitraCollection {

static String zr = "zara";
static String hm = "H&M";
static String lv = "Levi's";
static String ad = "Adidas";
static String pm = "Puma";
static String fi = "FabIndia";
static String w = "W";
static String and = "AND";
static String bb = "Biba";


    static String[] brands = {zr, hm, lv, "Nike", ad, pm, fi, w, and, bb};

    public static void main(String brand[]) {
        System.out.println(brands[0] + " " + brands[1] + " " + brands[2] + " " + brands[3] + " " + brands[4] + " " +brands[5] + " " + brands[6]
		+ " " + brands[7] + " " + brands[8] + " " + brands[9]);
		
		
		
		for (String items : brands)
			System.out.println(items);
    }
}*/

//local 
class PavitraCollection {
    public static void main(String[] args) {
        // All variables declared locally inside the main method
        String zr = "Zara";
        String hm = "H&M";
        String lv = "Levi's";
        String ad = "Adidas";
        String pm = "Puma";
        String fi = "FabIndia";
        String w = "W";
        String and = "AND";
        String bb = "Biba";

        // Local array using the local variables above
        String[] brands = {zr, hm, lv, "Nike", ad, pm, fi, w, and, bb};

        // Print all in one line
        System.out.println(brands[0] + " " + brands[1] + " " + brands[2] + " " +
                           brands[3] + " " + brands[4] + " " + brands[5] + " " +
                           brands[6] + " " + brands[7] + " " + brands[8] + " " +
                           brands[9]);

        // Print each brand on a new line
        for (String item : brands) {
            System.out.println(item);
        }
    }
}
