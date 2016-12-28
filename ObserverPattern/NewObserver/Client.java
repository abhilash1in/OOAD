
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
		Notification m1 = new ClubMember("m1");
		Notification m2 = new ClubMember("m2");
		Notification m3 = new ClubMember("m3");
		ArrayList<Notification> members = new ArrayList<>();
		members.add(m1);
		members.add(m2);
		members.add(m3);

		Appointment appointment=new Appointment();
		appointment.setDate("28th December 2017");
		appointment.setLocation("JW Kitchen");
		appointment.setTime("1:00 PM");
		appointment.setMembers(members);


		appointment.setTime("2:00 PM");
	}

}
