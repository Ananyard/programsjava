package com.xworkx.amazon.product;

public class Product {
    private int productId;
    private String name;
    private String category;
    private double price;
    private int quantity;
    private String seller;

    public void setProductId(int productId) {
        this.productId = productId;
    }
    public int getProductId() {
        return productId;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public String getCategory() {
        return category;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }
    public String getSeller() {
        return seller;
    }

}
