/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playlist;

import model.BTSPlaylist;
import model.TXTPlaylist;
import model.SeventeenPlaylist;
import model.NCTPlaylist;
import model.Song;
import model.Playlist; // Pastikan ini ada
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Inisialisasi playlist
            BTSPlaylist btsPlaylist = new BTSPlaylist("Playlist BTS");
            TXTPlaylist txtPlaylist = new TXTPlaylist("Playlist TXT");
            SeventeenPlaylist seventeenPlaylist = new SeventeenPlaylist("Playlist Seventeen");
            NCTPlaylist nctPlaylist = new NCTPlaylist("Playlist NCT");

            boolean running = true;

            while (running) {
                System.out.println("\n+-----------------------------------------+");
                System.out.println("=========== Playlist Musik KPOP ===========");
                System.out.println("|             1. Playlist BTS             |");
                System.out.println("|             2. Playlist TXT             |");
                System.out.println("|             3. Playlist Seventeen       |");
                System.out.println("|             4. Playlist NCT             |");
                System.out.println("|             5. Keluar                   |");
                System.out.println("+-----------------------------------------+");
                System.out.print("\nPilih Menu: ");

                int choice = scanner.nextInt();
                scanner.nextLine();

                Playlist selectedPlaylist = switch (choice) {
                    case 1 -> btsPlaylist;
                    case 2 -> txtPlaylist;
                    case 3 -> seventeenPlaylist;
                    case 4 -> nctPlaylist;
                    case 5 -> {
                        running = false; 
                        System.out.println("~Thank You for The Time You Spend With Me~");
                        System.out.println("            ~Have a Great Day~            ");
                        yield null; 
                    }
                    default -> {
                        System.out.println("Opsi tidak valid. Silakan coba lagi.");
                        yield null; // Mengembalikan null untuk kasus tidak valid
                    }
                };

                if (selectedPlaylist != null) {
                    handleCrudMenu(scanner, selectedPlaylist);
                }
            }
        } 
    }

    public static void handleCrudMenu(Scanner scanner, Playlist playlist) {
        boolean crudRunning = true;

        while (crudRunning) {
            System.out.println("\n+-----------------------------------------+");
            System.out.println("================ Menu CRUD ================");
            System.out.println("|       1. Tambah Lagu ke Playlist        |");
            System.out.println("|       2. Hapus Lagu dari Playlist       |");
            System.out.println("|       3. Edit Lagu di Playlist          |");
            System.out.println("|       4. Tampilkan Playlist             |");
            System.out.println("|       5. Kembali ke Menu Playlist       |");
            System.out.println("+-----------------------------------------+");
            System.out.print("\nPilih menu: ");

            int crudChoice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (crudChoice) {
                case 1 -> {
                    System.out.print("Masukkan judul lagu: ");
                    String title = scanner.nextLine();
                    System.out.print("Masukkan artis: ");
                    String artist = scanner.nextLine();
                    System.out.print("Masukkan durasi: ");
                    String duration = scanner.nextLine();
                    System.out.print("Masukkan tahun: ");
                    int year = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    playlist.addSong(new Song(title, artist, duration, year));
                    System.out.println("Lagu ditambahkan ke " + playlist.getPlaylistName());
                }
                case 2 -> {
                    System.out.print("Masukkan judul lagu yang ingin dihapus: ");
                    String removeTitle = scanner.nextLine();
                    playlist.removeSong(removeTitle);
                    System.out.println("Lagu " + removeTitle + " telah dihapus dari " + playlist.getPlaylistName());
                }
                case 3 -> {
                    System.out.print("Masukkan judul lagu yang ingin diedit: ");
                    String editTitle = scanner.nextLine();
                    Song songToEdit = playlist.findSongByTitle(editTitle);
                    if (songToEdit != null) {
                        System.out.println("\n+-----------------------------------------+");
                        System.out.println("====== Pilih Menu Yang Ingin di Edit ======");
                        System.out.println("|              1. Judul                   |");
                        System.out.println("|              2. Artis                   |");
                        System.out.println("|              3. Durasi                  |");
                        System.out.println("|              4. Tahun Rilis             |");
                        System.out.println("+-----------------------------------------+");
                        System.out.print("\nPilih opsi: ");
                        int editChoice = scanner.nextInt();
                        scanner.nextLine(); // Consume newline

                        switch (editChoice) {
                            case 1 -> {
                                System.out.print("Judul baru: ");
                                String newTitle = scanner.nextLine();
                                songToEdit.setTitle(newTitle);
                                System.out.println("Judul lagu berhasil diubah.");
                            }
                            case 2 -> {
                                System.out.print("Artis baru: ");
                                String newArtist = scanner.nextLine();
                                songToEdit.setArtist(newArtist);
                                System.out.println("Artis lagu berhasil diubah.");
                            }
                            case 3 -> {
                                System.out.print("Durasi baru: ");
                                String newDuration = scanner.nextLine();
                                songToEdit.setDuration(newDuration);
                                System.out.println("Durasi lagu berhasil diubah.");
                            }
                            case 4 -> {
                                System.out.print("Tahun rilis baru: ");
                                int newYear = scanner.nextInt();
                                songToEdit.setYear(newYear);
                                System.out.println("Tahun rilis berhasil diubah.");
                            }
                            default -> System.out.println("Pilihan tidak valid.");
                        }
                    } else {
                        System.out.println("Lagu tidak ditemukan.");
                    }
                }
                case 4 -> {
                    playlist.displayPlaylist();
                }
                case 5 -> crudRunning = false; 
                default -> System.out.println("Opsi tidak valid. Silakan coba lagi.");
            }
        }
    }
}