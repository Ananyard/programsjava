public class GiTagRunner {
    public static void main(String[] king) {

        System.out.println("main started");

        GiTag g1 = new GiTag();
        GiTag g2 = new GiTag(1);
        GiTag g3 = new GiTag(2, "Darjeeling Tea");
        GiTag g4 = new GiTag(3, "Banarasi Saree", "Uttar Pradesh");
        GiTag g5 = new GiTag(4, "Kanjeevaram Silk", "Tamil Nadu", 2008);
        GiTag g6 = new GiTag(5, "Kolhapuri Chappal", "Maharashtra", 2010, "Footwear");
        GiTag g7 = new GiTag(6, "Basmati Rice", "Punjab", 2006, "Agricultural", true);

        System.out.println("\nSelected Field Outputs:");
        System.out.println("g2 ID: " + g2.tagId);
        System.out.println("g3 Product: " + g3.productName);
        System.out.println("g4 State: " + g4.state);
        System.out.println("g5 Year: " + g5.year);
        System.out.println("g6 Category: " + g6.category);
        System.out.println("g7 Exported: " + g7.isExported);

        System.out.println("\nCalling getInfo():");
        g1.getInfo(); g2.getInfo(); g3.getInfo(); g4.getInfo(); g5.getInfo(); g6.getInfo(); g7.getInfo();

        System.out.println("main ended");
    }
}
