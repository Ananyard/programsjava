package com.xworkz.mglr.port;

import com.xworkz.mglr.city.City;

public class Port extends City {
    @Override
    public boolean beauty() {
        System.out.println("Exporting and importing are done");
        return true;
    }
}
