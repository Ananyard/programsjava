class IssueLaptop {
    public static void issue(String name, String department, String laptopModel) {
        System.out.println("Issuing " + laptopModel + " to " + name);
        System.out.println("Updating asset records...");

        Confirmations.confirm(name, laptopModel);
    }
}
