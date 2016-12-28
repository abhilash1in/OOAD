
import java.util.*;

/**
 * 
 */
public class Context {

    /**
     * Default constructor
     */
    public Context() {
    }
    
    private Contactlist strategy;

   public Context(Contactlist strategy){
      this.strategy = strategy;
   }

   public void executeDisplay(){
      strategy.display();
   }
}