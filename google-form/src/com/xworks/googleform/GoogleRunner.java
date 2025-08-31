package com.xworks.googleform;
import com.xworks.googleform.user.GoogleUser;
import com.xworks.googleform.login.Login;
public class GoogleRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        GoogleUser googleUser = new GoogleUser();
        googleUser.setGivenName("anu");
        System.out.println("the given name is " + googleUser.getGivenName());
        googleUser.setSurName("rd");
        System.out.println("the sur name is " + googleUser.getSurName());
        googleUser.setDob("jan 7 1999");
        System.out.println("dob is " + googleUser.getDob());
        googleUser.setEmail("apop@gmail.com");
        System.out.println("email is :" + googleUser.getEmail());
        googleUser.setPhoneNumber(9874563210l);
        System.out.println("the ph no is " + googleUser.getPhoneNumber());
        googleUser.setPassword("apa");
        System.out.println("the pass is " + googleUser.getPassword());
        googleUser.setConfirmPass("apa");
        System.out.println("the confirm pass is "+ googleUser.getConformPass());

        Login login = new Login();
        boolean created  = login.createForm(googleUser);
        System.out.println("accounted created" + created);


        System.out.println("main ended");
    }
}
