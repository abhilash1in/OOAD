/**
 * Created by 5c on 28/9/16.
 */
public class Boiler {
    private static Boiler b = null;
    private boolean isEmpty = true;
    private boolean isHeated = false;

    public static Boiler getBoiler(){
        if(b == null){
            b = new Boiler();
            return b;
        }else{
            System.out.println("Boiler already initiallized");
            return null;
        }
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
            System.out.println("Boiler is empty");
        }
    }

    public void heat(){
        if(!isEmpty() && !isHeated()){
            System.out.println("Heated");
            setHeated(true);
        }else{
            if(isEmpty()){
                System.out.println("Not Heated : Boiler empty");
            }
            if(isHeated()){
                System.out.println("Not Heated : Boiler already heated");
            }
        }
    }

    public void pourOut(){
        if(!isEmpty && isHeated()){
            setEmpty(true);
            setHeated(false);
            System.out.println("Poured out");
        }else{
            if(isEmpty()){
                System.out.println("Not poured out : Boiler empty");
            }
            if(!isHeated()){
                System.out.println("Not poured out : Boiler not heated");
            }
        }
    }
}
