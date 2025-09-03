package com.xworkz.shoppingmallapp.mall;

import com.xworkz.shoppingmallapp.shop.Shop;

public class ShoppingMall {

    private Shop[] shops = new Shop[13];
    private int index;

    public boolean addShop(Shop shop) {
        boolean isAdded = false;
        if (shop != null && index < shops.length) {
            shops[index++] = shop;
            isAdded = true;
        } else {
            System.out.println("Invalid Shop or No space left...");
        }
        return isAdded;
    }

    public void getAllShops() {
        System.out.println("----- List of Shops -----");
        for (Shop shop : shops) {
            if (shop != null) {
                System.out.println("Shop ID: " + shop.getShopId());
                System.out.println("Shop Name: " + shop.getShopName());
                System.out.println("---------------------------");
            }
        }
    }
}
