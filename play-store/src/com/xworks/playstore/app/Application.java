package com.xworks.playstore.app;

public class Application {
    private String appName;
    private String appVersion;
    private String updatedOn;
    private String downloadSize;
    private  long downloads;
    private String requiredOs;
    private String offeredBy ;
    private  String releasedOn;


    public void setAppName(String appName){
        this.appName = appName;
    }
    public String getAppName(){
        return appName;
    }
    public void setAppVersion(String appVersion){
        this.appVersion = appVersion;
    }
    public String getAppVersion(){
        return appVersion;
    }
    public void setUpdatedOn(String updatedOn){
        this.updatedOn = updatedOn;
    }
    public String getUpdatedOn(){
        return updatedOn;
    }
    public void  setDownloadSize(String downloadSize){
        this.downloadSize =downloadSize;
    }
    public String getDownloadSize(){
        return downloadSize;
    }

    public void setDownloads(long downloads){
        this.downloads =downloads;
    }
    public long getDownloads(){
        return downloads;
    }

    public void setRequiredOs(String requiredOs){
        this.requiredOs =requiredOs;
    }
    public String getRequiredOs(){
        return requiredOs;
    }
    public void  setOfferedBy(String offeredBy){
        this.offeredBy =offeredBy;
    }
    public String getOfferedBy(){
        return offeredBy;
    }
    public void setReleasedOn(String releasedOn){
        this.releasedOn = releasedOn;
    }
    public String getReleasedOn(){
        return releasedOn;
    }
}
