package com.xworks.appstore.users;

public class User {
    private  String givenName;
    private String surName;
    private  String dob;
    private  int age;
    private char gender;
    private String email;
    private long phoneNUmber;
    private String password;
    private String confirmPass;
    private String city;
    private String idProf;
    private String address;
    private String country;
    private String  state;
    private String occupation;

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
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setDob(String dob){
        this.dob = dob;
    }
    public String getDob(){
        return  dob;
    }
    public void setEmail(String email){
        this.email =email;
    }
    public String getEmail(){
        return email;
    }
    public void setGender(char gender){
        this.gender =gender;
    }

    public char getGender() {
        return gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setPhoneNUmber(long phoneNUmber) {
        this.phoneNUmber = phoneNUmber;
    }

    public long getPhoneNUmber() {
        return phoneNUmber;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setConfirmPass(String confirmPass) {
        this.confirmPass = confirmPass;
    }
    public String getConfirmPass() {
        return confirmPass;
    }

    public void setIdProf(String idProf) {
        this.idProf = idProf;
    }

    public String getIdProf() {
        return idProf;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

}
