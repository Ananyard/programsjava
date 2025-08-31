package com.xworks.appstore;

import com.xworks.appstore.appstores.App;
import com.xworks.appstore.users.User;
import com.xworks.appstore.validation.Validate;

public class AppRunner {
    public static void main(String[] args) {
        System.out.println("main startrd");
    User user =new User();
    user.setGivenName("an");
    user.setSurName("pp");
    user.setGender('f');
    user.setAge(45);
    user.setPhoneNUmber(9874563210l);
    user.setDob("10 july 2000");
    user.setEmail("pop@gmail.com");
    user.setCity("Mangalore");
    user.setAddress("9th blovk krihsnapura");
    user.setCountry("india");
    user.setIdProf("90897799899");
    user.setPassword("pop");
    user.setConfirmPass("pop");
    user.setState("karnataka");
    user.setOccupation("working");

    Validate validate = new Validate();
    boolean created = validate.addDetails(user);
        System.out.println("acount created " + created);
    validate.detailsINfo();


    }
}
