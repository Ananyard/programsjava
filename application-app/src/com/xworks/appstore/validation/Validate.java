package com.xworks.appstore.validation;

import com.xworks.appstore.appstores.App;
import com.xworks.appstore.users.User;

public class Validate {
    User user;
    public  boolean addDetails(User user){
        boolean userDetails = false;
        App app = new App();
        boolean validateUser = app.createAccount(user);
        if (validateUser){
            this.user = user;
            validateUser =  true;
        }
        return validateUser;
    }
    public void detailsINfo(){
        System.out.println("the given name is :" + user.getGivenName());
        System.out.println("sur name " + user.getSurName());
        System.out.println(" age is " + user.getAge());
        System.out.println("dob is " + user.getDob());
        System.out.println(" phone number is " + user.getPhoneNUmber());
        System.out.println("email is " + user.getEmail());
        System.out.println("pass is "  + user.getPassword());
        System.out.println("con pass " + user.getConfirmPass());
        System.out.println("country " + user.getCountry());
        System.out.println("state  " + user.getState());
        System.out.println("city" +user.getCity());
        System.out.println("gender " + user.getGender());
        System.out.println("address is " + user.getAddress());
        System.out.println("id prrof " + user.getIdProf());
        System.out.println("occupation " +user.getOccupation());


    }
}
