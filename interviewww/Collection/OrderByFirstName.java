package extr;

import java.util.Comparator;

public class OrderByFirstName implements Comparator<ComparatorEmployee> {

	@Override
	public int compare(ComparatorEmployee a, ComparatorEmployee b) {
		
		if(a.getfName().equals(b.getfName())) {
			return a.getLName().compareTo(b.getLName());
		}
		else {
			return a.getfName().compareTo(b.getfName());
		}
		
	}

}
