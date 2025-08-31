package com.xworks.googleform.user;

public class GoogleUser {
    private String  givenName;

    public void setGivenName(String givenName){
        this.givenName = givenName;
    }
    public String getGivenName(){
        return givenName;
    }

    private String surName;

    public void setSurName(String surName){
        this.surName = surName;
    }
    public String getSurName(){
        return surName;
    }

    private long phoneNumber;

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public long getPhoneNumber(){
        return phoneNumber;
    }

    private String email;

    public void setEmail(String  email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }
    private String dob;

    public void setDob( String dob){
        this.dob = dob;
    }
    public  String getDob(){
        return dob;
    }
    private String password;

    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }

    private String conformPass;

    public void setConfirmPass(String conformPass){
        this.conformPass = conformPass;
    }
    public String getConformPass(){
        return  conformPass;
    }
}
