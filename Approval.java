class Approval {
    public static void processApproval(String name, String department, String laptopModel) {
        System.out.println("Manager reviewing request for: " + name);
        System.out.println("Approval granted ✅");

        StockCheck.checkStock(name, department, laptopModel);
    }
}
