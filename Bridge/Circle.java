
import java.util.*;

/**
 * 
 */
public class Circle extends Shape {

    /**
     * Default constructor
     */
    public Circle(DrawPattern drawpattern) {
		super(drawpattern);
	}

    /**
     * 
     */
    public void draw() {
        // TODO implement here
        drawpattern.drawCircle();
    }

}
