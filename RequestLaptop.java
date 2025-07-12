class RequestLaptop {
    public static void request(String name, String department, String laptopModel) {
        System.out.println("Request received from " + name + " of " + department + " department.");
        System.out.println("Requested Laptop: " + laptopModel);

        Approval.processApproval(name, department, laptopModel);
    }
}
