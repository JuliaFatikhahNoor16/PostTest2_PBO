/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class Playlist implements CRUD{
    private final String playlistName;
    private ArrayList<Song> songs;

    // Konstruktor
    public Playlist(String playlistName) {
        this.playlistName = playlistName;
        this.songs = new ArrayList<>();
    }

    // Getter untuk nama playlist
    public String getPlaylistName() {
        return playlistName;
    }

    // Metode untuk menambah lagu
    @Override
    public void addSong(Song song) {
        songs.add(song);
    }

    // Metode untuk menghapus lagu
    @Override
    public void removeSong(String title) {
        songs.removeIf(song -> song.getTitle().equalsIgnoreCase(title));
    }

    // Metode untuk mencari lagu berdasarkan judul
    public Song findSongByTitle(String title) {
        for (Song song : songs) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                return song;
            }
        }
        return null; // Jika tidak ditemukan
    }

    // Metode untuk menampilkan playlist
    @Override
    public void displayPlaylist() {
    System.out.println("=========  " + getPlaylistName() + " =========");
    if (songs.isEmpty()) {
        System.out.println("Playlist kosong.");
    } else {
        for (Song song : songs) {
            System.out.println("+-----------------------------------------+");
            System.out.println(song); 
            System.out.println("+-----------------------------------------+");
        }
        }
    }
}