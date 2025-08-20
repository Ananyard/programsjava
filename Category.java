class Category {
    String categoryName;
    Product product;

    void getCategoryInfo() {
        System.out.println("Category: " + categoryName);
        product.getProductInfo();
    }
}