package Week5;
import java.util.ArrayList;
import helpers.*;

public class MusicList 
{
    private ArrayList<Song> songs = new ArrayList<Song>();

    public void run()
    {
        System.out.println("Ana's Music List");
        testSongs();
        doMainMenu();
    }

    private void doMainMenu() 
    {
        System.out.println("Main menu");
        System.out.println("Add new song (1)");
        System.out.println("Delete song (2)");
        System.out.println("Print list of songs (3)");
        System.out.println("Print list of songs by number of plays (4)");
        System.out.println("Close application (5)");        

        int option;
        System.out.println("Please enter desired option ");
        option = InputReader.getInt("1-5:  ");

        if(option >=1 && option <=5)
            {
                System.out.println("This is an valid choice. Please enter number between 1 and 5.");
            }
        else 
            {
                System.out.println("This is an invalid choice. Please enter number between 1 and 5.");
            }

    }

    private void testSongs()
    {
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


