package com.xworkx.hospital.patient;

public class Patient {
    private int patientId;
    private String patientName;
    private String patientDob;
    private long phoneNumber;
    private String location;
    private int age;

    public void setPatientId(int patientId){
        this.patientId = patientId;
    }
    public int getPatientId(){
        return patientId;
    }
    public void setPatientName(String patientName){
        this.patientName = patientName;
    }
    public String getPatientName(){
        return patientName;
    }
    public void setPatientDob(String patientDob){
        this.patientDob = patientDob;
    }
    public String getPatientDob(){
        return patientDob;
    }
    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public long getPhoneNumber(){
        return phoneNumber;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public String getLocation(){
        return location;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}

