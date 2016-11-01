
import java.util.*;

/**
 * 
 */
public class Customize {

    /**
     * Default constructor
     */
	private InfoManager obj1;
	private InfoManager obj2;
	private InfoManager obj3;
    public Customize() {
	obj1=new FontType();
	obj2=new FontSize();
	obj3=new Currency();
    }


    /**
     * 
     */
    public void type() {
        // TODO implement here
	System.out.println("\nIn Customize");
	obj1.vary();
    }

    /**
     * 
     */
    public void size() {
	System.out.println("\nIn Customize");
        // TODO implement here
	obj2.vary();
    }

    /**
     * 
     */
    public void currency() {
	System.out.println("\nIn Customize");
        // TODO implement here
	obj3.vary();
    }

}
