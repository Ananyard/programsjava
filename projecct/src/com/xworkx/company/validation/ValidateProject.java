package com.xworkx.company.validation;

import com.xworkx.company.project.Project;

public class ValidateProject {
    private Project project;

    public boolean validateProjectInfo(Project project) {
        boolean validId = false;
        boolean validName = false;
        boolean validDomain = false;
        boolean validStart = false;
        boolean validEnd = false;
        boolean validBudget = false;

        if (project.getProjectId() > 0) {
            validId = true;
        } else System.out.println("Invalid project ID");

        if (project.getProjectName() != null && !project.getProjectName().isEmpty()) {
            validName = true;
        } else System.out.println("Invalid project name");

        if (project.getDomain() != null && !project.getDomain().isEmpty()) {
            validDomain = true;
        } else System.out.println("Invalid domain");

        if (project.getStartDate() != null && !project.getStartDate().isEmpty()) {
            validStart = true;
        } else System.out.println("Invalid start date");

        if (project.getEndDate() != null && !project.getEndDate().isEmpty()) {
            validEnd = true;
        } else System.out.println("Invalid end date");

        if (project.getBudget() > 0) {
            validBudget = true;
        } else System.out.println("Invalid budget");

        if (validId && validName && validDomain && validStart && validEnd && validBudget) {
            this.project = project;
            return true;
        }
        return false;
    }
}
