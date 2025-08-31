package com.xworks.flipkart;

import com.xworks.flipkart.app.App;
import com.xworks.flipkart.user.UserAccount;
public class FlipkartRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        App app = new App();
        app.setGivenName("lap");
        app.setSurName("po");
        app.setEmail("pop@gmail.com");
        app.setPhoneNumber(9874563210l);
        app.setPassword("pop");
        app.setConPass("pop");

        UserAccount userAccount = new UserAccount();
        boolean created = userAccount.creatAccount(app);
        System.out.println("accounted creared " + created);

        if(created){
            userAccount.displayUserDetails();
        }

    }
}
