package com.xworkz.companyapp.project;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Project {

    private int projectId;
    private String projectName;
    private String domain;
    private int teamSize;
    private String manager;

}
