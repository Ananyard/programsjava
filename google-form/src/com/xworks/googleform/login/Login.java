package com.xworks.googleform.login;
import com.xworks.googleform.user.GoogleUser;
public class Login {
    GoogleUser googleUser;
    public boolean createForm(GoogleUser googleUser){

        boolean accountedCreated = false;
        boolean givenNameValid = false;
        boolean surNameValid = false;
        boolean dobValid = false;
        boolean emailValid = false;
        boolean phoneNumberValid  = false;
        boolean passwordValid = false;
        boolean confirmPassValid = false;



        if(googleUser.getGivenName() !=null){
          givenNameValid = true;
        }
        else
            System.out.println("given name not valid");
        if(googleUser.getSurName()!=null){
            surNameValid = true;
        }
        else
            System.out.println("surname not valid");
        if (googleUser.getDob()!=null){
            dobValid = true;
        }
        else
            System.out.println("dob not valid");
        if (googleUser.getEmail()!=null){
            emailValid = true;
        }
        else
            System.out.println("email not valid");
        if (googleUser.getPhoneNumber()>0 ){
            phoneNumberValid = true;
        }
        if (googleUser.getPassword()!=null){
            passwordValid = true;
        }
        else
            System.out.println("pass not valid ");
        if (googleUser.getConformPass()!=null){
            confirmPassValid = true;
        }
        else
            System.out.println("confirm pass not valid");

        if (givenNameValid && surNameValid && dobValid && passwordValid
                && confirmPassValid && emailValid){
          accountedCreated = true;

        }
        return accountedCreated;
    }
}
