import java.util.ArrayList;


public class Playlist {
    String name;
    boolean isEmpty = true;
    ArrayList<String> songNames = new ArrayList<String>();
    int totalDuration = 0;


    public Playlist(String name) {
        this.name = name;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void addSong (Song song) {
        isEmpty = false;
        songNames.add(song.title);
        totalDuration += song.durationInSeconds;
    }

    public String[] songNames () {
        String[] titleArr = new String[songNames.size()];
        return songNames.toArray(titleArr);
    }

    public int totalDuration () {
        return totalDuration;
    }

    public void swap (Song song1, Song song2) {
        int index1 = songNames.indexOf(song1.title);
        int index2 = songNames.indexOf(song2.title);
        songNames.set(index1, song2.title);
        songNames.set(index2, song1.title);
    }

    public void removeSong (Song song) {
        songNames.remove(songNames.indexOf(song.title));
        totalDuration -= song.durationInSeconds;
    }
}
