package com.xworks.playstore.play;

import com.xworks.playstore.app.Application;
import com.xworks.playstore.validation.Validation;

public class Playstore {
    Application application;
    public boolean addApplication(Application application){
        boolean isAppAdded=false;


        Validation validation = new Validation() ;
      boolean isApplicationInfoValid = validation.validateApplication(application);

        if (isApplicationInfoValid){
            this.application = application;
            isAppAdded = true;
        }
        return  isAppAdded;
    }

public  void appInfo(){
    System.out.println("the app name is: " + application.getAppName());
    System.out.println("the version is: " + application.getAppVersion());
    System.out.println("the updated on: " + application.getUpdatedOn());
    System.out.println("the download size is: " + application.getDownloadSize());
    System.out.println("the requird os: " + application.getRequiredOs());
    System.out.println("the downloads down til now : " + application.getDownloads());
    System.out.println("relaesed on :" + application.getReleasedOn());
    System.out.println("offered by: " + application.getOfferedBy());
}

}
