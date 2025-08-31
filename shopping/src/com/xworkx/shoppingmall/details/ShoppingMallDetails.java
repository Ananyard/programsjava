package com.xworkx.shoppingmall.details;

import com.xworkx.shoppingmall.shop.Shop;
import com.xworkx.shoppingmall.validation.ValidateShop;

public class ShoppingMallDetails {
    private Shop shop;

    public boolean addShop(Shop shop) {
        ValidateShop validateShop = new ValidateShop();
        boolean isValid = validateShop.validateShopInfo(shop);

        if (isValid) {
            this.shop = shop;
            return true;
        }
        return false;
    }

    public void showShopDetails() {
        System.out.println("Shop ID: " + shop.getShopId());
        System.out.println("Shop Name: " + shop.getShopName());
        System.out.println("Category: " + shop.getCategory());
        System.out.println("Owner Name: " + shop.getOwnerName());
        System.out.println("Opening Time: " + shop.getOpeningTime());
        System.out.println("Closing Time: " + shop.getClosingTime());
    }
}
