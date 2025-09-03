package com.xworkz.loksabhaapp.politician;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Politician {

    private int politicianId;
    private String name;
    private String party;
    private String constituency;
    private int age;

}
