package extr;

public class MarksheetComparable implements Comparable<MarksheetComparable> {
	
	private int rollNo;
	private String name;
	
	public MarksheetComparable(int rollNo, String name) {
		
		this.rollNo=rollNo;
		this.name=name;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		
		return rollNo + " " + name;
	}

	@Override
	public int compareTo(MarksheetComparable m) {
		// Ascending order
		return rollNo-m.getRollNo();
		
		/*Descending order
		 * 
		return m.getRollNo()-rollNo;
		*/
		
		/*if rollNo is String then
		
		return rollNo.compareTo(m.rollNo);
		*/
		
	}

}
