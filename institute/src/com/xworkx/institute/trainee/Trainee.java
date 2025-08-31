package com.xworkx.institute.trainee;

public class Trainee {
    private int traineeId;
    private String name;
    private String course;
    private String joinDate;
    private String email;
    private int age;

    public void setTraineeId(int traineeId) {
        this.traineeId = traineeId;
    }
    public int getTraineeId() {
        return traineeId;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    public String getCourse() {
        return course;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }
    public String getJoinDate() {
        return joinDate;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
