package in.co.rays.collection;
public class MarksheetComparable implements Comparable<MarksheetComparable> {
	
	private String rollNo;
	private String name;
	
	public MarksheetComparable(String rollNo, String name) {
		
		this.rollNo=rollNo;
		this.name=name;
	}
	
	public String getRollNo() {
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
		//return rollNo-m.getRollNo();
		
		//Descending order
		  
		//return m.getRollNo()-rollNo;
		
		
		//if rollNo is String then
		
		//Ascending
		//return rollNo.compareTo(m.rollNo);
		
		//Dscending
		return m.rollNo.compareTo(rollNo);
	}

}