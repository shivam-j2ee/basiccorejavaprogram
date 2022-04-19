package DateTen;
//swap var without third
public class Eight {
public static void main(String[] args) {
	String fname="vaishali";
	String lname="shah";
	
	fname=fname+lname;
	lname=fname.substring(0,fname.length()-lname.length());
	fname=fname.substring(lname.length());
	
	
	System.out.println(fname);
	System.out.println(lname);
}
}
