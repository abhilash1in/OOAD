
import java.util.*;

/**
 * 
 */
public class ClubMember implements Notification {
	String name;
	public ClubMember(String name){
		this.name = name;
	}
	public void update(Appointment ap){
		System.out.println(name+" Received updated Appointment information: ");
		System.out.println(" Date: "+ap.date+"\n Time: "+ap.time+"\n Location: "+ap.location+"\n");
	}
}