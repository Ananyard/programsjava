package com.xworkz.amazonapp;

import com.xworkz.amazonapp.product.Product;
import com.xworkz.amazonapp.amazon.Amazon;

public class AmazonRunner {
    public static void main(String[] args) {

        Product product = new Product();
        product.setProductId(1);
        product.setProductName("iPhone 15");
        product.setPrice(79999);
        product.setCategory("Electronics");
        product.setSeller("Apple Store");

        Product product1 = new Product();
        product1.setProductId(2);
        product1.setProductName("Samsung Galaxy S23");
        product1.setPrice(74999);
        product1.setCategory("Electronics");
        product1.setSeller("Samsung Store");

        Product product2 = new Product();
        product2.setProductId(3);
        product2.setProductName("Sony WH-1000XM5 Headphones");
        product2.setPrice(29999);
        product2.setCategory("Audio");
        product2.setSeller("Sony India");

        Product product3 = new Product();
        product3.setProductId(4);
        product3.setProductName("Nike Air Max");
        product3.setPrice(8999);
        product3.setCategory("Footwear");
        product3.setSeller("Nike");

        Product product4 = new Product();
        product4.setProductId(5);
        product4.setProductName("Adidas Ultraboost");
        product4.setPrice(9999);
        product4.setCategory("Footwear");
        product4.setSeller("Adidas");

        Product product5 = new Product();
        product5.setProductId(6);
        product5.setProductName("Puma Sports T-shirt");
        product5.setPrice(1999);
        product5.setCategory("Clothing");
        product5.setSeller("Puma");

        Product product6 = new Product();
        product6.setProductId(7);
        product6.setProductName("Levi’s Jeans");
        product6.setPrice(3499);
        product6.setCategory("Clothing");
        product6.setSeller("Levi’s");

        Product product7 = new Product();
        product7.setProductId(8);
        product7.setProductName("Ray-Ban Sunglasses");
        product7.setPrice(6999);
        product7.setCategory("Accessories");
        product7.setSeller("Ray-Ban");

        Product product8 = new Product();
        product8.setProductId(9);
        product8.setProductName("Rolex Watch");
        product8.setPrice(550000);
        product8.setCategory("Accessories");
        product8.setSeller("Rolex");

        Product product9 = new Product();
        product9.setProductId(10);
        product9.setProductName("Dell XPS Laptop");
        product9.setPrice(120000);
        product9.setCategory("Electronics");
        product9.setSeller("Dell");

        Product product10 = new Product();
        product10.setProductId(11);
        product10.setProductName("HP Pavilion Laptop");
        product10.setPrice(65000);
        product10.setCategory("Electronics");
        product10.setSeller("HP");

        Product product11 = new Product();
        product11.setProductId(12);
        product11.setProductName("Canon DSLR Camera");
        product11.setPrice(45000);
        product11.setCategory("Electronics");
        product11.setSeller("Canon");

        Product product12 = new Product();
        product12.setProductId(13);
        product12.setProductName("KitchenAid Mixer");
        product12.setPrice(18000);
        product12.setCategory("Home Appliances");
        product12.setSeller("KitchenAid");

        Product product13 = new Product();
        product13.setProductId(14);
        product13.setProductName("LG Refrigerator");
        product13.setPrice(55000);
        product13.setCategory("Home Appliances");
        product13.setSeller("LG");

        Product product14 = new Product();
        product14.setProductId(15);
        product14.setProductName("Whirlpool Washing Machine");
        product14.setPrice(35000);
        product14.setCategory("Home Appliances");
        product14.setSeller("Whirlpool");

        Product product15 = new Product();
        product15.setProductId(16);
        product15.setProductName("Tata Salt");
        product15.setPrice(25);
        product15.setCategory("Grocery");
        product15.setSeller("Tata");

        Product product16 = new Product();
        product16.setProductId(17);
        product16.setProductName("Aashirvaad Atta");
        product16.setPrice(350);
        product16.setCategory("Grocery");
        product16.setSeller("ITC");

        Product product17 = new Product();
        product17.setProductId(18);
        product17.setProductName("Nestle Maggi Noodles");
        product17.setPrice(12);
        product17.setCategory("Grocery");
        product17.setSeller("Nestle");

        Product product18 = new Product();
        product18.setProductId(19);
        product18.setProductName("Amul Butter");
        product18.setPrice(55);
        product18.setCategory("Grocery");
        product18.setSeller("Amul");

        Amazon amazon = new Amazon();

        amazon.addProduct(product);
        amazon.addProduct(product1);
        amazon.addProduct(product2);
        amazon.addProduct(product3);
        amazon.addProduct(product4);
        amazon.addProduct(product5);
        amazon.addProduct(product6);
        amazon.addProduct(product7);
        amazon.addProduct(product8);
        amazon.addProduct(product9);
        amazon.addProduct(product10);
        amazon.addProduct(product11);
        amazon.addProduct(product12);
        amazon.addProduct(product13);
        amazon.addProduct(product14);
        amazon.addProduct(product15);
        amazon.addProduct(product16);
        amazon.addProduct(product17);
        amazon.addProduct(product18);

        amazon.getAllProducts();
    }
}
