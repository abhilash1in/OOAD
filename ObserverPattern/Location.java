
import java.util.*;

/**
 * 
 */
public class Location implements ClubMeeting {

    /**
     * Default constructor
     */
	public Appointment appointment;
    public Location(Appointment appointment) {
	this.appointment=appointment;
	this.appointment.attach(this);
    }

    /**
     * 
     */
    public void update() {
        // TODO implement here
	System.out.println("Club Meeting Location updated!!");
    }

}
