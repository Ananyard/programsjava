package com.xworkz.cosmetics.products;

public class Products {
    public String productName;
    public int price;

    public String getProductName(){
        return productName;
    }
    public int getPrice(){
        return price;
    }

    // Instead of multiplying, directly set price
    public void price(int price){
        this.price = price;
    }

    // Instead of printing, store productName
    public void productName(String name){
        this.productName = name;
    }

}
