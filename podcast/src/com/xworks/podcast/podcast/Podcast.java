package com.xworks.podcast.podcast;

import com.xworks.podcast.channel.Channel;

// child / sub / derived
public class Podcast extends Channel {

    public void showVideo(String episodeTitle) {
        System.out.println("🎥 Now streaming VIDEO episode: " + episodeTitle + " from " + name + " hosted by " + host);
    }
}
