
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
        // TODO implement here
        System.out.println("\nIn Customize");
        obj2.vary();
    }

    /**
     * 
     */
    public void currency() {
        // TODO implement here
        System.out.println("\nIn Customize");
        obj3.vary();
    }

}
