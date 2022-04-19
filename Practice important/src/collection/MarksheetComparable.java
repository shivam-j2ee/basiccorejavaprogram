package collection;

public class MarksheetComparable implements Comparable<MarksheetComparable>
{
	private String name;
	private String roll;
	
	public MarksheetComparable(String name , String roll) 
	{
	  this.name = name;
	  this.roll = roll;
	}

	@Override
	public String toString() {
		/*return "MarksheetComparable [name=" + name + ", roll=" + roll + "]";*/
		return roll+" "+name;
	}

	public String getName() {
		return name;
	}
    
	public String getRoll() {
		return roll;
	}

	@Override
	public int compareTo(MarksheetComparable o) 
	{
		//Assending Order if roll is of type  int
		//return roll-o.getRoll();
		
		//Decending Order if roll is of type  int
		//return o.getRoll()-roll;
		
		// Assending Order if roll is of type String
		 //return roll.compareTo(o.getRoll());

		// Decending Order if roll is of type int
		 return o.getRoll().compareTo(roll);
		
	}

}
