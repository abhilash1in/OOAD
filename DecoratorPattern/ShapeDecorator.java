
import java.util.*;

/**
 * 
 */
public class ShapeDecorator implements Shape {

    /**
     * Default constructor
     */
	protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
	   this.decoratedShape = decoratedShape;
    }


    /**
     * 
     */
    public void draw() {
        // TODO implement here
	   decoratedShape.draw();
    }

}
