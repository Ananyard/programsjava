package com.xworkz.shoppingmallapp;

import com.xworkz.shoppingmallapp.mall.ShoppingMall;
import com.xworkz.shoppingmallapp.shop.Shop;

public class ShoppingMallRunner {
    public static void main(String[] args) {

        Shop shop1 = new Shop();
        shop1.setShopId(1);
        shop1.setShopName("Lifestyle");

        Shop shop2 = new Shop();
        shop2.setShopId(2);
        shop2.setShopName("Pantaloons");

        Shop shop3 = new Shop();
        shop3.setShopId(3);
        shop3.setShopName("Reliance Trends");

        Shop shop4 = new Shop();
        shop4.setShopId(4);
        shop4.setShopName("Max Fashion");

        Shop shop5 = new Shop();
        shop5.setShopId(5);
        shop5.setShopName("Adidas");

        Shop shop6 = new Shop();
        shop6.setShopId(6);
        shop6.setShopName("Nike");

        Shop shop7 = new Shop();
        shop7.setShopId(7);
        shop7.setShopName("Puma");

        Shop shop8 = new Shop();
        shop8.setShopId(8);
        shop8.setShopName("Levi's");

        Shop shop9 = new Shop();
        shop9.setShopId(9);
        shop9.setShopName("Zara");

        Shop shop10 = new Shop();
        shop10.setShopId(10);
        shop10.setShopName("H&M");

        Shop shop11 = new Shop();
        shop11.setShopId(11);
        shop11.setShopName("Apple Store");

        Shop shop12 = new Shop();
        shop12.setShopId(12);
        shop12.setShopName("Samsung Store");

        Shop shop13 = new Shop();
        shop13.setShopId(13);
        shop13.setShopName("Croma");

        ShoppingMall mall = new ShoppingMall();

        mall.addShop(shop1);
        mall.addShop(shop2);
        mall.addShop(shop3);
        mall.addShop(shop4);
        mall.addShop(shop5);
        mall.addShop(shop6);
        mall.addShop(shop7);
        mall.addShop(shop8);
        mall.addShop(shop9);
        mall.addShop(shop10);
        mall.addShop(shop11);
        mall.addShop(shop12);
        mall.addShop(shop13);

        mall.getAllShops();
    }
}
