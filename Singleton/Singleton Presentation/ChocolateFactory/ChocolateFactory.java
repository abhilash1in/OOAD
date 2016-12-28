/**
 * Created by 5c on 28/9/16.
 */
public class ChocolateFactory {
    public static void main(String[] args){
        Boiler b = Boiler.getBoiler();

        b.pourOut();
        b.heat();
        b.pourOut();

        b.fillRawMixture();
        b.pourOut();

        b.heat();
        b.pourOut();
        b.pourOut();
        b.heat();
        Boiler b2 = Boiler.getBoiler();
        b.fillRawMixture();
        if(b2!=null)
            b2.heat();

        b.pourOut();
    }
}
