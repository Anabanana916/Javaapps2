package Week5;

/**
 * Below is an array class that determines a number of objects that can be called and printed
 * stores details of songs
 * @author Ana
 */
public class Song 
{
    private String name;
    private String artist;
    private int numberOfPlays;
    
    /**
    * This is the constructor that will create the name, artist and number of plays
    *of a song
    */
    public Song(String name, String artist, int numberOfPlays)
    {
        this.name = name;
        this.artist = artist;
        this.numberOfPlays = numberOfPlays;
    }
}
