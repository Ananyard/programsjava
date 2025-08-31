package com.xworkx.amazon;

import com.xworkx.amazon.product.Product;
import com.xworkx.amazon.details.AmazonDetails;

public class AmazonRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        Product product = new Product();
        product.setProductId(10101);
        product.setName("Wireless Bluetooth Headphones");
        product.setCategory("Electronics");
        product.setPrice(2499.99);
        product.setQuantity(15);
        product.setSeller("Tech World Pvt Ltd");

        AmazonDetails details = new AmazonDetails();
        boolean added = details.addProduct(product);
        System.out.println("Product added: " + added);

        if (added) {
            details.showProductDetails();
        }
        details.updateProductPrice(55);
        details.updateProductQuantity(10);
        details.showProductDetails();
        System.out.println("Main ended");
    }
}
