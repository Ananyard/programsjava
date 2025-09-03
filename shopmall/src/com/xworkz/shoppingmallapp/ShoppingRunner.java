package com.xworkz.shoppingmallapp;

import com.xworkz.shoppingmallapp.shop.Shop;
import com.xworkz.shoppingmallapp.shoppingmall.ShoppingMall;

public class ShoppingRunner {

    public static void main(String[] args) {

        Shop s1 = new Shop();
        s1.setShopId(1);
        s1.setShopName("Trends");
        s1.setShopType("Clothing");
        s1.setOwnerName("Ramesh Kumar");
        s1.setFloorNumber(1);
        s1.setContactNumber("9876543210");

        Shop s2 = new Shop();
        s2.setShopId(2);
        s2.setShopName("Reliance Digital");
        s2.setShopType("Electronics");
        s2.setOwnerName("Suresh Mehta");
        s2.setFloorNumber(2);
        s2.setContactNumber("9876501234");

        Shop s3 = new Shop();
        s3.setShopId(3);
        s3.setShopName("Puma");
        s3.setShopType("Sportswear");
        s3.setOwnerName("Anita Sharma");
        s3.setFloorNumber(1);
        s3.setContactNumber("9123456780");

        Shop s4 = new Shop();
        s4.setShopId(4);
        s4.setShopName("Food Court");
        s4.setShopType("Restaurant");
        s4.setOwnerName("Vikas Gupta");
        s4.setFloorNumber(3);
        s4.setContactNumber("9988776655");

        Shop s5 = new Shop();
        s5.setShopId(5);
        s5.setShopName("Big Bazaar");
        s5.setShopType("Supermarket");
        s5.setOwnerName("Neha Verma");
        s5.setFloorNumber(2);
        s5.setContactNumber("9090909090");

        Shop s6 = new Shop();
        s6.setShopId(6);
        s6.setShopName("Westside");
        s6.setShopType("Fashion");
        s6.setOwnerName("Priya Singh");
        s6.setFloorNumber(1);
        s6.setContactNumber("9345678901");

        Shop s7 = new Shop();
        s7.setShopId(7);
        s7.setShopName("Croma");
        s7.setShopType("Electronics");
        s7.setOwnerName("Raj Malhotra");
        s7.setFloorNumber(2);
        s7.setContactNumber("9123987654");

        Shop s8 = new Shop();
        s8.setShopId(8);
        s8.setShopName("Domino’s");
        s8.setShopType("Food");
        s8.setOwnerName("Arjun Nair");
        s8.setFloorNumber(3);
        s8.setContactNumber("9000000001");

        Shop s9 = new Shop();
        s9.setShopId(9);
        s9.setShopName("Archies");
        s9.setShopType("Gift Shop");
        s9.setOwnerName("Pooja Joshi");
        s9.setFloorNumber(1);
        s9.setContactNumber("9555555555");

        Shop s10 = new Shop();
        s10.setShopId(10);
        s10.setShopName("Decathlon");
        s10.setShopType("Sports");
        s10.setOwnerName("Manoj Kumar");
        s10.setFloorNumber(2);
        s10.setContactNumber("9777777777");

        Shop s11 = new Shop();
        s11.setShopId(11);
        s11.setShopName("Apple Store");
        s11.setShopType("Electronics");
        s11.setOwnerName("Rahul Jain");
        s11.setFloorNumber(2);
        s11.setContactNumber("9888888888");

        Shop s12 = new Shop();
        s12.setShopId(12);
        s12.setShopName("Lifestyle");
        s12.setShopType("Clothing");
        s12.setOwnerName("Shalini Rao");
        s12.setFloorNumber(1);
        s12.setContactNumber("9666666666");

        Shop s13 = new Shop();
        s13.setShopId(13);
        s13.setShopName("KFC");
        s13.setShopType("Restaurant");
        s13.setOwnerName("Sameer Khan");
        s13.setFloorNumber(3);
        s13.setContactNumber("9333333333");

        ShoppingMall mall = new ShoppingMall();

        mall.addShop(s1);
        mall.addShop(s2);
        mall.addShop(s3);
        mall.addShop(s4);
        mall.addShop(s5);
        mall.addShop(s6);
        mall.addShop(s7);
        mall.addShop(s8);
        mall.addShop(s9);
        mall.addShop(s10);
        mall.addShop(s11);
        mall.addShop(s12);
        mall.addShop(s13);

        mall.getAllShops();
    }
}