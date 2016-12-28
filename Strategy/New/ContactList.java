import java.util.*;

class ContactList {
	SummerizeStrategy s;
	public ContactList(SummerizeStrategy s){
		this.s = s;
	}
	public void doSummerize(List<Contact> a){
		s.summarize(a);
	}
}