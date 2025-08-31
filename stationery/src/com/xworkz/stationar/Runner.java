package com.xworkz.stationar;

import com.xworkz.stationar.product.Product;
import com.xworkz.stationar.stat.Stat;

public class Runner {
    public static void main(String[] args) {
        System.out.println("started");
        Stat chi = new Stat();

        Product sriHari = new Product();
        sriHari.category = "Stationery";


        Stat notebook = new Stat();
        sriHari.assignCategoryTo(notebook);

        Stat pen = new Stat();
        sriHari.assignCategoryTo(pen);




        // Print categories (using only getCategory())
        System.out.println("SriHari category: " + sriHari.getCategory());
        System.out.println("Notebook category: " + notebook.getCategory());
        System.out.println("Pen category: " + pen.getCategory());
        System.out.println("ended");
    }
}
