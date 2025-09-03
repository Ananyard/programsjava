package com.xworkz.instituteapp;

import com.xworkz.instituteapp.trainee.Trainee;
import com.xworkz.instituteapp.institute.Institute;

public class InstituteRunner {
    public static void main(String[] args) {

        Trainee trainee = new Trainee();
        trainee.setTraineeId(1);
        trainee.setTraineeName("Ravi");
        trainee.setCourse("Java Full Stack");
        trainee.setAge(22);
        trainee.setBatch("Batch A");

        Trainee trainee1 = new Trainee();
        trainee1.setTraineeId(2);
        trainee1.setTraineeName("Sita");
        trainee1.setCourse("Python");
        trainee1.setAge(21);
        trainee1.setBatch("Batch A");

        Trainee trainee2 = new Trainee();
        trainee2.setTraineeId(3);
        trainee2.setTraineeName("Kiran");
        trainee2.setCourse("Data Science");
        trainee2.setAge(23);
        trainee2.setBatch("Batch B");

        Trainee trainee3 = new Trainee();
        trainee3.setTraineeId(4);
        trainee3.setTraineeName("Asha");
        trainee3.setCourse("Web Development");
        trainee3.setAge(22);
        trainee3.setBatch("Batch B");

        Trainee trainee4 = new Trainee();
        trainee4.setTraineeId(5);
        trainee4.setTraineeName("Sunil");
        trainee4.setCourse("Java Full Stack");
        trainee4.setAge(24);
        trainee4.setBatch("Batch C");

        Trainee trainee5 = new Trainee();
        trainee5.setTraineeId(6);
        trainee5.setTraineeName("Divya");
        trainee5.setCourse("Python");
        trainee5.setAge(20);
        trainee5.setBatch("Batch C");

        Trainee trainee6 = new Trainee();
        trainee6.setTraineeId(7);
        trainee6.setTraineeName("Manoj");
        trainee6.setCourse("Data Science");
        trainee6.setAge(25);
        trainee6.setBatch("Batch D");

        Trainee trainee7 = new Trainee();
        trainee7.setTraineeId(8);
        trainee7.setTraineeName("Kavya");
        trainee7.setCourse("Web Development");
        trainee7.setAge(21);
        trainee7.setBatch("Batch D");

        Trainee trainee8 = new Trainee();
        trainee8.setTraineeId(9);
        trainee8.setTraineeName("Ramesh");
        trainee8.setCourse("Java Full Stack");
        trainee8.setAge(23);
        trainee8.setBatch("Batch E");

        Trainee trainee9 = new Trainee();
        trainee9.setTraineeId(10);
        trainee9.setTraineeName("Meena");
        trainee9.setCourse("Python");
        trainee9.setAge(22);
        trainee9.setBatch("Batch E");

        Trainee trainee10 = new Trainee();
        trainee10.setTraineeId(11);
        trainee10.setTraineeName("Ajay");
        trainee10.setCourse("Data Science");
        trainee10.setAge(24);
        trainee10.setBatch("Batch F");

        Trainee trainee11 = new Trainee();
        trainee11.setTraineeId(12);
        trainee11.setTraineeName("Pooja");
        trainee11.setCourse("Web Development");
        trainee11.setAge(23);
        trainee11.setBatch("Batch F");

        Trainee trainee12 = new Trainee();
        trainee12.setTraineeId(13);
        trainee12.setTraineeName("Vikas");
        trainee12.setCourse("Java Full Stack");
        trainee12.setAge(21);
        trainee12.setBatch("Batch G");

        Trainee trainee13 = new Trainee();
        trainee13.setTraineeId(14);
        trainee13.setTraineeName("Sneha");
        trainee13.setCourse("Python");
        trainee13.setAge(22);
        trainee13.setBatch("Batch G");

        Trainee trainee14 = new Trainee();
        trainee14.setTraineeId(15);
        trainee14.setTraineeName("Arjun");
        trainee14.setCourse("Data Science");
        trainee14.setAge(25);
        trainee14.setBatch("Batch H");

        Institute institute = new Institute();

        institute.addTrainee(trainee);
        institute.addTrainee(trainee1);
        institute.addTrainee(trainee2);
        institute.addTrainee(trainee3);
        institute.addTrainee(trainee4);
        institute.addTrainee(trainee5);
        institute.addTrainee(trainee6);
        institute.addTrainee(trainee7);
        institute.addTrainee(trainee8);
        institute.addTrainee(trainee9);
        institute.addTrainee(trainee10);
        institute.addTrainee(trainee11);
        institute.addTrainee(trainee12);
        institute.addTrainee(trainee13);
        institute.addTrainee(trainee14);

        institute.getAllTrainees();
    }
}
