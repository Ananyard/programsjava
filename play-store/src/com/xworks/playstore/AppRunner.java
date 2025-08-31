package com.xworks.playstore;

import com.xworks.playstore.app.Application;
import com.xworks.playstore.play.Playstore;

public class AppRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Application application  = new Application();
        application.setAppName("Manga up");
        application.setAppVersion("1.0.90.9");
        application.setDownloadSize("4.55mb");
        application.setUpdatedOn("29 july 2025");
        application.setDownloads(1000000000l);
        application.setOfferedBy("square enix co,ltd");
        application.setRequiredOs("andriod and up ");
        application.setReleasedOn("july 21 2022");


        Playstore playstore = new Playstore();
        boolean updated = playstore.addApplication(application);
        System.out.println("app updated " + updated);


       if(updated){
           playstore.appInfo();
       }

        System.out.println("main ended");

    }
}






