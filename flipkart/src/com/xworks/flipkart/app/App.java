package com.xworks.flipkart.app;

public class App {
    private String givenName;
    private String surName;
    private String email;
    private long phoneNumber;
    private String password;
    private String conPass;

    public  void setGivenName(String givenName){
        this.givenName = givenName;
    }
    public  String getGivenName(){
        return givenName;
    }
    public void setSurName(String surName){
        this.surName = surName;
    }
    public String getSurName(){
        return surName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String  getEmail(){
        return email;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
    public void setConPass(String conPass){
        this.conPass =conPass;
    }
    public String getConPass(){
        return conPass;
    }
    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public long getPhoneNumber(){
        return phoneNumber;
    }

}
