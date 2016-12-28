
import java.util.*;

/**
 * 
 */
public class infactory implements abstractfactory {

    /**
     * Default constructor
     */
    public infactory() {
    }

    /**
     * @return
     */
    public address getaddress() {
        // TODO implement here
        return new inaddress();
    }

    /**
     * @return
     */
    public phoneno getphoneno() {
        // TODO implement here
        return new inphoneno();
        
    }

}
