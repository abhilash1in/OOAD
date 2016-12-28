import java.util.*;

class Contact {
	String name,company;
	
	public void setContact(String n,String c){
		name = n;
		company = c;
	}
	
    public String toString() {
        return ("(" + name + ", " + company + ")");
    }
	
}