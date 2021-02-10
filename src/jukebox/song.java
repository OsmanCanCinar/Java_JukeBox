//  @author osman
package jukebox;

public class song {
    
    private String songName;
    private String songArtist;
    private String songGenre;
    private String songPath;
    
    public song(String songName, String songArtist, String songGenre, String songPath) {
        this.songName = songName;
        this.songArtist = songArtist;
        this.songGenre = songGenre;
        this.songPath = songPath;
    }

    public String getSongName() {
        return songName;
    }

    public String getSongArtist() {
        return songArtist;
    }

    public String getSongGenre() {
        return songGenre;
    }

    public String getSongPath() {
        return songPath;
    }
}
