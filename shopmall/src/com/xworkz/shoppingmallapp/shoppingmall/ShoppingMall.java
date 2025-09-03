package com.xworkz.shoppingmallapp.shoppingmall;
import com.xworkz.shoppingmallapp.shop.Shop;

public class ShoppingMall {
    Shop[] shops = new Shop[13];
    int index;

    public boolean addShop(Shop shop) {
        if (shop != null && index < shops.length) {
            shops[index++] = shop;
            return true;
        }
        System.out.println("Invalid Shop or Mall Capacity Full");
        return false;
    }

    public void getAllShops() {
        System.out.println("List of Shops in Shopping Mall");
        for (Shop shop : shops) {
            if (shop != null) {
                System.out.println("Shop Id: " + shop.getShopId());
                System.out.println("Shop Name: " + shop.getShopName());
                System.out.println("Shop Type: " + shop.getShopType());
                System.out.println("Owner Name: " + shop.getOwnerName());
                System.out.println("Floor Number: " + shop.getFloorNumber());
                System.out.println("Contact Number: " + shop.getContactNumber());
                System.out.println("-----------------------------------");
            }
        }
    }
}
