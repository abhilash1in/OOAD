
import java.util.*;

/**
 * 
 */
public class Date implements ClubMeeting {

    /**
     * Default constructor
     */
	public Appointment appointment;
    public Date(Appointment appointment) {
	this.appointment=appointment;
	this.appointment.attach(this);
    }

    /**
     * 
     */
    public void update() {
        // TODO implement here
	System.out.println("Club Meeting Date updated!!");
    }

}
