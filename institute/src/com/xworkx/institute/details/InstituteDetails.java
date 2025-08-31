package com.xworkx.institute.details;

import com.xworkx.institute.trainee.Trainee;
import com.xworkx.institute.validation.ValidateTrainee;

public class InstituteDetails {
    private Trainee trainee;

    public boolean addTrainee(Trainee trainee) {
        ValidateTrainee validateTrainee = new ValidateTrainee();
        boolean isValid = validateTrainee.validateTraineeInfo(trainee);

        if (isValid) {
            this.trainee = trainee;
            return true;
        }
        return false;
    }

    public void showTraineeDetails() {
        System.out.println("Trainee ID: " + trainee.getTraineeId());
        System.out.println("Name: " + trainee.getName());
        System.out.println("Course: " + trainee.getCourse());
        System.out.println("Join Date: " + trainee.getJoinDate());
        System.out.println("Email: " + trainee.getEmail());
        System.out.println("Age: " + trainee.getAge());
    }
}
