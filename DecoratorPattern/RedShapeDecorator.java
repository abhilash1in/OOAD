
import java.util.*;

/**
 * 
 */
public class RedShapeDecorator extends ShapeDecorator {

    /**
     * Default constructor
     */
    public RedShapeDecorator(Shape decoratedShape) {
	   super(decoratedShape);
    }

    /**
     * 
     */
    public void draw() {
        // TODO implement here
      super.draw();	       
      setredborder(decoratedShape);
    }

    /**
     * 
     */
    public void setredborder(Shape decoratedShape) {
        // TODO implement here
      System.out.println("Border Color: Red");
    }

}
