package com.xworks.amazonapp;
import com.xworks.amazonapp.user.AmazonUser;
import  com.xworks.amazonapp.login.LoginCreated;
public class AmazonRunner {
        public static void main(String[] args) {
            AmazonUser amazonUser = new AmazonUser();
            amazonUser.setGivenName("anu");
            amazonUser.setSurName("A");
            amazonUser.setEmail("sm@gmail.com");
            amazonUser.setPassword("12");
            amazonUser.setcPass("12");

           /* System.out.println("the amazon user is:" + amazonUser.getGivenName());
            System.out.println("the sur name is:" + amazonUser.getSurName());
            System.out.println("the email is:" + amazonUser.getEmail());
            System.out.println("the password is:" + amazonUser.getPassword());
            System.out.println("the confirm pwd is:" + amazonUser.getcPass());*/


            LoginCreated loginCreated=new LoginCreated();
            boolean userCreated=loginCreated.createUserRegistered(amazonUser);
            System.out.println("the user registered" +userCreated);

            if(userCreated) {
                loginCreated.displayUserDetails();
            }


        }

    }
