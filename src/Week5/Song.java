package Week5;

/**
 * Below is an array class that determines a number ofobjects that can be called and printed
 * @author Ana
 */
public class Song 
{
    private String name;
    private String artist;
    private int numberOfPlays;
    
    /**
    * This is the constructor that will create the name, artist and number of plays
    */
    public Song(String name, String artist, int numberOfPlays)
    {
        this.name = name;
        this.artist = artist;
        this.numberOfPlays = numberOfPlays;
    }
}
