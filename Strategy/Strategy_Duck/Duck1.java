
import java.util.*;

/**
 * 
 */
public class Duck1 extends Duck {

    /**
     * Default constructor
     */
    public Duck1() {
	quackBehavior = new Quack();
	flyBehavior = new FlyWithWings();
    }

    /**
     * 
     */
    public void display() {
        // TODO implement here
	System.out.println("I’m a good duck 1");
    }

}
