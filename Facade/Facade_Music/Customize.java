
import java.util.*;

/**
 * 
 */
public class Customize {

    /**
     * Default constructor
     */
	MusicPlayer obj1;
	MusicPlayer obj2;
	MusicPlayer obj3;

    public Customize() {
	obj1=new Player();
	obj2=new Decoder();
	obj3=new FileLoader();
    }

    public void load() {
        // TODO implement here
	obj3.display();
    }

    public void decode() {
        // TODO implement here
	obj2.display();
    }

    public void volume() {
        // TODO implement here
	obj1.display();
    }

    public void title() {
        // TODO implement here
	obj1.display();
	
    }

}
