class StockCheck {
    public static void checkStock(String name, String department, String laptopModel) {
        System.out.println("Checking stock for model: " + laptopModel);
        System.out.println("Laptop is available in stock ✅");

        IssueLaptop.issue(name, department, laptopModel);
    }
}
