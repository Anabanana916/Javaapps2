package Week5;

import java.util.ArrayList;


import helpers.InputReader;


public class MusicList {
    
    private ArrayList<Song> songs;
/**
 * Below are all of the methods used within this document.
 * Each method has a value which is then called depending
 * on what option the user picks and the code relevant to
 * that option.
 */
    public void run() {
        System.out.println("Ana's Music List");
        testSongs();
        mainMenu();
        addNewSong();
        deleteSong();
        printSongs(0);
        topPrintSongs(); 
        quit();
        
    }
/**
 * Below is the main menu the user sees when they start
 * the app. Displaying each option available for a user
 * to select. Each have a number next to them to be 
 * printed for them for navigation (see int option)
 */
    private void mainMenu() {
        System.out.println("Main menu");
        System.out.println("Add new song (1)");
        System.out.println("Delete song (2)");
        System.out.println("Print list of songs (3)");
        System.out.println("Print list of top songs (4)");
        System.out.println("Quit (5)");
        /**
         * Below is the navigation code. I have done this
         * via giving each option an integer which triggers
         * a method based on the user's input. Above, you
         * can see I put a number in brackets next to each
         * option. If a user enters any of those numbers,
         * it takes them to the relevant option. If they do
         * not enter any of the numbers displayed, it will
         * loop back to the main menu and tell them to
         * clearly enter a number between 1 and 4.
         */
        int option;
        option = InputReader.getInt("Please enter desired option (1-5):  ");
        if (option == 1) {
            addNewSong();
        } 
        else if (option == 2) {
            deleteSong();
        } 
        else if (option == 3) {
            printSongs(0);
        } 
        else if (option == 4) {
            topPrintSongs();
        }
        else if (option == 5) {
            quit();
        } 
        else {
            System.out.println("This is an invalid choice. Please enter number between 1 and 4.");
            mainMenu();
        }
    }

    /**
     * Below is the method to add songs to the play list. First
     * asking for the song name, the artist and the number of
     * plays. If I had the time, I would have liked to add a 
     * random number generator for the play count purely so the
     * user does not have to enter it for this app and to
     * generate a number purely for the sake of this project
     * but this is what I was able to do in the time.
     */
    private void addNewSong() {

        String name = InputReader.getString("Please enter the title of the song you wish to add.");
        String artist = InputReader.getString("Please enter the artist of the song you wish to add.");
        int numberOfPlays = InputReader.getInt("Please enter the play count of the song.");
        Song newsong = new Song(name, artist, numberOfPlays);
        songs.add(newsong);

        /**
         * The below code will allow the user to enter a value
         * to return to the menu, enter another song and if they
         * do not pick a valid option, it will specify the
         * conditions again
         */
        int option;
        option = InputReader.getInt("Would you like to add another song(1) or return to main menu(2)?:  ");
        if (option == 1) {
            addNewSong();
        } 
        else if (option == 2) {
            mainMenu();
        }
        else {
            System.out.println("This is an invalid choice. Please enter number between 1 and 2.");
            mainMenu();
        }

    }


    /**
     * Below is the method to delete the song. I have also
     * added the list of songs to display above so the user
     * has a reminder of the songs on the playlist so they
     * have a reminder of the name and artist of the songs
     */
    private void deleteSong() 
    {
        for(Song song : songs)
        {
            song.getSong();
        }
        /**
         * option should change based on order entered. So
         * the "option" here will be a string to match the
         * song in the list, but the "option" later should
         * change the value to the integer entered due to
         * how Java works and that "option" is not a set
         * constant
         */
        String choice;
        choice = InputReader.getString("Please enter the title of the song you wish to delete.");
        /**
         * For loop used for computer to run through list of songs
         * This first option will be based if the app only picks
         * up 1 song with the name the user enters. Printing
         * the name and the artist so the user can double check
         * their choice
         */
        for(Song song : songs){
            if (choice.equals(song.getName() ) )
            {
                song.print();
                int option;
                option = InputReader.getInt("Are you sure you want to remove this song? Yes(1) No(2))?:  ");
                if (option == 1){
                    songs.remove(song);
                    System.out.println("Song has been deleted");break;
                }
                else {
                    deleteSong();
                }
            }
        }
        //else if (option matches 2 songs)
        //else{
            //System.out.println("Error: Please enter the name of the song you wish to delete.");
            //deleteSong();
        //}
        //songs.remove(InputReader.getInt("Please enter the name of the song you wish to delete. "));

        int option2;
        option2 = InputReader.getInt("Would you like to remove another song(1) or return to main menu(2)?:  ");
        if (option2 == 1) {
            deleteSong();
        } 
        else if (option2 == 2) {
            mainMenu();
        }
        else {
            System.out.println("This is an invalid choice. Please enter number between 1 and 2.");
            mainMenu();
        }
    }

    

    /**
     * Below is the code for printing an unordered list of songs.
     * Using the for loop, the system goes through each song in
     * the array list and then prints each one on a seperate
     * line.
     */
    private void printSongs(int numberOfPlays) {
        for(Song song : songs){
            if(song.getNumberOfPlays()>numberOfPlays)
                song.print();
        }
        /**
         * Code below allows the user to return to the menu by
         * hitting any number
         */
        int option;
        option = InputReader.getInt("Return to main menu(Press any number)?:  ");
        if (option == 1) {
            mainMenu();
        }
        else {
            mainMenu();
        }
    }

    /**
     * Below is the page used to print songs in order.
     * It contains the method to print the songs which
     * has been adjusted from the normal print method.
     */
    private void topPrintSongs() {
        int noOfPlays = InputReader.getInt("Please specify the minimum number of plays: ");
        printSongs(noOfPlays);
    }

    

    private void quit() {
        String qutting;
        qutting = InputReader.getString("Want to quit?");
        if (qutting.equals("Yes") )
        {
            System.exit(0);
            }
            else {
            mainMenu();
            }

    }

/**
 * Below is the array list for all of the songs. Currently
 * it only has 8 songs. The additional 2 to meet the
 * criteria will be added via user input using the
 * addsong option. Each song has their own set values
 * (name, artist and number of plays). Each value allows
 * the system to pick out the desired attributes based on
 * what the user enters and which method is being called.
 */
    private void testSongs() {
        songs = new ArrayList<Song>();        
        Song song1 = new Song("Children of the Grave", "Black Sabbath", 5748967);
        Song song2 = new Song("Gift of guilt", "Gojira", 2008967);
        Song song3 = new Song("Hunger of the Undead", "Dark Angel", 78967);
        Song song4 = new Song("Death Portrait", "Lorna Shore", 298975);
        Song song5 = new Song("Pull the Plug", "Death", 2000125);
        Song song6 = new Song("Ache With Me", "Against Me!", 187158);
        Song song7 = new Song("Cherry Bomb", "Joan Jett & the Blackhearts", 6868967);
        Song song8 = new Song("Comfort in the Grave", "Vision Video", 98967);
/**
 * The code above are the values of each song. The code
 * below is actually adding the code to the array list.
 */
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
