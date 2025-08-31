package com.xworkx.institute.validation;

import com.xworkx.institute.trainee.Trainee;

public class ValidateTrainee {
    private Trainee trainee;

    public boolean validateTraineeInfo(Trainee trainee) {
        boolean validId = false;
        boolean validName = false;
        boolean validCourse = false;
        boolean validDate = false;
        boolean validEmail = false;
        boolean validAge = false;

        if (trainee.getTraineeId() > 0) {
            validId = true;
        } else System.out.println("Invalid Trainee ID");

        if (trainee.getName() != null && !trainee.getName().isEmpty()) {
            validName = true;
        } else System.out.println("Invalid name");

        if (trainee.getCourse() != null && !trainee.getCourse().isEmpty()) {
            validCourse = true;
        } else System.out.println("Invalid course");

        if (trainee.getJoinDate() != null && !trainee.getJoinDate().isEmpty()) {
            validDate = true;
        } else System.out.println("Invalid join date");

        if (trainee.getEmail() != null && trainee.getEmail().contains("@")) {
            validEmail = true;
        } else System.out.println("Invalid email");

        if (trainee.getAge() > 0) {
            validAge = true;
        } else System.out.println("Invalid age");

        if (validId && validName && validCourse && validDate && validEmail && validAge) {
            this.trainee = trainee;
            return true;
        }
        return false;
    }
}
