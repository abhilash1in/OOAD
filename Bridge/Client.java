
import java.util.*;

/**
 * 
 */
public class Client {

    /**
     * Default constructor
     */
    public Client() {
    }


	public static void main(String []args){

	System.out.println("Drawing using V1 and DP1");
	Shape v1=new Circle(new V1Drawing());
	v1.draw();
	System.out.println("Circle drawn\n");

	System.out.println("Drawing using V2 and DP2");
	Shape v2=new Circle(new V2Drawing());
	v2.draw();
	System.out.println("Circle drawn\n");

	System.out.println("Drawing using V1 and DP1");
	Shape v3=new Rectangle(new V1Drawing());
	v3.draw();
	System.out.println("Rectangle drawn\n");
	
	System.out.println("Drawing using V2 and DP2");
	Shape v4=new Rectangle(new V2Drawing());
	v4.draw();
	System.out.println("Rectangle drawn\n");
}
}
