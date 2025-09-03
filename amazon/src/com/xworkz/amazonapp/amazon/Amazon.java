package com.xworkz.amazonapp.amazon;

import com.xworkz.amazonapp.product.Product;

public class Amazon {

    private Product[] products = new Product[19];
    private int index;

    public void addProduct(Product product) {
        if (index < products.length) {
            products[index] = product;
            index++;
        } else {
            System.out.println("No space to add more products...");
        }
    }

    public void getAllProducts() {
        System.out.println("----- List of Products -----");
        for (Product product : products) {
            if (product != null) {
                System.out.println("ID: " + product.getProductId() +
                        ", Name: " + product.getProductName() +
                        ", Price: " + product.getPrice() +
                        ", Category: " + product.getCategory() +
                        ", Seller: " + product.getSeller());
            }
        }
    }
}
