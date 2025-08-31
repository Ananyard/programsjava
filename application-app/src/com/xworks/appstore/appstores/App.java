package com.xworks.appstore.appstores;

import com.xworks.appstore.users.User;

public class App {
    User user;
   public boolean createAccount(User user){
       boolean accountValid = true;
      boolean givenNameValid = false;
      boolean surNameValid = false;
      boolean dobValid = false;
     boolean ageValid = false;
      boolean genderValid = false;
       boolean emailValid = false;
      boolean phoneNUmberValid = false;
       boolean passwordValid = false;
       boolean confirmPassValid = false;
       boolean cityValid = false;
      boolean idProfValid =false;
      boolean addressValid =false;
       boolean countryValid=false;
       boolean  stateValid=false;
       boolean occupationValid=false;

       if (user.getGivenName() != null && !user.getGivenName().isEmpty()){
           givenNameValid = true;
       }else System.out.println("name not valid");
       if (user.getSurName() != null && !user.getSurName().isEmpty()){
           surNameValid = true;
       } else System.out.println("sur name not valid");
       if (user.getAge() > 0){
           ageValid = true;
       }else System.out.println("age not valid");
       if (user.getGender()>0){
           genderValid = true;
       }else System.out.println("gender not valid");
       if (user.getDob()!=null && !user.getDob().isEmpty()){
               dobValid = true;
           }else System.out.println("doob not valid ");
       if (user.getEmail()!=null && !user.getEmail().isEmpty()) {
           emailValid = true;
       } else System.out.println("emial not valid");
       if (user.getPhoneNUmber()>0){
           phoneNUmberValid =true;
       }else System.out.println(" phoneNUmber not Valid");
       if (user.getPassword() != null && !user.getPassword().isEmpty()){
           passwordValid = true;
       }else System.out.println("pass not valid");
       if (user.getConfirmPass() !=null && !user.getConfirmPass().isEmpty()){
           confirmPassValid =true;
       }else System.out.println("confirm passs not valid");
       if (user.getCity() !=null && !user.getCity().isEmpty()){
           cityValid = true;
       }else System.out.println("city not valid");
       if (user.getAddress()!= null && !user.getAddress().isEmpty()){
           addressValid = true;
       } else System.out.println("address not valid");
       if (user.getCountry()!=null && !user.getCountry().isEmpty()){
           countryValid = true;
       } else System.out.println("country not valid");
       if (user.getState()!=null && !user.getState().isEmpty()){
           stateValid = true;
       } else System.out.println("state not valid");
       if (user.getIdProf()!=null && !user.getIdProf().isEmpty()){
           idProfValid = true;
       } else System.out.println("id proof not valid");
       if (user.getOccupation()!= null && !user.getOccupation().isEmpty()){
           occupationValid=true;
       }else System.out.println("occupation not valid");
       if (addressValid && ageValid && cityValid && occupationValid && confirmPassValid && countryValid
       && dobValid && emailValid && genderValid && givenNameValid && surNameValid && phoneNUmberValid &&passwordValid
       && stateValid && idProfValid){
           accountValid = true;
       }
return addressValid;
   }

}
