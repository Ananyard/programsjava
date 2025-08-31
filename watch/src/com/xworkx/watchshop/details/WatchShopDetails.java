package com.xworkx.watchshop.details;

import com.xworkx.watchshop.watch.Watch;
import com.xworkx.watchshop.validation.ValidateWatch;

public class WatchShopDetails {
    private Watch watch;

    public boolean addWatch(Watch watch) {
        ValidateWatch validateWatch = new ValidateWatch();
        boolean isValid = validateWatch.validateWatchInfo(watch);

        if (isValid) {
            this.watch = watch;
            return true;
        }
        return false;
    }

    public void showWatchDetails() {
        System.out.println("Watch ID: " + watch.getWatchId());
        System.out.println("Brand: " + watch.getBrand());
        System.out.println("Model: " + watch.getModel());
        System.out.println("Type: " + watch.getType());
        System.out.println("Material: " + watch.getMaterial());
        System.out.println("Price: ₹" + watch.getPrice());
    }
}
