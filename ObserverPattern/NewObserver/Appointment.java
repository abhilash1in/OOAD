
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
	
	private ArrayList<Notification> observers = new ArrayList<>();
	public String date,time,location;
	/**
	* 
	*/
	public void setMembers(ArrayList<Notification> members) {
	// TODO implement here
		for (Notification member : members) {
			observers.add(member);
		}
	}

	public void setMembers(Notification member) {
	// TODO implement here
		observers.add(member);
	}

	/**
	* 
	*/
	public void detachMember(Notification member) {
	// TODO implement here
		observers.remove(member);
	}

	/**
	* 
	*/
	public void setDate(String date) {
		this.date=date;
		notifyall();
	}

	public void setTime(String time) {
		this.time=time;
		notifyall();
	}

	public void setLocation(String location) {
		this.location=location;
		notifyall();
	}

	public void notifyall() {
	// TODO implement here
		for(Notification observer : observers) {
			observer.update(this);
		}
	}
}