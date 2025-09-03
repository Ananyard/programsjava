package com.xworkz.companyapp;

import com.xworkz.companyapp.company.Company;
import com.xworkz.companyapp.project.Project;

public class CompanyRunner {
    public static void main(String[] args) {

        Project project1 = new Project();
        project1.setProjectId(1);
        project1.setProjectName("E-Commerce Platform");

        Project project2 = new Project();
        project2.setProjectId(2);
        project2.setProjectName("Banking Application");

        Project project3 = new Project();
        project3.setProjectId(3);
        project3.setProjectName("Hospital Management System");

        Project project4 = new Project();
        project4.setProjectId(4);
        project4.setProjectName("Library Management System");

        Project project5 = new Project();
        project5.setProjectId(5);
        project5.setProjectName("Food Delivery App");

        Project project6 = new Project();
        project6.setProjectId(6);
        project6.setProjectName("Travel Booking Portal");

        Project project7 = new Project();
        project7.setProjectId(7);
        project7.setProjectName("Social Media Platform");

        Project project8 = new Project();
        project8.setProjectId(8);
        project8.setProjectName("CRM Software");

        Project project9 = new Project();
        project9.setProjectId(9);
        project9.setProjectName("School ERP");

        Project project10 = new Project();
        project10.setProjectId(10);
        project10.setProjectName("Inventory Management");

        Project project11 = new Project();
        project11.setProjectId(11);
        project11.setProjectName("Chat Application");

        Project project12 = new Project();
        project12.setProjectId(12);
        project12.setProjectName("Fitness Tracker");

        Project project13 = new Project();
        project13.setProjectId(13);
        project13.setProjectName("Weather Forecasting System");

        Project project14 = new Project();
        project14.setProjectId(14);
        project14.setProjectName("Online Voting System");

        Project project15 = new Project();
        project15.setProjectId(15);
        project15.setProjectName("Movie Ticket Booking");

        Project project16 = new Project();
        project16.setProjectId(16);
        project16.setProjectName("Hotel Reservation System");

        Project project17 = new Project();
        project17.setProjectId(17);
        project17.setProjectName("Online Examination Portal");

        Project project18 = new Project();
        project18.setProjectId(18);
        project18.setProjectName("Expense Tracker");

        Project project19 = new Project();
        project19.setProjectId(19);
        project19.setProjectName("Employee Payroll System");

        Project project20 = new Project();
        project20.setProjectId(20);
        project20.setProjectName("Gaming Application");

        Company company = new Company();

        company.addProject(project1);
        company.addProject(project2);
        company.addProject(project3);
        company.addProject(project4);
        company.addProject(project5);
        company.addProject(project6);
        company.addProject(project7);
        company.addProject(project8);
        company.addProject(project9);
        company.addProject(project10);
        company.addProject(project11);
        company.addProject(project12);
        company.addProject(project13);
        company.addProject(project14);
        company.addProject(project15);
        company.addProject(project16);
        company.addProject(project17);
        company.addProject(project18);
        company.addProject(project19);
        company.addProject(project20);

        company.getAllProjects();
    }
}
