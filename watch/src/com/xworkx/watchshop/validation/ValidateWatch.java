package com.xworkx.watchshop.validation;

import com.xworkx.watchshop.watch.Watch;

public class ValidateWatch {
    private Watch watch;

    public boolean validateWatchInfo(Watch watch) {
        boolean validId = false;
        boolean validBrand = false;
        boolean validModel = false;
        boolean validPrice = false;
        boolean validType = false;
        boolean validMaterial = false;

        if (watch.getWatchId() > 0) {
            validId = true;
        } else System.out.println("Invalid watch ID");

        if (watch.getBrand() != null && !watch.getBrand().isEmpty()) {
            validBrand = true;
        } else System.out.println("Invalid brand");

        if (watch.getModel() != null && !watch.getModel().isEmpty()) {
            validModel = true;
        } else System.out.println("Invalid model");

        if (watch.getPrice() > 0) {
            validPrice = true;
        } else System.out.println("Invalid price");

        if (watch.getType() != null && !watch.getType().isEmpty()) {
            validType = true;
        } else System.out.println("Invalid type");

        if (watch.getMaterial() != null && !watch.getMaterial().isEmpty()) {
            validMaterial = true;
        } else System.out.println("Invalid material");

        if (validId && validBrand && validModel && validPrice && validType && validMaterial) {
            this.watch = watch;
            return true;
        }
        return false;
    }
}
