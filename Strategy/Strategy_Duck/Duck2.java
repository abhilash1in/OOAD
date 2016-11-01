
import java.util.*;

/**
 * 
 */
public class Duck2 extends Duck {

    /**
     * Default constructor
     */
    public Duck2() {
	quackBehavior = new MuteQuack();
	flyBehavior = new FlyNoWay();
    }

    /**
     * 
     */
    public void display() {
        // TODO implement here
	System.out.println("IDK if I'm a duck!!!");
    }

}
