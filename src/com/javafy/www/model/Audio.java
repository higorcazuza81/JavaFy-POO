package com.javafy.www.model;

/**
 * This class represents an audio file.
 *
 * @version 1.0 09/13/2023
 * @since 1.0
 */
public abstract class Audio {
    //Fields
    private  String title;
    private  int duration;
    private int likes;
    private int reproductions;
    private boolean like = false;

    //Constructors

    /**
     * This constructor creates an audio object with the given parameters.
     */
    public Audio() {
        this.title = "";
        this.duration = 0;
        this.likes = 0;
        this.reproductions = 0;
    }

    public Audio(String title, int duration) {
        this.title = title;
        this.duration = duration;
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
     * This method is used to set the title of the audio file.
     * @param title
     */
    public void setTitle(String title) {
        if (title != null && !title.isEmpty()) {
            this.title = title;
        } else {
            System.out.println("Title cannot be null or empty.");
        }
    }
        /**
         * This method is used to set the duration of the audio file.
         * @param duration
         */
        public void setDuration ( int duration){
            if (duration >= 0) {
                this.duration = duration;
            } else {
                System.out.println("Duration cannot be negative.");
            }
        }


    /**
     * This method is used show technical sheet of the audio file.
     */
    public void showTechnicalSheet() {
        System.out.println("Title: " + title);
        System.out.println("Duration: " + duration);
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
    public void setlike(boolean like) {
        if (like) {
            likes++;
        }
    }

}

