package com.xworkz.fruitapp;

import com.xworkz.fruitapp.fruit.Fruit;
import com.xworkz.fruitapp.orange.Orange;

public class Runner {
    public static void main(String[] args) {
        System.out.println("main statred");
        Fruit fruit = new Orange();
        fruit.fruitname();
    }
}
