package com.xworkz.instituteapp.trainee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Trainee {

    private int traineeId;
    private String traineeName;
    private String course;
    private int age;
    private String batch;

}
