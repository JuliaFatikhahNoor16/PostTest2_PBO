/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

/**
 *
 * @author Asus
 */
public interface CRUD {
    void addSong(Song song);
    void removeSong(String title);
    void displayPlaylist();
}
