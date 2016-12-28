
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
		Appointment appointment=new Appointment();

		new Date(appointment);
		new Location(appointment);
		new Time(appointment);

		System.out.println("First State Change !!!");
		appointment.setstate(1);
		System.out.println("");

		System.out.println("Second State Change !!!");
		appointment.setstate(2);
		System.out.println("");
	}

}
