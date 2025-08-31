package com.xworkx.company.details;

import com.xworkx.company.project.Project;
import com.xworkx.company.validation.ValidateProject;

public class CompanyDetails {
    private Project project;

    public boolean addProject(Project project) {
        ValidateProject validateProject = new ValidateProject();
        boolean isValid = validateProject.validateProjectInfo(project);

        if (isValid) {
            this.project = project;
            return true;
        }
        return false;
    }

    public void showProjectDetails() {
        System.out.println("Project ID: " + project.getProjectId());
        System.out.println("Project Name: " + project.getProjectName());
        System.out.println("Domain: " + project.getDomain());
        System.out.println("Start Date: " + project.getStartDate());
        System.out.println("End Date: " + project.getEndDate());
        System.out.println("Budget: ₹" + project.getBudget());
    }
}
