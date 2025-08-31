package com.xworkz.hospitalapp;
import com.xworkz.hospitalapp.apollo.Apollo;
import com.xworkz.hospitalapp.hospital.Hospital;

public class HospitalRunner {
    public static void main(String[] args) {
        Hospital hospital=new Apollo();
        hospital.treatEmergency();
                }

}
