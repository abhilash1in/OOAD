
import java.util.*;

/**
 * 
 */
public class usfactory implements abstractfactory {

    /**
     * Default constructor
     */
    public usfactory() {
    }

    /**
     * @return
     */
    public address getaddress() {
        // TODO implement here
        return new usaddress();
    }

    /**
     * @return
     */
    public phoneno getphoneno() {
        // TODO implement here
        return new usphoneno();
    }

}
