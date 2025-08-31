package com.xworkz.bussinessapp;
import com.xworkz.bussinessapp.bussoiness.Bussiness;
import com.xworkz.bussinessapp.ratantata.RatanTata;

public class BussinessRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Bussiness bussiness =new RatanTata();
        bussiness.doBusiness();
        System.out.println("main ended");
        }

}
