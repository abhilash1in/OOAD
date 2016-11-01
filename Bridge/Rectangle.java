
import java.util.*;

/**
 * 
 */
public class Rectangle extends Shape {

    /**
     * Default constructor
     */
	
    public Rectangle(DrawPattern drawpattern) {
	super(drawpattern);
    }

    /**
     * 
     */
    public void draw() {
        // TODO implement here
	drawpattern.drawLine();
    }

}
