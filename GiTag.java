public class GiTag {
    int tagId;
    String productName;
    String state;
    int year;
    String category;
    boolean isExported;

    GiTag() {
        System.out.println("Default constructor called");
    }

    GiTag(int tagId) {
        this.tagId = tagId;
        System.out.println("Tag ID: " + tagId);
    }

    GiTag(int tagId, String productName) {
        this.tagId = tagId;
        this.productName = productName;
        System.out.println("Product: " + productName);
    }

    GiTag(int tagId, String productName, String state) {
        this.tagId = tagId;
        this.productName = productName;
        this.state = state;
        System.out.println("State: " + state);
    }

    GiTag(int tagId, String productName, String state, int year) {
        this.tagId = tagId;
        this.productName = productName;
        this.state = state;
        this.year = year;
        System.out.println("Year: " + year);
    }

    GiTag(int tagId, String productName, String state, int year, String category) {
        this.tagId = tagId;
        this.productName = productName;
        this.state = state;
        this.year = year;
        this.category = category;
        System.out.println("Category: " + category);
    }

    GiTag(int tagId, String productName, String state, int year, String category, boolean isExported) {
        this.tagId = tagId;
        this.productName = productName;
        this.state = state;
        this.year = year;
        this.category = category;
        this.isExported = isExported;
        System.out.println("Exported: " + isExported);
    }

    public void getInfo() {
        System.out.println("ID: " + t
