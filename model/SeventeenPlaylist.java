/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Asus
 */
public class SeventeenPlaylist extends Playlist{
    public SeventeenPlaylist(String name) {
        super(name);
        initializeSongs();
    }

    private void initializeSongs() {
        addSong(new Song("Left & Right", "Seventeen", "3.24", 2021));
        addSong(new Song("Home;Run", "Seventeen", "3.33", 2020));
        addSong(new Song("Don't Wanna Cry", "Seventeen", "3.37", 2017));
        addSong(new Song("Pretty U", "Seventeen", "3.30", 2016));
        addSong(new Song("Adore U", "Seventeen", "3.39", 2015));
    }
}
