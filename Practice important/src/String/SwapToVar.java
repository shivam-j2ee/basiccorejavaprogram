package String;

public class SwapToVar 
{
	public static void main(String[] args) {
		String fname = "Siddharth";
		String lname = "Jain";
		fname = fname + lname;
		System.out.println(fname);
		lname = fname.substring(0, fname.length() - lname.length());
		System.out.println(lname);
		fname=fname.substring(lname.length());
		System.out.println(fname);
	
		System.out.println(fname+" "+lname);

	}
}
