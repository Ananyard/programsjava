package com.xworkz.instituteapp.institute;

import com.xworkz.instituteapp.trainee.Trainee;

public class Institute {

    private Trainee[] trainees = new Trainee[15];
    private int index;

    public void addTrainee(Trainee trainee) {
        if (index < trainees.length) {
            trainees[index] = trainee;
            index++;
        } else {
            System.out.println("No space to add more trainees...");
        }
    }

    public void getAllTrainees() {
        System.out.println("----- List of Trainees -----");
        for (Trainee trainee : trainees) {
            if (trainee != null) {
                System.out.println("ID: " + trainee.getTraineeId() +
                        ", Name: " + trainee.getTraineeName() +
                        ", Course: " + trainee.getCourse() +
                        ", Age: " + trainee.getAge() +
                        ", Batch: " + trainee.getBatch());
            }
        }
    }
}
