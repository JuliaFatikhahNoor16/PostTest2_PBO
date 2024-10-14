/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Asus
 */
public class TXTPlaylist extends Playlist{
    public TXTPlaylist(String name) {
        super(name);
        initializeSongs();
    }

    private void initializeSongs() {
        addSong(new Song("Crown", "TXT", "3.13", 2019));
        addSong(new Song("Blue Hour", "TXT", "3.22", 2020));
        addSong(new Song("Magic", "TXT", "3.03", 2021));
        addSong(new Song("0X1=LOVESONG", "TXT", "3.29", 2021));
        addSong(new Song("Can't You See Me?", "TXT", "3.31", 2020));
    }
}
