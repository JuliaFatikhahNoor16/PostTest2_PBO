/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Asus
 */
public class BTSPlaylist extends Playlist{
     public BTSPlaylist(String name) {
        super(name);
        initializeSongs();
    }

    private void initializeSongs() {
        addSong(new Song("Butter", "BTS", "2.44", 2021));
        addSong(new Song("Dynamite", "BTS", "3.19", 2020));
        addSong(new Song("Boy With Luv", "BTS", "3.49", 2019));
        addSong(new Song("Fake Love", "BTS", "3.36", 2018));
        addSong(new Song("Spring Day", "BTS", "4.34", 2017));
    }
}
