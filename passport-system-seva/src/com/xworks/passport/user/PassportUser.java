package com.xworks.passport.user;

import javax.swing.text.StringContent;

public class PassportUser {

     private String cpvLocation;
     private String dcdrLocation;
     private String givenName;
     private String  surName;
     private String dob;
     private String email;
     private boolean isEmailLoginSame;
     private String loginId;
     private String pwd;
     private String confirmPwd;
     private String hintQues;
     private String hintAnswer;
     private String captcha;

    public void setcpvLocation( String cpvLocation){
      this.cpvLocation = cpvLocation;
    }
    public String getCpvLocation(){
        return cpvLocation;
    }
    public  void  setDcdrLocation(String dcdrLocation){
        this.dcdrLocation = dcdrLocation;
    }
    public String getDcdrLocation(){
        return dcdrLocation;
    }
    public void setGivenName(String givenName){
        this.givenName = givenName;
    }
    public String getGivenName(){
        return givenName;
    }
    public void setSurName(String surName){
        this.surName = surName;
    }
    public String getSurName(){
        return surName;
    }
    public void setDob(String dob){
        this.dob = dob;
    }
    public String getDob(){
        return dob;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setPwd(String pwd){
        this.pwd = pwd;
    }
    public String getPwd(){
        return pwd;
    }
    public void setLoginId(String loginId){
        this.loginId = loginId;
    }
    public String getLoginId(){
        return loginId;
    }
    public void setConfirmPwd(String confirmPwd){
        this.confirmPwd = confirmPwd;
    }
    public String getConfirmPwd(){
        return confirmPwd;
    }
    public void setHintQues(String hintQues){
        this.hintQues = hintQues;
    }
    public String getHintQues(){
        return hintQues;
    }
    public void setHintAnswer(String hintAnswer){
        this.hintAnswer =hintAnswer;
    }
    public String getHintAnswer(){
        return hintAnswer;
    }
    public void setCaptcha(String captcha){
        this.captcha =captcha;
    }
    public String getCaptcha(){
        return captcha;
    }
    public void setEmailLoginSame(boolean isEmailLoginSame){
        this.isEmailLoginSame  = isEmailLoginSame;
    }
    public boolean isEmailLoginSame(){
        return isEmailLoginSame;
    }
}
