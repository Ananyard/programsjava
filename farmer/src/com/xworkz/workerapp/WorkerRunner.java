package com.xworkz.workerapp;
import com.xworkz.workerapp.farmer.Farmer;
import com.xworkz.workerapp.worker.Worker;
public class WorkerRunner {
    public static void main(String[] args) {
        Worker worker = new Farmer();
        worker.sellFarmProducts();
        }

}
