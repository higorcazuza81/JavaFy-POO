package com.javafy.www.model;

import com.javafy.www.classification.Classification;

/**
 * Podcast class.
 *
 * This class is used to create Podcast objects.
 *
 * @version 1.0 09/13/2023
 * @since 1.0
 *
 */

public class Podcast extends Audio implements Classification {
    //Fields
    private final String host;
    private final String guest;
    private final String topic;
    private final String description;

    //Constructors
    public Podcast() {
        super();
        this.host = "";
        this.guest = "";
        this.topic = "";
        this.description = "";
    }

    /**
     * This constructor creates a podcast object with the given parameters.
     */
    public Podcast(String title, int duration, String host, String guest, String topic, String description) {
        super(title, duration);
        this.host = host;
        this.guest = guest;
        this.topic = topic;
        this.description = description;
    }

    //Methods

    /**
     * This method returns the host of the podcast.
     * @return host
     */
    public String getHost() {
        return host;
    }

    /**
     * This method returns the guest of the podcast.
     * @return guest
     */
    public String getGuest() {
        return guest;
    }

    /**
     * This method returns the topic of the podcast.
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    /**
     * This method returns the description of the podcast.
     * @return description
     */
    public String getDescription() {
        return description;
    }


    /**
     * This method returns the classification of the podcast.
     * @return classification
     */
    @Override
    public int getClassification() {
        if(getLikes() >= 10){
            return 5;
        }else{
            return 3;
        }
    }

    /**
     * This method prints the technical sheet of the podcast.
     */
    public void showTechnicalSheet(){
        System.out.println("#############################################");
        System.out.println("*** PODCAST ***");
        System.out.println("Title: " + getTitle());
        System.out.println("Duration: " + getDuration());
        System.out.println("Host: " + getHost());
        System.out.println("Guest: " + getGuest());
        System.out.println("Topic: " + getTopic());
        System.out.println("Description: " + getDescription());
        System.out.println("#############################################");
    }
}
