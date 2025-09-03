package com.xworkz.hosapp;

import com.xworkz.hosapp.department.Department;
import com.xworkz.hosapp.hospital.Hospital;

public class HospitalRunner {

    public static void main(String[] args) {

        Department d1 = new Department();
        d1.setDepartmentId(1);
        d1.setDepartmentName("Cardiology");
        d1.setHeadOfDepartment("Dr. Ramesh Kumar");
        d1.setFloorNumber(2);
        d1.setContactNumber("9876543210");

        Department d2 = new Department();
        d2.setDepartmentId(2);
        d2.setDepartmentName("Neurology");
        d2.setHeadOfDepartment("Dr. Suresh Mehta");
        d2.setFloorNumber(3);
        d2.setContactNumber("9876501234");

        Department d3 = new Department();
        d3.setDepartmentId(3);
        d3.setDepartmentName("Orthopedics");
        d3.setHeadOfDepartment("Dr. Anita Sharma");
        d3.setFloorNumber(1);
        d3.setContactNumber("9123456780");

        Department d4 = new Department();
        d4.setDepartmentId(4);
        d4.setDepartmentName("Pediatrics");
        d4.setHeadOfDepartment("Dr. Vikas Gupta");
        d4.setFloorNumber(2);
        d4.setContactNumber("9988776655");

        Department d5 = new Department();
        d5.setDepartmentId(5);
        d5.setDepartmentName("Dermatology");
        d5.setHeadOfDepartment("Dr. Neha Verma");
        d5.setFloorNumber(4);
        d5.setContactNumber("9090909090");

        Department d6 = new Department();
        d6.setDepartmentId(6);
        d6.setDepartmentName("ENT");
        d6.setHeadOfDepartment("Dr. Priya Singh");
        d6.setFloorNumber(1);
        d6.setContactNumber("9345678901");

        Department d7 = new Department();
        d7.setDepartmentId(7);
        d7.setDepartmentName("Oncology");
        d7.setHeadOfDepartment("Dr. Raj Malhotra");
        d7.setFloorNumber(5);
        d7.setContactNumber("9123987654");

        Department d8 = new Department();
        d8.setDepartmentId(8);
        d8.setDepartmentName("Radiology");
        d8.setHeadOfDepartment("Dr. Arjun Nair");
        d8.setFloorNumber(3);
        d8.setContactNumber("9000000001");

        Department d9 = new Department();
        d9.setDepartmentId(9);
        d9.setDepartmentName("Emergency");
        d9.setHeadOfDepartment("Dr. Pooja Joshi");
        d9.setFloorNumber(0);
        d9.setContactNumber("9555555555");

        Department d10 = new Department();
        d10.setDepartmentId(10);
        d10.setDepartmentName("Gastroenterology");
        d10.setHeadOfDepartment("Dr. Manoj Kumar");
        d10.setFloorNumber(2);
        d10.setContactNumber("9777777777");

        // Create hospital object
        Hospital hospital = new Hospital();

        // Add departments
        hospital.addDepartment(d1);
        hospital.addDepartment(d2);
        hospital.addDepartment(d3);
        hospital.addDepartment(d4);
        hospital.addDepartment(d5);
        hospital.addDepartment(d6);
        hospital.addDepartment(d7);
        hospital.addDepartment(d8);
        hospital.addDepartment(d9);
        hospital.addDepartment(d10);

        // Print all departments
        hospital.getAllDepartments();
    }
}
