package com.javafy.www.model;

/**
 * Podcast class.
 *
 * This class is used to create Podcast objects.
 *
 * @version 1.0 09/13/2023
 * @since 1.0
 *
 */

public class Podcast extends Audio {
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

}
