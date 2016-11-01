
import java.util.*;

/**
 * 
 */
public class XXCircle implements XXShape {

    /**
     * Default constructor
     */
	
	Shape obj;
    public XXCircle() {
	obj=new Circle();
    }

	public void display() {
		System.out.println("\nIn XXCircle");
		obj.display();
}


}
