package com.xworkx.company;

import com.xworkx.company.project.Project;
import com.xworkx.company.details.CompanyDetails;

public class CompanyRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        Project project = new Project();
        project.setProjectId(301);
        project.setProjectName("AI Chatbot System");
        project.setDomain("Artificial Intelligence");
        project.setStartDate("01-Sep-2025");
        project.setEndDate("31-Dec-2025");
        project.setBudget(1200000.50);

        CompanyDetails details = new CompanyDetails();
        boolean added = details.addProject(project);
        System.out.println("Project added: " + added);

        if (added) {
            details.showProjectDetails();
        }

        System.out.println("Main ended");
    }
}
