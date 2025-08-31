package com.xworkx.institute;

import com.xworkx.institute.trainee.Trainee;
import com.xworkx.institute.details.InstituteDetails;

public class InstituteRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        Trainee trainee = new Trainee();
        trainee.setTraineeId(501);
        trainee.setName("Ananya Sharma");
        trainee.setCourse("Full Stack Java Development");
        trainee.setJoinDate("01-Aug-2025");
        trainee.setEmail("ananya.sharma@example.com");
        trainee.setAge(22);

        InstituteDetails details = new InstituteDetails();
        boolean added = details.addTrainee(trainee);
        System.out.println("Trainee added: " + added);

        if (added) {
            details.showTraineeDetails();
        }

        System.out.println("Main ended");
    }
}
