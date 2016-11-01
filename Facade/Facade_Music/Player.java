
import java.util.*;

/**
 * 
 */
public class Player implements MusicPlayer {

    /**
     * Default constructor
     */
    public Player() {
    }


    /**
     * 
     */
    public void setvolume() {
        // TODO implement here
	SoundSystem obj=new SoundSystem();
	obj.volume();
    }

    /**
     * 
     */
    public void showtitle() {
        // TODO implement here
	System.out.println("Closer by Chainsmoker");
	showduration();
    }

    /**
     * 
     */
    public void showduration() {
        // TODO implement here
	System.out.println("4 minutes");
    }

    /**
     * 
     */
    public void showsong() {
        // TODO implement here
    }

	public void display(){
		setvolume();
		showtitle();
		System.out.println("Playing...");
}

}
