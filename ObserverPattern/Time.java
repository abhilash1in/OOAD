
import java.util.*;

/**
 * 
 */
public class Time implements ClubMeeting {

    /**
     * Default constructor
     */
	public Appointment appointment;
    public Time(Appointment appointment) {
	this.appointment=appointment;
	this.appointment.attach(this);
    }

    /**
     * 
     */
    public void update() {
        // TODO implement here
	System.out.println("Club Meeting Time updated!!");
    }

}
