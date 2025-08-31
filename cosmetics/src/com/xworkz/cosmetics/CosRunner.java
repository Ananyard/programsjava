package com.xworkz.cosmetics;
import com.xworkz.cosmetics.products.Products;

public class CosRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Products products = new Products();
        products.productName("Lipstick");   // set product name
        products.price(100);                // set base price

        System.out.println("Product: " + products.getProductName());
        System.out.println("Price: " + products.getPrice());

        System.out.println("main ended");
    }
}
