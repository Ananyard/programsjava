package com.xworkz.policestationapp;

import com.xworkz.policestationapp.police.Police;
import com.xworkz.policestationapp.policestation.PoliceStation;

public class PoliceRunner {
    public static void main(String[] args) {

        Police police = new Police();
        police.setPoliceId(1);
        police.setPoliceName("Ravi");
        police.setRank("Inspector");
        police.setAge(40);
        police.setStationName("MG Road");

        Police police1 = new Police();
        police1.setPoliceId(2);
        police1.setPoliceName("Suresh");
        police1.setRank("Sub-Inspector");
        police1.setAge(35);
        police1.setStationName("Rajajinagar");

        Police police2 = new Police();
        police2.setPoliceId(3);
        police2.setPoliceName("Mahesh");
        police2.setRank("Constable");
        police2.setAge(28);
        police2.setStationName("Indiranagar");

        Police police3 = new Police();
        police3.setPoliceId(4);
        police3.setPoliceName("Anil");
        police3.setRank("Head Constable");
        police3.setAge(32);
        police3.setStationName("Jayanagar");

        Police police4 = new Police();
        police4.setPoliceId(5);
        police4.setPoliceName("Ramesh");
        police4.setRank("Inspector");
        police4.setAge(45);
        police4.setStationName("Koramangala");

        Police police5 = new Police();
        police5.setPoliceId(6);
        police5.setPoliceName("Sunil");
        police5.setRank("Constable");
        police5.setAge(26);
        police5.setStationName("Whitefield");

        PoliceStation station = new PoliceStation();

        station.addPolice(police);
        station.addPolice(police1);
        station.addPolice(police2);
        station.addPolice(police3);
        station.addPolice(police4);
        station.addPolice(police5);

        station.getAllPolice();
    }
}
