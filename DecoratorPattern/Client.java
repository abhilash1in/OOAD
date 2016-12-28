
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


    /**
     * @return
     */
    public static void main(String args[]) {
        // TODO implement here
        
      Shape circle = new Circle();
      Shape square = new Square();

      Shape redCircle = new RedShapeDecorator(new Circle());
      Shape redSquare = new RedShapeDecorator(new Square());

      System.out.println("\nCircle with normal border");
      circle.draw();

      System.out.println("\nCircle of red border");
      redCircle.draw();

      System.out.println("\nSquare with normal border");
      square.draw();

      System.out.println("\nSquare of red border");
      redSquare.draw();
      System.out.println("");
    }

}
