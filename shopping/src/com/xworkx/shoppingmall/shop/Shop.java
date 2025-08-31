package com.xworkx.shoppingmall.shop;

public class Shop {
    private int shopId;
    private String shopName;
    private String category;
    private String ownerName;
    private String openingTime;
    private String closingTime;

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }
    public int getShopId() {
        return shopId;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
    public String getShopName() {
        return shopName;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public String getCategory() {
        return category;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public String getOwnerName() {
        return ownerName;
    }

    public void setOpeningTime(String openingTime) {
        this.openingTime = openingTime;
    }
    public String getOpeningTime() {
        return openingTime;
    }

    public void setClosingTime(String closingTime) {
        this.closingTime = closingTime;
    }
    public String getClosingTime() {
        return closingTime;
    }
}
