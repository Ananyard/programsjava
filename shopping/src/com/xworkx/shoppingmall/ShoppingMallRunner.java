package com.xworkx.shoppingmall;

import com.xworkx.shoppingmall.shop.Shop;
import com.xworkx.shoppingmall.details.ShoppingMallDetails;

public class ShoppingMallRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        Shop shop = new Shop();
        shop.setShopId(101);
        shop.setShopName("Trends Fashion Store");
        shop.setCategory("Clothing & Lifestyle");
        shop.setOwnerName("Ramesh");
        shop.setOpeningTime("10:00 AM");
        shop.setClosingTime("10:00 PM");

        ShoppingMallDetails details = new ShoppingMallDetails();
        boolean added = details.addShop(shop);
        System.out.println("Shop added: " + added);

        if (added) {
            details.showShopDetails();
        }

        System.out.println("Main ended");
    }
}
