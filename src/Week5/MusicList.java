package Week5;

import java.util.ArrayList;
import java.util.Arrays;

import helpers.InputReader;
import java.util.Scanner;

public class MusicList {
    

    public void run() {
        System.out.println("Ana's Music List");
        testSongs();
        mainMenu();
        addNewSong();
        deleteSong();
        printSongs();
        orderedPrintSongs();  
        song();
    }

    private void mainMenu() {
        System.out.println("Main menu");
        System.out.println("Add new song (1)");
        System.out.println("Delete song (2)");
        System.out.println("Print list of songs (3)");
        System.out.println("Print list of songs by number of plays (4)");
        System.out.println("Close application (5)");

        int option;
        option = InputReader.getInt("Please enter desired option (1-5):  ");
        if (option == 1) {
            addNewSong();
        } 
        else if (option == 2) {
            deleteSong();
        } 
        else if (option == 3) {
            printSongs();
        } 
        else if (option == 4) {
            orderedPrintSongs();
        } 
        else {
            System.out.println("This is an invalid choice. Please enter number between 1 and 5.");
            mainMenu();
        }
    }


    private void addNewSong() {
        song = InputReader.getString("Please enter the title of the song you wish to add.");
    }

    private void deleteSong() {
        InputReader.getString("Please enter the title of the song you wish to delete.");
    }

    private void printSongs() {
        System.out.println(ArrayList<song>());
    }

    private void orderedPrintSongs() {
        System.out.println("Ana, if this works, imma be surprised 2");

    }

    private void testSongs() {
        ArrayList<Song> songs = new ArrayList<Song>();        
        Song song1 = new Song("Children of the Grave", "Black Sabbath", 5748967);
        Song song2 = new Song("Gift of guilt", "Gojira", 2008967);
        Song song3 = new Song("Hunger of the Undead", "Dark Angel", 78967);
        Song song4 = new Song("Death Portrait", "Lorna Shore", 298975);
        Song song5 = new Song("Pull the Plug", "Death", 2000125);
        Song song6 = new Song("Ache With Me", "Against Me!", 187158);
        Song song7 = new Song("Cherry Bomb", "Joan Jett & the Blackhearts", 6868967);
        Song song8 = new Song("Comfort in the Grace", "Vision Video", 98967);

        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
        songs.add(song6);
        songs.add(song7);
        songs.add(song8);

    }
}
