package com.xworkx.shoppingmall.validation;

import com.xworkx.shoppingmall.shop.Shop;

public class ValidateShop {
    private Shop shop;

    public boolean validateShopInfo(Shop shop) {
        boolean validId = false;
        boolean validName = false;
        boolean validCategory = false;
        boolean validOwner = false;
        boolean validOpen = false;
        boolean validClose = false;

        if (shop.getShopId() > 0) {
            validId = true;
        } else System.out.println("Invalid shop ID");

        if (shop.getShopName() != null && !shop.getShopName().isEmpty()) {
            validName = true;
        } else System.out.println("Invalid shop name");

        if (shop.getCategory() != null && !shop.getCategory().isEmpty()) {
            validCategory = true;
        } else System.out.println("Invalid category");

        if (shop.getOwnerName() != null && !shop.getOwnerName().isEmpty()) {
            validOwner = true;
        } else System.out.println("Invalid owner name");

        if (shop.getOpeningTime() != null && !shop.getOpeningTime().isEmpty()) {
            validOpen = true;
        } else System.out.println("Invalid opening time");

        if (shop.getClosingTime() != null && !shop.getClosingTime().isEmpty()) {
            validClose = true;
        } else System.out.println("Invalid closing time");

        if (validId && validName && validCategory && validOwner && validOpen && validClose) {
            this.shop = shop;
            return true;
        }
        return false;
    }
}
