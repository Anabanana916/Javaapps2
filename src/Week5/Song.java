package Week5;

/**
 * Below defines the song class for the array list in
 * MusicList. Allowing the system to determine the
 * details that can be called and printed when
 * referring to the stored details of songs
 * @author Ana
 */
public class Song 
{
    /**
     * Below will allow the name of the song, the
     * artist and the number of plays to be logged.
     */
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

    /**
     * Below is the code related to the commands to print the array list. This code
     * on it's own will not print the whole list. In the MusicList file, there is a
     * for loop which allows the whole list to be printed.
     */
    public void print() {
        System.out.println("Song: " + this.name + " Artist: " + this.artist + " Plays: " + this.numberOfPlays);
    }

    /**
     * Below is the method to get the song for the delete method. I created this so the user
     * can double check the system has brought up the correct song the user wishes to delete.
     * It should print the name of the song and artist matching in the playlist so the user
     * can then confirm if they wish to delete said song in the main code. This is purely
     * to display the name and artist.
     */
    public void getSong() {
        System.out.println("Song: " + this.name + " Artist: " + this.artist);
    }

    /**
     * This code allows the name of the song to be displayed when asked for. 
     */
    public String getName()
    {
        return this.name;
    }
    /**
     * This code allows the artist of the song to be displayed when asked for. 
     */
    public String getArtist()
    {
        return this.artist;
    }
    /**
     * This code allows the number of plays to be displayed when asked for. 
     */
    public int getNumberOfPlays()
    {
        return this.numberOfPlays;
    }

}
