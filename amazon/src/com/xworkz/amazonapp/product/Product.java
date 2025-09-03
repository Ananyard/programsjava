package com.xworkz.amazonapp.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private int productId;
    private String productName;
    private double price;
    private String category;
    private String seller;

}
