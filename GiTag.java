public class GiTag {
    int giId;
    String productName;
    String originPlace;
    int yearGranted;
    String productCategory;
    boolean isExported;

  
    GiTag(int giId, String productName, String originPlace, int yearGranted, String productCategory, boolean isExported) {
        this.giId = giId;
        this.productName = productName;
        this.originPlace = originPlace;
        this.yearGranted = yearGranted;
        this.productCategory = productCategory;
        this.isExported = isExported;
		System.out.println("parameterised cons invoked");
    }

  
    GiTag() {
	 System.out.println("cons invoked");
	}

    // Method to display GI tag information
    void getInfo() {
        System.out.println("GI ID: " + giId);
        System.out.println("Product Name: " + productName);
        System.out.println("Origin Place: " + originPlace);
        System.out.println("Year Granted: " + yearGranted);
        System.out.println("Category: " + productCategory);
        System.out.println("Exported: " + isExported);
        System.out.println("-----------------------------");
    }
}
