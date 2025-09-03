package com.xworkz.watchshopapp;

import com.xworkz.watchshopapp.watch.Watch;
import com.xworkz.watchshopapp.watchshop.WatchShop;

public class WatchShopRunner {
    public static void main(String[] args) {

        Watch watch1 = new Watch();
        watch1.setWatchId(1);
        watch1.setBrand("Rolex");

        Watch watch2 = new Watch();
        watch2.setWatchId(2);
        watch2.setBrand("Omega");

        Watch watch3 = new Watch();
        watch3.setWatchId(3);
        watch3.setBrand("Casio");

        Watch watch4 = new Watch();
        watch4.setWatchId(4);
        watch4.setBrand("Fossil");

        Watch watch5 = new Watch();
        watch5.setWatchId(5);
        watch5.setBrand("Titan");

        Watch watch6 = new Watch();
        watch6.setWatchId(6);
        watch6.setBrand("Seiko");

        Watch watch7 = new Watch();
        watch7.setWatchId(7);
        watch7.setBrand("Citizen");

        Watch watch8 = new Watch();
        watch8.setWatchId(8);
        watch8.setBrand("Tag Heuer");

        Watch watch9 = new Watch();
        watch9.setWatchId(9);
        watch9.setBrand("Timex");

        WatchShop shop = new WatchShop();

        shop.addWatch(watch1);
        shop.addWatch(watch2);
        shop.addWatch(watch3);
        shop.addWatch(watch4);
        shop.addWatch(watch5);
        shop.addWatch(watch6);
        shop.addWatch(watch7);
        shop.addWatch(watch8);
        shop.addWatch(watch9);

        shop.getAllWatches();
    }
}
