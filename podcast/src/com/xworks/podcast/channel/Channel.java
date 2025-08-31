package com.xworks.podcast.channel;

public class Channel {
public String name;
public String host;

public String getName(){
    return name;
}
public String getHost(){
    return host;
}

public void play(String song){
    System.out.println("the song" + song + "sining by" + name);
}
public void coregrophy(String  music){
    System.out.println("the " + music + "host name" + host);
}

}
