class LaptopIssueSystem {
    public static void main(String[] args) {
        System.out.println("Laptop Issue Request Started!");

        String name = "Chinnu";
        String department = "IT";
        String laptopModel = "Dell Latitude 5430";

        RequestLaptop.request(name, department, laptopModel);
    }
}
