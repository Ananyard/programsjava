package com.xworks.amazonapp.user;

public class AmazonUser {

    private String givenName;
    public void setGivenName(String givenName){
        this.givenName = givenName;
    }
    public  String getGivenName(){
        return givenName;
    }

    private String surName;
    public void  setSurName(String surName){
        this.surName = surName;
    }
    public   String getSurName(){
        return surName;
    }

    private String email;
    public void setEmail(String  email){
        this.email =email;
    }
    public String getEmail(){
        return  email;
    }

    private String password;
    public void setPassword(String password){
        this.password = password;
    }
    public  String getPassword(){
        return password;
    }
    private String cPass;
    public void setcPass(String cPass){
        this.cPass = cPass;
    }
    public String getcPass(){
        return cPass;
    }
}
