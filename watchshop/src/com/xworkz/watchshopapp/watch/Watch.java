package com.xworkz.watchshopapp.watch;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Watch {

    private int watchId;
    private String brand;
    private String model;
    private double price;
    private String type;

}
