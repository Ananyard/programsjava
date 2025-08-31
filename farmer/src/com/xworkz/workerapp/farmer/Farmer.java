package com.xworkz.workerapp.farmer;

import com.xworkz.workerapp.worker.Worker;

public class Farmer extends Worker {
    @Override
    public double sellFarmProducts() {
        System.out.println("the farmer will export the farm produvts");
        return 8500;
    }

}
