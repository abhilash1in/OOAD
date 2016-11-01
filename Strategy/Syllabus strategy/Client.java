
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
      Context context = new Context(new DisplayA());		
      context.executeDisplay();

      context = new Context(new DisplayB());		
      context.executeDisplay();

      /*context = new Context(new DisplayC());		
      context.executeDisplay();*/
   }


}
