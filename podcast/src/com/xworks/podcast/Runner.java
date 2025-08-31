package com.xworks.podcast;
import com.xworks.podcast.podcast.Podcast;
import com.xworks.podcast.channel.Channel;
public class Runner {

    public static void main(String[] args) {
        System.out.println("main started");

        Podcast techTalks = new Podcast();
        techTalks.name = "Tech Talks";
        techTalks.host = "Sara";
        techTalks.play("Future of AI");
        techTalks.coregrophy("Lina");

        Podcast travelDiaries = new Podcast();
        travelDiaries.name = "Travel Diaries";
        travelDiaries.host = "Chinnu";
        travelDiaries.play("Exploring Gokarna Beaches");
        travelDiaries.coregrophy("Sia");

        Podcast vlogShow = new Podcast();
        vlogShow.name = "Food Fiesta";
        vlogShow.host = "John";
        vlogShow.play("Top Street Foods 2025");   // inherited method
        vlogShow.showVideo("Top Street Foods 2025"); // child method

        System.out.println("main ended");
    }
}
