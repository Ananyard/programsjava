package com.xworkz.companyapp.company;

import com.xworkz.companyapp.project.Project;

public class Company {

    private Project[] projects = new Project[20];
    private int index;

    public boolean addProject(Project project) {
        boolean isAdded = false;
        if (project != null && index < projects.length) {
            projects[index++] = project;
            isAdded = true;
        } else {
            System.out.println("Invalid Project or No space left...");
        }
        return isAdded;
    }

    public void getAllProjects() {
        System.out.println("----- List of Projects -----");
        for (Project project : projects) {
            if (project != null) {
                System.out.println("Project ID: " + project.getProjectId());
                System.out.println("Project Name: " + project.getProjectName());
                System.out.println("---------------------------");
            }
        }
    }
}
