
import java.util.*;

/**
* 
*/
public class Appointment {

	/**
	* Default constructor
	*/
	public Appointment() {
	}
	
	private List<ClubMeeting> observers = new ArrayList<ClubMeeting>();
	private int state;

	/**
	* 
	*/
	public void attach(ClubMeeting observer) {
	// TODO implement here
		observers.add(observer);
	}

	/**
	* 
	*/
	public void detach(ClubMeeting observer) {
	// TODO implement here
		observers.remove(observer);

	}

	/**
	* 
	*/
	public void setstate(int state) {
		this.state=state;
		notifyall();
	}


	public void notifyall() {
	// TODO implement here
		for(ClubMeeting observer : observers) {
			observer.update();
		}
	}

	/**
	* 
	*/
	public int getstate() {
	// TODO implement here
		return state;
	}
}