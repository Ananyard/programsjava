package com.xworks.passport.seva;

import com.xworks.passport.user.PassportUser;

public class PassportSeva {
    PassportUser passportUser;

    public boolean createPassportUser(PassportUser passportUser) {
        //validation
        //user is saved
        boolean passposrtUserCreated = false;
        boolean cpvLocationValid = false;
        boolean dcdrLocationValid = false;
        boolean dobValid = false;
        boolean emailValid = false;
        boolean givenNameValid = false;
        boolean surNameValid = false;
        boolean loginIdValid = false;
        boolean pwdValid = false;
        boolean confirmPwd = false;
        boolean hintQuesValid = false;
        boolean hintAnswerValid = false;
        boolean captchaValid = false;
        boolean emailLoginSameValid = false;

        if (passportUser.getCpvLocation() != null) {
            cpvLocationValid = true;
        } else {
            System.out.println("cpv location is not valid");
        }

        if (passportUser.getDcdrLocation() != null) {
            dcdrLocationValid = true;
        } else {
            System.out.println("dcdr location not valid");
        }
        if (passportUser.getGivenName() != null) {
            givenNameValid = true;
        } else {
            System.out.println("given name not valid");
        }
        if (passportUser.getSurName() != null) {
            surNameValid = true;
        } else {
            System.out.println("sur name not valid ");
        }

        if (passportUser.getDob() != null) {
            dobValid = true;
        } else {
            System.out.println("dob not valid");
        }
        if (passportUser.getEmail() != null) {
            emailValid = true;
        } else {
            System.out.println("email is not valid");
        }
        if (passportUser.getLoginId() != null) {
            loginIdValid = true;
        } else {
            System.out.println("login id not valid");
        }
        if (passportUser.getPwd() != null) {
            pwdValid = true;
        } else {
            System.out.println("passwrd not valid");
        }
        if (passportUser.getConfirmPwd() != null) {
            confirmPwd = true;
        } else {
            System.out.println("confirm passs not valid");
        }
        if (passportUser.getCaptcha() != null) {
            captchaValid = true;
        } else {
            System.out.println("captcha not valid");
        }
        if (passportUser.getHintQues() != null) {
            hintAnswerValid = true;
        } else {
            System.out.println("hint question not valid");
        }
        if (passportUser.getHintAnswer() != null) {
            hintQuesValid = true;
        }
        else {
            System.out.println("hint answer not valid");
        }

        if (passportUser.isEmailLoginSame()) {
            emailLoginSameValid = true;
        }
        if (captchaValid && emailValid && cpvLocationValid && confirmPwd && pwdValid && givenNameValid && surNameValid &&
                dobValid  && loginIdValid && hintAnswerValid && hintQuesValid && dcdrLocationValid) {

                passposrtUserCreated = true;

            this.passportUser = passportUser;
        }
            return passposrtUserCreated;
        }

}
