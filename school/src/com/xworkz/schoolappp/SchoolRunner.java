package com.xworkz.schoolappp;
import com.xworkz.schoolappp.school.School;
public class SchoolRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        School school = new School();
        school.setSchoolId(1);
        school.setSchoolName("Chaithanya public school");
        int schoolId = school.getSchoolId();
        String schoolName = school.getSchoolName();
        System.out.println("the school id is " + schoolId);
        System.out.println("the school name is " + schoolName);
        System.out.println("main ended");
    }
}
