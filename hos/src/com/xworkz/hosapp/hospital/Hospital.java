package com.xworkz.hosapp.hospital;

import com.xworkz.hosapp.department.Department;

public class Hospital {
    Department[] departments = new Department[10];
    int index;

    public boolean addDepartment(Department department) {
        if (department != null && index < departments.length) {
            departments[index++] = department;
            return true;
        }
        System.out.println("Invalid Department or Hospital Capacity Full");
        return false;
    }

    public void getAllDepartments() {
        System.out.println("List of Departments in Hospital");
        for (Department dept : departments) {
            if (dept != null) {
                System.out.println("Department Id: " + dept.getDepartmentId());
                System.out.println("Department Name: " + dept.getDepartmentName());
                System.out.println("Head of Department: " + dept.getHeadOfDepartment());
                System.out.println("Floor Number: " + dept.getFloorNumber());
                System.out.println("Contact Number: " + dept.getContactNumber());
                System.out.println("-----------------------------------");
            }
        }
    }
}
