package com.xworkx.amazon.validation;

import com.xworkx.amazon.product.Product;

public class ValidateProduct {
    private Product product;

    public boolean validateProductInfo(Product product) {
        boolean validId = false;
        boolean validName = false;
        boolean validCategory = false;
        boolean validPrice = false;
        boolean validQuantity = false;
        boolean validSeller = false;

        if (product.getProductId() > 0) {
            validId = true;
        } else System.out.println("Invalid product ID");

        if (product.getName() != null && !product.getName().isEmpty()) {
            validName = true;
        } else System.out.println("Invalid product name");

        if (product.getCategory() != null && !product.getCategory().isEmpty()) {
            validCategory = true;
        } else System.out.println("Invalid category");

        if (product.getPrice() > 0) {
            validPrice = true;
        } else System.out.println("Invalid price");

        if (product.getQuantity() >= 0) { // Quantity can be 0 if out of stock
            validQuantity = true;
        } else System.out.println("Invalid quantity");

        if (product.getSeller() != null && !product.getSeller().isEmpty()) {
            validSeller = true;
        } else System.out.println("Invalid seller");

        if (validId && validName && validCategory && validPrice && validQuantity && validSeller) {
            this.product = product;
            return true;
        }
        return false;
    }
}
