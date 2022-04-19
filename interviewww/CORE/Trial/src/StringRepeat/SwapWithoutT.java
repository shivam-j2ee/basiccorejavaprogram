package StringRepeat;

public class SwapWithoutT {
public static void main(String[] args) {
	String fname="vaishali";
	String lname="shah";
	
	 fname=fname+lname;
	 lname=fname.substring(0,fname.length()-lname.length());
	 fname=fname.substring(lname.length());
	 
	 
	 System.out.println(fname+" "+lname);
}
}
