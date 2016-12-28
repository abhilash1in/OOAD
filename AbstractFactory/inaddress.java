
import java.util.*;

/**
 * 
 */
public class inaddress extends address {

    /**
     * Default constructor
     */
    public inaddress() {
     super.getaddress();
    }


   public void printaddress(){
    System.out.println("Indian Address:");
     System.out.println("The Address is:");
        System.out.println("city: "+city);
        System.out.println("state: "+state);
   }

}
