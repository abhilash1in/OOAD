
import java.util.*;

/**
 * 
 */
public class Duck {

    /**
     * Default constructor
     */
	FlyBehaviour flyBehavior;
	QuackBehaviour quackBehavior;	
    public Duck() {
    }



    /**
     * 
     */
    public void display() {
        // TODO implement here
    }

    /**
     * 
     */
    public void performFly() {
        // TODO implement here
	flyBehavior.fly();
    }

    /**
     * 
     */
    public void performQuack() {
        // TODO implement here
	quackBehavior.quack();
    }

}
