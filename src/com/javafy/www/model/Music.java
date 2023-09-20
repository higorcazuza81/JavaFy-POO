package com.javafy.www.model;
/**
 * Music class.
 *
 * This class is used to create Music objects.
 *
 * @version 1.0 09/13/2023
 * @since 1.0
 *
 */
public class Music extends Audio {
    //fields
    private final String artist;
    private final String album;
    private final String genre;

    //constructors
    public Music() {
        super();
        this.artist = "";
        this.album = "";
        this.genre = "";
    }

    /**
     * This constructor creates a music object with the given parameters.
     */

    public Music(String title, int duration, String artist, String album, String genre) {
        super(title, duration);
        this.artist = artist;
        this.album = album;
        this.genre = genre;
    }

    //methods

    /**
     * This method returns the artist of the music.
     * @return artist
     */
    public String getArtist() {
        return artist;
    }

    /**
     * This method returns the album of the music.
     * @return album
     */
    public String getAlbum() {
        return album;
    }

    /**
     * This method returns the genre of the music.
     * @return genre
     */
    public String getGenre() {
        return genre;
    }
  }
