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
    }

    private void testSongs()
    {
        Song song1 = new Song("Children of the Grave", "Black Sabbath", 1748967);
        Song song2 = new Song("Children of the Grave", "Black Sabbath", 1748967);
    
        songs.add(song1);
        songs.add(song2);
    }
}


