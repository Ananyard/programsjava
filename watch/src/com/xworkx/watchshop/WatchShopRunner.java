package com.xworkx.watchshop;

import com.xworkx.watchshop.watch.Watch;
import com.xworkx.watchshop.details.WatchShopDetails;

public class WatchShopRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        Watch watch = new Watch();
        watch.setWatchId(101);
        watch.setBrand("Rolex");
        watch.setModel("Submariner");
        watch.setType("Analog");
        watch.setMaterial("Stainless Steel");
        watch.setPrice(850000.50);

        WatchShopDetails details = new WatchShopDetails();
        boolean added = details.addWatch(watch);
        System.out.println("Watch added: " + added);

        if (added) {
            details.showWatchDetails();
        }

        System.out.println("Main ended");
    }
}
