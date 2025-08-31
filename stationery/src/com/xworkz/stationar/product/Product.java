package com.xworkz.stationar.product;

public class Product {
    public String category;

    public String getCategory(){
        return category;
    }
    public void assignCategoryTo(Product anotherItem) {
        anotherItem.category = this.category;
    }
}
