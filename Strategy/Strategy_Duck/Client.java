
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

	public static void main(String[] args) {
		Duck duck1= new Duck1();
		duck1.performQuack();	
		duck1.performFly();

		Duck duck2= new Duck2();
		duck2.performQuack();	
		duck2.performFly();

		Duck duck3= new Duck3();
		duck3.performQuack();	
		duck3.performFly();


}


}
