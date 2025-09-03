package com.xworkz.shoppingmallapp.shop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Shop {

    private int shopId;
    private String shopName;
    private String category;
    private String owner;
    private String floor;

}
