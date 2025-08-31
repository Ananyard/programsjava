package com.xworks.playstore.validation;

import com.xworks.playstore.app.Application;
public class Validation {
    Application application;
   public boolean validateApplication(Application application){
       boolean appValidated =false;
       boolean appNameValid =false;
       boolean appVersionValidate = false;
       boolean updatedOnValidate = false;
       boolean downloadSizeValidate =false;
       boolean offeredValid =false;
       boolean downloadValid =true;
       boolean relasedValid = false;
       boolean requiredValid =false;

     if (application.getAppName() !=null && !application.getAppName().isEmpty()){
         appNameValid = true;
     } else System.out.println("app name not found ");

     if (application.getAppVersion() !=null && !application.getAppVersion().isEmpty()){
         appVersionValidate = true;
     } else System.out.println("version not found");
     if (application.getDownloadSize()!=null && !application.getDownloadSize().isEmpty()){
         downloadSizeValidate =true;
     }
     else System.out.println("size not available");
     if (application.getUpdatedOn()!=null && !application.getUpdatedOn().isEmpty()){
         updatedOnValidate = true;
     }
     else System.out.println("update not available");
 if (application.getOfferedBy()!=null && !application.getOfferedBy().isEmpty()){
     offeredValid = true;
 } else System.out.println("the offered not valid");

 if (application.getDownloads()>0){
     downloadValid =true;
 } else System.out.println("not available");
 if (application.getReleasedOn()!=null && !application.getReleasedOn().isEmpty()){
     relasedValid =true;
 }else System.out.println("no relsed date");
 if (application.getRequiredOs()!=null && !application.getRequiredOs().isEmpty()){
     requiredValid =true;

 }

     if(appNameValid && appVersionValidate && downloadSizeValidate && updatedOnValidate && relasedValid &&
     offeredValid && downloadValid && requiredValid){
         appValidated =true;
         this.application =application;
     }
       return appValidated;
   }



}
