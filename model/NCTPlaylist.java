/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Asus
 */
public class NCTPlaylist extends Playlist{
    public NCTPlaylist(String name) {
        super(name);
        initializeSongs();
    }

    private void initializeSongs() {
        addSong(new Song("Kick It", "NCT 127", "3.22", 2020));
        addSong(new Song("Cherry Bomb", "NCT 127", "3.19", 2017));
        addSong(new Song("Make A Wish", "NCT U", "3.30", 2020));
        addSong(new Song("90's Love", "NCT U", "3.27", 2020));
        addSong(new Song("Sticker", "NCT 127", "3.33", 2021));
    }
}
