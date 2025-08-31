package com.xworks.passport;

import com.xworks.passport.seva.PassportSeva;
import com.xworks.passport.user.PassportUser;

public class Passposrtrunner {
    public static void main(String[] args) {
        System.out.println("main started");
        PassportUser passportUser = new PassportUser();
        passportUser.setcpvLocation("po");
        passportUser.setDcdrLocation("bnglr");
        passportUser.setGivenName("anu");
        passportUser.setSurName("rd");
        passportUser.setDob("may 10 2003");
        passportUser.setEmail("an@gmail.com");
        passportUser.setLoginId("anu@gmail.com");
        passportUser.setPwd("anu");
        passportUser.setConfirmPwd("anu");
        passportUser.setHintQues("who is ur bestfrnd");
        passportUser.setHintAnswer("krishna");
        passportUser.setCaptcha("PLko90");
        passportUser.setEmailLoginSame(true);

        System.out.println("the cpv location is " + passportUser.getCpvLocation());
        System.out.println("the dcdr location is " + passportUser.getDcdrLocation());
        System.out.println("the given name is " + passportUser.getGivenName());
        System.out.println("the sur name is "  + passportUser.getSurName());
        System.out.println("the dob is " + passportUser.getDob());
        System.out.println("the email is " + passportUser.getEmail());
        System.out.println("the login id " + passportUser.getLoginId());
        System.out.println("the password is " + passportUser.getPwd());
        System.out.println("the confirm password is " + passportUser.getConfirmPwd());
        System.out.println("hint question " + passportUser.getHintQues());
        System.out.println("the hint answer " + passportUser.getHintAnswer());
        System.out.println("the captcha is " + passportUser.getCaptcha());


        PassportSeva passportSeva = new PassportSeva();
       boolean created =  passportSeva.createPassportUser(passportUser);
        System.out.println("Passport user created " + created);

    }
}
