package com.xworkx.company.project;

public class Project {
    private int projectId;
    private String projectName;
    private String domain;
    private String startDate;
    private String endDate;
    private double budget;

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }
    public int getProjectId() {
        return projectId;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    public String getProjectName() {
        return projectName;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
    public String getDomain() {
        return domain;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public String getStartDate() {
        return startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    public String getEndDate() {
        return endDate;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
    public double getBudget() {
        return budget;
    }
}
