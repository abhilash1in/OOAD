
import java.util.*;

/**
 * 
 */
public class Duck3 extends Duck {

    /**
     * Default constructor
     */
    public Duck3() {
	quackBehavior = new Squeak();
	flyBehavior = new FlyWithWings();
    }

    /**
     * 
     */
    public void display() {
        // TODO implement here
	System.out.println("I’m a decent duck 3");
    }

}
