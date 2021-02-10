package jukebox;
//  @author osman

public class playList {
    
    private String playListName;
    private int playListOwnerID;
    
    public playList(String playListName, int playListOwnerID) {
        this.playListName = playListName;
        this.playListOwnerID = playListOwnerID;
    }
 
    public String getPlayListName() {
        return playListName;
    }

    public int getPlayListOwnerID() {
        return playListOwnerID;
    }
}
