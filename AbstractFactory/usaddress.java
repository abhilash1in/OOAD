
import java.util.*;

/**
 * 
 */
public class usaddress extends address {

    /**
     * Default constructor
     */
    public usaddress() {
     super.getaddress();
    }
    
   public void printaddress(){
    System.out.println("Us Address:");
     System.out.println("The Address is:");
        System.out.println("city: "+city);
        System.out.println("state: "+state);
   }

}
