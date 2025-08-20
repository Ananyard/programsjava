class EcommerceRunner {
    public static void main(String[] args) {

        Product product = new Product();
        product.productName = "Wireless Earbuds";
        product.price = 1999;

        Category category = new Category();
        category.categoryName = "Electronics";
        category.product = product;

        Ecommerce ecommerce = new Ecommerce();
        ecommerce.platformName = "ShopEase";
        ecommerce.category = category;

        ecommerce.getEcommerceInfo();
    }
}