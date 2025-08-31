package com.xworkx.amazon.details;

import com.xworkx.amazon.product.Product;
import com.xworkx.amazon.validation.ValidateProduct;

public class AmazonDetails {
    private Product product;

    public boolean addProduct(Product product) {
        ValidateProduct validateProduct = new ValidateProduct();
        boolean isValid = validateProduct.validateProductInfo(product);

        if (isValid) {
            this.product = product;
            return true;
        }
        return false;
    }

    public void showProductDetails() {
        System.out.println("Product ID: " + product.getProductId());
        System.out.println("Name: " + product.getName());
        System.out.println("Category: " + product.getCategory());
        System.out.println("Price: ₹" + product.getPrice());
        System.out.println("Quantity: " + product.getQuantity());
        System.out.println("Seller: " + product.getSeller());
    }
    public boolean updateProductPrice(double price){
        boolean isPriceUpdated =  false;
        if(price > 0){
            product.setPrice(price);
            isPriceUpdated =true;
        }
        return isPriceUpdated;
    }
    public boolean updateProductQuantity(int quantity){
        boolean isQuantityUpdated =  false;
        if (quantity >= 0){
            product.setQuantity(quantity);
            isQuantityUpdated = true;
        }
        return isQuantityUpdated;
    }
}
