package com.javafy.www.model;

/**
 * This class represents an audio file.
 *
 * @version 1.0 09/13/2023
 * @since 1.0
 */
public class Audio {
    //Fields
    private  String title;
    private  int duration;
    private int likes;
    private int reproductions;
    private final double classification;

    //Constructors
    public Audio() {
        this.title = "";
        this.duration = 0;
        this.likes = 0;
        this.reproductions = 0;
        this.classification = 0.0;
    }
       //Methods

    /**
     * This method returns the title of the audio file.
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method returns the duration of the audio file.
     * @return duration
     */
    public int getDuration() {
        return duration;
    }

    /**
     * This method returns the number of likes of the audio file.
     * @return likes
     */
    public int getLikes() {
        return likes;
    }

    /**
     * This method returns the number of reproductions of the audio file.
     * @return reproductions
     */
    public int getReproductions() {
        return reproductions;
    }

    /**
     * This method returns the classification of the audio file.
     * @return classification
     */
    public double getClassification() {
        return classification;
    }

    /**
     * This method is used to set the title of the audio file.
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method is used to set the duration of the audio file.
     * @param duration
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
    * This method is used to play the audio file.
    * @param play
    */
    public void play(boolean play) {
        if (play) {
            reproductions++;
        }
    }
    /**
     * This method is used to like the audio file.
     * @param like
     */
    public void like(boolean like) {
        if (like) {
            likes++;
        }

    }
}

