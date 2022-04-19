package trial.collection;

public class MarksheetComparable implements Comparable<MarksheetComparable> {

	private int rollNo;
	private String name;

	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MarksheetComparable(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	public String toString() {
		return rollNo + " " + name;
	}

	@Override
	public int compareTo(MarksheetComparable m) {
		return rollNo - (m.rollNo); // ascending...
	}

}
