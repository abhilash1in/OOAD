import java.util.*;

class SummarizeName implements SummerizeStrategy{

	@Override
	public void summarize(List<Contact> a) {
		// TODO Auto-generated method stub
		System.out.println("Summerise by name");
		Collections.sort(a, new Comparator<Contact>(){
			public int compare(Contact o1, Contact o2){
				return o1.name.compareTo(o2.name);
			}
		});
		System.out.println(Arrays.asList(a));
	}

}