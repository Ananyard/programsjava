package com.xworkz.watchshopapp.watchshop;

import com.xworkz.watchshopapp.watch.Watch;

public class WatchShop {

    private Watch[] watches = new Watch[9];
    private int index;

    public boolean addWatch(Watch watch) {
        boolean isAdded = false;
        if (watch != null && index < watches.length) {
            watches[index++] = watch;
            isAdded = true;
        } else {
            System.out.println("Invalid Watch or No space left...");
        }
        return isAdded;
    }

    public void getAllWatches() {
        System.out.println("----- List of Watches -----");
        for (Watch watch : watches) {
            if (watch != null) {
                System.out.println("Watch ID: " + watch.getWatchId());
                System.out.println("Brand: " + watch.getBrand());
                System.out.println("---------------------------");
            }
        }
    }
}
