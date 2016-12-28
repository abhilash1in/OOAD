
import java.util.*;

/**
 * 
 */
public class address {

    /**
     * Default constructor
     */
    public address() {
    }

    /**
     * 
     */
    public String city;

    /**
     * 
     */
    public String state;

    /**
     * @return
     */
    public void getaddress() {
        // TODO implement here
        Scanner s=new Scanner(System.in);
        System.out.println("enter the address");
        city=s.nextLine();
        state=s.nextLine();
    }

    /**
     * @return
     */
    public void printaddress() {
        // TODO implement here
       
        
    }

}
