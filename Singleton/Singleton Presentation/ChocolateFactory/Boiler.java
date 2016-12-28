/**
 * Created by 5c on 28/9/16.
 */
public class Boiler {
    private volatile static Boiler b = null;
    private boolean isEmpty = true;
    private boolean isHeated = false;

    private Boiler(){
    	// empty constructor
    }

    public static Boiler getBoiler(){
        if(b == null){
        	synchronized(Boiler.class){
        		if(b == null)
        			b = new Boiler();
        	}
            
        }else{
            System.out.println("Boiler already initiallized. Returning existing boiler instance");
        }
        return b;
    }

    private boolean isEmpty() {
        return isEmpty;
    }

    private void setEmpty(boolean empty) {
        this.isEmpty = empty;
    }

    private boolean isHeated() {
        return isHeated;
    }

    private void setHeated(boolean heated) {
        isHeated = heated;
    }

    public void fillRawMixture(){
        if(isEmpty()){
            setEmpty(false);
            System.out.println("Filled raw mixture");
        }
        else{
            System.out.println("Boiler is not empty");
        }
        System.out.println("");
    }

    public void heat(){
        if(!isEmpty() && !isHeated()){
            System.out.println("Heated");
            setHeated(true);
        }else{
            if(isHeated()){
                System.out.println("Not Heated : Boiler already heated");
            }
            if(isEmpty()){
                System.out.println("Not Heated : Boiler empty");
            }
        }
        System.out.println("");
    }

    public void pourOut(){
        if(!isEmpty && isHeated()){
            setEmpty(true);
            setHeated(true);
            System.out.println("Poured out");
        }else{
            if(isEmpty()){
                System.out.println("Not poured out : Boiler empty");
            }
            if(!isHeated()){
                System.out.println("Not poured out : Boiler not heated");
            }
        }
        System.out.println("");
    }
}
