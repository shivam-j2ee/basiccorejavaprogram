package collection;

public class ComparatorEmployee
{
 private String fName;
 private String lName;
 
	public ComparatorEmployee(String fname , String lname) 
	{
      this.fName = fname;
      this.lName = lname;
	}

	@Override
	public String toString() {
		return "ComparatorEmployee [fName=" + fName + ", lName=" + lName + "]";
	}

public String getfName() {
	return fName;
}
public String getlName() {
	return lName;
}
 
 
}
