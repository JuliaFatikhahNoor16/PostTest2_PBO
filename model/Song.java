/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Asus
 */
public final class Song {
    private String title;
    private String artist;
    private String duration;  
    private int year;      

    public Song(String title, String artist, String duration, int year) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    @Override
    public String toString() {
    return String.format("Title    : %s\nArtist   : %s\nDuration : %s min\nYear     : %d\n",
                          title, artist, duration, year);
    }
}
