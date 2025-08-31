package com.xworks.flipkart.user;
import com.xworks.flipkart.app.App;
public class UserAccount {
    App app;

    public boolean creatAccount(App app) {
        boolean accountcreated = false;
        boolean givenNameValid = false;
        boolean surNameValid = false;
        boolean phoneNumberValid = false;
        boolean passwordValid = false;
        boolean confirmPassValid = false;
        boolean emailValid = false;

        if (app.getGivenName() != null) {
            givenNameValid = true;
        }
        if (app.getSurName() != null) {
            surNameValid = true;
        }
        if (app.getEmail() != null) {
            emailValid = true;
        }
        if (app.getPhoneNumber() > 0) {
            passwordValid = true;
        }
        if (app.getPassword() != null) {
            passwordValid = true;
        }
        if (app.getConPass() != null) {
            confirmPassValid = true;
        } else
            System.out.println("not valid");

        if (givenNameValid && surNameValid && emailValid && passwordValid && passwordValid && confirmPassValid) {
            accountcreated = true;
            this.app = app;
        }
        return accountcreated;




}
public void displayUserDetails(){
    System.out.println("the gievn name " + app.getGivenName());
    System.out.println("the sur name " + app.getSurName());
    System.out.println("the phone number is " + app.getPhoneNumber());
    System.out.println("the email is " + app.getEmail());
    System.out.println("the password is " + app.getPassword());
    System.out.println("the con pass is " + app.getConPass());
}

}
