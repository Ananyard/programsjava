package com.xworkz.loksabhaapp;

import com.xworkz.loksabhaapp.loksabha.LokSabha;
import com.xworkz.loksabhaapp.politician.Politician;

public class LokSabhaRunner {
    public static void main(String[] args) {

        Politician p1 = new Politician();
        p1.setPoliticianId(1);
        p1.setName("Narendra Modi");

        Politician p2 = new Politician();
        p2.setPoliticianId(2);
        p2.setName("Rahul Gandhi");

        Politician p3 = new Politician();
        p3.setPoliticianId(3);
        p3.setName("Amit Shah");

        Politician p4 = new Politician();
        p4.setPoliticianId(4);
        p4.setName("Sonia Gandhi");

        Politician p5 = new Politician();
        p5.setPoliticianId(5);
        p5.setName("Arvind Kejriwal");

        Politician p6 = new Politician();
        p6.setPoliticianId(6);
        p6.setName("Mamta Banerjee");

        Politician p7 = new Politician();
        p7.setPoliticianId(7);
        p7.setName("Sharad Pawar");

        Politician p8 = new Politician();
        p8.setPoliticianId(8);
        p8.setName("Yogi Adityanath");

        Politician p9 = new Politician();
        p9.setPoliticianId(9);
        p9.setName("Mayawati");

        Politician p10 = new Politician();
        p10.setPoliticianId(10);
        p10.setName("Nitish Kumar");

        Politician p11 = new Politician();
        p11.setPoliticianId(11);
        p11.setName("MK Stalin");

        Politician p12 = new Politician();
        p12.setPoliticianId(12);
        p12.setName("K Chandrasekhar Rao");

        LokSabha lokSabha = new LokSabha();

        lokSabha.addPolitician(p1);
        lokSabha.addPolitician(p2);
        lokSabha.addPolitician(p3);
        lokSabha.addPolitician(p4);
        lokSabha.addPolitician(p5);
        lokSabha.addPolitician(p6);
        lokSabha.addPolitician(p7);
        lokSabha.addPolitician(p8);
        lokSabha.addPolitician(p9);
        lokSabha.addPolitician(p10);
        lokSabha.addPolitician(p11);
        lokSabha.addPolitician(p12);

        lokSabha.getAllPoliticians();
    }
}
