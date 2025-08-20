public class GiTag {
    public int tagId;
    public String productName;
    public String state;
    public String category; 
    public String registeredYear;
    public boolean isActive;

    public void getInfo() {
        System.out.println("GI Tag ID: " + tagId);
        System.out.println("Product Name: " + productName);
        System.out.println("State: " + state);
        System.out.println("Category: " + category);
        System.out.println("Registered Year: " + registeredYear);
        System.out.println("Is Active: " + isActive);
        System.out.println("----------------------------------");
    }
}
