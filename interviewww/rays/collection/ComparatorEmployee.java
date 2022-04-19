package in.co.rays.collection;
public class ComparatorEmployee {
	
	private String fName;
	private String lName;

	public ComparatorEmployee(String fName, String lName) {
		
		this.fName=fName;
		this.lName=lName;
	}

	public String getfName() {
		return fName;
	}

	public String getLName() {
		return lName;
	}

	public String toString() {
		return fName + " " + lName;
	}

}
