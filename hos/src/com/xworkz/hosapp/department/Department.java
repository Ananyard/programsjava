package com.xworkz.hosapp.department;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    private int departmentId;
    private String departmentName;
    private String headOfDepartment;
    private int floorNumber;
    private String contactNumber;
}
